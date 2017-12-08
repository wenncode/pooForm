package trabalho.Modelo;

import java.awt.Button;

import trabalho.Visao.TelaPrincipal;

public class Login {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String txtUsuario;
	private String txtSenha;
	private Button btnAutenticar;
	
	
	public Login(String txtUsuario, String txtSenha, Button btnAutenticar) {
		this.txtUsuario = txtUsuario;
		this.txtSenha = txtSenha;
		this.btnAutenticar = btnAutenticar;
	}


	public String getTxtUsuario() {
		return txtUsuario;
	}


	public void setTxtUsuario(String txtUsuario) {
		this.txtUsuario = txtUsuario;
	}


	public String getTxtSenha() {
		return txtSenha;
	}


	public void setTxtSenha(String txtSenha) {
		this.txtSenha = txtSenha;
	}


	public Button getBtnAutenticar() {
		return btnAutenticar;
	}


	public void setBtnAutenticar(Button btnAutenticar) {
		this.btnAutenticar = btnAutenticar;
	}
	
	
	
	

}
