package kr.co.mdi.device.service;

import java.util.List;
import java.util.Optional;
import kr.co.mdi.device.dto.DeviceDTO;

public interface DeviceService {
    List<DeviceDTO> findAll();
    Optional<DeviceDTO> findById(Long id);
    DeviceDTO save(DeviceDTO device);
    void delete(Long id);
}
