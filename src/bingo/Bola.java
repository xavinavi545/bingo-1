package bingo;

public class Bola {

	private String valor;
	private boolean activo;

	public Bola() {
		this.activo = true;
	}

	public Bola(String valor, boolean activo) {
		super();
		this.valor = valor;
		this.activo = activo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		//String retorno = "Bola [Valor: " + valor + ", Activo: " + activo + "]";
		String retorno = valor;
		return retorno;

	}

}
