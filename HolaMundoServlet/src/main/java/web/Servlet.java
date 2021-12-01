
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HolaMundo") //la ruta de la url, del archivo html
public class Servlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //ESTABLECE EL TIPO DE CONTENIDO CON EL QUE VAMOS A CONTESTAR AL CLIENTE
        
        response.setContentType("text/html;charset=UTF-8"); //especifico que tipo de contenido contesto al cliente, contenido html
        
        PrintWriter out = response.getWriter(); //me lanza excepción y hago el throws de IOException
        
        out.println("Hola clase de seundo DAM");
        out.close();
    }
    
    
    
    
}
