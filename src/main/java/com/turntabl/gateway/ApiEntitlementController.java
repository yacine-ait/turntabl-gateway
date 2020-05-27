package com.turntabl.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ApiEntitlementController {

    @GetMapping("/apis")
    @ResponseBody
    public List<ApiDetail> getEntitledApis() {
        return Arrays.asList(new ApiDetail("http://localhost/trades/v2/api-docs", "PB", "Trades"),
                new ApiDetail("http://localhost/positions/v2/api-docs", "PB", "Positions"),
                new ApiDetail("http://localhost/products/v2/api-docs", "Shared", "Products")
        );
    }
}
