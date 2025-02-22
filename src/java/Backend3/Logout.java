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

/**
 *
 * @author Lenovo
 */
public class Logout extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res )throws ServletException, IOException
    {
        HttpSession session = req.getSession();
        
        session.invalidate();
        
        res.sendRedirect("index.html");
    }      
    
}
