/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: EmployeeService
 * Author:   Administrator
 * Date:     2020/9/13 19:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.validate.service.impl;

import com.example.validate.pojo.Employee;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/13
 * @since 1.0.0
 */
@Service
@Validated
public class EmployeeService {
    public void add(@Valid Employee employee) {
        System.out.println(employee);
    }

}
