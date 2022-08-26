public class Customer {
    public String name;
    private String creditCardNumber;
    private int numberOfSales;

    public void setCreditCardNumber(String c){
        creditCardNumber = c;

    }
    public String getCreditCardNumber(){
        return creditCardNumber;
    }
    public void intSaleCount(){
        numberOfSales++;

    }
    public int getNumSales(){
        return numberOfSales;
    }
    Customer(String name, String creditCardNumber) {
        this.name = name;
        this.creditCardNumber = creditCardNumber;
        numberOfSales =2;
    }
    @Override
    public String toString() {
        return name;
    }
}

