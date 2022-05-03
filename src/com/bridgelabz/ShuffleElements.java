package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShuffleElements {

	 public static void main(String[] args)
	    {
	        // Creating a HashMap
	        Map<Integer, String> mp
	            = new HashMap<Integer, String>();
	  
	        // Inserting some values inside the HashMap
	        mp.put(1, "Raj");
	        mp.put(2, "Is");
	        mp.put(3, "Learning");
	        mp.put(4, "Java");
	        mp.put(5, "Programming");
	  
	        // Displaying the map
	        System.out.println("The Map before shuffling: ");
	        
	        for (Map.Entry<Integer, String> entry :mp.entrySet())
	            System.out.println(entry.getKey() + " "
	                               + entry.getValue());
	        
	        System.out.println();
	  
	        // Creating a list and storing the elements of the
	        // Map inside of it
	        List<Map.Entry<Integer, String> > list
	            = new ArrayList<>(mp.entrySet());
	  
	        // Shuffling the list using shuffle() method
	        Collections.shuffle(list);
	  
	        // Displaying the list
	        System.out.println("The List (containing the elements of the Map)" 
	                           + " After shuffing: ");
	        
	        for (Map.Entry<Integer, String> entry : list)
	            System.out.println(entry.getKey() + " "
	                               + entry.getValue());
	        System.out.println();
	    }
	}