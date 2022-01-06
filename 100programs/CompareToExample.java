
//program to print the sorted data based on the provided data in which it have the different elements

import java.util.*;

class Laptop implements Comparable<Laptop> {

	String brand;
	int ramGb;
	double price;
	
	public Laptop(String brand, int ramGb, double price) {
		this.brand = brand;
		this.ramGb = ramGb;
		this.price = price;
	}

	
	public int compareTo(Laptop s) {  
		return s.brand.compareTo(brand);
	}

}


public class CompareToExample{

	public static void main(String[] args) {
		
		ArrayList<Laptop> ar = new ArrayList<Laptop>();
		
		Laptop l1 = new Laptop("Toshiba", 8, 55000.0);
		Laptop l2 = new Laptop("Asus", 12, 84000.0);
		Laptop l3 = new Laptop("Apple", 16, 89000.0);
		Laptop l4 = new Laptop("HP", 4, 40000.0);
		Laptop l5 = new Laptop("Lenovo", 32, 102000.0);
		Laptop l6 = new Laptop("Dell", 16, 69000.0);
		
		ar.add(l1);
		ar.add(l2);
		ar.add(l3);
		ar.add(l4);
		ar.add(l5);
		ar.add(l6);
		
		Collections.sort(ar);
		
		Iterator<Laptop> itr = ar.iterator();
		
		while(itr.hasNext()) {
			 Laptop temp = itr.next();
			 System.out.println(temp.brand + " " + temp.ramGb + " " + temp.price);
		}
			
	}
}

/*

output:
-------

Toshiba 8 55000.0
Lenovo 32 102000.0
HP 4 40000.0      
Dell 16 69000.0   
Asus 12 84000.0   
Apple 16 89000.0

*/