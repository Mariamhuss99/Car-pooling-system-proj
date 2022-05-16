/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpooling;
import java.util.*;
/**
 *
 * @author HP
 */

 abstract class passenger{ //abstract class
  int ticket_price;

    passenger(double price){
        ticket_price = (int) price;
    }

    
   public abstract double discount(); 
    
    
}
 abstract class nonsubscribe extends passenger{ //inhertance

    nonsubscribe (double price ){
    super (price);
    }
public double discount(){ // override
    
    
    return ticket_price;
}
}
  abstract class subscribe extends passenger{//inhertance
 private final static int discount=(int) 0.50; // final static data member  & access modifer
subscribe (double price){
super (price);

}
public double discount(){
   
    return 0.50*ticket_price; //Calculated data member
}
}
 class subscription{
    
    
   int age;
    int numberoftrips;
    String name;
    String carcode;
    
    subscription(int age,int numberoftrips,String name,String carcode){
    
    this.age=age;
    this.numberoftrips=numberoftrips;
   this. name=name;
   this.carcode=carcode;
    }    
}
 interface Car{ // interface class

public void display();


}
 class Carinfo implements Car{ //inhert from interface
    String uniquecode;
    int TripsPerDay ;
    int maxCapicity ;
    String DriveName;
    String assemblyloc;
    String destinationLoc;
    Carinfo(String uniquecode,int Tripsperday,int maxcapicity,String DriveName,String d1,String d2){
    
      
    this.uniquecode=uniquecode;
    this.TripsPerDay=Tripsperday;
    this.maxCapicity=maxcapicity;
   this.DriveName= DriveName;
  this.assemblyloc=d1;
  this.destinationLoc=d2;
  
    }
    @Override
 public void display (){ //one from 5 SOLID designs
 
 }

}
        
public class CarPooling {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String x  ;
        List<Carinfo> c1=new  ArrayList<>(); //Hard coded data saved in Array List
        c1.add(new Carinfo("BMW12",6,5,"Ahmed","Hdayek el koba ","Matrya"));
         c1.add(new Carinfo("tyota2020",9,6,"muhmmed","Masr el gdeda ","Abbasya"));
         c1.add(new Carinfo("Kia2012",6,5,"osama","Naser city "," fifth st."));
         c1.add(new Carinfo("BYD550",6,5,"ali","maadi ","kattamya"));
          ArrayList<subscription> a1=new  ArrayList<>();
    a1.add(new subscription(20,50,"ahmed","Kia2012"));
    a1.add(new subscription(20,50,"Muhmmed","BYD550"));
    a1.add(new subscription(60,50,"Shimaa","tyota2020"));
     a1.add(new subscription(22,50,"hamdy","BMW12"));
    passenger p;
         boolean subscribe = false;
    
       
        System.out.println("Welcome to CarPooling system Enter Operation you want to make");
        
        System.out.println("1-Search routes ... 2-Sunscribe frequent Car....3-unsubscribe...4-to rate");
        
        Scanner sd= new Scanner(System.in);
       int choice=sd.nextInt();
       if (choice==1){
          
           System.out.println("Available routes is: 1-from Hdayek el koba to Matrya");
           System.out.println("2-from Masr el gdeda to Abbasya");
           System.out.println("3-From naser city to fifth st.");
           System.out.println("4-from maadi to kattmya");
            
         int ch = sd.nextInt();
         
         
         switch (ch){
             case 1:
                   for(Carinfo car:c1){
         
          if(car.DriveName=="Ahmed"){
              System.out.println("you choose From hdayek el koba to Matrya: information about Car 60 pound");
          System.out.println("Drive Name :"+" "+car.DriveName);
           System.out.println("Code of the Car:"+" "+car.uniquecode);
            System.out.println("Trips per Day:"+" "+car.TripsPerDay);
           System.out.println("Maximum Capicity of Car:"+" "+car.maxCapicity);
           System.out.print("are you subscribe any car press yes or No");
      Scanner kk = new Scanner(System.in);
          x=kk.nextLine();
          if(x=="y"){
           subscribe s = new subscribe (60){} ;
           p=s;//polymerphism here
              System.out.print("your Card");
           System.out.print("you have discount 50%");
           System.out.println(p.discount());
        
          }
          else{
          nonsubscribe n = new nonsubscribe (60){};
          p=n;
             System.out.print("your Card");
          System.out.println(p.discount());
          
          }
           
           
         
          }
                   } 
         
         
      break;
         
         
             case 2:
                  for(Carinfo car:c1){
         
          if(car.DriveName=="muhmmed"){
              System.out.println("you choose From masr el gdeda to abbasya: information about Car 50 pounds");
          System.out.println("Drive Name :"+" "+car.DriveName);
           System.out.println("Code of the Car:"+" "+car.uniquecode);
            System.out.println("Trips per Day:"+" "+car.TripsPerDay);
           System.out.println("Maximum Capicity of Car:"+" "+car.maxCapicity);
         System.out.print("are you subscribe any car press yes or No");
      Scanner kk = new Scanner(System.in);
          x=kk.nextLine();
          if(x=="y"){
           subscribe s = new subscribe (50){} ;
           p=s;
              System.out.print("your Card");
            System.out.print("you have discount 50%");
           System.out.println(p.discount());
          }
          else{
          nonsubscribe n = new nonsubscribe (50){};
          p=n;
             System.out.print("your Card");
          System.out.println(p.discount());
          }
          }
                   } 
               break;
               
             case 3:
                 for(Carinfo car:c1){
         
          if(car.DriveName=="osama"){
              System.out.println("you choose From nasser city to fifth st: information about Car 25 pound");
          System.out.println("Drive Name :"+" "+car.DriveName);
           System.out.println("Code of the Car:"+" "+car.uniquecode);
            System.out.println("Trips per Day:"+" "+car.TripsPerDay);
           System.out.println("Maximum Capicity of Car:"+" "+car.maxCapicity);
           System.out.print("are you subscribe any car press yes or No");
      Scanner kk = new Scanner(System.in);
          x=kk.nextLine();
          if(x=="y"){
           subscribe s = new subscribe (25){} ;
           p=s;
              System.out.print("your Card");
            System.out.print("you have discount 50%");
           System.out.println(p.discount());
          }
          else{
          nonsubscribe n = new nonsubscribe (25){};
          p=n;
             System.out.print("your Card");
          System.out.println(p.discount());
          }
         
          }
                   } 
               
               break;
             case 4:
               for(Carinfo car:c1){
         
          if(car.DriveName=="ali"){
              System.out.println("you choose From maadi to kattmya: information about Car 55 pound");
          System.out.println("Drive Name :"+" "+car.DriveName);
           System.out.println("Code of the Car:"+" "+car.uniquecode);
            System.out.println("Trips per Day:"+" "+car.TripsPerDay);
           System.out.println("Maximum Capicity of Car:"+" "+car.maxCapicity);
           System.out.print("are you subscribe any car press yes or No");
      Scanner kk = new Scanner(System.in);
          x=kk.nextLine();
          if(x=="y"){
           subscribe s = new subscribe (55){} ;
           p=s;
              System.out.print("your Card");
            System.out.print("you have discount 50%");
           System.out.println(p.discount());
          }
          else{
          nonsubscribe n = new nonsubscribe (55){};
          p=n;
             System.out.print("your Card");
          System.out.println(p.discount());
          }
         
          }
                   } 
               break;
               
               
             }
                 
                
           
       }
        
       if (choice ==2){
       System.out.print("Subscription rules if you are from 20 to 24 and 60 years old and 20 trips per month");
        int age;
        int numberoftrips;
        String name; 
        String code;
   System.out.print("enter you Data :Age, Number of trips per month ,Name,Carcode to subscribe.");
   
    Scanner sc = new Scanner (System.in);
    age= sc.nextInt();
    numberoftrips= sc.nextInt();
        Scanner ss= new Scanner(System.in);
    name = ss.nextLine();
    code=ss.nextLine();
    if (age==20||age==60||age==22||age==21||age==23||age ==24&&numberoftrips==20){
        a1.add(new subscription(age, numberoftrips, name,code));
        System.out.println("you are now subscribe");
    }
    else{
    
    System.out.println("Sorry, you arenot allowed to make a subsrition");
    }
    Scanner xo= new Scanner (System.in);
 
 
            
             
       }
       if (choice==3){
       System.out.println("enter your Name here to non_subscribe");
       Scanner h = new Scanner (System.in);
       String testname = h.nextLine();
       
     
       if ( null != testname)
switch (testname) {
                case "ahmed":
                    a1.remove(0);
                    break;
                case "Muhmmed":
                    a1.remove(1);
                    break;
                case "Shimaa":
                    a1.remove(2);
                    break;
                case "hamdy":
                    a1.remove(3);
                    break;
                default:
                    break;
            }
      
   
             
     
       }
if (choice == 4){

int rate;
Scanner se= new Scanner (System.in);
System.out.print("Give the driver from 1 to 5 rate");
rate=se.nextInt();




}



 for(subscription su:a1){
 System.out.println(su.age+" "+ su.name +" "+su.numberoftrips +"  "+ su.carcode);
 
 
 }


  
        
       }
    
    

}

