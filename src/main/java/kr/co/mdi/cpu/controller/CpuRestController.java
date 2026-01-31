package kr.co.mdi.cpu.controller;

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

import kr.co.mdi.cpu.dto.CpuDTO;
import kr.co.mdi.cpu.service.CpuService;

@RestController
public class CpuRestController {

    private final CpuService cpuService;

    public CpuRestController(CpuService cpuService) {
        this.cpuService = cpuService;
    }

    @GetMapping("/api/cpus")
    public List<CpuDTO> getAllCpu() {
        return cpuService.findAll();
    }

    @GetMapping("/api/cpus/{id}")
    public ResponseEntity<CpuDTO> getCpuById(@PathVariable Long id) {
        return cpuService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/api/cpus")
    public ResponseEntity<CpuDTO> createCpu(@RequestBody CpuDTO cpuDto) {
        CpuDTO saved = cpuService.save(cpuDto);
        URI location = URI.create("/api/cpus/" + saved.getIdCpu());
        return ResponseEntity.created(location).body(saved);
    }

    @PutMapping("/api/cpus/{id}")
    public ResponseEntity<CpuDTO> updateCpu(@PathVariable Long id, @RequestBody CpuDTO cpuDetails) {
        return cpuService.findById(id)
                .map(cpu -> {
                    cpu.setNameCpu(cpuDetails.getNameCpu());
                    cpu.setReleaseCpu(cpuDetails.getReleaseCpu());
                    cpu.setCoreCpu(cpuDetails.getCoreCpu());
                    cpu.setThreadCpu(cpuDetails.getThreadCpu());
                    cpu.setMaxGhzCpu(cpuDetails.getMaxGhzCpu());
                    cpu.setMinGhzCpu(cpuDetails.getMinGhzCpu());
                    cpu.setTypeCodeCpu(cpuDetails.getTypeCodeCpu());
                    cpu.setManfCodeCpu(cpuDetails.getManfCodeCpu());
                    return ResponseEntity.ok(cpuService.save(cpu));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/api/cpus/{id}")
    public ResponseEntity<Void> deleteCpu(@PathVariable Long id) {
        cpuService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
