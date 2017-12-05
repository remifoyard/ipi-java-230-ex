package com.ipiecoles.java.java230.repository;

import org.springframework.data.repository.CrudRepository;

import com.ipiecoles.java.java230.model.Employe;

import java.awt.print.Pageable;
import java.util.*;

import org.joda.time.LocalDate;

public interface EmployeRepository extends PagingAndSortingRepository<Employe,Long>{
    Employe findByMatricule(String matricule);
    List<Employe> findByNomAndPrenom(String nom, String prenom);
    List<Employe> findByNomIgnoreCase(String nom);
    Page<Employe> findByNomIgnoreCase(String nom, Pageable page);
    List<Employe> findByDateEmbaucheBefore(LocalDate date);
    List<Employe> findByDateEmbaucheAfter(LocalDate date);
    List<Employe> findBySalaireGreaterThanOOrderBySalaireDesc(Double salaire);
}
