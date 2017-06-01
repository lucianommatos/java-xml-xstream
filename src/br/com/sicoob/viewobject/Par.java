package br.com.sicoob.viewobject;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("d")
public class Par {
	
	@XStreamAlias("r")
	@XStreamAsAttribute
	private String rotulo;
	
	@XStreamAlias("v")
	@XStreamAsAttribute
	private String valor;

	public Par(){
		
	}
	
	public Par(String rotulo, String valor) {
		this.rotulo = rotulo;
		this.valor = valor;
	}

	public String getRotulo() {
		return rotulo;
	}

	public void setRotulo(String rotulo) {
		this.rotulo = rotulo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
