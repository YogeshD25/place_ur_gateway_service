package com.imutable.coding.cloud.gateway.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/placeServiceFallBack")
    public String placeServiceFallBackMethod() {
        return "Foundation Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/ratingServiceFallBack")
    public String ratingServiceFallBackMethod() {
        return "Rating Service is taking longer than Expected." +
                " Please try again later";
    }
}
