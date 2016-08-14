package com.taxi.action;

import java.util.List;
import java.util.Scanner;

import com.taxi.model.Car;
import com.taxi.service.CarService;

public class TaxiWel {

	final static CarService carService = new CarService();
	
	public static void main(String[] args) {
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		System.out.println("���Ƿ�Ҫ�⳵��1�� 0��");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		if(x == 1){
			Car car = carService.initCar();
			List<Car> cars = car.getList();
			System.out.println("�������õĳ����Լ���Ŀ��" );
			System.out.println("��� \t����\t���\t����");
			for(Car c : cars){
				String type = null;
				if(c.getType() == "1"){
					type = "�ؿ�";
				}else if(c.getType() == "2"){
					type = "�ػ�";
				}
				System.out.println(c.getNum()+ "\t" + c.getName() + "\t" + c.getPrice() + "\t"
						+type+":"+c.getCapacity());
			}
			System.out.println("��������Ҫ�⳵��������");
			int taxiNum = in.nextInt(); //�⳵��
			int[] orderNum = new int[taxiNum];
			for(int i=0;i<taxiNum;i++){
				System.out.println("��������Ҫ�⳵����ţ�");
				orderNum[i] = in.nextInt();
			}
			System.out.println("��������Ҫ�⳵��������");
			int days = in.nextInt();
			System.out.println("�����˵���");
			for(int i=0;i<orderNum.length;i++){
				Car result = carService.getById(car, orderNum[i]);
				System.out.println(result.getNum()+ "\t" + result.getName() + "\t" + result.getPrice() + "\t"
						+result.getType()+":"+result.getCapacity());
			}
		}else{
			System.out.println("�ټ�!");
		}
	}
}
