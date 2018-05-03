/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.dao;

import co.com.poli.appcursos_javaee_clasemayo02_pdp.model.Course;
import java.util.List;

/**
 *
 * @author wilmar.duque
 */
public interface ICourseDao {
    
    List<Course> getICourseList();
    Course getICourse(String idCourse);
    void createCourse(Course course);
    void editCourse(Course course);
    void removeCourse(String idCourse);
    
}
