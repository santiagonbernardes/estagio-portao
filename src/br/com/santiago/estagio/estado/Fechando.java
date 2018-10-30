package br.com.santiago.estagio.estado;

import br.com.santiago.estagio.entities.Portao;

public class Fechando implements Estado {

	Portao portao;

	public Fechando(Portao portao) {
		this.portao = portao;
		portao.setPosicao(portao.getPosicao() - 1);
	}

	@Override
	public void execute(char c) {
		switch (c) {
		case '.':
			if (portao.getPosicao() != 0) {
				portao.setPosicao(portao.getPosicao() - 1);
			} else {
				portao.setEstadoAnterior(portao.getEstadoAtual());
				portao.setEstadoAtual(new Fechado(portao));
			}
			break;
		case 'P':
			portao.setEstadoAnterior(portao.getEstadoAtual());
			portao.setEstadoAtual(new Parado(portao));
			break;
		case 'O':
			portao.setEstadoAnterior(portao.getEstadoAtual());
			portao.setEstadoAtual(new Abrindo(portao));
			break;
		}

	}
}
