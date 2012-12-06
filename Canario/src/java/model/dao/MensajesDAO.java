/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entities.Mensajes;

/**
 *
 * @author tinchogava
 */
public interface MensajesDAO {
    public boolean AgregarMensajes(Mensajes mensaje);
    public ArrayList<Mensajes> ListarMensajes();
    
}
