/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entities.Usuarios;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author tinchogava
 */
public class UsuariosDAOImpl implements UsuariosDAO {
    Transaction transaccion;
    Session sesion;
    
    
    @Override
    public boolean AgregarUsuarios(Usuarios usuario) {
        try{
            sesion=HibernateUtil.getSessionFactory().getCurrentSession();
            transaccion=sesion.beginTransaction();
            sesion.save(usuario);
            transaccion.commit();
            return true;
        }
        catch (Exception E){
            if(transaccion != null)
                transaccion.rollback();
            return false;
        }
    }

    @Override
    public ArrayList<Usuarios> ListarUusarios() {
        try{
            Session sesion;
            sesion=HibernateUtil.getSessionFactory().getCurrentSession();
            return (ArrayList<Usuarios>)sesion.createQuery("from Usuarios").list();
        }
        catch(Exception E){
            return null;
        }
        
    }
    
    
}
