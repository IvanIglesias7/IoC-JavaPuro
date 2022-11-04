/**
 * 
 */
package com.app.ioc;

/**
 * @author csi20-iiglhez
 *
 */
public class UsuarioFactory {

	IUsuario usr;
	
	public UsuarioFactory(IUsuario usr) {
		this.usr = usr;
	}
	
	public void getInsertaUsuario() {
		usr.insertaUsuario();
	}
	
	
	public void getEliminaUsuarioByID(int id) {
		usr.eliminaUsuarioByID(id);
	}
	
	
}
