package entities;

public final class Fisica extends Pessoa{
	private Double gatosComSaude;
	
	public Fisica() {
		super();
	}
	
	public Fisica(String nome, Double renda, Double gatosComSaude) {
		super(nome, renda);
		this.gatosComSaude = gatosComSaude;
	}

	@Override
	public double imposto() {
		double imposto;

        if (getRenda() < 20000.00) {
            imposto = getRenda() * 0.15;
        } else {
            imposto = getRenda() * 0.25;
        }

        imposto = imposto - (gatosComSaude * 0.50);

        return imposto;
	}
}
