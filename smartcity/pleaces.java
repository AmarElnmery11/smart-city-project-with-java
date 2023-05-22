package smartcity;

import java.util.Scanner;
class pleaces {
    String []visit={"a@","b@","c@","d@"};
    String []resturant={"e@","f@","g@","h@"};
    String []tourest_arrivals={"e@","f@","g@","h@"};
    boolean q=false;
   public pleaces(){
    Scanner input = new Scanner(System.in);
     int w=1;
     while(w==1){
        System.out.println("[1] pleaces to visit\n[2] resturants pleaces\n[3] tourest arrivals");
        int x=input.nextInt();
        switch(x){
          case(1):
              for(int l=0;l<visit.length;l++){
               System.out.println(visit[l]+"\t");
              }
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
          case(2):
              for(int l=0;l<resturant.length;l++){
                  System.out.println(resturant[l]+"\t");
              }
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter another number");
              w=input.nextInt();
              break;
          case(3):
              for(int l=0;l<tourest_arrivals.length;l++){
                  System.out.println(tourest_arrivals[l]+"\t");
              }
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter anouther number");
              w=input.nextInt();
              break;         
          default:
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
