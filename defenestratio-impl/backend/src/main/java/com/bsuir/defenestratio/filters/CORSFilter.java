package com.bsuir.defenestratio.filters;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CORSFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        filterChain.doFilter(servletRequest, httpServletResponse);
    }

    @Override
    public void destroy() {

    }
}
