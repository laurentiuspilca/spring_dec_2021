package com.example.proxy;

import com.example.model.HttpBinResponse;
import com.example.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "httpBin", url = "http://httpbin.org")
public interface HttpBinProxy {

  @PostMapping("/anything")
  ResponseEntity<HttpBinResponse> sendProduct(@RequestBody Product p);
}
