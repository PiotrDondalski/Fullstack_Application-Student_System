package com.pdondalski.studentsystem.repository;

import com.pdondalski.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{ //podlaczenie jpa repository - wskazanie na
    //nazwe klasy modelu (Student) i podanie typu klucza glownego (Integer)
}
