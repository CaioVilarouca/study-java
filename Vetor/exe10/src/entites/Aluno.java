package entites;

public class Aluno {
	private String nome;
	private Double nota01;
	private Double nota02;
	
	public Aluno (String nome, double nota01, double nota02) {
		this.nome = nome;
		this.nota01 = nota01;
		this.nota02 = nota02;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota01() {
		return nota01;
	}

	public void setNota01(Double nota01) {
		this.nota01 = nota01;
	}

	public Double getNota02() {
		return nota02;
	}

	public void setNota02(Double nota02) {
		this.nota02 = nota02;
	}
	
}
