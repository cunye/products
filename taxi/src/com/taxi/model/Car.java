package com.taxi.model;

import java.util.List;

public class Car {

	private int num;
	private String name; //����
	private String price; //���
	private String capacity; //����
	private String type; //�ؿ�1���ػ�2��0���ؿ�Ҳ�ػ�
	private List<Car> list = null;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Car> getList() {
		return list;
	}
	public void setList(List<Car> list) {
		this.list = list;
	}
	
}
