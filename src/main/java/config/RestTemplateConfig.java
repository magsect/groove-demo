package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/*
 * OrderService,precisa se comunicar com 
 * o ProductService ( exemploo RestTemplate 
 * para fazer chamadas HTTP para outros microserviço) 
 * 
 * AQUI PODE USAR FEIGN CLIENT TBM
 * 
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}