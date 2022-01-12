package java8.solidPrincipiles;

interface Restaurant{
	void vegMeal();
	void nonVegMeal();
}

class Krishnasagar implements Restaurant{

	@Override
	public void vegMeal() {
	}

	@Override
	public void nonVegMeal() {
	}
	
}
//======================^ == OLD ===================

interface VegRestaurant{
	void vegMeal();
}

interface NonVegRestaurant{
	void nonVegMeal();
}

class Celibration implements VegRestaurant, NonVegRestaurant{

	@Override
	public void vegMeal() {
	}

	@Override
	public void nonVegMeal() {
	}
	
}

// A Client should not be forced to implement an interface that it does not use
public class I_InterfaceSegregationPrinciple {

}
