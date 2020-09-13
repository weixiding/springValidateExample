package com.example.validate.controller;

import com.example.validate.annotation.ValidateList;
import com.example.validate.pojo.AjaxResult;
import com.example.validate.pojo.Employee;
import com.example.validate.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.groups.Default;
import java.util.List;

@RestController
@RequestMapping("employee")
@Validated
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("add")
    public AjaxResult add(@RequestBody @Validated({Employee.Add.class, Default.class}) Employee employee) {
        return AjaxResult.success("添加成功");
    }

    @PostMapping("addList")
    public AjaxResult addList(@RequestBody @ValidateList(grouping = {Employee.Add.class,Default.class}) List<Employee> employee) {
        return AjaxResult.success("添加成功");
    }

    @PostMapping("addByService")
    public AjaxResult addByService(@RequestBody Employee employee) {
        employeeService.add(employee);
        return AjaxResult.success("添加成功");
    }

    @PostMapping("update")
    public AjaxResult update(@RequestBody @Validated({Employee.Update.class,Default.class}) Employee employee) {
        return AjaxResult.success("修改成功");
    }

}
