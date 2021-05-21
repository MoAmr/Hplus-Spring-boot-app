package com.test.hplus.restcontroller;

import com.test.hplus.beans.Product;
import com.test.hplus.repositrory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohammed Amr
 * @created 21/05/2021 - 03:30
 * @project hplus-app
 */

@Controller
public class ProductsRestController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/hplus/rest/products")
    @ResponseBody
    public List<Product> getProducts() {
        // call product repo
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;
    }
}
