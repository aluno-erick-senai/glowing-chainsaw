package controller.filter;


import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.entity.Usuario;

/**
 *
 * @author João 
 */
@WebFilter("/*")
public class barracoFilter implements Filter{

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException
    {
        //HttpRequest
        //HttpResponse
        //HttpSession
        HttpServletRequest httpRequest = (HttpServletRequest) request; 
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession httpSession = httpRequest.getSession();
        
        if(httpRequest.getRequestURI().contains("ProdutoPedido"){
        
            Usuario usuario = (Usuario) httpSession.getAttribute("usuario");
            
           if(usuario == null || !usuario.getAdministrador()){
               httpResponse.sendRedirect(httpRequest.getContextPath() + "/base.jsf");
           }
        
        
        
        chain.doFilter(request, response);
        
    }
    
}
