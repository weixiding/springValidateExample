/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MultipleOfThreeForInteger
 * Author:   Administrator
 * Date:     2020/9/13 21:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.validate.annotation.validate;

import com.example.validate.annotation.MultipleOfThree;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/13
 * @since 1.0.0
 */
public class MultipleOfThreeForList implements ConstraintValidator<MultipleOfThree, List> {


    @Override
    public void initialize(MultipleOfThree constraintAnnotation) {

    }

    @Override
    public boolean isValid(List value, ConstraintValidatorContext context) {
        if(value == null) {
            return true;
        }

        return value.size() % 3 == 0;
    }
}
