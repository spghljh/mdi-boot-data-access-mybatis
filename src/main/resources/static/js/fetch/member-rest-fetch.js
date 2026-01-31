document.addEventListener("DOMContentLoaded", () => {
    fetch("/api/members")
        .then(res => res.json())
        .then(data => {
            const tbody = document.getElementById("memberBody");
            tbody.innerHTML = "";
            if (data.length === 0) {
                tbody.innerHTML = '<tr><td colspan="13" class="text-center text-muted">데이터가 없습니다.</td></tr>';
            } else {
                data.forEach(member => {
                    tbody.innerHTML += `
                        <tr>
                            <td>${member.idMember}</td>
                            <td>${member.loginId}</td>
                            <td>${member.pass}</td>
                            <td>${member.name}</td>
                            <td>${member.email}</td>
                            <td>${member.registDay}</td>
                            <td>${member.role}</td>
                            <td>${member.status}</td>
                            <td>${member.emailVerified}</td>
                            <td>${member.failCount}</td>
                            <td>${member.lastLogin}</td>
                            <td>${member.updatedAt}</td>
                            <td>${member.deletedAt}</td>
                        </tr>`;
                });
            }
        })
        .catch(err => console.error("Member 데이터 로딩 실패:", err));
});
