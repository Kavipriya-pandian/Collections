package ArrayList_Restaurant;


import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class Tester {
    
    public static List<String> getItems(List<Order> orders) {
		
		//Implement your logic here and change the return statement accordingly
    	List<String> itemList=new ArrayList<>();
		for(Order order:orders) 
			itemList.addAll(order.getItemNames());


		return itemList;
    	
    	
    
	}
    
	public static void main(String[] args) {
		List<Order> orders1 = new ArrayList<Order>();

		List<String> items1 = new ArrayList<String>();
		items1.add("FriedRice");
		items1.add("Pasta");
		items1.add("Tortilla");
		orders1.add(new Order(101, items1, true));

		List<String> items2 = new ArrayList<String>();
		items2.add("Pizza");
		items2.add("Pasta");
		orders1.add(new Order(102, items2, true));

		List<String> items3 = new ArrayList<String>();
		items3.add("Burger");
		items3.add("Sandwich");
		items3.add("Pizza");
		orders1.add(new Order(103, items3, true));

		List<String> items = getItems(orders1);
		System.out.println("List of Items:");
		for (String item : items) 
		{
			System.out.println(item);
		}
		
	}

}

