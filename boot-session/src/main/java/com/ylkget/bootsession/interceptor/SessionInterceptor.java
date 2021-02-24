package com.ylkget.bootsession.interceptor;

import com.ylkget.bootsession.constants.Consts;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * SessionInterceptor
 * </p>
 *
 * @author joe 2021/2/24 11:53
 */
@Component
public class SessionInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if (session.getAttribute(Consts.SESSION_KEY) != null) {
            return true;
        }
        // 跳转到登录页
        String url = "/page/login?redirect=true";
        response.sendRedirect(request.getContextPath() + url);
        return false;
    }
}
