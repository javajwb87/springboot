package com.source.library.security;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

public class SigninFailureHandler extends SimpleUrlAuthenticationFailureHandler {

	 public SigninFailureHandler(String defaultFailureUrl) {
         this.setDefaultFailureUrl(defaultFailureUrl);
     }
	 
     @Override
     public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

    	 HttpSession session = request.getSession();
         if (session != null) {
        	 super.onAuthenticationFailure(request, response, exception);
             //getRedirectStrategy().sendRedirect(request, response, defaultFailureUrl);
         }
         
         /*
          String message = "로그인실패하였습니다.";

          response.setContentType("application/json");
          response.setCharacterEncoding("utf-8");

          String data = StringUtils.join(new String[] {
               " { ",
               " \"success\" : " , "false" , ", ",
               " \"message\" : \"", message , "\" ",
               " } "
          });

          PrintWriter out = response.getWriter();
          out.print(data);
          out.flush();
          out.close();
          */
     }
}