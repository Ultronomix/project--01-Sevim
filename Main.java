
import java.util.*;

class Main{
    public static void main (String[]args){
        //initialize all product we have
        HashMap<String,Integer> products = new HashMap<String,Integer>();
        //add keys and values (Name,Count)
        products.put("Noetbook", 2);
        products.put("Pens",0);
        products.put("Books",0);

        //for (String i : product.keySet()) {
            //System.out.println("key: " + i + "value:" +product.get(i));

        //Read customer name ignore emty line inputs
        Scanner in = new Scanner(System.in);

    
  String customerName = new String();
  System.out.println("What is your name?");
  while (true){
    customerName = in.nextLine();
  
  // Read Customer credit card
  System.out.println("What is your credit card number");
  String cc = in.nextLine();
     // Make Customer
     Customer customer = new Customer(customerName,cc);
     System.out.println("\n Hello " + customerName + "Please looks the books on your rigt side: ");
     products.forEach((key,value)-> {
        System.out.println(key + ":" +value);
     });
     //Customer chose items
     Sale sale = new Sale(customer);
     String selection = new String();
     System.out.print("Please chose your product by color Please type 'q' when finished");
     while (true) {
         selection.equals("q");
         break;
         
        
     }

    }
    }
}

    

