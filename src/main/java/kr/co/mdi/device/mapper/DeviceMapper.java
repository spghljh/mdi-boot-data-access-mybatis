package kr.co.mdi.device.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mdi.device.dto.DeviceDTO;

@Mapper
public interface DeviceMapper {
    List<DeviceDTO> selectAllDevices();
    DeviceDTO selectDeviceById(Long id);
    void insertDevice(DeviceDTO device);
    void updateDevice(DeviceDTO device);
    void deleteDevice(Long id);
}
