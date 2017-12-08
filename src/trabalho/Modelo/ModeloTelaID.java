package trabalho.Modelo;

import javax.swing.JButton;
import javax.swing.JTextField;

import trabalho.Visao.TelaPrincipal;

public class ModeloTelaID {
	
	private JTextField txtCPFidentificador;
	private JButton btnConsultar;
	
	public ModeloTelaID(JTextField txtCPFidentificador, JButton btnConsultar) {
		super();
		this.txtCPFidentificador = txtCPFidentificador;
		this.btnConsultar = btnConsultar;
	}

	public JTextField getTxtCPFidentificador() {
		return txtCPFidentificador;
	}

	public void setTxtCPFidentificador(JTextField txtCPFidentificador) {
		this.txtCPFidentificador = txtCPFidentificador;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}
	
	

}
