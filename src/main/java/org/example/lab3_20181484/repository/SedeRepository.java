package org.example.lab3_20181484.repository;

import org.example.lab3_20181484.entity.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepository extends JpaRepository<Sede, Integer> {

}
