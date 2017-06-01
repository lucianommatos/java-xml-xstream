package br.com.sicoob.viewobject;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("t")
public class TransacaoVO {
	
	@XStreamImplicit
	private List<Par> rotulos;

//	private TransacaoVO transacaoFilha;
	
	public List<Par> getRotulos() {
		return rotulos;
	}

	public void setRotulos(List<Par> rotulos) {
		this.rotulos = rotulos;
	}

//	public TransacaoVO getTransacaoFilha() {
//		return transacaoFilha;
//	}
//
//	public void setTransacaoFilha(TransacaoVO transacaoFilha) {
//		this.transacaoFilha = transacaoFilha;
//	}
	
}
