package kr.co.mdi.cpu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import kr.co.mdi.cpu.dto.CpuDTO;
import kr.co.mdi.cpu.mapper.CpuMapper; // MyBatis Mapper 인터페이스

@Profile("dev-user-mysql")
@Service
public class CpuServiceImpl implements CpuService {

    private final CpuMapper cpuMapper;

    public CpuServiceImpl(CpuMapper cpuMapper) {
        this.cpuMapper = cpuMapper;
    }

    @Override
    public List<CpuDTO> findAll() {
        return cpuMapper.selectAllCpus();
    }

    @Override
    public Optional<CpuDTO> findById(Long id) {
        return Optional.ofNullable(cpuMapper.selectCpuById(id));
    }

    @Override
    public CpuDTO save(CpuDTO cpu) {
        if (cpu.getIdCpu() == null) {
            // 신규 등록
            cpuMapper.insertCpu(cpu);
        } else {
            // 업데이트
            cpuMapper.updateCpu(cpu);
        }
        return cpu;
    }

    @Override
    public void delete(Long id) {
        cpuMapper.deleteCpu(id);
    }
}
