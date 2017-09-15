package br.ufpi.es.app.controle;
import br.ufpi.es.app.dados.*;
public class ControladorUsuarios {
	RepositorioListaUsuario repositorio;
	public ControladorUsuarios(){
		repositorio = new RepositorioListaUsuario(); 
	}
	public void InserirUsuario(String nome){
		Usuario u = new Usuario(nome);
		repositorio.inserir(u);
	}
	
	public String ListarUsuario(){
		String str = "";
		for(Usuario u : repositorio.getListaUsuario()){
			str = str + u.getId() + " - " + u.getNome()+ "\n";
		}
		return str;
	}
}
