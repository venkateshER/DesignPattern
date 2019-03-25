package com.bridgeit.DesignPattern.BehavioralDesign.VisitorDesign;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
