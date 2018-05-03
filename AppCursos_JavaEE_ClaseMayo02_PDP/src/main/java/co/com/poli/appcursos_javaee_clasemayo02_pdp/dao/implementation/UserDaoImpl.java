/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos_javaee_clasemayo02_pdp.dao.implementation;

import co.com.poli.appcursos_javaee_clasemayo02_pdp.dao.IUserDao;
import co.com.poli.appcursos_javaee_clasemayo02_pdp.data.UserData;
import co.com.poli.appcursos_javaee_clasemayo02_pdp.model.User;
import java.util.List;

/**
 * Esta capa solo es para acceder a BD, reglas de negocio en el business (validar antes de eliminar, etc...)
 * @author wilmar.duque
 */
public class UserDaoImpl implements IUserDao{

    @Override
    public List<User> getIUserList() {
        return UserData.getUserList();
    }

    @Override
    public User getIUser(String document) {
        User user = null;
        for(User item : UserData.getUserList()){
            if(item.getDocument().equals(document)){
                user = item;
                break;
            }
        }
        return user;
    }

    @Override
    public void createUser(User user) {
        List<User> userList = UserData.getUserList();
        userList.add(user);
        UserData.setUserList(userList);
    }

    @Override
    public void editUser(User user) {
        List<User> userList = UserData.getUserList();
        userList.set(userList.indexOf(user), user);
        UserData.setUserList(userList);
    }

    @Override
    public void removeUser(String document) {
        List<User> userList = UserData.getUserList();
        userList.remove(getIUser(document));
        UserData.setUserList(userList);
    }
    
}
