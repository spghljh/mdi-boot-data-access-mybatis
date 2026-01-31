package kr.co.mdi.cpu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CpuCsrController {

    @GetMapping("/csr/cpus")
    public String cpuJsonView() {
        return "/csr/csr-cpu-total";
    }
}
