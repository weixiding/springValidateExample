/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Job
 * Author:   Administrator
 * Date:     2020/9/13 20:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.validate.pojo;

import com.example.validate.annotation.MultipleOfThree;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/13
 * @since 1.0.0
 */
public class Job {
    /*
    注解一般不会管null 的情况
    null 的处理由not null 注解处理
    同一个注解可以对多个类生效
     */

    /*
        自定义注解
        实现场景
        1 对于integer 而言，必须是3的倍数
        2 对于list 而言，list中的元素个数，必须是3的倍数
        准备写一个注解去实现3的倍数的验证
        并且支持两种类型的参数校验
        1 integer
        2 list
     */
    @MultipleOfThree
    private Integer id;
    @Size(min = 1)
    private String name;
    @Size(min = 1)
    @MultipleOfThree
    private List<String> labels;

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

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
}
