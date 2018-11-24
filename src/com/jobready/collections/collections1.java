package com.jobready.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collections1 {


     String Make;
     String Model;
     int Price;
     boolean FourWheelerDr;
     
	@Override
	public String toString() {
		return "collections1 [Make=" + Make + ", Model=" + Model + ", Price=" + Price + ", FourWheelerDr="
				+ FourWheelerDr + "]";
	}
	public collections1(String make, String model, int price, boolean fourWheelerDr) {
		super();
		Make = make;
		Model = model;
		Price = price;
		FourWheelerDr = fourWheelerDr;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public boolean isFourWheelerDr() {
		return FourWheelerDr;
	}
	public void setFourWheelerDr(boolean fourWheelerDr) {
		FourWheelerDr = fourWheelerDr;
	}
     
     
     
     
	 
		
	 

}
