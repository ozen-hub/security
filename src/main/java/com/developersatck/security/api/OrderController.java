package com.developersatck.security.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    @PostMapping("/user")
    public String createOrder(){return "createOrder";}
    @GetMapping
    public String findOrder(){return "findOrder";}
    @DeleteMapping("/user")
    public String deleteOrder(){return "deleteOrder";}
    @PutMapping("/user")
    public String updateOrder(){return "updateOrder";}
    @GetMapping
    public String getAllOrders(){return "getAllOrders";}
}
