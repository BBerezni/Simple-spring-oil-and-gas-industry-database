package com.example.simple.spring.oil.and.gas.industry.database.Services;

import com.example.simple.spring.oil.and.gas.industry.database.Model.OilWellModel;
import com.example.simple.spring.oil.and.gas.industry.database.Repository.OilWellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OilWellServices {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private final OilWellRepository oilWellRepository;

    @Autowired
    public OilWellServices(OilWellRepository oilWellRepository) {
        this.oilWellRepository = oilWellRepository;
    }

    public List<OilWellModel> findAll(){
        return oilWellRepository.findAll();
    }

    public int insertOilWell(OilWellModel oilWellModel) {
        String insertWell = "INSERT INTO OilWellDatabase (well_id, well_name, well_perforation, well_tubing_diameter, well_tubing_depth, well_casing_diameter, well_casing_depth, well_drill_date) values (?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(insertWell,
                oilWellModel.getWell_id(),
                oilWellModel.getWell_name(),
                oilWellModel.getWell_perforation(),
                oilWellModel.getWell_tubing_diameter(),
                oilWellModel.getWell_tubing_depth(),
                oilWellModel.getWell_casing_diameter(),
                oilWellModel.getWell_casing_depth(),
                oilWellModel.getWell_drill_date());
    }
}

