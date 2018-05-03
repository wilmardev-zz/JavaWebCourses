/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.dao.implementation;

import co.com.poli.appcursos_javaee_clasemayo02_pdp.dao.ICourseDao;
import co.com.poli.appcursos_javaee_clasemayo02_pdp.data.CourseData;
import co.com.poli.appcursos_javaee_clasemayo02_pdp.model.Course;
import java.util.List;

/**
 *
 * @author wilmar.duque
 */
public class CourseDaoImpl implements ICourseDao{

    @Override
    public List<Course> getICourseList() {
        return CourseData.getCourseList();
    }

    @Override
    public Course getICourse(String idCourse) {
        Course course = null;
        for(Course item : CourseData.getCourseList()){
            if(item.getIdCourse().equals(idCourse)){
                course = item;
                break;
            }
        }
        return course;
    }

    @Override
    public void createCourse(Course course) {
        List<Course> courseList = CourseData.getCourseList();
        courseList.add(course);
        CourseData.setCourseList(courseList);
    }

    @Override
    public void editCourse(Course course) {
        List<Course> courseList = CourseData.getCourseList();
        courseList.set(courseList.indexOf(course),course);
        CourseData.setCourseList(courseList);
    }

    @Override
    public void removeCourse(String idCourse) {
        List<Course> courseList = CourseData.getCourseList();
        courseList.remove(getICourse(idCourse));
        CourseData.setCourseList(courseList);
    }
}
