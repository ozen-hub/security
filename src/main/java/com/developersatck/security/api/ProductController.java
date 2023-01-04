package com.developersatck.security.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @PostMapping("/member/create")
    public String createProduct(){return "createProduct";}
    @GetMapping("/user/find")
    public String findProduct(){return "findProduct";}
    @DeleteMapping
    public String deleteProduct(){return "deleteProduct";}
    @PutMapping
    public String updateProduct(){return "updateProduct";}
    @GetMapping("/user/list")
    public String getAllProducts(){return "getAllProducts";}
}
