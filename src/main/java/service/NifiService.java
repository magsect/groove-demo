package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NifiService {

    @Value("${nifi.endpoint.url}")
    private String nifiEndpointUrl;

    private final RestTemplate restTemplate;

    public NifiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendDataToNiFi(String data) {
        restTemplate.postForObject(nifiEndpointUrl, data, String.class);
    }
}