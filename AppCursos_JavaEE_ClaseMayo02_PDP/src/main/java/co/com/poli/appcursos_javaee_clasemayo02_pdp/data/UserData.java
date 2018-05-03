/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.data;

import co.com.poli.appcursos_javaee_clasemayo02_pdp.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wilmar.duque
 */
public class UserData {
    
    private static List<User> UserList;
    
    static {
        UserList = new ArrayList<User>(){
            {
                add(new User("1234", "Wilmar", "Duque", "123", "admin", Boolean.TRUE));
                add(new User("1234", "Santiago", "Valencia", "123", "subaltern", Boolean.TRUE));
                add(new User("1234", "Melina", "Mejia", "123", "admin", Boolean.TRUE));
                add(new User("1234", "Kevin", "Garcia", "123", "engeneer", Boolean.TRUE));
            }
        };
    }

    public static List<User> getUserList() {
        return UserList;
    }

    public static void setUserList(List<User> UserList) {
        UserData.UserList = UserList;
    }
    
    
}
