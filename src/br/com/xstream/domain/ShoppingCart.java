package br.com.xstream.domain;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("cart")
public class ShoppingCart {

	@XStreamImplicit
	private List<Product> productList;

	public ShoppingCart() {
		super();
		this.productList = new ArrayList<Product>();
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		String list = "";
		for (Product product : productList) {
			list.concat(product.getName() + " | ");
		}
		
		return "ShoppingCart: " + list;
	}
	
}
