import java.util.ArrayList;

public class Sale {
    ArrayList<String>products;
    Customer customer;
    //Sale begins with customer with 2 products
    Sale (Customer customer){
        this.customer = customer;
        products = new ArrayList<>();
    
    }
    //Check If a Credit Card is valid.
    public boolean validCreditCard(){
        return customer.getCreditCardNumber().length()>8;
    }

    }

    
