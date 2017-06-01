package br.com.sicoob.parser;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import br.com.sicoob.viewobject.Par;
import br.com.sicoob.viewobject.TransacaoVO;

public class XMLParser {
	public static void main(String[] args) throws Exception{
//		XStream xStream = new XStream(new StaxDriver());
		XStream xStream = new XStream();
		xStream.processAnnotations(TransacaoVO.class);
		TransacaoVO transacao = new TransacaoVO();
		
		List<Par> pares = new ArrayList<>();
		pares.add(new Par("00025", "\"5"));
		pares.add(new Par("03001", "&XG0002"));
		pares.add(new Par("06969", "what's009"));
		transacao.setRotulos(pares);
		
//		TransacaoVO transacaoFilha = new TransacaoVO();
//		List<Par> paresTransacaoFilha = new ArrayList<>();
//		paresTransacaoFilha.add(new Par("00023","3105"));
//		paresTransacaoFilha.add(new Par("90001","OF01000000620089"));
//		transacaoFilha.setRotulos(paresTransacaoFilha);
//		transacao.setTransacaoFilha(transacaoFilha);
		TransacaoVO teste = (TransacaoVO )xStream.fromXML(new FileInputStream(new File("C:\\Users\\Luciano.Matos\\Desktop\\teste.xml")));
		
//		TransacaoVO vo = (TransacaoVO )xStream.fromXML(new FileInputStream(new File("F:\\Workspaces\\Office\\XMLParser\\src\\xstream.xml")));
		System.out.println(xStream.toXML(transacao));
	}
}
