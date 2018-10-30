package br.com.santiago.estagio.entities;

public class Controller {

	private Portao portao;

	public Controller() {
		portao = new Portao();
	}

	public String execute(String string) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			portao.getEstadoAtual().execute(string.charAt(i));
			sb.append(portao.getPosicao());
		}
		return sb.toString();
	}

}
