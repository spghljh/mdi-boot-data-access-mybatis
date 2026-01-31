package kr.co.mdi.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RouteInfoController {

    private final RequestMappingHandlerMapping handlerMapping;

    public RouteInfoController(RequestMappingHandlerMapping handlerMapping) {
        this.handlerMapping = handlerMapping;
    }

    @GetMapping("/routes")
    public List<String> getAllRoutes() {
        return handlerMapping.getHandlerMethods().keySet().stream()
                .flatMap(info -> info.getPatternsCondition().getPatterns().stream()
                        .map(pattern -> {
                            String methods = info.getMethodsCondition().getMethods().isEmpty()
                                    ? "ALL"
                                    : info.getMethodsCondition().getMethods().iterator().next().name();
                            return pattern + " [" + methods + "]";
                        }))
                .distinct() // 중복 제거
                .sorted()   // 오름차순 정렬
                .collect(Collectors.toList());
    }
}
