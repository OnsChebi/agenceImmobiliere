package com.tekup.agenceImmobiliere.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.agenceImmobiliere.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer > {
     User findByEmail(String email);

    
    
}
