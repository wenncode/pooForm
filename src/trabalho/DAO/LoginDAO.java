package trabalho.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginDAO implements DAO {
	
	private String login;
	private String senha;
//	private FileWriter writer; 
//	private BufferedWriter wr;
	private FileReader reader = new FileReader("senhas.txt");
	private BufferedReader rd = new BufferedReader(reader);

	public LoginDAO(String login, String senha) throws IOException{
		this.login=login;
		this.senha=senha;
//		this.writer = new FileWriter("senhas.txt", true);
//		this.wr = new BufferedWriter(writer);
	}
	
	public boolean autenticacao() throws IOException{
		return buscarUsuario(login, senha);
	}
	
	public boolean buscarUsuario(String usuario, String senha) throws IOException{
		String linha;
		while ((linha=rd.readLine())!=null){
			if (linha.equals(loginToString(usuario,senha))){
				return true;
			}
		}
		return false;
	}
	
	public String loginToString(String usuario, String senha){
		return usuario + " " + senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public FileReader getReader() {
		return reader;
	}

	public void setReader(FileReader reader) {
		this.reader = reader;
	}

	public BufferedReader getRd() {
		return rd;
	}

	public void setRd(BufferedReader rd) {
		this.rd = rd;
	}

	public boolean buscar (String login2, String senha2) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
