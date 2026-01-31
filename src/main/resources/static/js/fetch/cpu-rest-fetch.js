document.addEventListener("DOMContentLoaded", () => {
    fetch("/api/cpus")
        .then(res => res.json())
        .then(data => {
            const tbody = document.getElementById("cpuBody");
            tbody.innerHTML = "";
            if (data.length === 0) {
                tbody.innerHTML = '<tr><td colspan="9" class="text-center text-muted">데이터가 없습니다.</td></tr>';
            } else {
                data.forEach(cpu => {
                    tbody.innerHTML += `
                        <tr>
                            <td>${cpu.idCpu}</td>
                            <td>${cpu.nameCpu}</td>
                            <td>${cpu.releaseCpu}</td>
                            <td>${cpu.coreCpu}</td>
                            <td>${cpu.threadCpu}</td>
                            <td>${cpu.maxGhzCpu}</td>
                            <td>${cpu.minGhzCpu}</td>
                            <td>${cpu.typeCodeCpu}</td>
                            <td>${cpu.manfCodeCpu}</td>
                        </tr>`;
                });
            }
        })
        .catch(err => console.error("CPU 데이터 로딩 실패:", err));
});
