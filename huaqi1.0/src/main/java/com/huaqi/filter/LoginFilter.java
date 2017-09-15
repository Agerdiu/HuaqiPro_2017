package com.huaqi.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        // 获得在下面代码中要用的request,response,session对象
        HttpServletRequest servletRequest = (HttpServletRequest) request;
        HttpServletResponse servletResponse = (HttpServletResponse) response;
        HttpSession session = servletRequest.getSession();

        // 获得用户请求的URI
        String path = servletRequest.getRequestURI();
        //System.out.println(path);

        // 从session里取员工工号信息
        String id = (String) session.getAttribute("currentUser");

        /*创建类Constants.java，里面写的是无需过滤的页面
        for (int i = 0; i < Constants.NoFilter_Pages.length; i++) {

            if (path.indexOf(Constants.NoFilter_Pages[i]) > -1) {
                chain.doFilter(servletRequest, servletResponse);
                return;
            }
        }*/
        if(path.contains(".css") || path.contains(".js") || path.contains(".png")|| path.contains(".jpg")){
            //如果发现是css或者js文件，直接放行
            chain.doFilter(request, response);
            return;
        }

        String[] strs = { "evaluateResult","evaluate_common","checkId","login", "register", "evaluate-example", "index","about"}; // 路径中包含这些字符串的,可以不用登录直接访问
        // 特殊用途的路径可以直接访问
        if (strs != null && strs.length > 0) {
            for (String str : strs) {
                if (path.indexOf(str) >= 0) {
                    chain.doFilter(servletRequest, servletResponse);
                    return;
                }
            }
        }
System.out.println("过滤"+path);
        // 判断如果没有取到员工信息,就跳转到登陆页面
        if (id == null || "".equals(id)) {
            // 跳转到登陆页面
            servletResponse.sendRedirect("/huaqi/login.jsp");
        } else {
            // 已经登陆,继续此次请求
            chain.doFilter(request, response);
        }

    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

}
