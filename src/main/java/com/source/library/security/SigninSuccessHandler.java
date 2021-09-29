package com.source.library.security;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;


public class SigninSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
     private static final Logger logger = LoggerFactory.getLogger(SigninSuccessHandler.class);

     public SigninSuccessHandler(String defaultTargetUrl) {
         setDefaultTargetUrl(defaultTargetUrl);
     }
     
     @Override
     public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
    	 
    	 HttpSession session = request.getSession();
         if (session != null) {
             super.onAuthenticationSuccess(request, response, authentication);
             getRedirectStrategy().sendRedirect(request, response, this.getDefaultTargetUrl());
         }
         
         /*
          * for json response
          * 
         String role;
         for (GrantedAuthority grantedAuthority : authentication.getAuthorities()) {
			role = grantedAuthority.getAuthority();
         }
         
         
         response.setContentType("application/json");
	     response.setCharacterEncoding("utf-8");
	      
	     String data = StringUtils.join(new String[] {
	           " { " +
	           " \"message\" : \"로그인하였습니다.\" ,",
	           " \"success\" : true ",
	           "} "});
	      
	      System.out.println("login data:"+data);
	
	      PrintWriter out = response.getWriter();
	      out.print(data);
	      out.flush();
	      out.close();
	      
	      */
     }
}