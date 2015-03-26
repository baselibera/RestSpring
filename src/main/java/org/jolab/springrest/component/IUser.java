/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jolab.springrest.component;

import org.jolab.springrest.model.User;
import org.springframework.stereotype.Component;

/**
 *
 * @author jolab
 */

public interface IUser {
    public User getUserById(Integer id);
}
