package trabalho.Visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabalho.Modelo.Formulario;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TelaBemVindo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaBemVindo(Formulario form) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaBemVindo.class.getResource("/imagens/aa.png")));
		setTitle("Formul\u00E1rios DERCA-UFCSPA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmConsultarDados = new JMenuItem("Consultar dados");
		mntmConsultarDados.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					mntmConsultarDados.doClick();
				}
			}
		});
		mntmConsultarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				TelaIdentificador tID = new TelaIdentificador();
				tID.setVisible(true);
			}
		});
		mnMenu.add(mntmConsultarDados);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					mntmSair.doClick();
				}
			}
		});
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnMenu.add(mntmSair);
		
		JMenu mnForms = new JMenu("Formul\u00E1rios");
		menuBar.add(mnForms);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("List.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JMenu mnGerais = new JMenu("Gerais");
		mnForms.add(mnGerais);
		
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
		mnForms.add(mnInternatoEmMedicina);
		
		JMenuItem mntmTrocaDeMdulo = new JMenuItem("Troca de m\u00F3dulo");
		mnInternatoEmMedicina.add(mntmTrocaDeMdulo);
		
		JMenuItem mntmAutorizaoDeFrias = new JMenuItem("Autoriza\u00E7\u00E3o de f\u00E9rias do doutorado");
		mnInternatoEmMedicina.add(mntmAutorizaoDeFrias);
		
		JMenuItem mntmTermoDeCompromisso = new JMenuItem("Termo de compromisso Santa Casa");
		mnInternatoEmMedicina.add(mntmTermoDeCompromisso);
		
		JMenuItem mntmEstgioForaDa = new JMenuItem("Est\u00E1gio fora da UFCSPA");
		mnInternatoEmMedicina.add(mntmEstgioForaDa);
		
		JMenu mnMonitoriaVoluntria = new JMenu("Monitoria volunt\u00E1ria");
		mnForms.add(mnMonitoriaVoluntria);
		
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
		mnForms.add(mnPid);
		
		JMenuItem mntmCartaDeApresentao = new JMenuItem("Carta de apresenta\u00E7\u00E3o do projeto");
		mnPid.add(mntmCartaDeApresentao);
		
		JMenuItem mntmCartaDeRenovao = new JMenuItem("Carta de renova\u00E7\u00E3o do projeto");
		mnPid.add(mntmCartaDeRenovao);
		
		JMenuItem mntmAtaDeSeleo_1 = new JMenuItem("Ata de sele\u00E7\u00E3o");
		mnPid.add(mntmAtaDeSeleo_1);
		
		JMenuItem mntmAtestadoDeFrequncia = new JMenuItem("Atestado de frequ\u00EAncia");
		mnPid.add(mntmAtestadoDeFrequncia);
		
		JMenu mnTermosDeCompromisso = new JMenu("Termos de compromisso de est\u00E1gio");
		mnForms.add(mnTermosDeCompromisso);
		
		JMenuItem mntmEstgioSantaCasa = new JMenuItem("Est\u00E1gio Santa Casa");
		mnTermosDeCompromisso.add(mntmEstgioSantaCasa);
		
		JMenuItem mntmEstgioOutrasConcedentes = new JMenuItem("Est\u00E1gio outras concedentes");
		mntmEstgioOutrasConcedentes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					mntmEstgioOutrasConcedentes.doClick();
				}
			}
		});
		mntmEstgioOutrasConcedentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaFormParte1 tfintro = new TelaFormParte1(form);
				tfintro.setVisible(true);
			}
		});
		mnTermosDeCompromisso.add(mntmEstgioOutrasConcedentes);
		
		JMenu mnCursoDeFrias = new JMenu("Curso de f\u00E9rias");
		mnForms.add(mnCursoDeFrias);
		
		JMenuItem mntmFormulrioParaSeleo = new JMenuItem("Formul\u00E1rio para sele\u00E7\u00E3o");
		mnCursoDeFrias.add(mntmFormulrioParaSeleo);
		
		JMenuItem mntmControleDeFrequncia = new JMenuItem("Controle de frequ\u00EAncia");
		mnCursoDeFrias.add(mntmControleDeFrequncia);
		
		JMenu mnModelosDePlanos = new JMenu("Planos de ensino");
		mnForms.add(mnModelosDePlanos);
		
		JMenuItem mntmCronogramaPlanosDe = new JMenuItem("Cronograma planos de ensino 2018/1");
		mnModelosDePlanos.add(mntmCronogramaPlanosDe);
		
		JMenuItem mntmGradeDeHorrios = new JMenuItem("Grade de hor\u00E1rios dos cursos 2018");
		mnModelosDePlanos.add(mntmGradeDeHorrios);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaBemVindo.class.getResource("/imagens/bemvindo2.png")));
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

}