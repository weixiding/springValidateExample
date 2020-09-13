package com.example.validate.controller;

import com.example.validate.annotation.exception.ListValidatorException;
import com.example.validate.pojo.AjaxResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import javax.validation.ValidationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ControllerAdvice(basePackages = "com.example.validate.controller")
@ResponseBody
public class MyControllerAdvice {

    @ExceptionHandler
    public AjaxResult handlerMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        Map<String, Object> message = new HashMap<>();
        for (FieldError fieldError : fieldErrors) {
            String field = fieldError.getField();
            String defaultMessage = fieldError.getDefaultMessage();
            message.put(field, defaultMessage);
        }
        return AjaxResult.error("参数校验失败", message);
    }

    @ExceptionHandler
    public AjaxResult handlerConstraintViolationException(ConstraintViolationException exception) {
        Set<ConstraintViolation<?>> constraintViolations = exception.getConstraintViolations();
        Map<String, Object> data = new HashMap<>();

        for (ConstraintViolation<?> constraintViolation : constraintViolations) {
            String propertyPath =
                    constraintViolation.getPropertyPath().toString();
            String message = constraintViolation.getMessage();
            data.put(propertyPath,message);
        }
        return new AjaxResult(AjaxResult.Type.ERROR,"service参数校验失败",data);

    }

    @ExceptionHandler
    public AjaxResult handlerValidationException(ValidationException exception) {
        ListValidatorException cause = (ListValidatorException) exception.getCause();
        Map<Integer,Map<String,Object>> exceptionCause = cause.getData();
        return new AjaxResult(AjaxResult.Type.ERROR,"service参数校验失败",exceptionCause);

    }

    @ExceptionHandler
    public AjaxResult handlerException(Exception exception) {
        return  AjaxResult.error("系统异常",exception.getCause());

    }
}
