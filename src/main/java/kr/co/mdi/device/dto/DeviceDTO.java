package kr.co.mdi.device.dto;

public class DeviceDTO {
    private Long idDevice;
    private String nameDevice;
    private Long idCpu;
    private String lineupDevice;
    private Integer releaseDevice;
    private Float weightDevice;
    private String typeCodeDevice;
    private String manfCodeDevice;

    public DeviceDTO() {}

    // Getter & Setter
    public Long getIdDevice() { return idDevice; }
    public void setIdDevice(Long idDevice) { this.idDevice = idDevice; }

    public String getNameDevice() { return nameDevice; }
    public void setNameDevice(String nameDevice) { this.nameDevice = nameDevice; }

    public Long getIdCpu() { return idCpu; }
    public void setIdCpu(Long idCpu) { this.idCpu = idCpu; }

    public String getLineupDevice() { return lineupDevice; }
    public void setLineupDevice(String lineupDevice) { this.lineupDevice = lineupDevice; }

    public Integer getReleaseDevice() { return releaseDevice; }
    public void setReleaseDevice(Integer releaseDevice) { this.releaseDevice = releaseDevice; }

    public Float getWeightDevice() { return weightDevice; }
    public void setWeightDevice(Float weightDevice) { this.weightDevice = weightDevice; }

    public String getTypeCodeDevice() { return typeCodeDevice; }
    public void setTypeCodeDevice(String typeCodeDevice) { this.typeCodeDevice = typeCodeDevice; }

    public String getManfCodeDevice() { return manfCodeDevice; }
    public void setManfCodeDevice(String manfCodeDevice) { this.manfCodeDevice = manfCodeDevice; }
}
