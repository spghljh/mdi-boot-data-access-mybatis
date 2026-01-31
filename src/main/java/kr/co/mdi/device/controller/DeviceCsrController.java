package kr.co.mdi.device.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeviceCsrController {

    @GetMapping("/csr/devices")
    public String deviceJsonView() {
        return "/csr/csr-device-total";
    }
}
