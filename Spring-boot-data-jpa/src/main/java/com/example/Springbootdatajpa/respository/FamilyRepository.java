package com.example.Springbootdatajpa.respository;

import com.example.Springbootdatajpa.model.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository  extends JpaRepository<Family,Integer> {
}
