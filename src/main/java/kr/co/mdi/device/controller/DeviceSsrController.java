package kr.co.mdi.device.controller;

import kr.co.mdi.device.dto.DeviceDTO;
import kr.co.mdi.device.service.DeviceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DeviceSsrController {

    private final DeviceService deviceService;

    public DeviceSsrController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/ssr/devices")
    public String deviceList(Model model) {
        List<DeviceDTO> deviceList = deviceService.findAll();
        model.addAttribute("deviceList", deviceList);
        return "/ssr/ssr-device-total";
    }
}
