package trabalho.Visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabalho.Modelo.Formulario;

import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class TelaFormParte3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAreaAtuacao;
	private JTextField txtPeriodo;
	private JTextField txtCargaHoraria;
	private JTextField txtApolice;
	private JTextField txtSeguradora;
	public Formulario form;

	/**
	 * Create the frame.
	 * @param form 
	 */
	public TelaFormParte3(Formulario form) {
		this.form = form;
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaFormParte3.class.getResource("/imagens/aa.png")));
		setResizable(false);
		setBackground(SystemColor.text);
		setTitle("Formul\u00E1rio Termo de Compromisso");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
		setBounds(100, 100, 630, 612);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(SystemColor.text);
		contentPane.add(panel5, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaFormParte3.class.getResource("/imagens/aa.png")));
		panel5.add(lblNewLabel);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(SystemColor.text);
		contentPane.add(panel6, BorderLayout.CENTER);
		GridBagLayout gbl_panel6 = new GridBagLayout();
		gbl_panel6.columnWidths = new int[]{37, 81, 0, 475, 0, 0, 0, 0};
		gbl_panel6.rowHeights = new int[]{20, 0, 17, 0, 0, 0, 17, 17, 17, 0, 31, 17, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel6.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel6.setLayout(gbl_panel6);
		
		JLabel lblEstgioCurricular = new JLabel("Est\u00E1gio curricular");
		lblEstgioCurricular.setFont(new Font("Calibri", Font.BOLD, 16));
		GridBagConstraints gbc_lblEstgioCurricular = new GridBagConstraints();
		gbc_lblEstgioCurricular.anchor = GridBagConstraints.WEST;
		gbc_lblEstgioCurricular.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstgioCurricular.gridx = 1;
		gbc_lblEstgioCurricular.gridy = 3;
		panel6.add(lblEstgioCurricular, gbc_lblEstgioCurricular);
		
		JLabel lblAUnidadeConcedente = new JLabel("A UNIDADE CONCEDENTE DE EST\u00C1GIO acima identificado oferece ao ESTUDANTE supra ");
		lblAUnidadeConcedente.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblAUnidadeConcedente.setPreferredSize(new Dimension(334, 14));
		lblAUnidadeConcedente.setMinimumSize(new Dimension(334, 14));
		lblAUnidadeConcedente.setMaximumSize(new Dimension(334, 14));
		lblAUnidadeConcedente.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblAUnidadeConcedente = new GridBagConstraints();
		gbc_lblAUnidadeConcedente.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAUnidadeConcedente.gridwidth = 6;
		gbc_lblAUnidadeConcedente.insets = new Insets(0, 0, 5, 0);
		gbc_lblAUnidadeConcedente.gridx = 1;
		gbc_lblAUnidadeConcedente.gridy = 5;
		panel6.add(lblAUnidadeConcedente, gbc_lblAUnidadeConcedente);
		
		JLabel lblReferidoMedianteCumprimento = new JLabel("referido, mediante cumprimento das condi\u00E7\u00F5es abaixo, com as quais todas as partes ");
		lblReferidoMedianteCumprimento.setFont(new Font("Calibri", Font.PLAIN, 15));
		GridBagConstraints gbc_lblReferidoMedianteCumprimento = new GridBagConstraints();
		gbc_lblReferidoMedianteCumprimento.anchor = GridBagConstraints.WEST;
		gbc_lblReferidoMedianteCumprimento.gridwidth = 6;
		gbc_lblReferidoMedianteCumprimento.insets = new Insets(0, 0, 5, 0);
		gbc_lblReferidoMedianteCumprimento.gridx = 1;
		gbc_lblReferidoMedianteCumprimento.gridy = 6;
		panel6.add(lblReferidoMedianteCumprimento, gbc_lblReferidoMedianteCumprimento);
		
		JLabel lblNewLabel_1 = new JLabel("concordam, inclusive a UFCSPA, na condi\u00E7\u00E3o de interveniente, tendo em vista conv\u00EA-");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.gridwidth = 5;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 7;
		panel6.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNioExistente = new JLabel("nio existente.");
		lblNioExistente.setFont(new Font("Calibri", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNioExistente = new GridBagConstraints();
		gbc_lblNioExistente.anchor = GridBagConstraints.WEST;
		gbc_lblNioExistente.insets = new Insets(0, 0, 5, 5);
		gbc_lblNioExistente.gridx = 1;
		gbc_lblNioExistente.gridy = 8;
		panel6.add(lblNioExistente, gbc_lblNioExistente);
		
		JLabel lblAreaDe = new JLabel("a) \u00C1rea de atua\u00E7\u00E3o do estagi\u00E1rio:");
		lblAreaDe.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblAreaDe = new GridBagConstraints();
		gbc_lblAreaDe.anchor = GridBagConstraints.WEST;
		gbc_lblAreaDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblAreaDe.gridx = 1;
		gbc_lblAreaDe.gridy = 10;
		panel6.add(lblAreaDe, gbc_lblAreaDe);
		
		txtAreaAtuacao = new JTextField();
		txtAreaAtuacao.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_txtAreaAtuacao = new GridBagConstraints();
		gbc_txtAreaAtuacao.gridwidth = 2;
		gbc_txtAreaAtuacao.insets = new Insets(0, 0, 5, 5);
		gbc_txtAreaAtuacao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAreaAtuacao.gridx = 3;
		gbc_txtAreaAtuacao.gridy = 10;
		panel6.add(txtAreaAtuacao, gbc_txtAreaAtuacao);
		txtAreaAtuacao.setColumns(10);
		
		JLabel lblBPerodoDe = new JLabel("b) Per\u00EDodo de dura\u00E7\u00E3o do est\u00E1gio:");
		lblBPerodoDe.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblBPerodoDe = new GridBagConstraints();
		gbc_lblBPerodoDe.anchor = GridBagConstraints.WEST;
		gbc_lblBPerodoDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblBPerodoDe.gridx = 1;
		gbc_lblBPerodoDe.gridy = 11;
		panel6.add(lblBPerodoDe, gbc_lblBPerodoDe);
		
		txtPeriodo = new JTextField();
		txtPeriodo.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_txtPeriodo = new GridBagConstraints();
		gbc_txtPeriodo.gridwidth = 2;
		gbc_txtPeriodo.insets = new Insets(0, 0, 5, 5);
		gbc_txtPeriodo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPeriodo.gridx = 3;
		gbc_txtPeriodo.gridy = 11;
		panel6.add(txtPeriodo, gbc_txtPeriodo);
		txtPeriodo.setColumns(10);
		
		JLabel lblCCargaHorria = new JLabel("c) Carga hor\u00E1ria semanal (horas):");
		lblCCargaHorria.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblCCargaHorria = new GridBagConstraints();
		gbc_lblCCargaHorria.anchor = GridBagConstraints.WEST;
		gbc_lblCCargaHorria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCCargaHorria.gridx = 1;
		gbc_lblCCargaHorria.gridy = 12;
		panel6.add(lblCCargaHorria, gbc_lblCCargaHorria);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_txtCargaHoraria = new GridBagConstraints();
		gbc_txtCargaHoraria.gridwidth = 2;
		gbc_txtCargaHoraria.insets = new Insets(0, 0, 5, 5);
		gbc_txtCargaHoraria.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCargaHoraria.gridx = 3;
		gbc_txtCargaHoraria.gridy = 12;
		panel6.add(txtCargaHoraria, gbc_txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		JLabel lblDSeguroDe = new JLabel("d) Seguro de acidente pessoal em favor do estagi\u00E1rio, despesa a cargo da: UFCSPA");
		lblDSeguroDe.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblDSeguroDe.setHorizontalAlignment(SwingConstants.LEFT);
		lblDSeguroDe.setPreferredSize(new Dimension(334, 14));
		lblDSeguroDe.setMinimumSize(new Dimension(334, 14));
		lblDSeguroDe.setMaximumSize(new Dimension(334, 14));
		GridBagConstraints gbc_lblDSeguroDe = new GridBagConstraints();
		gbc_lblDSeguroDe.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDSeguroDe.gridwidth = 3;
		gbc_lblDSeguroDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblDSeguroDe.gridx = 1;
		gbc_lblDSeguroDe.gridy = 13;
		panel6.add(lblDSeguroDe, gbc_lblDSeguroDe);
		
		JLabel lblApliceN = new JLabel("Ap\u00F3lice n\u00BA:");
		lblApliceN.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblApliceN = new GridBagConstraints();
		gbc_lblApliceN.insets = new Insets(0, 0, 5, 5);
		gbc_lblApliceN.gridx = 1;
		gbc_lblApliceN.gridy = 15;
		panel6.add(lblApliceN, gbc_lblApliceN);
		
		txtApolice = new JTextField();
		txtApolice.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_txtApolice = new GridBagConstraints();
		gbc_txtApolice.gridwidth = 2;
		gbc_txtApolice.insets = new Insets(0, 0, 5, 5);
		gbc_txtApolice.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApolice.gridx = 3;
		gbc_txtApolice.gridy = 15;
		panel6.add(txtApolice, gbc_txtApolice);
		txtApolice.setColumns(10);
		
		JLabel lblSeguradora = new JLabel("Seguradora:");
		lblSeguradora.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblSeguradora = new GridBagConstraints();
		gbc_lblSeguradora.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeguradora.gridx = 1;
		gbc_lblSeguradora.gridy = 16;
		panel6.add(lblSeguradora, gbc_lblSeguradora);
		
		txtSeguradora = new JTextField();
		txtSeguradora.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_txtSeguradora = new GridBagConstraints();
		gbc_txtSeguradora.gridwidth = 2;
		gbc_txtSeguradora.insets = new Insets(0, 0, 5, 5);
		gbc_txtSeguradora.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSeguradora.gridx = 3;
		gbc_txtSeguradora.gridy = 16;
		panel6.add(txtSeguradora, gbc_txtSeguradora);
		txtSeguradora.setColumns(10);
		
		JPanel panel7 = new JPanel();
		panel7.setBackground(SystemColor.text);
		contentPane.add(panel7, BorderLayout.SOUTH);
		
		JButton btnProximo = new JButton("Pr\u00F3ximo >>");
		btnProximo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					btnProximo.doClick();
				}

			}
		});
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaFormParte4 tfp4 = new TelaFormParte4(form);
				tfp4.setVisible(true);
				dispose();
			}
		});
		
		JButton btnLimparCampos = new JButton("Limpar campos");
		btnLimparCampos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					btnLimparCampos.doClick();
				}

			}
		});
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limparTela(e);
			}
		});
		
		JButton btnRegistrarsalvar = new JButton("Registrar/Salvar");
		btnRegistrarsalvar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					btnRegistrarsalvar.doClick();
				}

			}
		});
		btnRegistrarsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addInfo();
			}
		});
		
		JButton btnAnterior = new JButton("<< Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				TelaFormParte2 tfp2 = new TelaFormParte2(form);
				tfp2.setVisible(true);
				dispose();
			}
		});
		btnAnterior.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					btnAnterior.doClick();
				}

			}
		});
		btnAnterior.setFont(new Font("Calibri", Font.BOLD, 15));
		panel7.add(btnAnterior);
		btnRegistrarsalvar.setFont(new Font("Calibri", Font.BOLD, 15));
		panel7.add(btnRegistrarsalvar);
		btnLimparCampos.setFont(new Font("Calibri", Font.BOLD, 15));
		panel7.add(btnLimparCampos);
		btnProximo.setFont(new Font("Calibri", Font.BOLD, 15));
		panel7.add(btnProximo);
	}
	
		public void limparTela(ActionEvent e) {
		
			if(e.getActionCommand().equals("Limpar campos")){
				txtAreaAtuacao.setText("");
				txtPeriodo.setText("");
				txtCargaHoraria.setText("");
				txtApolice.setText("");
				txtSeguradora.setText("");			

		}
	}
	public void addInfo() {
		this.form.setTxtAreaAtuacao1(txtAreaAtuacao.getText().toString());
		this.form.setTxtPeriodo1(txtPeriodo.getText().toString());
		this.form.setTxtCargaHoraria1(txtCargaHoraria.getText().toString());
		this.form.setTxtApolice1(txtApolice.getText().toString());
		this.form.setTxtSeguradora1(txtSeguradora.getText().toString());
	}

}