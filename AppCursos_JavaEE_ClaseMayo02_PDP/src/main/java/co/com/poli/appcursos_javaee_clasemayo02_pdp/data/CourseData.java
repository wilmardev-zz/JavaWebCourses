/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.data;

import co.com.poli.appcursos_javaee_clasemayo02_pdp.model.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wilmar.duque
 */
public class CourseData {
    
    private static List<Course> CourseList;
    
    static{
        CourseList = new ArrayList<Course>(){
            {
                add(new Course("01", "PDP", 4.5, 500.2, Boolean.TRUE));
                add(new Course("02", "Etica", 1.0, 10.5, Boolean.TRUE));
                add(new Course("03", "Gestion", 4.0, 250.5, Boolean.TRUE));
                add(new Course("04", "Modelos", 5.0, 1000.0, Boolean.TRUE));
            }
        };
    }

    public static List<Course> getCourseList() {
        return CourseList;
    }

    public static void setCourseList(List<Course> CourseList) {
        CourseData.CourseList = CourseList;
    }

}
