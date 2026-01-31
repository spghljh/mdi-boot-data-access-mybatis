package kr.co.mdi.cpu.dto;

public class CpuDTO {
    private Long idCpu;
    private String nameCpu;
    private Integer releaseCpu;
    private Integer coreCpu;
    private Integer threadCpu;
    private Float maxGhzCpu;
    private Float minGhzCpu;
    private String typeCodeCpu;
    private String manfCodeCpu;

    public CpuDTO() {}

    // Getter & Setter
    public Long getIdCpu() { return idCpu; }
    public void setIdCpu(Long idCpu) { this.idCpu = idCpu; }

    public String getNameCpu() { return nameCpu; }
    public void setNameCpu(String nameCpu) { this.nameCpu = nameCpu; }

    public Integer getReleaseCpu() { return releaseCpu; }
    public void setReleaseCpu(Integer releaseCpu) { this.releaseCpu = releaseCpu; }

    public Integer getCoreCpu() { return coreCpu; }
    public void setCoreCpu(Integer coreCpu) { this.coreCpu = coreCpu; }

    public Integer getThreadCpu() { return threadCpu; }
    public void setThreadCpu(Integer threadCpu) { this.threadCpu = threadCpu; }

    public Float getMaxGhzCpu() { return maxGhzCpu; }
    public void setMaxGhzCpu(Float maxGhzCpu) { this.maxGhzCpu = maxGhzCpu; }

    public Float getMinGhzCpu() { return minGhzCpu; }
    public void setMinGhzCpu(Float minGhzCpu) { this.minGhzCpu = minGhzCpu; }

    public String getTypeCodeCpu() { return typeCodeCpu; }
    public void setTypeCodeCpu(String typeCodeCpu) { this.typeCodeCpu = typeCodeCpu; }

    public String getManfCodeCpu() { return manfCodeCpu; }
    public void setManfCodeCpu(String manfCodeCpu) { this.manfCodeCpu = manfCodeCpu; }
}
