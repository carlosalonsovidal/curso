package modelo;

public class Endereco {
	String logradouro;
	String numero;
	String bairro;
	String cidade;
	String uf;
	String cep;
	
	
	
	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String numero, String bairro, String cidade, String uf, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public String getAll() {
		return logradouro + "\n" + numero + "\n" + bairro + "\n" + cidade + "\n" + uf + "\n" + cep; 
	}
	
	public void setAll(String logradouro, String numero, String bairro, String cidade, String uf, String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		if (uf.length() == 2) {
			this.uf = uf.toUpperCase();
		}else {
//			this.uf = null;
			throw new RuntimeException();
		}
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
