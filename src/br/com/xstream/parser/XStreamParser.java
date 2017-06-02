package br.com.xstream.parser;

import com.thoughtworks.xstream.XStream;

import br.com.xstream.domain.ShoppingCart;

public class XStreamParser {

	public static String toXml(ShoppingCart cart) {
		
		XStream xtStream = new XStream();
		xtStream.processAnnotations(ShoppingCart.class);
		
		return xtStream.toXML(cart);
	}
	
}
