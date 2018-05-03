/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.business;

import co.com.poli.appcursos_javaee_clasemayo02_pdp.model.Course;
import java.util.List;

/**
 *
 * @author wilmar.duque
 */
public interface ICourseBusiness {
    
    List<Course> getICourseList();
    Course getICourse(String idCourse);
    String createCourse(Course course);
    String editCourse(Course course);
    String removeCourse(String idCourse);
    
}
