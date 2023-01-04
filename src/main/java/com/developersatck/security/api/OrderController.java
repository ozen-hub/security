package com.developersatck.security.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    @PostMapping("/user/create")
    public String createOrder(){return "createOrder";}
    @GetMapping
    public String findOrder(){return "findOrder";}
    @DeleteMapping("/user/remove")
    public String deleteOrder(){return "deleteOrder";}
    @PutMapping("/user/modify")
    public String updateOrder(){return "updateOrder";}
    @GetMapping("/list")
    public String getAllOrders(){return "getAllOrders";}
}
