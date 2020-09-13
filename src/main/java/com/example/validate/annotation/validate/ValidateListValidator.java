/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ValidateListValidator
 * Author:   Administrator
 * Date:     2020/9/13 22:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.validate.annotation.validate;

import com.example.validate.annotation.ValidateList;
import com.example.validate.annotation.exception.ListValidatorException;
import com.example.validate.utils.ValidatorUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 〈进行list存储内容的校验功能注解〉<br>
 * 〈〉
 *
 * @author weijinhao
 * @create 2020/9/13
 * @since 1.0.0
 */
public class ValidateListValidator implements ConstraintValidator<ValidateList, List> {
    private Class<?>[] groups;
    @Override
    public void initialize(ValidateList constraintAnnotation) {
        this.groups = constraintAnnotation.grouping();
    }

    @Override
    public boolean isValid(List value, ConstraintValidatorContext context) {
        Map<Integer, Map<String,Object>> validateMessage = new HashMap<>();
        for(int i = 0; i < value.size(); i++) {
           //获取validator
           Set<ConstraintViolation<Object>> validate = ValidatorUtils.validator.validate(value.get(i), groups);
            Map<String, Object> chengyuan = new HashMap<>();
            for (ConstraintViolation<Object> constraintViolation : validate) {
                String propertyPath =
                        constraintViolation.getPropertyPath().toString();
                String message = constraintViolation.getMessage();
                chengyuan.put(propertyPath,message);
            }
            if(!chengyuan.isEmpty()) {
                validateMessage.put(i, chengyuan);
            }
        }
        if(!validateMessage.isEmpty()) {
            throw  new ListValidatorException(validateMessage);
        }
        return true;
    }
}
