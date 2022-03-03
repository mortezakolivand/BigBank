package com.mk.bigBank.service;

import com.mk.bigBank.model.User;
import com.mk.bigBank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public void save(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repo.save(user);
    }
    public void updateCalculationNumber(){
        UserDetails userDetails= (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        User user = repo.findByEmail(userDetails.getUsername());
        int x = user.getNumberOfCalculation()+1;
        user.setNumberOfCalculation(x);
        repo.save(user);
    }

    public int sumOfAllCalculation(){
        List<User> userList =repo.findAll();
        int count =0;
        for (User user: userList ) {
            count+=  user.getNumberOfCalculation();
        }
        return count;
    }


    public List<User> findAll(){
        return repo.findAll();
    }

}
