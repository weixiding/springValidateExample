package com.example.validate.controller;


import com.example.validate.pojo.AjaxResult;
import com.example.validate.pojo.Department;
import com.example.validate.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("department")
@Validated//对本类中的方法进行校验
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("add")
    public AjaxResult add(@RequestBody @Valid /*校验后面的参数*/Department department) {
        return AjaxResult.success();
    }

    @PostMapping("addByDepartmentService")
    public AjaxResult addByDepartmentService(@RequestBody Department department) {
        AjaxResult add = departmentService.add(department);
        return add;
    }
}
