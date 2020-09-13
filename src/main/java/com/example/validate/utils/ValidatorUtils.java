/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ValidatorUtils
 * Author:   Administrator
 * Date:     2020/9/13 22:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.validate.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Validator;


@Component
public class ValidatorUtils {
    public static Validator validator;
    @Autowired
    public  void setValidator(Validator validator) {
        ValidatorUtils.validator = validator;
    }



}
