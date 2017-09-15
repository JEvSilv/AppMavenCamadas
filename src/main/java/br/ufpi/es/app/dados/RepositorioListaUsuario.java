package br.ufpi.es.app.dados;
import java.util.ArrayList;
public class RepositorioListaUsuario implements IRepositorioUsuarios {
	private ArrayList<Usuario> listausuario;
	
	public RepositorioListaUsuario(){
		this.listausuario = new ArrayList<Usuario>(); 
	}
	
	public	ArrayList<Usuario> getListaUsuario(){
		return this.listausuario;
	}

	@Override
	public void inserir(Usuario u) {
		this.listausuario.add(u);
	}
	
	
}
