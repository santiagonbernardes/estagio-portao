package br.com.santiago.estagio.estado;

import br.com.santiago.estagio.entities.Portao;

public enum Estado {

	ABERTO {
		@Override
		public void acaoPressionado(Portao portao) {
			portao.setEstadoAnterior(portao.getEstadoAtual());
			portao.setPosicao(portao.getPosicao() - 1);
			portao.setEstadoAtual(FECHANDO);
		}
	},

	ABRINDO {
		@Override
		public void acaoPressionado(Portao portao) {
			portao.setEstadoAnterior(portao.getEstadoAtual());
			portao.setEstadoAtual(PARADO);
		}

		@Override
		public void acaoObstaculo(Portao portao) {
			portao.setEstadoAnterior(portao.getEstadoAtual());
			portao.setPosicao(portao.getPosicao() - 1);
			portao.setEstadoAtual(FECHANDO);
		}

		@Override
		public void semAcao(Portao portao) {
			if (portao.getPosicao() != 5) {
				portao.setPosicao(portao.getPosicao() + 1);
			} else {
				portao.setEstadoAnterior(portao.getEstadoAtual());
				portao.setEstadoAtual(ABERTO);
			}
		}
	},

	FECHADO {
		@Override
		public void acaoPressionado(Portao portao) {
			portao.setEstadoAnterior(portao.getEstadoAtual());
			portao.setPosicao(portao.getPosicao() + 1);
			portao.setEstadoAtual(ABRINDO);

		}
	},

	FECHANDO {
		@Override
		public void acaoPressionado(Portao portao) {
			portao.setEstadoAnterior(portao.getEstadoAtual());
			portao.setEstadoAtual(PARADO);
		}

		@Override
		public void acaoObstaculo(Portao portao) {
			portao.setEstadoAnterior(portao.getEstadoAtual());
			portao.setPosicao(portao.getPosicao() + 1);
			portao.setEstadoAtual(ABRINDO);
		}

		@Override
		public void semAcao(Portao portao) {
			if (portao.getPosicao() != 0) {
				portao.setPosicao(portao.getPosicao() - 1);
			} else {
				portao.setEstadoAnterior(portao.getEstadoAtual());
				portao.setEstadoAtual(FECHADO);
			}
		}
	},

	PARADO {
		@Override
		public void acaoPressionado(Portao portao) {
			Estado estadoTemp = portao.getEstadoAtual();
			if (portao.getEstadoAnterior() == ABRINDO) {
				portao.setPosicao(portao.getPosicao() + 1);
				portao.setEstadoAtual(ABRINDO);
			} else {
				portao.setPosicao(portao.getPosicao() - 1);
				portao.setEstadoAtual(FECHANDO);
			}
			portao.setEstadoAnterior(estadoTemp);
		}
	};

	public void execute(char c, Portao portao) {
		switch (c) {
		case '.':
			semAcao(portao);
			break;
		case 'P':
			acaoPressionado(portao);
			break;
		case 'O':
			acaoObstaculo(portao);
			break;
		}
	}

	public abstract void acaoPressionado(Portao portao);

	public void acaoObstaculo(Portao portao) {
	}

	public void semAcao(Portao portao) {
	}

}
