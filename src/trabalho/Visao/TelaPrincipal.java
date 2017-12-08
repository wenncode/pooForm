package trabalho.Visao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.ComponentOrientation;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import trabalho.DAO.LoginDAO;

import javax.swing.JFormattedTextField;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JButton btnAutenticar;

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/imagens/aa.png")));
		setResizable(false);
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setTitle("Formul\u00E1rios DERCA-UFCSPA ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 254);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.text);
		setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);

		JMenuItem mntmSair_1 = new JMenuItem("Sair");
		mntmSair_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});
		mnMenu.add(mntmSair_1);

		JMenu mnFormulrios_1 = new JMenu("Formul\u00E1rios");
		menuBar.add(mnFormulrios_1);

		JMenu mnGerais = new JMenu("Gerais");
		mnFormulrios_1.add(mnGerais);

		JMenuItem mntmModeloDePlano = new JMenuItem("Modelo de plano de ensino e orienta\u00E7\u00F5es");
		mnGerais.add(mntmModeloDePlano);

		JMenuItem mntmModeloDePlano_1 = new JMenuItem("Modelo de plano de est\u00E1gio e orienta\u00E7\u00F5es");
		mnGerais.add(mntmModeloDePlano_1);

		JMenuItem mntmProcuraoParaMatrcula = new JMenuItem("Procura\u00E7\u00E3o para matr\u00EDcula");
		mnGerais.add(mntmProcuraoParaMatrcula);

		JMenuItem mntmSolicitaoDeReserva = new JMenuItem("Solicita\u00E7\u00E3o de reserva de sala");
		mnGerais.add(mntmSolicitaoDeReserva);

		JMenuItem mntmGuiaDeRecolhimento = new JMenuItem("Guia de recolhimento da uni\u00E3o - GRU");
		mnGerais.add(mntmGuiaDeRecolhimento);

		JMenuItem mntmAtaDeExame = new JMenuItem("Ata de exame");
		mnGerais.add(mntmAtaDeExame);

		JMenu mnInternatoEmMedicina = new JMenu("Internato em medicina");
		mnFormulrios_1.add(mnInternatoEmMedicina);

		JMenuItem mntmTrocaDeMdulo = new JMenuItem("Troca de m\u00F3dulo");
		mnInternatoEmMedicina.add(mntmTrocaDeMdulo);

		JMenuItem mntmAutorizaoDeFrias = new JMenuItem("Autoriza\u00E7\u00E3o de f\u00E9rias do doutorado");
		mnInternatoEmMedicina.add(mntmAutorizaoDeFrias);

		JMenuItem mntmTermoDeCompromisso = new JMenuItem("Termo de compromisso Santa Casa");
		mnInternatoEmMedicina.add(mntmTermoDeCompromisso);

		JMenuItem mntmEstgioForaDa = new JMenuItem("Est\u00E1gio fora da UFCSPA");
		mnInternatoEmMedicina.add(mntmEstgioForaDa);

		JMenu mnMonitoriaVoluntria = new JMenu("Monitoria volunt\u00E1ria");
		mnFormulrios_1.add(mnMonitoriaVoluntria);

		JMenuItem mntmPlanoDepartamental = new JMenuItem("Plano departamental");
		mnMonitoriaVoluntria.add(mntmPlanoDepartamental);

		JMenuItem mntmAtaDeSeleo = new JMenuItem("Ata de sele\u00E7\u00E3o");
		mnMonitoriaVoluntria.add(mntmAtaDeSeleo);

		JMenuItem mntmPlanoDeAtividades = new JMenuItem("Plano de atividades do monitor");
		mnMonitoriaVoluntria.add(mntmPlanoDeAtividades);

		JMenuItem mntmRelatrioFinalDo = new JMenuItem("Relat\u00F3rio final do professor");
		mnMonitoriaVoluntria.add(mntmRelatrioFinalDo);

		JMenuItem mntmRelatrioFinalMonitor = new JMenuItem("Relat\u00F3rio final monitor");
		mnMonitoriaVoluntria.add(mntmRelatrioFinalMonitor);

		JMenu mnPid = new JMenu("PID");
		mnFormulrios_1.add(mnPid);

		JMenuItem mntmCartaDeApresentao = new JMenuItem("Carta de apresenta\u00E7\u00E3o do projeto");
		mnPid.add(mntmCartaDeApresentao);

		JMenuItem mntmCartaDeRenovao = new JMenuItem("Carta de renova\u00E7\u00E3o do projeto");
		mnPid.add(mntmCartaDeRenovao);

		JMenuItem mntmAtaDeSeleo_1 = new JMenuItem("Ata de sele\u00E7\u00E3o");
		mnPid.add(mntmAtaDeSeleo_1);

		JMenuItem mntmAtestadoDeFrequncia = new JMenuItem("Atestado de frequ\u00EAncia");
		mnPid.add(mntmAtestadoDeFrequncia);

		JMenu mnTermosDeCompromisso = new JMenu("Termos de compromisso de est\u00E1gio");
		mnFormulrios_1.add(mnTermosDeCompromisso);

		JMenuItem mntmEstgioSantaCasa = new JMenuItem("Est\u00E1gio Santa Casa");
		mnTermosDeCompromisso.add(mntmEstgioSantaCasa);

		JMenuItem mntmEstgioOutrasConcedentes = new JMenuItem("Est\u00E1gio outras concedentes");
		mnTermosDeCompromisso.add(mntmEstgioOutrasConcedentes);

		JMenu mnCursoDeFrias = new JMenu("Curso de f\u00E9rias");
		mnFormulrios_1.add(mnCursoDeFrias);

		JMenuItem mntmFormulrioParaSeleo = new JMenuItem("Formul\u00E1rio para sele\u00E7\u00E3o");
		mnCursoDeFrias.add(mntmFormulrioParaSeleo);

		JMenuItem mntmControleDeFrequncia = new JMenuItem("Controle de frequ\u00EAncia");
		mnCursoDeFrias.add(mntmControleDeFrequncia);

		JMenu mnModelosDePlanos = new JMenu("Planos de ensino");
		mnFormulrios_1.add(mnModelosDePlanos);

		JMenuItem mntmCronogramaPlanosDe = new JMenuItem("Cronograma planos de ensino 2018/1");
		mnModelosDePlanos.add(mntmCronogramaPlanosDe);

		JMenuItem mntmGradeDeHorrios = new JMenuItem("Grade de hor\u00E1rios dos cursos 2018");
		mnModelosDePlanos.add(mntmGradeDeHorrios);

		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel1 = new JPanel();
		panel1.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel1, BorderLayout.NORTH);

		JLabel lblInforme = new JLabel("Autentica\u00E7\u00E3o de usu\u00E1rio");
		lblInforme.setFont(new Font("Calibri", Font.BOLD, 16));
		panel1.add(lblInforme);

		JPanel panel2 = new JPanel();
		panel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel2.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPorFavorInforme = new JLabel("Por favor, informe seu nome de usu\u00E1rio e a senha.");
		lblPorFavorInforme.setFont(new Font("Calibri", Font.BOLD, 13));
		panel2.add(lblPorFavorInforme);

		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setEditable(false);
		formattedTextField.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		formattedTextField.setBorder(null);
		formattedTextField.setText(
				"                                                                                                                                     ");
		panel2.add(formattedTextField);

		JLabel lblNewLabel = new JLabel("               ");
		panel2.add(lblNewLabel);

		JLabel lblUsuario = new JLabel("                              Usu\u00E1rio");
		lblUsuario.setVerticalAlignment(SwingConstants.BOTTOM);
		lblUsuario.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		panel2.add(lblUsuario);

		txtUsuario = new JTextField(20);
		txtUsuario.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtUsuario.setHorizontalAlignment(SwingConstants.LEFT);

		txtUsuario.setFont(new Font("Calibri", Font.PLAIN, 14));
		panel2.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblSenha = new JLabel("                                                Senha  ");
		lblSenha.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setFont(new Font("Calibri", Font.PLAIN, 15));
		panel2.add(lblSenha);

		txtSenha = new JPasswordField(10);
		txtSenha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					((JTextField) e.getSource()).transferFocus();
				}
			}
		});
		txtSenha.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtSenha.setHorizontalAlignment(SwingConstants.LEFT);
		txtSenha.setFont(new Font("Calibri", Font.PLAIN, 14));
		panel2.add(txtSenha);

		JPanel panel3 = new JPanel();
		panel3.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		panel3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel3, BorderLayout.SOUTH);

		btnAutenticar = new JButton("Autenticar");
		btnAutenticar.setActionCommand("Autenticar");
		btnAutenticar.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel3.add(btnAutenticar);

		btnAutenticar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					LoginDAO login = new LoginDAO(txtUsuario.getText(),txtSenha.getText());
					
					if (login.autenticacao()){
						System.out.println("Login valido");
						
						TelaBemVindo bemVindo = new TelaBemVindo();
						bemVindo.setVisible(true);
						setVisible(false);
					} else {
						System.out.println("Login invalido");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnLimparDados = new JButton("Limpar dados");
		btnLimparDados.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnLimparDados.doClick();
				}
			}
		});
		btnLimparDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				limparTela(e);
			}
		});
		btnLimparDados.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel3.add(btnLimparDados);
	}

	public void limparTela(ActionEvent e) {

		if (e.getActionCommand().equals("Limpar dados")) {
			txtUsuario.setText("");
			txtSenha.setText("");
		}
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JPasswordField getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(JPasswordField txtSenha) {
		this.txtSenha = txtSenha;
	}

	public JButton getBtnAutenticar() {
		return btnAutenticar;
	}

	public void setBtnAutenticar(JButton btnAutenticar) {
		this.btnAutenticar = btnAutenticar;
	}

}
