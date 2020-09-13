/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: DepartmentService
 * Author:   Administrator
 * Date:     2020/9/13 19:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.validate.service;

import com.example.validate.pojo.AjaxResult;
import com.example.validate.pojo.Department;

import javax.validation.Valid;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/13
 * @since 1.0.0
 */
//如果是接口的话，需要在接口上面做验证，在实现类中加注解,并且service的异常和controller的异常类型不同
public interface DepartmentService {
    public AjaxResult add( @Valid Department department);

}
