package dio.me.spring_boot_api_rest_railway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String healthCheck() {
        return "🚀 API Online! Profile ativo!";
    }
}
