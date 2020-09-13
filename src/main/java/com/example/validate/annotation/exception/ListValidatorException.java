/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ListValidatorException
 * Author:   Administrator
 * Date:     2020/9/13 22:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.validate.annotation.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/9/13
 * @since 1.0.0
 */
public class ListValidatorException extends RuntimeException {
    private Map data;

    public ListValidatorException(Map data) {
        super();
        this.data = data;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }
}
