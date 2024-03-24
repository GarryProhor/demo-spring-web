package com.example.managerapp.controller;

import com.example.managerapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.stream.IntStream;

@Controller
@RequiredArgsConstructor
@RequestMapping("catalog/products")
public class ProductsController {

    private final ProductService productService;



    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String getProductsList(Model model){
        model.addAttribute("products", this.productService.findAllProducts());
        return  "catalog/products/list";
    }
}
