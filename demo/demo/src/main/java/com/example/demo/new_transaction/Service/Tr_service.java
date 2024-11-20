package com.example.demo.new_transaction.Service;


import com.example.demo.new_transaction.Entity.Tr_entity;

import java.util.List;

public interface Tr_service {

    List<Tr_entity> getAllTransactions();

    Tr_entity getTransactionById(long trId);

    Tr_entity createTransaction(Tr_entity transaction);

    Tr_entity updateTransactions(long trId, Tr_entity transactionDetails);

    void deleteTransactions(long trId);
}
