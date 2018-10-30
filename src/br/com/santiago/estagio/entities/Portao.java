package br.com.santiago.estagio.entities;

import br.com.santiago.estagio.estado.Estado;
import br.com.santiago.estagio.estado.Fechado;

public class Portao {

	private Estado estadoAtual;
	private Estado estadoAnterior;
	private int posicao;

	public Portao() {
		estadoAtual = new Fechado(this);
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

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

}
