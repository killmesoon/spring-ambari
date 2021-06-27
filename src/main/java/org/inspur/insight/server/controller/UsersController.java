package org.inspur.insight.server.controller;


import org.inspur.insight.server.entity.Users;
import org.inspur.insight.server.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dky
 * @since 2021-06-27
 */
@RestController
@RequestMapping("/server/users")
public class UsersController {

    @Autowired
    private IUsersService usersService;

    @GetMapping("/list")
    public List<Users> getAllUser() {
        return usersService.list();
    }
}
