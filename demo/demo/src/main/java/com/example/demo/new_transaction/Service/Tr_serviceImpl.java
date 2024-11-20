package com.example.demo.new_transaction.Service;


import com.example.demo.new_transaction.Entity.Tr_entity;
import com.example.demo.new_transaction.Repository.Tr_repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tr_serviceImpl implements Tr_service{
    private final Tr_repository transactionRepository;

    @Autowired
    public Tr_serviceImpl(Tr_repository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    public List<Tr_entity> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Tr_entity getTransactionById(long transactionId) {
        return transactionRepository.findById(transactionId)
                .orElseThrow(() -> new RuntimeException("transaction not found with id:" +transactionId));
    }

    public Tr_entity createTransaction(Tr_entity transaction) {
        return transactionRepository.save(transaction);
    }

    public Tr_entity updateTransactions(long transactionId, Tr_entity transactionDetails) {
        Tr_entity transaction = transactionRepository.findById(transactionId)
                .orElseThrow(() -> new RuntimeException("transaction not found with id: " + transactionId));

        transaction.setStatus(transactionDetails.getStatus());
        transaction.setType(transactionDetails.getType());
        transaction.setAmount(transactionDetails.getAmount());
        transaction.setAcc_no(transactionDetails.getAcc_no());

        return transactionRepository.save(transaction);
    }

    public void deleteTransactions(long transactionId) {
        Tr_entity transaction = transactionRepository.findById(transactionId)
                .orElseThrow(() -> new RuntimeException("transaction not found with id: " + transactionId));

        transactionRepository.delete(transaction);
    }
}
