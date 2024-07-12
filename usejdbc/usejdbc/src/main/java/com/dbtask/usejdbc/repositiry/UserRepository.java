package com.dbtask.usejdbc.repositiry;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbtask.usejdbc.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

