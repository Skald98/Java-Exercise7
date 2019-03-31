
package javaexercise7;


public class JavaExercise7 {

    //We can use the same methods and classes with Scanner as well.
    public static void main(String[] args) {
        // TODO code application logic here
        
        Item i=new Item();
   Customer j=new Customer();
        
    }
    
}

class Item{
    
    String[] ItemName=Iteminfo();
   
 public String[] Iteminfo(){
     
     String []Itemname={"Tea Packages","Bread"};
      int []ItemQuantity={4,3};
     int [] payments={3,2};
        int [] Amounts_still_due={2,3};
     
      System.out.println("Item name: "+Itemname[0]+", Item quantity: "+ItemQuantity[0]+", Item Payments: "+payments[0]+", Amounts due: "+Amounts_still_due[0]);
       System.out.println("Item name: "+Itemname[1]+", Item quantity: "+ItemQuantity[1]+", Item Payments: "+payments[1]+", Amounts due: "+Amounts_still_due[1]);
     return Itemname;
 }
    
}

class Customer{
    String []Customer=customerinfo();

     public String[] customerinfo(){
         
        String []BillingAddress={"Lamia"};
        System.out.println("Billing Addresses: "+BillingAddress[0]);
           String []ShippingAddress={"Lamia, Town Square"};
               System.out.println("Shipping Addresses: "+ShippingAddress[0]);
     
               return BillingAddress;
     }

    }
    
    
    
    

