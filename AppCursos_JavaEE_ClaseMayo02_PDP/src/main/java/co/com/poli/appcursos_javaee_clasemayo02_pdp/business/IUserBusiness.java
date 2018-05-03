/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.business;

import co.com.poli.appcursos_javaee_clasemayo02_pdp.model.User;
import java.util.List;

/**
 *
 * @author wilmar.duque
 */
public interface IUserBusiness {
    
    List<User> getIUserList();
    User getIUser(String document);
    String createUser(User user);
    String editUser(User user);
    String removeUser(String document);
}
