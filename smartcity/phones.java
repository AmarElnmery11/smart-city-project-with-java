package smartcity;

import java.util.Scanner;

class phones {
   boolean q =false;
   public phones(){
       Scanner input = new Scanner(System.in);
       System.out.println("if you want to fix your mobile the the closed place to you in (**********)");
       System.out.println("else if you want to access to internet call service customes in pur country 56777 ");
       System.out.println("-------------------------------------\nnow if you want to exit enter        [1]\nelse if you want another service enter[2]");
       int x =input.nextInt();
       if(x==2)
       q=true;
       else
           System.out.println("----------- your are welcom ------------");
   }
}
