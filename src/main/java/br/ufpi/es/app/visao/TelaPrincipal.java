package br.ufpi.es.app.visao;
import br.ufpi.es.app.controle.*;
public class TelaPrincipal {

	public static void main(String[] args) {
		ControladorUsuarios controle = new ControladorUsuarios();
		System.out.println("#-- Modelo em camadas --#");
		controle.InserirUsuario("Jonathas");
		controle.InserirUsuario("Alexander");
		controle.InserirUsuario("Camila");
		System.out.println(controle.ListarUsuario());
	}

}
