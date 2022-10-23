package com.example.simple.spring.oil.and.gas.industry.database.Repository;

import com.example.simple.spring.oil.and.gas.industry.database.Model.OilWellModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OilWellRepository extends JpaRepository<OilWellModel, Integer> {

    List<OilWellModel> findAll();


}
