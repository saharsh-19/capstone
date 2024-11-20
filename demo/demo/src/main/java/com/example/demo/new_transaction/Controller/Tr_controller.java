package com.example.demo.new_transaction.Controller;


import com.example.demo.new_transaction.Entity.Tr_entity;
import com.example.demo.new_transaction.Service.Tr_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api/transact")
public class Tr_controller {



    private final Tr_service service;

    @Autowired
    public Tr_controller(Tr_service service) {
        this.service = service;
    }

    @GetMapping
    public List<Tr_entity> getAllTransactions() {
        return service.getAllTransactions();
    }

    @GetMapping("/{id}")
    public Tr_entity getTransactionById(@PathVariable("id") long transactionId) {
        return service.getTransactionById(transactionId);
        //return service.getTransactionById(transactionId);
    }

    @PostMapping("/create")
    public Tr_entity createTransaction(@RequestBody Tr_entity transaction) {
        return service.createTransaction(transaction);
    }

    @PutMapping("/{id}")  //Update
    public Tr_entity updateTransactions(@PathVariable("id") long transactionId, @RequestBody Tr_entity transaction) {
        return service.updateTransactions(transactionId, transaction);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransactions(@PathVariable("id") long transactionId) {
        service.deleteTransactions(transactionId);
        return ResponseEntity.noContent().build();
    }
}
