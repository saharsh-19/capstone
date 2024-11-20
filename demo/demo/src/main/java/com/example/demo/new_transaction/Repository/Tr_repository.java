package com.example.demo.new_transaction.Repository;



import com.example.demo.new_transaction.Entity.Tr_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//CRUD operations
@Repository
public interface Tr_repository extends JpaRepository<Tr_entity,Long> {
}
