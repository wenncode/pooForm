package trabalho.Modelo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import trabalho.Visao.TelaPrincipal;

public class ModeloTela4 {
	
	private JTextField txtNomeOrientador;
	private JTextField txtCargoOrientador;
	private JButton btnLimparForm;
	private JButton btnRegistrar;
	private JButton btnAnterior;
	private JComboBox comboDia;
	private JComboBox comboMes;
	private JComboBox comboAno;
	
	public ModeloTela4(JTextField txtNomeOrientador, JTextField txtCargoOrientador, JButton btnLimparForm,
			JButton btnRegistrar, JButton btnAnterior, JComboBox comboDia, JComboBox comboMes, JComboBox comboAno) {
		super();
		this.txtNomeOrientador = txtNomeOrientador;
		this.txtCargoOrientador = txtCargoOrientador;
		this.btnLimparForm = btnLimparForm;
		this.btnRegistrar = btnRegistrar;
		this.btnAnterior = btnAnterior;
		this.comboDia = comboDia;
		this.comboMes = comboMes;
		this.comboAno = comboAno;
	}

	public JTextField getTxtNomeOrientador() {
		return txtNomeOrientador;
	}

	public void setTxtNomeOrientador(JTextField txtNomeOrientador) {
		this.txtNomeOrientador = txtNomeOrientador;
	}

	public JTextField getTxtCargoOrientador() {
		return txtCargoOrientador;
	}

	public void setTxtCargoOrientador(JTextField txtCargoOrientador) {
		this.txtCargoOrientador = txtCargoOrientador;
	}

	public JButton getBtnLimparForm() {
		return btnLimparForm;
	}

	public void setBtnLimparForm(JButton btnLimparForm) {
		this.btnLimparForm = btnLimparForm;
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}

	public JButton getBtnAnterior() {
		return btnAnterior;
	}

	public void setBtnAnterior(JButton btnAnterior) {
		this.btnAnterior = btnAnterior;
	}

	public JComboBox getComboDia() {
		return comboDia;
	}

	public void setComboDia(JComboBox comboDia) {
		this.comboDia = comboDia;
	}

	public JComboBox getComboMes() {
		return comboMes;
	}

	public void setComboMes(JComboBox comboMes) {
		this.comboMes = comboMes;
	}

	public JComboBox getComboAno() {
		return comboAno;
	}

	public void setComboAno(JComboBox comboAno) {
		this.comboAno = comboAno;
	}
	
	
	
	

}
