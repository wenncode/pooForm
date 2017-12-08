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
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class TelaFormParte1 extends JFrame {

	/**
	 * 
	 */
	JFrame TelaFormParte1 = new JFrame(); 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomeLocal;
	private JTextField txtEndLocal;
	private JTextField txtCEP;
	private JTextField txtCidade;
	private JTextField txtCNPJ;
	private JComboBox comboUF;
	String nomeLocal;
	String endLocal;
	String CEP;
	String cidade;
	String CNPJ;
	String UF;
	private Formulario form;
	
	/**
	 * Create the frame.
	 */
	public TelaFormParte1(Formulario form) {
		this.form = form;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaFormParte1.class.getResource("/imagens/aa.png")));
		setResizable(false);
		setTitle("Formul\u00E1rio Termo de Compromisso");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
		setBounds(100, 100, 630, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(SystemColor.text);
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JLabel lblFigura = new JLabel("");
		lblFigura.setIcon(new ImageIcon(TelaFormParte1.class.getResource("/imagens/aa.png")));
		panel1.add(lblFigura);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(SystemColor.text);
		contentPane.add(panel2, BorderLayout.CENTER);
		GridBagLayout gbl_panel2 = new GridBagLayout();
		gbl_panel2.columnWidths = new int[]{37, 81, 0, 475, 0, 0, 0, 0};
		gbl_panel2.rowHeights = new int[]{20, 0, 17, 0, 0, 0, 17, 17, 17, 0, 31, 17, 17, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel2.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel2.setLayout(gbl_panel2);
		
		JLabel lblTitulo = new JLabel("TERMO DE COMPROMISSO DE EST\u00C1GIO CURRICULAR");
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setFont(new Font("Calibri", Font.BOLD, 16));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 3;
		gbc_lblTitulo.gridy = 1;
		panel2.add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblIntro = new JLabel("Termo de Compromisso para realiza\u00E7\u00E3o de est\u00E1gio curricular, de car\u00E1ter obrigat\u00F3rio, que entre si firmam:");
		lblIntro.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIntro = new GridBagConstraints();
		gbc_lblIntro.anchor = GridBagConstraints.NORTH;
		gbc_lblIntro.insets = new Insets(0, 0, 5, 0);
		gbc_lblIntro.gridwidth = 8;
		gbc_lblIntro.gridx = 0;
		gbc_lblIntro.gridy = 3;
		panel2.add(lblIntro, gbc_lblIntro);
		
		JLabel lblFundaoUniversidadeFederal = new JLabel("Funda\u00E7\u00E3o Universidade Federal de Ci\u00EAncias da Sa\u00FAde de Porto Alegre");
		lblFundaoUniversidadeFederal.setFont(new Font("Calibri", Font.BOLD, 16));
		lblFundaoUniversidadeFederal.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblFundaoUniversidadeFederal = new GridBagConstraints();
		gbc_lblFundaoUniversidadeFederal.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblFundaoUniversidadeFederal.insets = new Insets(0, 0, 5, 0);
		gbc_lblFundaoUniversidadeFederal.gridwidth = 7;
		gbc_lblFundaoUniversidadeFederal.gridx = 1;
		gbc_lblFundaoUniversidadeFederal.gridy = 5;
		panel2.add(lblFundaoUniversidadeFederal, gbc_lblFundaoUniversidadeFederal);
		
		JLabel lblRuaSarmentoLeite = new JLabel("Rua Sarmento Leite, 245, Centro - CEP 90050-170 - Porto Alegre/RS");
		lblRuaSarmentoLeite.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblRuaSarmentoLeite = new GridBagConstraints();
		gbc_lblRuaSarmentoLeite.anchor = GridBagConstraints.NORTH;
		gbc_lblRuaSarmentoLeite.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblRuaSarmentoLeite.insets = new Insets(0, 0, 5, 0);
		gbc_lblRuaSarmentoLeite.gridwidth = 7;
		gbc_lblRuaSarmentoLeite.gridx = 1;
		gbc_lblRuaSarmentoLeite.gridy = 6;
		panel2.add(lblRuaSarmentoLeite, gbc_lblRuaSarmentoLeite);
		
		JLabel lblCnpjSobO = new JLabel("CNPJ sob o n\u00BA 92967595/0001-77");
		lblCnpjSobO.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblCnpjSobO = new GridBagConstraints();
		gbc_lblCnpjSobO.anchor = GridBagConstraints.NORTH;
		gbc_lblCnpjSobO.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCnpjSobO.insets = new Insets(0, 0, 5, 0);
		gbc_lblCnpjSobO.gridwidth = 7;
		gbc_lblCnpjSobO.gridx = 1;
		gbc_lblCnpjSobO.gridy = 7;
		panel2.add(lblCnpjSobO, gbc_lblCnpjSobO);
		
		JLabel lblUnidadeConcedenteDe = new JLabel("Unidade Concedente de Est\u00E1gio:");
		lblUnidadeConcedenteDe.setFont(new Font("Calibri", Font.BOLD, 16));
		GridBagConstraints gbc_lblUnidadeConcedenteDe = new GridBagConstraints();
		gbc_lblUnidadeConcedenteDe.anchor = GridBagConstraints.NORTH;
		gbc_lblUnidadeConcedenteDe.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblUnidadeConcedenteDe.insets = new Insets(0, 0, 5, 0);
		gbc_lblUnidadeConcedenteDe.gridwidth = 7;
		gbc_lblUnidadeConcedenteDe.gridx = 1;
		gbc_lblUnidadeConcedenteDe.gridy = 9;
		panel2.add(lblUnidadeConcedenteDe, gbc_lblUnidadeConcedenteDe);
		
		JLabel lblNomeLocal = new JLabel("Nome:");
		lblNomeLocal.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNomeLocal = new GridBagConstraints();
		gbc_lblNomeLocal.anchor = GridBagConstraints.WEST;
		gbc_lblNomeLocal.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeLocal.gridx = 1;
		gbc_lblNomeLocal.gridy = 10;
		panel2.add(lblNomeLocal, gbc_lblNomeLocal);
		
		txtNomeLocal = new JTextField();
		txtNomeLocal.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtNomeLocal = new GridBagConstraints();
		gbc_txtNomeLocal.insets = new Insets(0, 0, 5, 5);
		gbc_txtNomeLocal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNomeLocal.gridx = 3;
		gbc_txtNomeLocal.gridy = 10;
		panel2.add(txtNomeLocal, gbc_txtNomeLocal);
		txtNomeLocal.setColumns(30);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.anchor = GridBagConstraints.WEST;
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 1;
		gbc_lblEndereo.gridy = 11;
		panel2.add(lblEndereo, gbc_lblEndereo);
		
		txtEndLocal = new JTextField();
		txtEndLocal.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtEndLocal = new GridBagConstraints();
		gbc_txtEndLocal.insets = new Insets(0, 0, 5, 5);
		gbc_txtEndLocal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEndLocal.gridx = 3;
		gbc_txtEndLocal.gridy = 11;
		panel2.add(txtEndLocal, gbc_txtEndLocal);
		txtEndLocal.setColumns(30);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCep = new GridBagConstraints();
		gbc_lblCep.anchor = GridBagConstraints.WEST;
		gbc_lblCep.insets = new Insets(0, 0, 5, 5);
		gbc_lblCep.gridx = 1;
		gbc_lblCep.gridy = 12;
		panel2.add(lblCep, gbc_lblCep);
		
		txtCEP = new JTextField();
		txtCEP.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtCEP = new GridBagConstraints();
		gbc_txtCEP.insets = new Insets(0, 0, 5, 5);
		gbc_txtCEP.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCEP.gridx = 3;
		gbc_txtCEP.gridy = 12;
		panel2.add(txtCEP, gbc_txtCEP);
		txtCEP.setColumns(9);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.anchor = GridBagConstraints.WEST;
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.gridx = 1;
		gbc_lblCidade.gridy = 13;
		panel2.add(lblCidade, gbc_lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtCidade = new GridBagConstraints();
		gbc_txtCidade.insets = new Insets(0, 0, 5, 5);
		gbc_txtCidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCidade.gridx = 3;
		gbc_txtCidade.gridy = 13;
		panel2.add(txtCidade, gbc_txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblUf = new GridBagConstraints();
		gbc_lblUf.anchor = GridBagConstraints.WEST;
		gbc_lblUf.insets = new Insets(0, 0, 5, 5);
		gbc_lblUf.gridx = 1;
		gbc_lblUf.gridy = 14;
		panel2.add(lblUf, gbc_lblUf);
		
		JComboBox<String> comboUF = new JComboBox<String>();
		comboUF.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_comboUF = new GridBagConstraints();
		gbc_comboUF.insets = new Insets(0, 0, 5, 5);
		gbc_comboUF.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboUF.gridx = 3;
		gbc_comboUF.gridy = 14;
		panel2.add(comboUF, gbc_comboUF);
		comboUF.addItem("");
		comboUF.addItem("Acre");
		comboUF.addItem("Alagoas");
		comboUF.addItem("Amapá");
		comboUF.addItem("Amazonas");
		comboUF.addItem("Bahia");
		comboUF.addItem("Ceará");
		comboUF.addItem("Distrito Federal");
		comboUF.addItem("Espírito Santo");
		comboUF.addItem("Goiás");
		comboUF.addItem("Maranhão");
		comboUF.addItem("Mato Grosso");
		comboUF.addItem("Mato Grosso do Sul");
		comboUF.addItem("Minas Gerais");
		comboUF.addItem("Pará");
		comboUF.addItem("Paraíba");
		comboUF.addItem("Paraná");
		comboUF.addItem("Pernambuco");
		comboUF.addItem("Piauí");
		comboUF.addItem("Rio de Janeiro");
		comboUF.addItem("Rio Grande do Norte");
		comboUF.addItem("Rio Grande do Sul");
		comboUF.addItem("Rondônia");
		comboUF.addItem("Roraima");
		comboUF.addItem("Santa Catarina");
		comboUF.addItem("São Paulo");
		comboUF.addItem("Sergipe");
		comboUF.addItem("Tocantins");
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCnpj = new GridBagConstraints();
		gbc_lblCnpj.anchor = GridBagConstraints.WEST;
		gbc_lblCnpj.insets = new Insets(0, 0, 5, 5);
		gbc_lblCnpj.gridx = 1;
		gbc_lblCnpj.gridy = 15;
		panel2.add(lblCnpj, gbc_lblCnpj);
		
		txtCNPJ = new JTextField();
		txtCNPJ.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_txtCNPJ = new GridBagConstraints();
		gbc_txtCNPJ.insets = new Insets(0, 0, 5, 5);
		gbc_txtCNPJ.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCNPJ.gridx = 3;
		gbc_txtCNPJ.gridy = 15;
		panel2.add(txtCNPJ, gbc_txtCNPJ);
		txtCNPJ.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
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
				
				TelaFormParte2 tfp2 = new TelaFormParte2(form);
				tfp2.setVisible(true);
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
				addInfo(e);
				
			}
		});
		btnRegistrarsalvar.setFont(new Font("Calibri", Font.BOLD, 15));
		panel_2.add(btnRegistrarsalvar);
		btnLimparCampos.setFont(new Font("Calibri", Font.BOLD, 15));
		panel_2.add(btnLimparCampos);
		btnPrximo.setFont(new Font("Calibri", Font.BOLD, 15));
		panel_2.add(btnPrximo);
	}
	
	public void limparTela(ActionEvent e) {
		
		if(e.getActionCommand().equals("Limpar campos")){
			System.out.println(form.getTxtNomeLocal1());
			System.out.println(form.getTxtEndLocal1());
			txtNomeLocal.setText("");
			txtEndLocal.setText("");
			txtCEP.setText("");
			txtCidade.setText("");
			txtCNPJ.setText("");		

		}
	}
	public void addInfo(ActionEvent e) { 
		this.form.setTxtNomeLocal1(txtNomeLocal.getText().toString());
		this.form.setTxtEndLocal1(txtEndLocal.getText().toString());
		this.form.setTxtCEP1(txtCEP.getText().toString());
		this.form.setTxtCidade1(txtCidade.getText().toString());
		this.form.setTxtCNPJ1(txtCNPJ.getText().toString());
	}

}