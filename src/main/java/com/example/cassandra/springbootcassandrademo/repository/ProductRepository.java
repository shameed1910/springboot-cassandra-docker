package com.example.cassandra.springbootcassandrademo.repository;

import com.example.cassandra.springbootcassandrademo.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product,Integer> {
}
