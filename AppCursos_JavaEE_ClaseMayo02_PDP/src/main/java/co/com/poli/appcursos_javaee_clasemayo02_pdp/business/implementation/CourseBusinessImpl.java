/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.business.implementation;

import co.com.poli.appcursos_javaee_clasemayo02_pdp.business.ICourseBusiness;
import co.com.poli.appcursos_javaee_clasemayo02_pdp.dao.implementation.CourseDaoImpl;
import co.com.poli.appcursos_javaee_clasemayo02_pdp.model.Course;
import java.util.List;

/**
 *
 * @author wilmar.duque
 */
public class CourseBusinessImpl implements ICourseBusiness{
    
        
    private CourseDaoImpl courseDaoImpl = new CourseDaoImpl();
    
    
    
    @Override
    public List<Course> getICourseList() {
        return courseDaoImpl.getICourseList();
    }

    @Override
    public Course getICourse(String idCourse) {
        return courseDaoImpl.getICourse(idCourse);
    }

    @Override
    public String createCourse(Course course) {
        String response = "Course already exist";
        if(course.getIdCourse().equals(courseDaoImpl.getICourse(course.getIdCourse()))){
            response = "Course already exist";
        }else{
            courseDaoImpl.createCourse(course);
            response = "User created successfully";
        }
        return response;
    }

    @Override
    public String editCourse(Course course) {
        courseDaoImpl.editCourse(course);
        return "Course modified successfully";
    }

    @Override
    public String removeCourse(String idCourse) {
        String response = "Course deleted successfully";
        if(idCourse.equals(getICourse(idCourse).getIdCourse())){
            courseDaoImpl.removeCourse(idCourse);
        }else{
            response = "Course don't exist";
        }
        return response;
    }
    
}
