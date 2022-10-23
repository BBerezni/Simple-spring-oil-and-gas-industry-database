package com.example.simple.spring.oil.and.gas.industry.database.Model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "OilWellDatabase")
public class OilWellModel {

    @Id
    @Column(name = "well_id")
    public Integer well_id;
    @Column(name = "well_name")
    public String well_name;
    @Column(name = "well_perforation")
    public String well_perforation;
    @Column(name = "well_tubing_diameter")
    public double well_tubing_diameter;
    @Column(name = "well_tubing_depth")
    public double well_tubing_depth;
    @Column(name = "well_casing_diameter")
    public double well_casing_diameter;
    @Column(name = "well_casing_depth")
    public double well_casing_depth;
    @Column(name = "well_drill_date")
    public Date well_drill_date;

    public OilWellModel() {
    }

    public OilWellModel(int well_id, String well_name, String well_perforation,
                        double well_tubing_diameter, double well_tubing_depth,
                        double well_casing_diameter, double well_casing_depth,
                        Date well_drill_date) {
        this.well_id = well_id;
        this.well_name = well_name;
        this.well_perforation = well_perforation;
        this.well_tubing_diameter = well_tubing_diameter;
        this.well_tubing_depth = well_tubing_depth;
        this.well_casing_diameter = well_casing_diameter;
        this.well_casing_depth = well_casing_depth;
        this.well_drill_date = well_drill_date;
    }

    public int getWell_id() {
        return well_id;
    }

    public void setWell_id(int well_id) {
        this.well_id = well_id;
    }

    public String getWell_name() {
        return well_name;
    }

    public void setWell_name(String well_name) {
        this.well_name = well_name;
    }

    public String getWell_perforation() {
        return well_perforation;
    }

    public void setWell_perforation(String well_perforation) {
        this.well_perforation = well_perforation;
    }

    public double getWell_tubing_diameter() {
        return well_tubing_diameter;
    }

    public void setWell_tubing_diameter(double well_tubing_diameter) {
        this.well_tubing_diameter = well_tubing_diameter;
    }

    public double getWell_tubing_depth() {
        return well_tubing_depth;
    }

    public void setWell_tubing_depth(double well_tubing_depth) {
        this.well_tubing_depth = well_tubing_depth;
    }

    public double getWell_casing_diameter() {
        return well_casing_diameter;
    }

    public void setWell_casing_diameter(double well_casing_diameter) {
        this.well_casing_diameter = well_casing_diameter;
    }

    public double getWell_casing_depth() {
        return well_casing_depth;
    }

    public void setWell_casing_depth(double well_casing_depth) {
        this.well_casing_depth = well_casing_depth;
    }

    public Date getWell_drill_date() {
        return well_drill_date;
    }

    public void setWell_drill_date(Date well_drill_date) {
        this.well_drill_date = well_drill_date;
    }

    @Override
    public String toString() {
        return "OilWellModel{" +
                "well_id=" + well_id +
                ", well_name='" + well_name + '\'' +
                ", well_perforation='" + well_perforation + '\'' +
                ", well_tubing_diameter=" + well_tubing_diameter +
                ", well_tubing_depth=" + well_tubing_depth +
                ", well_casing_diameter=" + well_casing_diameter +
                ", well_casing_depth=" + well_casing_depth +
                ", well_drill_date=" + well_drill_date +
                '}';
    }
}