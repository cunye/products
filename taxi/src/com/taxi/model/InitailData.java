package com.taxi.model;

import java.util.ArrayList;
import java.util.List;

public class InitailData {

	/**
	 * ��ʼ������
	 */
	public static Car initData(){
		System.out.println("���ڳ�ʼ������..." );
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
		System.out.println("���ݳ�ʼ����ɣ���");
		return car;
	}
	public static void main(String[] args) {
		Car car = initData();
		List<Car> cars = car.getList();
		System.out.println("���  ����  ���  ����");
		for(Car c : cars){
			String type = null;
			if(c.getType() == "1"){
				type = "�ؿ�";
			}else if(c.getType() == "2"){
				type = "�ػ�";
			}
			System.out.println(c.getNum()+ " " + c.getName() + " " + c.getPrice() + " "
					+type+":"+c.getCapacity());
		}
	}
}
