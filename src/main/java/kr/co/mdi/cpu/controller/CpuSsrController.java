package kr.co.mdi.cpu.controller;

import kr.co.mdi.cpu.dto.CpuDTO;
import kr.co.mdi.cpu.service.CpuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CpuSsrController {

    private final CpuService cpuService;

    public CpuSsrController(CpuService cpuService) {
        this.cpuService = cpuService;
    }

    @GetMapping("/ssr/cpus")
    public String cpuList(Model model) {
        List<CpuDTO> cpuList = cpuService.findAll();
        model.addAttribute("cpuList", cpuList);
        return "/ssr/ssr-cpu-total";
    }
}
