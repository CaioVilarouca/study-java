package model.services;

import java.time.Duration;

import model.intites.AluguelDeCarro;
import model.intites.Fatura;

public class AlugelServico {
	private Double precoPorHora;
	private Double precoPorDia;
	
	private BrasilTaxaServico taxaServico;

	public AlugelServico(Double precoPorHora, Double precoPorDia, BrasilTaxaServico taxaServico) {
		super();
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxaServico = taxaServico;
	}
	
	public void processamentoFatura(AluguelDeCarro aluguelDeCarro) {
		
		double minutos = Duration.between(aluguelDeCarro.getInicio(), aluguelDeCarro.getFim()).toMinutes();
		double horas = minutos / 60;
		
		double pagamentoBasico;
		if (horas <= 12.0 )
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		else 
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
		
		double taxa = taxaServico.taxa(pagamentoBasico);
		
		aluguelDeCarro.setFatura(new Fatura(pagamentoBasico, taxa));
	}
}
