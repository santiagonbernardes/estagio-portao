package br.com.santiago.estagio.entities;

import br.com.santiago.estagio.estado.Estado;

public class Portao {

	private Estado estadoAtual;
	private Estado estadoAnterior;
	private Integer posicao;

	public Portao() {
		posicao = 0;
		estadoAtual = Estado.FECHADO;
		estadoAnterior = null;
	}

	public Estado getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(Estado estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public Estado getEstadoAnterior() {
		return estadoAnterior;
	}

	public void setEstadoAnterior(Estado estadoAnterior) {
		this.estadoAnterior = estadoAnterior;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

}
