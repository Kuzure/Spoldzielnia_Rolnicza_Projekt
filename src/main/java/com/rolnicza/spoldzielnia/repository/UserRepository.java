package com.rolnicza.spoldzielnia.repository;

import com.rolnicza.spoldzielnia.modele.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
