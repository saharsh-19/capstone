package com.example.demo.Transaction.repository;


import com.example.demo.Transaction.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // You can add custom queries here if needed
}