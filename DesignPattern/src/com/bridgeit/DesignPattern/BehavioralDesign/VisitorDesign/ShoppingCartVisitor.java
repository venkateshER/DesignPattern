package com.bridgeit.DesignPattern.BehavioralDesign.VisitorDesign;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
