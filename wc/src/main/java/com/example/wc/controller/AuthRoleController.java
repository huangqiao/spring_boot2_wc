package com.example.wc.controller;

import com.example.wc.model.AuthRole;
import com.example.wc.service.AuthRoleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthRoleController {

    @Autowired
    private AuthRoleService authRoleService;

    @RequestMapping(value = "/role", method = RequestMethod.GET)
    public AuthRole findOneCity() {
        String roleId = "ROLE_ADMIN";
        return authRoleService.selectByPrimaryKey(roleId);
    }

    @RequestMapping(value = "/roleAll/{pageSize}/{pageNum}", method = RequestMethod.GET)
    public PageInfo<AuthRole> selectAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        return authRoleService.selectAll(pageNum, pageSize);
    }

}
