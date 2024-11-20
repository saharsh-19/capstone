package com.example.demo.Transaction.service;


import com.example.demo.Transaction.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);

    Optional<Transaction> getTransactionById(Long id);

    List<Transaction> getAllTransactions();

    Transaction updateTransactionStatus(Long id, String status);

    boolean deleteTransaction(Long id);
}
