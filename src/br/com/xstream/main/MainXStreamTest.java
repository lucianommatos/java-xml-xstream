package br.com.xstream.main;

import java.io.FileNotFoundException;

import br.com.xstream.domain.Product;
import br.com.xstream.domain.ShoppingCart;
import br.com.xstream.parser.XStreamParser;

public class MainXStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.getProductList().add(new Product("Notebook", "2000.0"));
		shoppingCart.getProductList().add(new Product("Joana D'Arc Book", "27.0"));
		shoppingCart.getProductList().add(new Product("Dark/Grey Guittar", "300.0"));

		System.out.println("Output:");
		System.out.println(XStreamParser.toXml(shoppingCart));
	}

}
