fetch('/routes')
    .then(res => res.json())
    .then(data => {
        const otherBody = document.getElementById('otherRoutes');
        const apiBody = document.getElementById('apiRoutes');
        const csrBody = document.getElementById('csrRoutes');
        const ssrBody = document.getElementById('ssrRoutes');

        otherBody.innerHTML = '';
        apiBody.innerHTML = '';
        csrBody.innerHTML = '';
        ssrBody.innerHTML = '';

        // "/api/cpus [GET]" 형태를 객체로 변환
        const routes = data.map(item => {
            const uri = item.substring(0, item.indexOf(" ["));
            const method = item.substring(item.indexOf("[") + 1, item.indexOf("]"));
            return { uri, method };
        });

        // URI 기준 오름차순 정렬
        routes.sort((a, b) => a.uri.localeCompare(b.uri));

        // 그룹별 출력
        routes.forEach(route => {
            const row = `
                <tr>
                    <td class="method-col"><strong style="color:black;">${route.method}</strong></td>
                    <td class="uri-col"><a href="${route.uri}">${route.uri}</a></td>
                </tr>`;

            if (route.uri.startsWith("/api")) {
                apiBody.insertAdjacentHTML('beforeend', row);
            } else if (route.uri.startsWith("/csr")) {
                csrBody.insertAdjacentHTML('beforeend', row);
            } else if (route.uri.startsWith("/ssr")) {
                ssrBody.insertAdjacentHTML('beforeend', row);
            } else {
                otherBody.insertAdjacentHTML('beforeend', row);
            }
        });
    });
