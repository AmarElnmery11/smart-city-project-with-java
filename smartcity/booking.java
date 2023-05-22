
package smartcity;

// (hotel , matches ticket(football,handball,volleybool,basketball,tennis)), resturant  )

import static java.lang.System.in;
import java.util.Scanner;

 // 3 interfaces(hotel/resturant/matchTicket) and 1 class(to payment) and class viewbooking extends and implements it
interface hotel {
    public String getKindroom() ;
    public void setKindroom(String kindroom);
    public int getDaysnumber();
    public void setDaysnumber(int daysnumber);
    public int getFloornumber();
    public void setFloornumber(int floornumber) ;
    public int getStars();
    public void setStars(int star) ;
  
}
interface resturant{
    public void viewresturant();
}
interface matchesTicket{
    public void viewticket();
}

class  payment{
    private String userbank;
    private String uservisa;
    private String passbank;
    private String passvisa;
    public String getUserbank() {
        return userbank;
    }
    public void setUserbank(String userbank) {
        this.userbank = userbank;
    }
    public String getUservisa() {
        return uservisa;
    }
    public void setUservisa(String uservisa) {
        this.uservisa = uservisa;
    }
    public String getPassbank() {
        return passbank;
    }
    public void setPassbank(String passbank) {
        this.passbank = passbank;
    }
    public String getPassvisa() {
        return passvisa;
    }
    public void setPassvisa(String passvisa) {
        this.passvisa = passvisa;
    }
   
    public void topayment(){
     Scanner in = new Scanner(System.in);
        System.out.println("[1] pay by bank account \n[2] pay by visa ");
        int x=in.nextInt();
        int m=2;
        while(m==2){
            
        switch(x){
          case(1):
              System.out.println("enter your user account bank");
              this.setUserbank(in.nextLine());
              this.setUserbank(in.nextLine());
              System.out.println("now enter your password");
              this.setPassbank(in.nextLine());
              m=1;
              break;
          case(2):
              System.out.println("enter your user visa");
              this.setUservisa(in.nextLine());
              this.setUservisa(in.nextLine());
              System.out.println("now enter your password");
              this.setPassvisa(in.nextLine());
              m=1;
              break;              
          default:
              System.out.println("please enter right number");
              
            }   
        }  
    }
}
  class viewbooking extends payment implements hotel,resturant,matchesTicket{//implement the methods that build in interfaces 
    boolean q =false;
    String kindroom=new String();
    int daysnumber=1;
    int floornumber=1;
    int stars=1;
    @Override   
    public String getKindroom() {
        return kindroom;
    }
    @Override   
    public void setKindroom(String kindroom) {
        this.kindroom = kindroom;
    }
    @Override   
    public int getDaysnumber() {
        return daysnumber;
    }
    @Override   
    public void setDaysnumber(int daysnumber) {
        this.daysnumber = daysnumber;
    }
    @Override   
    public int getFloornumber() {
        return floornumber;
    }
    @Override   
    public void setFloornumber(int floornumber) {
        this.floornumber = floornumber;
    }
    @Override   
    public int getStars() {
        return stars;
    }
    @Override   
    public void setStars(int stars) {
        this.stars = stars;
    }
    @Override    
    public void viewresturant(){
         Scanner input = new Scanner(System.in);
         String food,guice ,desert;
     int w=1;
     while(w==1){
         
        System.out.println("the menue\n[1] food\n[2] drinks\n[3] deserts");
        int x=input.nextInt();
        switch(x){
          case(1): 
              System.out.println("write your choose");
              System.out.println("********arrays of food*********"); 
              food=input.nextLine();
              food=input.nextLine();
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter another number");
              w=input.nextInt();
              break;
          case(2): 
              System.out.println("write your choose");
              System.out.println("********arrays of guice*********"); 
              guice=input.nextLine();
              guice=input.nextLine();
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter another number");
              w=input.nextInt();
              break;
          case(3): 
              System.out.println("write your choose");
              System.out.println("********arrays of food*********"); 
              desert=input.nextLine();
              desert=input.nextLine();
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter another number");
              w=input.nextInt();
              break;
          default:
              System.out.println("------------------------");
              System.out.println("enter the right number");              
        }
     }
    }
    static int resfoot=0;
    static int resbasket=0;
    static int resvolley=0;
    static int reshand=0;
    static int tennis=0;

    @Override
    public void viewticket(){
     
     Scanner input = new Scanner(System.in);
     int w=1;
     while(w==1){
        System.out.println("[1] football\n[2] basketball\n[3] volleyball\n[4] handball \n[5] tennis");
        int x=input.nextInt();
        switch(x){
          case(1):
              System.out.println("you reserve it succesful");
              resfoot++;
              System.out.println("----------------------------------\n---for payment---");
              topayment();
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
          case(2):
              System.out.println("you reserve it succesful");
              resbasket++;
              System.out.println("----------------------------------\n---for payment---");
              topayment();
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;              
          case(3):
              System.out.println("you reserve it succesful");
              resvolley++;
              System.out.println("----------------------------------\n---for payment---");
              topayment();
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;              
          case(4):
              System.out.println("you reserve it succesful");
              reshand++;
              System.out.println("----------------------------------\n---for payment---");
              topayment();
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
          case(5):
              System.out.println("you reserve it succesful");
              tennis++;
              System.out.println("----------------------------------\n---for payment---");
              topayment();
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
        }
     }
    }
     public viewbooking(){                                         
     Scanner input = new Scanner(System.in);
     int w=1;
     while(w==1){
        System.out.println("[1] hotel\n[2] resturant\n[3] matchesTicket");
        int x=input.nextInt();
        switch(x){
          case(1): 
              System.out.println("enter the kind of your room single or double ");
              this.setKindroom(input.nextLine());
              this.setKindroom(input.nextLine());
              System.out.println("the number of days");
              this.setDaysnumber(input.nextInt());
              System.out.println("the number of stars hotel");
              this.setStars(input.nextInt());
              System.out.println("enter the number of floor you want ");
              this.setFloornumber(input.nextInt());
              System.out.println("----------------------------------\n---for payment---");
              topayment();
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
          case(2):
              viewresturant();             
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter another number");
              w=input.nextInt();
              break;
          case(3):
              viewticket();
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter anouther number");
              w=input.nextInt();
              break;  
          default:
              System.out.println("------------------------");
              System.out.println("enter the right number");        
        }
        }
       System.out.println("-------------------------------------\nnow if you want to exit enter        [1]\nelse if you want another service enter another number");
       int x =input.nextInt();
       if(x!=1)
       q=true;
       else
           System.out.println("----------- your are welcom ------------");
        }
    }

