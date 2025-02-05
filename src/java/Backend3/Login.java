/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend3;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Lenovo
 */
public class Login extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        
        String uemail= req.getParameter("email1");
         String upass= req.getParameter("pass1");
         
       if(uemail.equals("sandeep@gmail.com")&& upass.equals("sand123")) 
       {
           HttpSession session=req.getSession();
           
           // get the name from database
           String nam ="sandeep";
           
           session.setAttribute("session_name",nam);
           
           res.sendRedirect("Profilee");
       }  
       else
       {
           out.println("<html>");
           out.println("<head>");
           out.println("</head>");
           out.println("<body>");
           out.println("<span style ='font-size:20px; color:red;'>Login error </span>");
           out.println("<a href='Logout'>Logout</a>");
           out.println("</body>");
           out.println("</html>");
           
           
       }   
        
    }       
    
}
