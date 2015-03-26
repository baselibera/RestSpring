/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jolab.springrest.web;

import org.jolab.springrest.component.IUser;
import org.jolab.springrest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jolab
 */
@RestController
@RequestMapping("/services")
public class MyRestController {

    @Autowired
    private IUser userService;
    
    
    @RequestMapping(value = "/prova", method = GET)
    public String prova() {
        return "prova";

    }

    @RequestMapping("/person")
    public User getPersonDetail() {
        User user = userService.getUserById(Integer.SIZE);
        return user;
    }

}
