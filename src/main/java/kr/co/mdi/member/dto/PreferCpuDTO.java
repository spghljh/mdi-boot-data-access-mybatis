package kr.co.mdi.member.dto;

public class PreferCpuDTO {
    private Long idPreferCpu;
    private Long idMember;
    private Long cpuId;

    public PreferCpuDTO() {}

    public Long getIdPreferCpu() { return idPreferCpu; }
    public void setIdPreferCpu(Long idPreferCpu) { this.idPreferCpu = idPreferCpu; }

    public Long getIdMember() { return idMember; }
    public void setIdMember(Long idMember) { this.idMember = idMember; }

    public Long getCpuId() { return cpuId; }
    public void setCpuId(Long cpuId) { this.cpuId = cpuId; }
}
