package modelo.entidades;

import java.time.LocalDate;

public class Parcela {
	private LocalDate dataVencimento;
	private Double quantidadeParcela;
	
	public Parcela() {
		
	}

	public Parcela(LocalDate dataVencimento, Double quantidadeParcela) {
		this.dataVencimento = dataVencimento;
		this.quantidadeParcela = quantidadeParcela;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getQuantidadeParcela() {
		return quantidadeParcela;
	}

	public void setQuantidadeParcela(Double quantidadeParcela) {
		this.quantidadeParcela = quantidadeParcela;
	}
}
