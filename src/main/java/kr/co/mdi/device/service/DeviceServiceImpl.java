package kr.co.mdi.device.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import kr.co.mdi.device.dto.DeviceDTO;
import kr.co.mdi.device.mapper.DeviceMapper;

@Service
public class DeviceServiceImpl implements DeviceService {

    private final DeviceMapper deviceMapper;

    public DeviceServiceImpl(DeviceMapper deviceMapper) {
        this.deviceMapper = deviceMapper;
    }

    @Override
    public List<DeviceDTO> findAll() {
        return deviceMapper.selectAllDevices();
    }

    @Override
    public Optional<DeviceDTO> findById(Long id) {
        return Optional.ofNullable(deviceMapper.selectDeviceById(id));
    }

    @Override
    public DeviceDTO save(DeviceDTO device) {
        if (device.getIdDevice() == null) {
            deviceMapper.insertDevice(device);
        } else {
            deviceMapper.updateDevice(device);
        }
        return device;
    }

    @Override
    public void delete(Long id) {
        deviceMapper.deleteDevice(id);
    }
}
