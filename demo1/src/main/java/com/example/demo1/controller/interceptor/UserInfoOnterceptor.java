package com.example.demo1.controller.interceptor;

import com.example.demo1.exception.GraceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class UserInfoOnterceptor implements HandlerInterceptor {
    /**
     *
     * @param request
     * @param response
     * @param handler
     * @return false 被拦截，true 放行
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
        String userId=request.getHeader("userId");
        String userToken=request.getHeader("userToken");
        if(StringUtils.isEmpty(userId)|| StringUtils.isEmpty(userToken)){
            log.error("user check error,info error");
            GraceException.display("user check error,info error");
            return false;
        }
        if(!userId.equals("1001") || !userToken.equalsIgnoreCase("abcxzy")){
            log.error("user auth fail");
            GraceException.display("user auth fail");
            return false;
        }

        return true;
    }

    /**
     *
     * @param request
     * @param response
     * @return
     */
//    @Override
//    public boolean postHandle(HttpServletRequest request, HttpServletResponse response){
//        return false;
//    }

}
