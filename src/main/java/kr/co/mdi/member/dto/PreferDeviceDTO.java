package kr.co.mdi.member.dto;

public class PreferDeviceDTO {
    private Long idPreferDevice;
    private Long idMember;
    private Long deviceId;

    public PreferDeviceDTO() {}

    public Long getIdPreferDevice() { return idPreferDevice; }
    public void setIdPreferDevice(Long idPreferDevice) { this.idPreferDevice = idPreferDevice; }

    public Long getIdMember() { return idMember; }
    public void setIdMember(Long idMember) { this.idMember = idMember; }

    public Long getDeviceId() { return deviceId; }
    public void setDeviceId(Long deviceId) { this.deviceId = deviceId; }
}
