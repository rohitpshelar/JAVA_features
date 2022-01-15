package java8.Interview;

import java.util.HashMap;
import java.util.Map;

public class TaxiTicketSystem {

    public static void main(String args[]) {
        System.out.println("Hello Taxi Ticket System");

        System.out.println("Taxi Ticket\n-----------");

        String from = "GOA";
        String to = "MUMBAI";
        int travellersCount = 2;
        
        new TaxiTicketSystem().generateTicket(from, to, travellersCount);

      
    }
    
    void generateTicket(String from, String to,int travellersCount){
    	
    	if(from == null || from.isBlank() ) {
    		System.out.println("Start Destination Not provided");
    		System.out.println("Ticket not generated");
    		return;
    	}
    	
    	if(to == null || to.isBlank() ) {
    		System.out.println("End Destination Not provided");
    		System.out.println("Ticket not generated");
    		return;
    	}
    	
    	if(travellersCount <=0 ) {
    		System.out.println("Travellers Count is invalid");
    		System.out.println("Ticket not generated");
    		return;
    	}
    		
    		
    	  System.out.println("Source: " + from);
          System.out.println("Destination: " + to);

          Map<String, Integer> distances = new HashMap<>();
          distances.put("MUMBAI-PUNE", 120);
          distances.put("MUMBAI-GOA", 350);
          distances.put("MUMBAI-NASIK", 180);
          distances.put("PUNE-NASIK", 200);

          
          
          Integer distance = distances.get(from + "-" + to);
          if(distance == null){
              distance = distances.get(to + "-" + from);
          }

          System.out.println("Kms: " + distance);
          System.out.println("No. of travellers = " + travellersCount);

          int ticketPrice = 0;
          if(distance > 100) {
              ticketPrice = (750 + ((distance -100) * 5)) * travellersCount;
          }else {
              ticketPrice = 750 * travellersCount;
          }

          System.out.println("Total = " + ticketPrice + " INR");
    	
    }
}