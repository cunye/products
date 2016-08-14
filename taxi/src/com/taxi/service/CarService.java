package com.taxi.service;

import java.util.ArrayList;
import java.util.List;

import com.taxi.model.Car;

public class CarService {
	
	public Car initCar(){
		List<Car> list = new ArrayList<Car>();
		Car car = new Car();
		
		Car car1 = new Car();
		car1.setNum(1);
		car1.setName("�µ�");
		car1.setPrice("500Ԫ/��");
		car1.setType("1");
		car1.setCapacity("4��");
		list.add(car1);
		
		Car car2 = new Car();
		car2.setNum(2);
		car2.setName("���Դ�");
		car2.setPrice("400Ԫ/��");
		car2.setType("1");
		car2.setCapacity("4��");
		list.add(car2);
		
		car.setList(list);
		return car;
	}
	
	public Car getById(Car car,int id){
		List<Car> cars = car.getList();
		Car cc = new Car();
		for(Car c : cars){
			if(c.getNum() == id){
				cc = c;
			}
		}
		return cc;
	}
}
