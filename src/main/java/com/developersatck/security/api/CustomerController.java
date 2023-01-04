package com.developersatck.security.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @PostMapping("/user")
    public String createCustomer(){return "createCustomer";}
    @GetMapping("/user")
    public String findCustomer(){return "findCustomer";}
    @DeleteMapping("/user")
    public String deleteCustomer(){return "deleteCustomer";}
    @PutMapping("/user")
    public String updateCustomer(){return "updateCustomer";}
    @GetMapping("/user/list")
    public String getAllCustomers(){return "getAllCustomers";}
}
