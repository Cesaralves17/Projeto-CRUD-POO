/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.usuario;

import org.hibernate.Session;
import org.hibernate.Transaction;
import univs.edu.util.HibernateUtil;

/**
 *
 * @author LABORATORIO 01
 */
public class UsuarioDAO {
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Usuario usuario){
        sessao = HibernateUtil.getSessionFactory() .openSession();
        transacao = sessao.beginTransaction();
        sessao.save(usuario);
        transacao.commit();
        sessao.close();
    }
}
