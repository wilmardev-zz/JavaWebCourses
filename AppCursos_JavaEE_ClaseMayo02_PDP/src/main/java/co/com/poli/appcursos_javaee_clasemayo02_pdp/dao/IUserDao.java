/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.dao;

import co.com.poli.appcursos_javaee_clasemayo02_pdp.model.User;
import java.util.List;

/**
 *
 * @author wilmar.duque
 */
public interface IUserDao {
    
    List<User> getIUserList();
    User getIUser(String document);
    void createUser(User user);
    void editUser(User user);
    void removeUser(String document);
    
}
