package trabalho.Modelo;

import javax.swing.JButton;
import javax.swing.JTextField;

import trabalho.Visao.TelaPrincipal;

public class ModeloTela3 {
	
	private JTextField txtAreaAtuacao;
	private JTextField txtPeriodo;
	private JTextField txtCargaHoraria;
	private JTextField txtApolice;
	private JTextField txtSeguradora;
	private JButton btnProximo;
	private JButton btnLimparCampos;
	private JButton btnRegistrarsalvar;
	private JButton btnAnterior;
	
	
	public ModeloTela3(JTextField txtAreaAtuacao, JTextField txtPeriodo, JTextField txtCargaHoraria,
			JTextField txtApolice, JTextField txtSeguradora, JButton btnProximo, JButton btnLimparCampos,
			JButton btnRegistrarsalvar, JButton btnAnterior) {
		super();
		this.txtAreaAtuacao = txtAreaAtuacao;
		this.txtPeriodo = txtPeriodo;
		this.txtCargaHoraria = txtCargaHoraria;
		this.txtApolice = txtApolice;
		this.txtSeguradora = txtSeguradora;
		this.btnProximo = btnProximo;
		this.btnLimparCampos = btnLimparCampos;
		this.btnRegistrarsalvar = btnRegistrarsalvar;
		this.btnAnterior = btnAnterior;
	}


	public JTextField getTxtAreaAtuacao() {
		return txtAreaAtuacao;
	}


	public void setTxtAreaAtuacao(JTextField txtAreaAtuacao) {
		this.txtAreaAtuacao = txtAreaAtuacao;
	}


	public JTextField getTxtPeriodo() {
		return txtPeriodo;
	}


	public void setTxtPeriodo(JTextField txtPeriodo) {
		this.txtPeriodo = txtPeriodo;
	}


	public JTextField getTxtCargaHoraria() {
		return txtCargaHoraria;
	}


	public void setTxtCargaHoraria(JTextField txtCargaHoraria) {
		this.txtCargaHoraria = txtCargaHoraria;
	}


	public JTextField getTxtApolice() {
		return txtApolice;
	}


	public void setTxtApolice(JTextField txtApolice) {
		this.txtApolice = txtApolice;
	}


	public JTextField getTxtSeguradora() {
		return txtSeguradora;
	}


	public void setTxtSeguradora(JTextField txtSeguradora) {
		this.txtSeguradora = txtSeguradora;
	}


	public JButton getBtnProximo() {
		return btnProximo;
	}


	public void setBtnProximo(JButton btnProximo) {
		this.btnProximo = btnProximo;
	}


	public JButton getBtnLimparCampos() {
		return btnLimparCampos;
	}


	public void setBtnLimparCampos(JButton btnLimparCampos) {
		this.btnLimparCampos = btnLimparCampos;
	}


	public JButton getBtnRegistrarsalvar() {
		return btnRegistrarsalvar;
	}


	public void setBtnRegistrarsalvar(JButton btnRegistrarsalvar) {
		this.btnRegistrarsalvar = btnRegistrarsalvar;
	}


	public JButton getBtnAnterior() {
		return btnAnterior;
	}


	public void setBtnAnterior(JButton btnAnterior) {
		this.btnAnterior = btnAnterior;
	}
	
	
	
	

}
