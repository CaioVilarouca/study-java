package entities;

public final class Juridica extends Pessoa{
	  private int numeroFuncionarios;

	 public Juridica() {
		 super();
	 }

	public Juridica(String nome, Double renda, int numeroFuncionarios) {
		super(nome, renda);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double imposto() {
		 if (numeroFuncionarios > 10) {
	            return getRenda() * 0.14;
	        } else {
	            return getRenda() * 0.16;
	        }
	}

}
