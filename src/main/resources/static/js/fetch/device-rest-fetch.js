document.addEventListener("DOMContentLoaded", () => {
    fetch("/api/devices")
        .then(res => res.json())
        .then(data => {
            const tbody = document.getElementById("deviceBody");
            tbody.innerHTML = "";
            if (data.length === 0) {
                tbody.innerHTML = '<tr><td colspan="8" class="text-center text-muted">데이터가 없습니다.</td></tr>';
            } else {
                data.forEach(device => {
                    tbody.innerHTML += `
                        <tr>
                            <td>${device.idDevice}</td>
                            <td>${device.nameDevice}</td>
                            <td>${device.idCpu}</td>
                            <td>${device.lineupDevice}</td>
                            <td>${device.releaseDevice}</td>
                            <td>${device.weightDevice}</td>
                            <td>${device.typeCodeDevice}</td>
                            <td>${device.manfCodeDevice}</td>
                        </tr>`;
                });
            }
        })
        .catch(err => console.error("Device 데이터 로딩 실패:", err));
});
