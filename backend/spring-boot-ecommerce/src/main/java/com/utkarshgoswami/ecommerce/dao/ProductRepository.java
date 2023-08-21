package com.utkarshgoswami.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarshgoswami.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
