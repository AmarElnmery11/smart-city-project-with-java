
package smartcity;

import java.util.Scanner;

class localfestival {
     boolean q=false;
    String [] singing_party={"a@@","b@@"}  ;       // i put pleaces in array 
    String [] dance_party ={"c@@","d@@"} ;
    String [] Some_strumming_exercises={"e@@","f@@"};
     public localfestival(){
    Scanner input = new Scanner(System.in);
     int w=1;
     while(w==1){
        System.out.println("[1] pleaces to singing party\n[2] pleaces to dance party \n[3] pleaces to Some strumming exercises ");
        int x=input.nextInt();
        switch(x){
          case(1):
              for(int l=0;l<singing_party.length;l++){
               System.out.println(singing_party[l]+"\t");
              }
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
          case(2):
              for(int l=0;l<dance_party.length;l++){
                  System.out.println(dance_party[l]+"\t");
              }
              System.out.println("\n---------------\nif you want back enter [1]\nif you want to end enter another number");
              w=input.nextInt();
              break;
          case(3):
              for(int l=0;l<Some_strumming_exercises.length;l++){
                  System.out.println(Some_strumming_exercises[l]+"\t");
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
