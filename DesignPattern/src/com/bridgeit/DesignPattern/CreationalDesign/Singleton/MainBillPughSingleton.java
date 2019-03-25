package com.bridgeit.DesignPattern.CreationalDesign.Singleton;

public class MainBillPughSingleton {

	public static void main(String[] args) {
		BillPughSingleton bs=BillPughSingleton.getInstance();
		System.out.println(""+bs.hashCode());
		BillPughSingleton bs1=BillPughSingleton.getInstance();
		System.out.println(""+bs1.hashCode());
	}

}
