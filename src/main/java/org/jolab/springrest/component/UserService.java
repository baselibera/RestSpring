/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jolab.springrest.component;

import org.jolab.springrest.model.User;
import org.jolab.springrest.component.IUser;
import org.springframework.stereotype.Component;

/**
 *
 * @author jolab
 */
@Component
public class UserService implements IUser{

    @Override
    public User getUserById(Integer id) {
        User result = new User();
        result.setId(id);
        result.setUsername(id + "UserName");
        result.setToken(result.toString());
        
        return result;
        
    }
    
    
}
