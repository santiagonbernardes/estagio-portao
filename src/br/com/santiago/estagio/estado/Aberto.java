package br.com.santiago.estagio.estado;

import br.com.santiago.estagio.entities.Portao;

public class Aberto implements Estado {

	Portao portao;

	public Aberto(Portao portao) {
		this.portao = portao;
		if (portao.getPosicao() != 5) {
			this.portao.setPosicao(5);
		}
	}

	@Override
	public void execute(char c) {
		switch (c) {
		case 'P':
			portao.setEstadoAnterior(portao.getEstadoAtual());
			portao.setEstadoAtual(new Fechando(portao));
			break;
		}
	}

}
