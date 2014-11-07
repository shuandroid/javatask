package myservlet;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.ChangedCharSetException;


public class MyServlet extends HttpServlet {
	public MyServlet() {
        super();
    }
    
    public void destroy() {
        super.destroy();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	response.setContentType("text/html ; charset = utf-8") ;
        boolean b = false;
        boolean c = false ;
        MyPOJO myPOJO = new MyPOJO();//新建MyPOJO类的对象myPOJO

       //根据标示名获取JSP文件中表单所包含的参数
        String thespeed = request.getParameter("speed");
        String thedirection = request.getParameter("direction");
        
        System.out.print(thedirection) ;
        if(0 == thespeed.length() ){
        	b = false ;
        }
        else  {
        	int speed = Integer.parseInt(thespeed) ;
        	b = myPOJO.login_speed(speed) ;
        }
        	 
       
        c = myPOJO.login_direction(thedirection) ;
//        System .out.println(b) ;
//        System .out.println(c) ;
        
       
        if (c&&(thespeed.length() == 0)) {
        	request.getSession().setAttribute("direction",thedirection) ;
        	response.sendRedirect("change_direction.jsp") ;
		}
        else if (b&&(thedirection.length()==0)) {
        	request.getSession().setAttribute("speed",thespeed) ;
        	response.sendRedirect("change_speed.jsp") ;
		}
        else  if (b&&c) {
    		
            request.getSession().setAttribute("speed",thespeed) ;	
            request.getSession().setAttribute("direction",thedirection) ;
     		response.sendRedirect("change.jsp") ;	
     		
     	     }
        else  {
			response.sendRedirect("error.jsp") ;
		}
        
}


    public void doPost(HttpServletRequest request, HttpServletResponse response)
    
            throws ServletException, IOException {
    	
    	this.doGet(request, response) ;
    }

      public void init() throws ServletException {
    	  
      }
	
	

}
