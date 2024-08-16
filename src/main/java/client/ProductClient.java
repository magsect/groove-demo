package client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.cloud.openfeign.FeignClient;


//@FeignClient(name = "product-service", url = "${product.service.url}")
public interface ProductClient {

   // @GetMapping("/products/{id}")
    //ProductDTO getProductById(@PathVariable("id") Long id);
}