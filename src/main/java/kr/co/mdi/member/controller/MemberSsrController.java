package kr.co.mdi.member.controller;

import kr.co.mdi.member.dto.MemberDTO;
import kr.co.mdi.member.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberSsrController {

    private final MemberService memberService;

    public MemberSsrController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/ssr/members")
    public String memberList(Model model) {
        List<MemberDTO> memberList = memberService.findAll();
        model.addAttribute("memberList", memberList);
        return "/ssr/ssr-member-total";
    }
}
