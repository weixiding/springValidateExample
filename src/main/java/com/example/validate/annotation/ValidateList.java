package com.example.validate.annotation;

import com.example.validate.annotation.validate.ValidateListValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 自定义进行校验list 里面对象的注解
 */
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {ValidateListValidator.class})
public @interface ValidateList {
    Class<?>[] grouping() default { };

    String message() default "";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
