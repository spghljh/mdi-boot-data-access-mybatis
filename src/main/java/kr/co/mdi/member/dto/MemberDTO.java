package kr.co.mdi.member.dto;

import java.time.LocalDateTime;

public class MemberDTO {
    private Long idMember;
    private String id;
    private String pass;
    private String name;
    private String email;
    private LocalDateTime registDay;
    private String role;
    private String status;
    private String emailVerified;
    private Integer failCount;
    private LocalDateTime lastLogin;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public MemberDTO() {}

    // Getter & Setter
    public Long getIdMember() { return idMember; }
    public void setIdMember(Long idMember) { this.idMember = idMember; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPass() { return pass; }
    public void setPass(String pass) { this.pass = pass; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDateTime getRegistDay() { return registDay; }
    public void setRegistDay(LocalDateTime registDay) { this.registDay = registDay; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getEmailVerified() { return emailVerified; }
    public void setEmailVerified(String emailVerified) { this.emailVerified = emailVerified; }

    public Integer getFailCount() { return failCount; }
    public void setFailCount(Integer failCount) { this.failCount = failCount; }

    public LocalDateTime getLastLogin() { return lastLogin; }
    public void setLastLogin(LocalDateTime lastLogin) { this.lastLogin = lastLogin; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    public LocalDateTime getDeletedAt() { return deletedAt; }
    public void setDeletedAt(LocalDateTime deletedAt) { this.deletedAt = deletedAt; }
}
