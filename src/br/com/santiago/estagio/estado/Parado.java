package br.com.santiago.estagio.estado;

import br.com.santiago.estagio.entities.Portao;

public class Parado implements Estado {

	Portao portao;

	public Parado(Portao portao) {
		this.portao = portao;
	}

	@Override
	public void execute(char c) {
		switch (c) {
		case 'P':
			Estado estadoTemp = portao.getEstadoAtual();
			if (portao.getEstadoAnterior() instanceof Abrindo) {
				portao.setEstadoAtual(new Abrindo(portao));
			} else {
				portao.setEstadoAtual(new Fechando(portao));
			}
			portao.setEstadoAnterior(estadoTemp);
			break;
		}
	}

}
