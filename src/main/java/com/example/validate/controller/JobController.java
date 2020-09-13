package com.example.validate.controller;


import com.example.validate.pojo.AjaxResult;
import com.example.validate.pojo.Department;
import com.example.validate.pojo.Job;
import com.example.validate.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("job")
@Validated//对本类中的方法进行校验
public class JobController {
    @PostMapping("add")
    public AjaxResult add(@RequestBody @Valid /*校验后面的参数*/Job department) {
        return AjaxResult.success();
    }
}
