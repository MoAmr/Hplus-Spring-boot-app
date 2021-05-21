package com.test.hplus.restcontroller;

import com.test.hplus.beans.Product;
import com.test.hplus.repositrory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohammed Amr
 * @created 21/05/2021 - 03:30
 * @project hplus-app
 */

//@Controller
@RestController
public class ProductsRestController {

    @Autowired
    private ProductRepository productRepository;

    /*@GetMapping("/hplus/rest/products")
    @ResponseBody
    public List<Product> getProducts() {
        // call product repo
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;
    }*/

    @GetMapping("/hplus/rest/products")
    public ResponseEntity getProductsByResponseParam(@RequestParam("name") String name) {
        List<Product> products = productRepository.searchByName(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
