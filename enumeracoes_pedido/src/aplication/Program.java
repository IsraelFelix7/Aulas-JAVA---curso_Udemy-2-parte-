package aplication;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
	System.out.println("Hello, world!");

		Order order = new Order(0001, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(" hello word!");
		
		System.out.println(order);
	
	}

}
