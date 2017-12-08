package trabalho.Controle;

import trabalho.Modelo.Formulario;
import trabalho.Visao.TelaPrincipal;

public class App {

	
	public static void main(String[] args) {
		Formulario form = new Formulario();
		
		TelaPrincipal jprinc = new TelaPrincipal();
		jprinc.setVisible(true);
	}

}
