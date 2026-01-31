package kr.co.mdi.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberCsrController {

    @GetMapping("/csr/members")
    public String memberJsonView() {
        return "/csr/csr-member-total";
    }
}
