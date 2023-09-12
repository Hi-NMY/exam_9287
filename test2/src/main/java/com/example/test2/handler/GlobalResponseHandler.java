package com.example.test2.handler;

import com.example.test2.bean.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice(annotations = RestController.class)
public class GlobalResponseHandler implements ResponseBodyAdvice<Object>{

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType,
            Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest,
            ServerHttpResponse serverHttpResponse) {

        if (body instanceof Response) {
            return body;
        }

        Response response = new Response();
        response.setCode(0);
        response.setMessage("ok");
        response.setResult(body);

        if (body instanceof String) {
            String s = null;
            try {
                s = new ObjectMapper().writeValueAsString(response);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return s;
        }

        return response;
    }

}
