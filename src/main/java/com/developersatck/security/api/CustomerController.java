package com.developersatck.security.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @PostMapping("/user/create")
    public String createCustomer(){return "createCustomer";}
    @GetMapping("/user/find")
    public String findCustomer(){return "findCustomer";}
    @DeleteMapping("/user/remove")
    public String deleteCustomer(){return "deleteCustomer";}
    @PutMapping("/user/modify")
    public String updateCustomer(){return "updateCustomer";}
    @GetMapping("/user/list")
    public String getAllCustomers(){return "getAllCustomers";}
}
