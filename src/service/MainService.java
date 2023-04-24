package service;

import java.util.HashMap;
import java.util.Hashtable;

import model.City;

public class MainService {

	public static void main(String[] args) {
		City city1 = new City("Ventspils", "Latvia", 120, 1230.23f, 32456);
		City city2 = new City("Rīga", "Latvia", 2020, 109230.23f, 100056);
		City city3 = new City("Kuldīga", "Latvia", 50, 1230.23f, 2356);
		City city4 = new City("Talsi", "Latvia", 60, 1000.24f, 1235);
		
		HashMap<String, City> myHashMap = new HashMap<>();
		myHashMap.put(city1.getTitle(), city1);
		myHashMap.put(city2.getTitle(), city2);
		myHashMap.put(city3.getTitle(), city3);
		myHashMap.put(city4.getTitle(), city4);
		
		if(myHashMap.containsKey("Ventspils")) {
			System.out.println(myHashMap.get("Ventspils"));
		}
		
		myHashMap.put("Ventspils", new City("Liepāja", "Latvia", 1200, 1243.54f, 45000));
		
		System.out.println(myHashMap.entrySet());
		
		Hashtable<String, City> myHashTable = new Hashtable<>();
		
		//myHashTable.put("Ventspils", null);		//ar hashtable nedrikst liekt nulli pirms tam
		
		
		
		
	}
	

}
