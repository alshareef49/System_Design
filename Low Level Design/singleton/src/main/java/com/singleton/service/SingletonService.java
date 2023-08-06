package com.singleton.service;

import com.singleton.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SingletonService {
    private List<ProductDTO> productList = new ArrayList<>();

    public void addProduct(ProductDTO product) {
        productList.add(product);
    }

    public List<ProductDTO> getAllProducts() {
        return productList;
    }
}
