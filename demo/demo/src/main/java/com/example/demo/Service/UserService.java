package com.example.demo.Service;
import com.example.demo.DTO.UserDTO;
import com.example.demo.Entity.User;
import com.example.demo.new_transaction.Entity.Tr_entity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User register(UserDTO userDTO);
    String login(String username, String password);
    User getUserById(Long id);
    User updateUser(Long id, UserDTO userDTO);
    void resetPassword(String username, String newPassword);
    List<User> getAllUsers();
}