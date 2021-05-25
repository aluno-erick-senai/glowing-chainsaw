package utils;

import javax.faces.context.FacesContext;

/**
 *
 * @author João
 */
public class Utilidades {
    
    public static Object verificarSessao(String chave){
        
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(chave);
                
    }
    public static boolean verificarExisteSessao(String chave){
        
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().containsKey(chave);
        
    }
    
}
