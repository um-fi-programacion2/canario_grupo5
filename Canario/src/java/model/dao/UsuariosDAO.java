/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entities.Usuarios;

/**
 *
 * @author tinchogava
 */
public interface UsuariosDAO {
    public boolean AgregarUsuarios(Usuarios usuario);
    public ArrayList<Usuarios> ListarUusarios();
}
