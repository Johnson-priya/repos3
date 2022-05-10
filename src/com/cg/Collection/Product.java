package com.cg.Collection;



	
		// TODO Auto-generated method stub

	

public class Product implements Comparable<Product> {
private int prodCode;
private String prodName;
private float price;
private float ratings;

//constructor with params
public Product(int prodCode, String prodName, float price, float ratings) {
	super();
	this.prodCode = prodCode;
	this.prodName = prodName;
	this.price = price;
	this.ratings = ratings;
}
//setters & getters
public int getProdCode() {
	return prodCode;
}
public void setProdCode(int prodCode) {
	this.prodCode = prodCode;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}
@Override
public String toString() {
	return "Product [prodCode=" + prodCode + ", prodName=" + prodName + ", price=" + price + ", ratings=" + ratings
			+ "]";
}
@Override
public int compareTo(Product p) {
	//System.out.println(" compare " + this.prodName + " and "  +  p.prodName );
	if(this.price==p.price)
	return -1;
	else
		return 1;
}


}
