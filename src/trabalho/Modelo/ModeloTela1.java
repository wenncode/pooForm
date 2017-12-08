package trabalho.Modelo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import trabalho.Visao.TelaPrincipal;

public class ModeloTela1 {
	
	private JTextField txtNomeLocal;
	private JTextField txtEndLocal;
	private JTextField txtCEP;
	private JTextField txtCidade;
	private JTextField txtCNPJ;
	private JComboBox comboUF;
	private JButton btnPrximo;
	private JButton btnLimparCampos;
	private JButton btnRegistrarSalvar;
	
	
	public ModeloTela1(JTextField txtNomeLocal, JTextField txtEndLocal, JTextField txtCEP, JTextField txtCidade,
			JTextField txtCNPJ) {
		super();
		this.txtNomeLocal = txtNomeLocal;
		this.txtEndLocal = txtEndLocal;
		this.txtCEP = txtCEP;
		this.txtCidade = txtCidade;
		this.txtCNPJ = txtCNPJ;
		this.comboUF = comboUF;
		this.btnPrximo = btnPrximo;
		this.btnLimparCampos = btnLimparCampos;
		this.btnRegistrarSalvar = btnRegistrarSalvar;
	}

	public JTextField getTxtNomeLocal() {
		return txtNomeLocal;
	}

	public void setTxtNomeLocal(JTextField txtNomeLocal) {
		this.txtNomeLocal = txtNomeLocal;
	}

	public JTextField getTxtEndLocal() {
		return txtEndLocal;
	}

	public void setTxtEndLocal(JTextField txtEndLocal) {
		this.txtEndLocal = txtEndLocal;
	}

	public JTextField getTxtCEP() {
		return txtCEP;
	}

	public void setTxtCEP(JTextField txtCEP) {
		this.txtCEP = txtCEP;
	}

	public JTextField getTxtCidade() {
		return txtCidade;
	}

	public void setTxtCidade(JTextField txtCidade) {
		this.txtCidade = txtCidade;
	}

	public JTextField getTxtCNPJ() {
		return txtCNPJ;
	}

	public void setTxtCNPJ(JTextField txtCNPJ) {
		this.txtCNPJ = txtCNPJ;
	}

	public JComboBox getComboUF() {
		return comboUF;
	}

	public void setComboUF(JComboBox comboUF) {
		this.comboUF = comboUF;
	}

	public JButton getBtnPrximo() {
		return btnPrximo;
	}

	public void setBtnPrximo(JButton btnPrximo) {
		this.btnPrximo = btnPrximo;
	}

	public JButton getBtnLimparCampos() {
		return btnLimparCampos;
	}

	public void setBtnLimparCampos(JButton btnLimparCampos) {
		this.btnLimparCampos = btnLimparCampos;
	}

	public JButton getBtnRegistrarSalvar() {
		return btnRegistrarSalvar;
	}

	public void setBtnRegistrarSalvar(JButton btnRegistrarSalvar) {
		this.btnRegistrarSalvar = btnRegistrarSalvar;
	}
	
		
	

}
