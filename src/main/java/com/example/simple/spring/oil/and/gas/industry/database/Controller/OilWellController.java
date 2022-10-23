package com.example.simple.spring.oil.and.gas.industry.database.Controller;

import com.example.simple.spring.oil.and.gas.industry.database.Model.OilWellModel;
import com.example.simple.spring.oil.and.gas.industry.database.Services.OilWellServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OilWellController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private final OilWellServices oilWellServices;

    public OilWellController(OilWellServices oilWellServices) {
        this.oilWellServices = oilWellServices;
    }

    @GetMapping("/api/oilwell/all")
    public List<OilWellModel> findAll(){
        return oilWellServices.findAll();
    }

    @PostMapping("/api/oilwell/insert")
    public void insertOilWell(@RequestBody OilWellModel oilWellModel){
        oilWellServices.insertOilWell(oilWellModel);
    }

}
