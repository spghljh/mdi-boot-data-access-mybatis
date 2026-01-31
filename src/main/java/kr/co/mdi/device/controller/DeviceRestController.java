package kr.co.mdi.device.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.mdi.device.dto.DeviceDTO;
import kr.co.mdi.device.service.DeviceService;

@RestController
public class DeviceRestController {

    private final DeviceService deviceService;

    public DeviceRestController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/api/devices")
    public List<DeviceDTO> getAllDevices() {
        return deviceService.findAll();
    }

    @GetMapping("/api/devices/{id}")
    public ResponseEntity<DeviceDTO> getDeviceById(@PathVariable Long id) {
        return deviceService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/api/devices")
    public ResponseEntity<DeviceDTO> createDevice(@RequestBody DeviceDTO deviceDto) {
        DeviceDTO saved = deviceService.save(deviceDto);
        URI location = URI.create("/api/devices/" + saved.getIdDevice());
        return ResponseEntity.created(location).body(saved);
    }

    @PutMapping("/api/devices/{id}")
    public ResponseEntity<DeviceDTO> updateDevice(@PathVariable Long id, @RequestBody DeviceDTO deviceDetails) {
        return deviceService.findById(id)
                .map(device -> {
                    device.setNameDevice(deviceDetails.getNameDevice());
                    device.setIdCpu(deviceDetails.getIdCpu());
                    device.setLineupDevice(deviceDetails.getLineupDevice());
                    device.setReleaseDevice(deviceDetails.getReleaseDevice());
                    device.setWeightDevice(deviceDetails.getWeightDevice());
                    device.setTypeCodeDevice(deviceDetails.getTypeCodeDevice());
                    device.setManfCodeDevice(deviceDetails.getManfCodeDevice());
                    return ResponseEntity.ok(deviceService.save(device));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/api/devices/{id}")
    public ResponseEntity<Void> deleteDevice(@PathVariable Long id) {
        deviceService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
