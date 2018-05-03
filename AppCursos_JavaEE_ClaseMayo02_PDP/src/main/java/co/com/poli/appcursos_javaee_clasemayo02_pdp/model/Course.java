/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.model;

import java.util.Objects;

/**
 *
 * @author wilmar.duque
 */
public class Course {
    private String idCourse;
    private String name;
    private Double hours;
    private Double courseValue;
    private Boolean status;

    public Course(String idCourse, String name, Double hours, Double courseValue, Boolean status) {
        this.idCourse = idCourse;
        this.name = name;
        this.hours = hours;
        this.courseValue = courseValue;
        this.status = status;
    }

    public String getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(String idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public Double getCourseValue() {
        return courseValue;
    }

    public void setCourseValue(Double courseValue) {
        this.courseValue = courseValue;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.idCourse);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.idCourse, other.idCourse)) {
            return false;
        }
        return true;
    }
    
    
    
}
