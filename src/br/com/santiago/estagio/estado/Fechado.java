package br.com.santiago.estagio.estado;

import br.com.santiago.estagio.entities.Portao;

public class Fechado implements Estado {

	Portao portao;

	public Fechado(Portao portao) {
		this.portao = portao;
		if (portao.getPosicao() != 0) {
			this.portao.setPosicao(0);
		}
	}

	@Override
	public void execute(char c) {
		switch (c) {
		case 'P':
			portao.setEstadoAnterior(portao.getEstadoAtual());
			portao.setEstadoAtual(new Abrindo(portao));
			break;
		}

	}

}
