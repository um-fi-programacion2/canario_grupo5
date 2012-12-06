/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entities.Reenviados;

/**
 *
 * @author tinchogava
 */
public interface ReenviadosDAO {
    public boolean AgregarReenviados(Reenviados reenviado);
    public ArrayList<Reenviados> ListarReenviados();

}
