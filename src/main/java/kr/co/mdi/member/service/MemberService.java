package kr.co.mdi.member.service;

import java.util.List;
import java.util.Optional;
import kr.co.mdi.member.dto.MemberDTO;

public interface MemberService {
    List<MemberDTO> findAll();
    Optional<MemberDTO> findById(Long id);
    MemberDTO save(MemberDTO member);
    void delete(Long id);
}
