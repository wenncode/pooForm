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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Toolkit;

public class TelaFormParte4 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomeOrientador;
	private JTextField txtCargoOrientador;
	public Formulario form;

	/**
	 * Create the frame.
	 */
	public TelaFormParte4(Formulario form) {
		this.form = form;
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaFormParte4.class.getResource("/imagens/aa.png")));
		setResizable(false);
		setTitle("Formul\u00E1rio Termo de Compromisso");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 630, 612);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel8 = new JPanel();
		panel8.setBackground(SystemColor.text);
		contentPane.add(panel8, BorderLayout.NORTH);
		
		JLabel lblFigura4 = new JLabel("");
		lblFigura4.setIcon(new ImageIcon(TelaFormParte4.class.getResource("/imagens/aa.png")));
		panel8.add(lblFigura4);
		
		JPanel panel9 = new JPanel();
		panel9.setBackground(SystemColor.text);
		contentPane.add(panel9, BorderLayout.CENTER);
		GridBagLayout gbl_panel9 = new GridBagLayout();
		gbl_panel9.columnWidths = new int[]{37, 81, 0, 0, 0, 475, 0, 0, 0, 0, 0, 0};
		gbl_panel9.rowHeights = new int[]{20, 0, 17, 0, 0, 0, 17, 17, 0, 17, 0, 0, 31, 17, 17, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel9.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel9.setLayout(gbl_panel9);
		
		JLabel lblArtigoE = new JLabel("e) Supervis\u00E3o: da UFCSPA, a cargo de professor designado pela Coordena\u00E7\u00E3o do Curso referido.      ");
		lblArtigoE.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblArtigoE.setPreferredSize(new Dimension(334, 14));
		lblArtigoE.setMinimumSize(new Dimension(334, 14));
		lblArtigoE.setMaximumSize(new Dimension(334, 14));
		GridBagConstraints gbc_lblArtigoE = new GridBagConstraints();
		gbc_lblArtigoE.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblArtigoE.gridwidth = 10;
		gbc_lblArtigoE.insets = new Insets(0, 0, 5, 0);
		gbc_lblArtigoE.gridx = 1;
		gbc_lblArtigoE.gridy = 4;
		panel9.add(lblArtigoE, gbc_lblArtigoE);
		
		JLabel lblArtigoF = new JLabel("f) Orienta\u00E7\u00E3o e Avalia\u00E7\u00E3o da \u00C1rea de est\u00E1gio, a cargo de orientador/professor designado pela");
		lblArtigoF.setPreferredSize(new Dimension(334, 14));
		lblArtigoF.setMinimumSize(new Dimension(334, 14));
		lblArtigoF.setMaximumSize(new Dimension(334, 14));
		lblArtigoF.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblArtigoF = new GridBagConstraints();
		gbc_lblArtigoF.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblArtigoF.gridwidth = 10;
		gbc_lblArtigoF.insets = new Insets(0, 0, 5, 0);
		gbc_lblArtigoF.gridx = 1;
		gbc_lblArtigoF.gridy = 5;
		panel9.add(lblArtigoF, gbc_lblArtigoF);
		
		JLabel lblUnConcEst = new JLabel("unidade concedente de est\u00E1gio.");
		lblUnConcEst.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblUnConcEst = new GridBagConstraints();
		gbc_lblUnConcEst.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnConcEst.gridx = 1;
		gbc_lblUnConcEst.gridy = 6;
		panel9.add(lblUnConcEst, gbc_lblUnConcEst);
		
		JLabel lblNomeOrientador = new JLabel("Nome do orientador/professor:");
		lblNomeOrientador.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNomeOrientador = new GridBagConstraints();
		gbc_lblNomeOrientador.anchor = GridBagConstraints.WEST;
		gbc_lblNomeOrientador.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeOrientador.gridx = 1;
		gbc_lblNomeOrientador.gridy = 8;
		panel9.add(lblNomeOrientador, gbc_lblNomeOrientador);
		
		txtNomeOrientador = new JTextField();
		txtNomeOrientador.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_txtNomeOrientador = new GridBagConstraints();
		gbc_txtNomeOrientador.gridwidth = 4;
		gbc_txtNomeOrientador.insets = new Insets(0, 0, 5, 5);
		gbc_txtNomeOrientador.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNomeOrientador.gridx = 2;
		gbc_txtNomeOrientador.gridy = 8;
		panel9.add(txtNomeOrientador, gbc_txtNomeOrientador);
		txtNomeOrientador.setColumns(10);
		
		JLabel lblCargoOrientador = new JLabel("Cargo do orientador/professor:");
		lblCargoOrientador.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblCargoOrientador = new GridBagConstraints();
		gbc_lblCargoOrientador.anchor = GridBagConstraints.WEST;
		gbc_lblCargoOrientador.insets = new Insets(0, 0, 5, 5);
		gbc_lblCargoOrientador.gridx = 1;
		gbc_lblCargoOrientador.gridy = 9;
		panel9.add(lblCargoOrientador, gbc_lblCargoOrientador);
		
		txtCargoOrientador = new JTextField();
		txtCargoOrientador.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_txtCargoOrientador = new GridBagConstraints();
		gbc_txtCargoOrientador.gridwidth = 4;
		gbc_txtCargoOrientador.insets = new Insets(0, 0, 5, 5);
		gbc_txtCargoOrientador.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCargoOrientador.gridx = 2;
		gbc_txtCargoOrientador.gridy = 9;
		panel9.add(txtCargoOrientador, gbc_txtCargoOrientador);
		txtCargoOrientador.setColumns(10);
		
		JLabel lblArtigoG = new JLabel("g) As atividades desenvolvidas pelo estagi\u00E1rio ser\u00E3o na \u00E1rea de forma\u00E7\u00E3o do curso;");
		lblArtigoG.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblArtigoG.setPreferredSize(new Dimension(334, 14));
		lblArtigoG.setMinimumSize(new Dimension(334, 14));
		lblArtigoG.setMaximumSize(new Dimension(334, 14));
		GridBagConstraints gbc_lblArtigoG = new GridBagConstraints();
		gbc_lblArtigoG.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblArtigoG.gridwidth = 9;
		gbc_lblArtigoG.insets = new Insets(0, 0, 5, 5);
		gbc_lblArtigoG.gridx = 1;
		gbc_lblArtigoG.gridy = 11;
		panel9.add(lblArtigoG, gbc_lblArtigoG);
		
		JLabel lblArtigoH = new JLabel("h) O presente est\u00E1gio curricular n\u00E3o cria v\u00EDnculo empregat\u00EDcio de qualquer natureza, de acordo");
		lblArtigoH.setPreferredSize(new Dimension(334, 14));
		lblArtigoH.setMinimumSize(new Dimension(334, 14));
		lblArtigoH.setMaximumSize(new Dimension(334, 14));
		lblArtigoH.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblArtigoH = new GridBagConstraints();
		gbc_lblArtigoH.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblArtigoH.gridwidth = 10;
		gbc_lblArtigoH.insets = new Insets(0, 0, 5, 0);
		gbc_lblArtigoH.gridx = 1;
		gbc_lblArtigoH.gridy = 12;
		panel9.add(lblArtigoH, gbc_lblArtigoH);
		
		JLabel lblLei = new JLabel("com o \u00A71\u00BA do Art. 12 da Lei 11.788.");
		lblLei.setFont(new Font("Calibri", Font.PLAIN, 14));
		GridBagConstraints gbc_lblLei = new GridBagConstraints();
		gbc_lblLei.insets = new Insets(0, 0, 5, 5);
		gbc_lblLei.gridx = 1;
		gbc_lblLei.gridy = 13;
		panel9.add(lblLei, gbc_lblLei);
		
		JLabel lblPortoAlegre = new JLabel("Porto Alegre,");
		lblPortoAlegre.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblPortoAlegre = new GridBagConstraints();
		gbc_lblPortoAlegre.anchor = GridBagConstraints.EAST;
		gbc_lblPortoAlegre.insets = new Insets(0, 0, 5, 5);
		gbc_lblPortoAlegre.gridx = 2;
		gbc_lblPortoAlegre.gridy = 16;
		panel9.add(lblPortoAlegre, gbc_lblPortoAlegre);
		
		JComboBox<String> comboDia = new JComboBox<String>();
		comboDia.setMaximumSize(new Dimension(334, 13));
		comboDia.setMinimumSize(new Dimension(400, 20));
		GridBagConstraints gbc_comboDia = new GridBagConstraints();
		gbc_comboDia.insets = new Insets(0, 0, 5, 5);
		gbc_comboDia.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboDia.gridx = 3;
		gbc_comboDia.gridy = 16;
		panel9.add(comboDia, gbc_comboDia);
		comboDia.addItem("");
		comboDia.addItem("1");
		comboDia.addItem("2");
		comboDia.addItem("3");
		comboDia.addItem("4");
		comboDia.addItem("5");
		comboDia.addItem("6");
		comboDia.addItem("7");
		comboDia.addItem("8");
		comboDia.addItem("9");
		comboDia.addItem("10");
		comboDia.addItem("11");
		comboDia.addItem("12");
		comboDia.addItem("13");
		comboDia.addItem("14");
		comboDia.addItem("15");
		comboDia.addItem("16");
		comboDia.addItem("17");
		comboDia.addItem("18");
		comboDia.addItem("19");
		comboDia.addItem("20");
		comboDia.addItem("21");
		comboDia.addItem("22");
		comboDia.addItem("23");
		comboDia.addItem("24");
		comboDia.addItem("25");
		comboDia.addItem("26");
		comboDia.addItem("27");
		comboDia.addItem("28");
		comboDia.addItem("29");
		comboDia.addItem("30");
		comboDia.addItem("31");
		
		
		JLabel lblDe = new JLabel("de");
		lblDe.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblDe = new GridBagConstraints();
		gbc_lblDe.anchor = GridBagConstraints.EAST;
		gbc_lblDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblDe.gridx = 4;
		gbc_lblDe.gridy = 16;
		panel9.add(lblDe, gbc_lblDe);
		
		JComboBox<String> comboMes = new JComboBox<String>();
		comboMes.setMinimumSize(new Dimension(100, 20));
		comboMes.setMaximumSize(new Dimension(100, 13));
		GridBagConstraints gbc_comboMes = new GridBagConstraints();
		gbc_comboMes.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboMes.insets = new Insets(0, 0, 5, 5);
		gbc_comboMes.gridx = 5;
		gbc_comboMes.gridy = 16;
		panel9.add(comboMes, gbc_comboMes);
		comboMes.addItem("");
		comboMes.addItem("Janeiro");
		comboMes.addItem("Fevereiro");
		comboMes.addItem("Março");
		comboMes.addItem("Abril");
		comboMes.addItem("Maio");
		comboMes.addItem("Junho");
		comboMes.addItem("Julho");
		comboMes.addItem("Agosto");
		comboMes.addItem("Setembro");
		comboMes.addItem("Outubro");
		comboMes.addItem("Novembro");
		comboMes.addItem("Dezembro");
		
		
		JLabel lblDe2 = new JLabel("de");
		lblDe2.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblDe2 = new GridBagConstraints();
		gbc_lblDe2.anchor = GridBagConstraints.EAST;
		gbc_lblDe2.insets = new Insets(0, 0, 5, 5);
		gbc_lblDe2.gridx = 6;
		gbc_lblDe2.gridy = 16;
		panel9.add(lblDe2, gbc_lblDe2);
		
		JComboBox<String> comboAno = new JComboBox<String>();
		comboAno.setMinimumSize(new Dimension(400, 20));
		comboAno.setMaximumSize(new Dimension(334, 13));
		GridBagConstraints gbc_comboAno = new GridBagConstraints();
		gbc_comboAno.gridwidth = 3;
		gbc_comboAno.insets = new Insets(0, 0, 5, 5);
		gbc_comboAno.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboAno.gridx = 7;
		gbc_comboAno.gridy = 16;
		panel9.add(comboAno, gbc_comboAno);
		comboAno.addItem("");
		comboAno.addItem("2017");
		comboAno.addItem("2018");
		comboAno.addItem("2019");
		comboAno.addItem("2020");
		comboAno.addItem("2021");
		comboAno.addItem("2022");
		comboAno.addItem("2023");
		comboAno.addItem("2024");
		comboAno.addItem("2025");
		
		
		JPanel panel10 = new JPanel();
		panel10.setBackground(SystemColor.text);
		contentPane.add(panel10, BorderLayout.SOUTH);
		
		JButton btnRegistrar = new JButton("Registrar/Salvar");
		btnRegistrar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					btnRegistrar.doClick();
				}
			}
		});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					escreveFormulario();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				TelaIdentificador tID = new TelaIdentificador();
				tID.setVisible(true);
							
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
				

				TelaFormParte3 tfp3 = new TelaFormParte3(form);
				tfp3.setVisible(true);
				dispose();
			}
		});
		btnAnterior.setFont(new Font("Calibri", Font.BOLD, 15));
		panel10.add(btnAnterior);
		btnRegistrar.setFont(new Font("Calibri", Font.BOLD, 15));
		panel10.add(btnRegistrar);
		
		JButton btnLimparForm = new JButton("Limpar campos");
		btnLimparForm.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					btnLimparForm.doClick();
				}

			}
		});
		btnLimparForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limparTela(e);
			}
		});
		btnLimparForm.setFont(new Font("Calibri", Font.BOLD, 15));
		panel10.add(btnLimparForm);
	}
			protected void escreveFormulario() throws IOException {
				FileWriter fw = new FileWriter("formularios.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				
//				bw.write(form.getTxtNomeEst1() + "#");
				bw.write(form.toString());
				bw.newLine();
				bw.flush();
				
				fw.close();
				bw.close();
		// TODO Auto-generated method stub
		
	}

			public void limparTela(ActionEvent e) {
		
			if(e.getActionCommand().equals("Limpar campos")){
				txtNomeOrientador.setText("");
				txtCargoOrientador.setText("");

			}
		}
}