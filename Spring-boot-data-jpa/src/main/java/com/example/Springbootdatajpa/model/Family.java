package com.example.Springbootdatajpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "family")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Family {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String age;
    private Date dob;
}
