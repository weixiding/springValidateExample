package com.example.validate.pojo;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class Employee {
    public interface Add {}
    public interface Update{}
    //分组参数校验,在修改时生效
    @Null(groups = Add.class)
    @NotNull(groups = Update.class)
    private Integer id;

    /*
     如果没有指定验证组，则属于验证组
     */
    @NotEmpty
    @NotNull
    private String name;
    @Valid
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
