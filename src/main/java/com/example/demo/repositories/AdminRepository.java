package com.example.demo.repositories;

import com.example.demo.model.AdminLogin;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

//@Repository
//public interface AdminRepository extends JpaRepository<AdminLogin, Integer> {
//
//    AdminLogin findByUserName(String userName);
//
//}

@Repository
public interface AdminRepository extends JpaRepository<AdminLogin, Integer>{
    AdminLogin findByUserName(String userName);

}
ue

















