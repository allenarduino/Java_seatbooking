//Importing built in class  for user input
import java.util.*;



public class SeatBooking{


   //Declaring memory space for storing the 2D array for the price
    static int[][] ticket_price= {
        {10,10,10,10,10,10,10,10,10,10},

        {10,10,10,10,10,10,10,10,10,10},

        {10,10,10,10,10,10,10,10,10,10},

        {10,10,20,20,20,20,20,20,10,10},

        {10,10,20,20,20,20,20,20,10,10},

        {10,10,20,20,20,20,20,10,20,10},
 
        {20,20,30,30,40,40,30,30,20,20},

        {20,40,50,50,50,50,50,50,40,20},

        {80,50,50,80,80,80,80,50,50,30}

        };





        //Method that reads,validates and returns the price
       public static int take_price(){
           //Taking  the price from the user
           int price;
           Scanner s=new Scanner(System.in);
           System.out.println("Please enter your price:");
           price=s.nextInt();

           return price;
        }

       
        //Method that checks whether a seat is available for that price
        public static boolean check_availability(){
            //Storing the value price returned from take_price() in price variable
             int price=take_price();
         
           
            for(int outer_index=0; outer_index <9;outer_index++){
                for(int inner_index=0; inner_index<10;inner_index++){
                    /*If your entered price matches the the prices in the
                    array of seats, (Stop searching)
                    and print the message to the user
                     */
                   if(ticket_price[outer_index][inner_index]==price){
                    //Message thrown to the user
                    System.out.println("Your seat is confirmed! Your seat number is "+ ""+ inner_index+1 + "." + "Enjoy your movie" );
                    ticket_price[outer_index][inner_index]=0;
                    return true;
                  
                  }
                  /*If the input price doesn't match any of the
                  prices in the array, we then throw negative message 
                  to the user*/
                  else{
                      System.out.println("A seat at this price is not available. Good Bye");
                      return false;
                  }
                 
                  
                }
                
            }
                 return false;
        }

        //Main method of the program
        public static void main(String[] args){
           check_availability();
        }
        






                                                   
}