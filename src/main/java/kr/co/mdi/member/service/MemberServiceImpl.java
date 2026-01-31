package kr.co.mdi.member.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import kr.co.mdi.member.dto.MemberDTO;
import kr.co.mdi.member.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public List<MemberDTO> findAll() {
        return memberMapper.selectAllMembers();
    }

    @Override
    public Optional<MemberDTO> findById(Long id) {
        return Optional.ofNullable(memberMapper.selectMemberById(id));
    }

    @Override
    public MemberDTO save(MemberDTO member) {
        if (member.getIdMember() == null) {
            memberMapper.insertMember(member);
        } else {
            memberMapper.updateMember(member);
        }
        return member;
    }

    @Override
    public void delete(Long id) {
        memberMapper.deleteMember(id);
    }
}
