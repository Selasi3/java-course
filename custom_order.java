// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  Scanner keyboard = new Scanner(System.in);
    String  firstName;
    String itemOrder;
    String frostingType;
    String fillingType;
    String toppings;
    // Introduce shop and prompt user to input first name
      

	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
    System.out.println("What is your first name?");
firstName=keyboard.nextLine();
System.out.print(firstName + ", please see our MENU below");
System.out.print("\n");
	  
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU
    System.out.println("_______________________________________________");      
    System.out.println("        MENU         QUANTITY    BASE COST  ");
    System.out.println("_______________________________________________"); 
    System.out.println("        Cake                     1            $15     ");
    System.out.println("   Set of Cupcakes       6            $15     ");
    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
    System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
    System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
    System.out.println("_______________________________________________");
    System.out.println("Do you want CUPCAKES or a CAKE");
    itemOrder = keyboard.nextLine()  ;

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER
    System.out.println("What type of FROSTING do you want? ");
    System.out.println("Vanilla, Chocolate, Strawberry or Coco");

	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING
        frostingType=keyboard.nextLine();
   

	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING
        System.out.println("What type of FILLING do you want? ");
        System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
        fillingType = keyboard.nextLine();

	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS
        System.out.println("What type of TOPPINGS do you want? ");
        System.out.println("Sprinkles, Cinnamon, Cocoa, Nuts");
        toppings = keyboard.nextLine();

	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION
//        String  firstName;
//        String itemOrder;
//        String frostingType;
//        String fillingType;
//        String toppings;
        System.out.println("_______________________________________________");
String [] list = {itemOrder,frostingType,fillingType,toppings};
        System.out.println("Your input are: ");
        for (String item:
             list) {
            System.out.println(item);

        }
        System.out.println("_______________________________________________");

//        System.out.println("firstName "+ firstName);


      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
  
    }   
}