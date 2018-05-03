/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.business.implementation;

import co.com.poli.appcursos_javaee_clasemayo02_pdp.business.IUserBusiness;
import co.com.poli.appcursos_javaee_clasemayo02_pdp.dao.implementation.UserDaoImpl;
import co.com.poli.appcursos_javaee_clasemayo02_pdp.model.User;
import java.util.List;

/**
 *
 * @author wilmar.duque
 */
public class UserBusinessImpl implements IUserBusiness{
    
    UserDaoImpl userDaoImpl = new UserDaoImpl();
    
    
    
    @Override
    public List<User> getIUserList() {
        return userDaoImpl.getIUserList();
    }

    @Override
    public User getIUser(String document) {
        return userDaoImpl.getIUser(document);
    }

    @Override
    public String createUser(User user) {
        String response = "User already exist";
        if(user.getDocument().equals(userDaoImpl.getIUser(user.getDocument()))){
            response = "User already exist";
        }else{
            userDaoImpl.createUser(user);
            response = "User created successfully";
        }
        return response;
    }

    @Override
    public String editUser(User user) {
        userDaoImpl.editUser(user);
        return "User modified successfully";
    }

    @Override
    public String removeUser(String document) {
        String response = "User deleted successfully";
        if(document.equals(getIUser(document).getDocument())){
            userDaoImpl.removeUser(document);
        }else{
            response = "User don't exist";
        }
        return response;
    }
}
