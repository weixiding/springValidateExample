package com.example.validate.annotation;

import com.example.validate.annotation.validate.MultipleOfThreeForInteger;
import com.example.validate.annotation.validate.MultipleOfThreeForList;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 自定义注解进行验证
 */
@Target({  FIELD })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {MultipleOfThreeForInteger.class, MultipleOfThreeForList.class})
public @interface MultipleOfThree {
    String message() default "必须是3的倍数";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
