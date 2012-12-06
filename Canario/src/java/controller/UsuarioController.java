/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ModelDriven;
import java.util.ArrayList;
import model.dao.UsuariosDAO;
import model.entities.Usuarios;

/**
 *
 * @author tinchogava
 */
public class UsuarioController implements ModelDriven<Usuarios>{
    Usuarios usuario=new Usuarios();
    ArrayList<Usuarios> listaUsuarios=new ArrayList();
    UsuariosDAO usuarioDAO;
    String msj="";
    @Override
    public Usuarios getModel() {
        return usuario;
    }
    public String agregarInicio(){
        return "success";
    }
    public String listarInicio(){
        return "success";
    }
    public String agregar(){
        if(usuarioDAO.AgregarUsuarios(usuario))
            msj = "Usuario Registrado correctamente";
        else
            msj = "Error! Intente Nuevamente";
        return "success";
    }
    public String listar(){
        listaUsuarios = usuarioDAO.ListarUusarios();
        return "success";
    }

    public ArrayList<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public String getMsj() {
        return msj;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
}
