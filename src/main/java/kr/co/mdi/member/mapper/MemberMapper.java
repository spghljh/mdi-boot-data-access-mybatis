package kr.co.mdi.member.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import kr.co.mdi.member.dto.MemberDTO;

@Mapper
public interface MemberMapper {
    List<MemberDTO> selectAllMembers();
    MemberDTO selectMemberById(Long id);
    void insertMember(MemberDTO member);
    void updateMember(MemberDTO member);
    void deleteMember(Long id);
}
