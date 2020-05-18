package com.uppower.exception;

import cn.windyrjc.utils.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.rmi.ServerException;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(ServerException.class)
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Response allExceptionHandler(HttpServletRequest request, Exception exception) {
        return Response.fail(exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Response exceptionHandler(HttpServletRequest request, Exception exception) {
        log.error(exception.getMessage());
        return Response.fail("服务器小抽抽了");
    }
}
