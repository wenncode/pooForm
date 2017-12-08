package trabalho.Modelo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import trabalho.Visao.TelaPrincipal;

public class ModeloTela2 {
	
	private JTextField txtEndEstu;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCEPestud;
	private JTextField txtCidadeEstu;
	private JTextField txtMatricula;
	private JTextField txtCPF;
	private JTextField txtDataNasci;
	private JTextField txtNomeEst;
	private JComboBox estadoEstud;
	private JComboBox cursosUFCSPA;
	private JComboBox semestre;
	private JButton btnPrximo;
	private JButton btnLimparCampos;
	private JButton btnRegistrarsalvar;
	private JButton btnAnterior;
	
	public ModeloTela2(JTextField txtEndEstu, JTextField txtComplemento, JTextField txtBairro, JTextField txtCEPestud,
			JTextField txtCidadeEstu, JTextField txtMatricula, JTextField txtCPF, JTextField txtDataNasci,
			JTextField txtNomeEst, JComboBox estadoEstud, JComboBox cursosUFCSPA, JComboBox semestre, JButton btnPrximo,
			JButton btnLimparCampos, JButton btnRegistrarsalvar, JButton btnAnterior) {
		super();
		this.txtEndEstu = txtEndEstu;
		this.txtComplemento = txtComplemento;
		this.txtBairro = txtBairro;
		this.txtCEPestud = txtCEPestud;
		this.txtCidadeEstu = txtCidadeEstu;
		this.txtMatricula = txtMatricula;
		this.txtCPF = txtCPF;
		this.txtDataNasci = txtDataNasci;
		this.txtNomeEst = txtNomeEst;
		this.estadoEstud = estadoEstud;
		this.cursosUFCSPA = cursosUFCSPA;
		this.semestre = semestre;
		this.btnPrximo = btnPrximo;
		this.btnLimparCampos = btnLimparCampos;
		this.btnRegistrarsalvar = btnRegistrarsalvar;
		this.btnAnterior = btnAnterior;
	}

	public JTextField getTxtEndEstu() {
		return txtEndEstu;
	}

	public void setTxtEndEstu(JTextField txtEndEstu) {
		this.txtEndEstu = txtEndEstu;
	}

	public JTextField getTxtComplemento() {
		return txtComplemento;
	}

	public void setTxtComplemento(JTextField txtComplemento) {
		this.txtComplemento = txtComplemento;
	}

	public JTextField getTxtBairro() {
		return txtBairro;
	}

	public void setTxtBairro(JTextField txtBairro) {
		this.txtBairro = txtBairro;
	}

	public JTextField getTxtCEPestud() {
		return txtCEPestud;
	}

	public void setTxtCEPestud(JTextField txtCEPestud) {
		this.txtCEPestud = txtCEPestud;
	}

	public JTextField getTxtCidadeEstu() {
		return txtCidadeEstu;
	}

	public void setTxtCidadeEstu(JTextField txtCidadeEstu) {
		this.txtCidadeEstu = txtCidadeEstu;
	}

	public JTextField getTxtMatricula() {
		return txtMatricula;
	}

	public void setTxtMatricula(JTextField txtMatricula) {
		this.txtMatricula = txtMatricula;
	}

	public JTextField getTxtCPF() {
		return txtCPF;
	}

	public void setTxtCPF(JTextField txtCPF) {
		this.txtCPF = txtCPF;
	}

	public JTextField getTxtDataNasci() {
		return txtDataNasci;
	}

	public void setTxtDataNasci(JTextField txtDataNasci) {
		this.txtDataNasci = txtDataNasci;
	}

	public JTextField getTxtNomeEst() {
		return txtNomeEst;
	}

	public void setTxtNomeEst(JTextField txtNomeEst) {
		this.txtNomeEst = txtNomeEst;
	}

	public JComboBox getEstadoEstud() {
		return estadoEstud;
	}

	public void setEstadoEstud(JComboBox estadoEstud) {
		this.estadoEstud = estadoEstud;
	}

	public JComboBox getCursosUFCSPA() {
		return cursosUFCSPA;
	}

	public void setCursosUFCSPA(JComboBox cursosUFCSPA) {
		this.cursosUFCSPA = cursosUFCSPA;
	}

	public JComboBox getSemestre() {
		return semestre;
	}

	public void setSemestre(JComboBox semestre) {
		this.semestre = semestre;
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
