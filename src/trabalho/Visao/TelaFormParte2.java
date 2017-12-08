package trabalho.Visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabalho.Modelo.Formulario;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class TelaFormParte2 extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static JTextField txtEndEstu;
	private static JTextField txtComplemento;
	private static JTextField txtBairro;
	private static JTextField txtCEPestud;
	private static JTextField txtCidadeEstu;
	private static JTextField txtMatricula;
	private static JTextField txtCPF;
	private static JTextField txtDataNasci;
	private static JTextField txtNomeEst;
	private static JComboBox estadoEstud;
	private static JComboBox semestre;
	private static JComboBox cursosUFCSPA;
	public Formulario form;

	/**
	 * Create the frame.
	 * @param form 
	 */
	public TelaFormParte2(Formulario form) {
		this.form = form;
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaFormParte2.class.getResource("/imagens/aa.png")));
		setResizable(false);
		setTitle("Formul\u00E1rio Termo de Compromisso");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
		setBounds(100, 100, 630, 612);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(SystemColor.text);
		contentPane.add(panel3, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.text);
		lblNewLabel.setIcon(new ImageIcon(TelaFormParte2.class.getResource("/imagens/aa.png")));
		panel3.add(lblNewLabel);
		
		JPanel panel4 = new JPanel();
		panel4.setMaximumSize(new Dimension(20000, 32767));
		panel4.setBackground(SystemColor.text);
		contentPane.add(panel4, BorderLayout.WEST);
		GridBagLayout gbl_panel4 = new GridBagLayout();
		gbl_panel4.columnWidths = new int[]{37, 81, 0, 350};
		gbl_panel4.rowHeights = new int[]{20, 0, 17, 0, 0, 0, 17, 17, 17, 0, 31, 17, 17, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel4.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0};
		gbl_panel4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel4.setLayout(gbl_panel4);
		
		JLabel lblEstudante = new JLabel("Estudante:");
		lblEstudante.setFont(new Font("Calibri", Font.BOLD, 16));
		GridBagConstraints gbc_lblEstudante = new GridBagConstraints();
		gbc_lblEstudante.anchor = GridBagConstraints.WEST;
		gbc_lblEstudante.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstudante.gridx = 1;
		gbc_lblEstudante.gridy = 2;
		panel4.add(lblEstudante, gbc_lblEstudante);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.WEST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 1;
		gbc_lblNome.gridy = 3;
		panel4.add(lblNome, gbc_lblNome);
		
		txtNomeEst = new JTextField();
		txtNomeEst.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtNomeEst = new GridBagConstraints();
		gbc_txtNomeEst.insets = new Insets(0, 0, 5, 5);
		gbc_txtNomeEst.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNomeEst.gridx = 3;
		gbc_txtNomeEst.gridy = 3;
		panel4.add(txtNomeEst, gbc_txtNomeEst);
		txtNomeEst.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblDataDeNascimento = new GridBagConstraints();
		gbc_lblDataDeNascimento.anchor = GridBagConstraints.WEST;
		gbc_lblDataDeNascimento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeNascimento.gridx = 1;
		gbc_lblDataDeNascimento.gridy = 4;
		panel4.add(lblDataDeNascimento, gbc_lblDataDeNascimento);
		
		txtDataNasci = new JTextField();
		txtDataNasci.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtDataNasci = new GridBagConstraints();
		gbc_txtDataNasci.insets = new Insets(0, 0, 5, 5);
		gbc_txtDataNasci.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDataNasci.gridx = 3;
		gbc_txtDataNasci.gridy = 4;
		panel4.add(txtDataNasci, gbc_txtDataNasci);
		txtDataNasci.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.anchor = GridBagConstraints.WEST;
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.gridx = 1;
		gbc_lblCpf.gridy = 5;
		panel4.add(lblCpf, gbc_lblCpf);
		
		txtCPF = new JTextField();
		txtCPF.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtCPF = new GridBagConstraints();
		gbc_txtCPF.insets = new Insets(0, 0, 5, 5);
		gbc_txtCPF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCPF.gridx = 3;
		gbc_txtCPF.gridy = 5;
		panel4.add(txtCPF, gbc_txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.anchor = GridBagConstraints.WEST;
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 1;
		gbc_lblEndereo.gridy = 6;
		panel4.add(lblEndereo, gbc_lblEndereo);
		
		txtEndEstu = new JTextField();
		txtEndEstu.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtEndEstu = new GridBagConstraints();
		gbc_txtEndEstu.insets = new Insets(0, 0, 5, 5);
		gbc_txtEndEstu.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEndEstu.gridx = 3;
		gbc_txtEndEstu.gridy = 6;
		panel4.add(txtEndEstu, gbc_txtEndEstu);
		txtEndEstu.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblComplemento = new GridBagConstraints();
		gbc_lblComplemento.anchor = GridBagConstraints.WEST;
		gbc_lblComplemento.insets = new Insets(0, 0, 5, 5);
		gbc_lblComplemento.gridx = 1;
		gbc_lblComplemento.gridy = 7;
		panel4.add(lblComplemento, gbc_lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtComplemento = new GridBagConstraints();
		gbc_txtComplemento.insets = new Insets(0, 0, 5, 5);
		gbc_txtComplemento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtComplemento.gridx = 3;
		gbc_txtComplemento.gridy = 7;
		panel4.add(txtComplemento, gbc_txtComplemento);
		txtComplemento.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblBairro = new GridBagConstraints();
		gbc_lblBairro.anchor = GridBagConstraints.WEST;
		gbc_lblBairro.insets = new Insets(0, 0, 5, 5);
		gbc_lblBairro.gridx = 1;
		gbc_lblBairro.gridy = 8;
		panel4.add(lblBairro, gbc_lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtBairro = new GridBagConstraints();
		gbc_txtBairro.insets = new Insets(0, 0, 5, 5);
		gbc_txtBairro.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBairro.gridx = 3;
		gbc_txtBairro.gridy = 8;
		panel4.add(txtBairro, gbc_txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCep = new GridBagConstraints();
		gbc_lblCep.anchor = GridBagConstraints.WEST;
		gbc_lblCep.insets = new Insets(0, 0, 5, 5);
		gbc_lblCep.gridx = 1;
		gbc_lblCep.gridy = 9;
		panel4.add(lblCep, gbc_lblCep);
		
		txtCEPestud = new JTextField();
		txtCEPestud.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtCEPestud = new GridBagConstraints();
		gbc_txtCEPestud.insets = new Insets(0, 0, 5, 5);
		gbc_txtCEPestud.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCEPestud.gridx = 3;
		gbc_txtCEPestud.gridy = 9;
		panel4.add(txtCEPestud, gbc_txtCEPestud);
		txtCEPestud.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.anchor = GridBagConstraints.WEST;
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.gridx = 1;
		gbc_lblCidade.gridy = 10;
		panel4.add(lblCidade, gbc_lblCidade);
		
		txtCidadeEstu = new JTextField();
		txtCidadeEstu.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtCidadeEstu = new GridBagConstraints();
		gbc_txtCidadeEstu.insets = new Insets(0, 0, 5, 5);
		gbc_txtCidadeEstu.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCidadeEstu.gridx = 3;
		gbc_txtCidadeEstu.gridy = 10;
		panel4.add(txtCidadeEstu, gbc_txtCidadeEstu);
		txtCidadeEstu.setColumns(10);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblUf = new GridBagConstraints();
		gbc_lblUf.anchor = GridBagConstraints.WEST;
		gbc_lblUf.insets = new Insets(0, 0, 5, 5);
		gbc_lblUf.gridx = 1;
		gbc_lblUf.gridy = 11;
		panel4.add(lblUf, gbc_lblUf);
		
		estadoEstud = new JComboBox<String>();
		estadoEstud.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_estadoEstud = new GridBagConstraints();
		gbc_estadoEstud.insets = new Insets(0, 0, 5, 5);
		gbc_estadoEstud.fill = GridBagConstraints.HORIZONTAL;
		gbc_estadoEstud.gridx = 3;
		gbc_estadoEstud.gridy = 11;
		panel4.add(estadoEstud, gbc_estadoEstud);
		estadoEstud.addItem("");
		estadoEstud.addItem("Acre");
		estadoEstud.addItem("Alagoas");
		estadoEstud.addItem("Amapá");
		estadoEstud.addItem("Amazonas");
		estadoEstud.addItem("Bahia");
		estadoEstud.addItem("Ceará");
		estadoEstud.addItem("Distrito Federal");
		estadoEstud.addItem("Espírito Santo");
		estadoEstud.addItem("Goiás");
		estadoEstud.addItem("Maranhão");
		estadoEstud.addItem("Mato Grosso");
		estadoEstud.addItem("Mato Grosso do Sul");
		estadoEstud.addItem("Minas Gerais");
		estadoEstud.addItem("Pará");
		estadoEstud.addItem("Paraíba");
		estadoEstud.addItem("Paraná");
		estadoEstud.addItem("Pernambuco");
		estadoEstud.addItem("Piauí");
		estadoEstud.addItem("Rio de Janeiro");
		estadoEstud.addItem("Rio Grande do Norte");
		estadoEstud.addItem("Rio Grande do Sul");
		estadoEstud.addItem("Rondônia");
		estadoEstud.addItem("Roraima");
		estadoEstud.addItem("Santa Catarina");
		estadoEstud.addItem("São Paulo");
		estadoEstud.addItem("Sergipe");
		estadoEstud.addItem("Tocantins");
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCurso = new GridBagConstraints();
		gbc_lblCurso.anchor = GridBagConstraints.WEST;
		gbc_lblCurso.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurso.gridx = 1;
		gbc_lblCurso.gridy = 12;
		panel4.add(lblCurso, gbc_lblCurso);
		
		cursosUFCSPA = new JComboBox<String>();
		cursosUFCSPA.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_cursosUFCSPA = new GridBagConstraints();
		gbc_cursosUFCSPA.insets = new Insets(0, 0, 5, 5);
		gbc_cursosUFCSPA.fill = GridBagConstraints.HORIZONTAL;
		gbc_cursosUFCSPA.gridx = 3;
		gbc_cursosUFCSPA.gridy = 12;
		panel4.add(cursosUFCSPA, gbc_cursosUFCSPA);
		cursosUFCSPA.addItem("");
		cursosUFCSPA.addItem("Biomedicina - diurno");
		cursosUFCSPA.addItem("Biomedicina - noturno");
		cursosUFCSPA.addItem("Enfermagem");
		cursosUFCSPA.addItem("Farmácia");
		cursosUFCSPA.addItem("Física Médica");
		cursosUFCSPA.addItem("Fisioterapia");
		cursosUFCSPA.addItem("Fonoaudiologia");
		cursosUFCSPA.addItem("Gastronomia");
		cursosUFCSPA.addItem("Gestão em Saúde");
		cursosUFCSPA.addItem("Informática Biomédica");
		cursosUFCSPA.addItem("Medicina");
		cursosUFCSPA.addItem("Nutrição");
		cursosUFCSPA.addItem("Psicologia");
		cursosUFCSPA.addItem("Química medicinal");
		cursosUFCSPA.addItem("Tecnologia em Alimentos");
		cursosUFCSPA.addItem("Toxicologia Analítica");
		
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula:");
		lblMatrcula.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblMatrcula = new GridBagConstraints();
		gbc_lblMatrcula.anchor = GridBagConstraints.WEST;
		gbc_lblMatrcula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatrcula.gridx = 1;
		gbc_lblMatrcula.gridy = 13;
		panel4.add(lblMatrcula, gbc_lblMatrcula);
		
		txtMatricula = new JTextField();
		txtMatricula.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtMatricula = new GridBagConstraints();
		gbc_txtMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_txtMatricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMatricula.gridx = 3;
		gbc_txtMatricula.gridy = 13;
		panel4.add(txtMatricula, gbc_txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblSemestre = new JLabel("Semestre:");
		lblSemestre.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblSemestre = new GridBagConstraints();
		gbc_lblSemestre.anchor = GridBagConstraints.WEST;
		gbc_lblSemestre.insets = new Insets(0, 0, 5, 5);
		gbc_lblSemestre.gridx = 1;
		gbc_lblSemestre.gridy = 14;
		panel4.add(lblSemestre, gbc_lblSemestre);
		
		semestre = new JComboBox<String>();
		semestre.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 14;
		panel4.add(semestre, gbc_comboBox);
		semestre.addItem("");
		semestre.addItem("1");
		semestre.addItem("2");
		
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnPrximo = new JButton("Pr\u00F3ximo >>");
		btnPrximo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					btnPrximo.doClick();
				}

			}
		});
		btnPrximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaFormParte3 tfp3 = new TelaFormParte3(form);
				tfp3.setVisible(true);
				dispose();
			}
		});
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
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
				System.out.println(form.getTxtNomeLocal1());
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
				addInfo(e);
				
			}
		});
		
		JButton btnAnterior = new JButton("<< Anterior");
		btnAnterior.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					btnAnterior.doClick();
				}

			}
			
		});
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaFormParte1 tfp1 = new TelaFormParte1(form);
				tfp1.setVisible(true);
				dispose();
			}
		});
		btnAnterior.setFont(new Font("Calibri", Font.BOLD, 15));
		panel.add(btnAnterior);
		btnRegistrarsalvar.setFont(new Font("Calibri", Font.BOLD, 15));
		panel.add(btnRegistrarsalvar);
		btnLimparCampos.setFont(new Font("Calibri", Font.BOLD, 15));
		panel.add(btnLimparCampos);
		btnPrximo.setFont(new Font("Calibri", Font.BOLD, 15));
		panel.add(btnPrximo);
	}
	
		public void limparTela(ActionEvent e) {
		
			if(e.getActionCommand().equals("Limpar Campos")){
				txtNomeEst.setText("");
				txtDataNasci.setText("");
				txtCPF.setText("");
				txtEndEstu.setText("");
				txtComplemento.setText("");	
				txtBairro.setText("");	
				txtCEPestud.setText("");	
				txtCidadeEstu.setText("");	
				txtMatricula.setText("");
		}
	}
		public void addInfo(ActionEvent e) { 
			form.setTxtNomeEst1(txtNomeEst.getText().toString());
			form.setTxtDataNasci1(txtDataNasci.getText().toString());
			form.setTxtCPF1(txtCPF.getText().toString());
			form.setTxtEndEstu1(txtEndEstu.getText().toString());
			form.setTxtComplemento1(txtComplemento.getText().toString());
			form.setTxtBairro1(txtBairro.getText().toString());
			form.setTxtCEPestud1(txtCEPestud.getText().toString());
			form.setTxtCidadeEstu1(txtCidadeEstu.getText().toString());
			form.setTxtMatricula1(txtMatricula.getText().toString());
			form.setEstadoStud1(estadoEstud.getSelectedItem().toString());
			form.setSemestre1(semestre.getSelectedItem().toString());
			form.setCursosUFCSPA1(cursosUFCSPA.getSelectedItem().toString());
		}
}