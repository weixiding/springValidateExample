package com.example.validate.pojo;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;


public class Department {
    @Null(message="主见不能有值")
    private Integer id;
    @NotNull
    private Integer parentId;
    @NotBlank
    @NotNull
    private String name;
    @PastOrPresent
    @NotNull
    private Date createTime;
    @NotNull
    @NotEmpty
    private List< @Valid Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
