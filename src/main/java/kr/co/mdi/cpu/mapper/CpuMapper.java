package kr.co.mdi.cpu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mdi.cpu.dto.CpuDTO;

@Mapper
public interface CpuMapper {
    List<CpuDTO> selectAllCpus();
    CpuDTO selectCpuById(Long id);
    void insertCpu(CpuDTO cpu);
    void updateCpu(CpuDTO cpu);
    void deleteCpu(Long id);
}
