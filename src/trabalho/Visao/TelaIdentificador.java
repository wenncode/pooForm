package trabalho.Visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaIdentificador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCPFidentificador;


	/**
	 * Create the frame.
	 */
	public TelaIdentificador() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaIdentificador.class.getResource("/imagens/aa.png")));
		setTitle("Consultar dados do formul\u00E1rio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 158);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelID = new JPanel();
		panelID.setBackground(Color.WHITE);
		contentPane.add(panelID, BorderLayout.NORTH);
		
		JLabel lblInformeSeuCpf = new JLabel("Informe seu CPF:");
		lblInformeSeuCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformeSeuCpf.setFont(new Font("Calibri", Font.BOLD, 15));
		panelID.add(lblInformeSeuCpf);
		
		JPanel panelID2 = new JPanel();
		panelID2.setBackground(Color.WHITE);
		contentPane.add(panelID2, BorderLayout.CENTER);
		
		txtCPFidentificador = new JTextField();
		panelID2.add(txtCPFidentificador);
		txtCPFidentificador.setColumns(20);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaConsultaDados tConsulta;
				try {
					tConsulta = new TelaConsultaDados(txtCPFidentificador.getText());
					tConsulta.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		btnConsultar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					btnConsultar.doClick();
				}
			}
		});
		btnConsultar.setFont(new Font("Calibri", Font.BOLD, 15));
		panel.add(btnConsultar);
	}

}