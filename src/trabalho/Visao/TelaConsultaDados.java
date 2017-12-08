package trabalho.Visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TelaConsultaDados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private FileWriter writer; 
	private BufferedWriter wr;
	private FileReader reader = new FileReader("formularios.txt");
	private BufferedReader rd = new BufferedReader(reader);

	/**
	 * Create the frame.
	 */
	public TelaConsultaDados(String cpf) throws IOException {
		setTitle("Consulta de dados do formul\u00E1rio");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaConsultaDados.class.getResource("/imagens/aa.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 630, 612);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textArea.setText(buscarFormulario(cpf));
	}
	
	public String buscarFormulario(String cpf) throws IOException{
		String linha;
		while ((linha=rd.readLine())!=null){
			if (linha.split("-")[0].equals(cpf)){
				return linha.replaceAll(",", "\n");
			}
		}
		return "Registro nao encontrado.";
	}

}