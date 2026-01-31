package kr.co.mdi.cpu.service;

import java.util.List;
import java.util.Optional;
import kr.co.mdi.cpu.dto.CpuDTO;

public interface CpuService {
    List<CpuDTO> findAll();
    Optional<CpuDTO> findById(Long id);
    CpuDTO save(CpuDTO cpu);
    void delete(Long id);
}
