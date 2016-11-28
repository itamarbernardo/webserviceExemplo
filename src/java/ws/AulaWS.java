/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import modelo.Usuario;

/**
 * REST Web Service
 *
 * @author ANAFLAVIA
 */
@Path("aulaws")
public class AulaWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AulaWS
     */
    public AulaWS() {
    }

    /**
     * Retrieves representation of an instance of ws.AulaWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces("aplication/text")
    public String getJson() {
        return "Meu primeiro webservice";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("usuario/get") //Caminho
    public String getUsuarios(){
        Usuario u = new Usuario();
        u.setEmail("aoiaod@lajd.com");
        u.setLogin("abacaçã");
        u.setPerfil("Admininastror");
        u.setSenha("iooiiooiioi");
        //Converte para GSON
        Gson g = new Gson();
        return g.toJson(u);
            
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("usuario/list") //Caminho
    public String listUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario u = new Usuario();
        u.setEmail("aoiaod@lajd.com");
        u.setLogin("abacaçã");
        u.setPerfil("Admininastror");
        u.setSenha("iooiiooiioi");
        
        usuarios.add(u);
        
        u = new Usuario();
        u.setEmail("aoiaod@lajd.com");
        u.setLogin("çãbacaa");
        u.setPerfil("Admininastror");
        u.setSenha("iooiiooiioi");
        
        usuarios.add(u);
        //Converte para GSON
        Gson g = new Gson();
        return g.toJson(usuarios);
            
    }

    /**
     * PUT method for updating or creating an instance of AulaWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
