package com.example.managerapp.repository;

import com.example.managerapp.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Repository
public class InMemoryProductRepository implements ProductRepository{

    private final List<Product> products = Collections.synchronizedList(new LinkedList<>());

}
