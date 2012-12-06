/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entities.SeguirUsuarios;

/**
 *
 * @author tinchogava
 */
public interface SeguirUsuariosDAO {
    public boolean AgregarSeguir(SeguirUsuarios follower);
    public ArrayList<SeguirUsuarios> ListarSeguir();
    
}
