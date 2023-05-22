
package smartcity;

import java.util.*;
import java.util.Scanner;                          
                                                   // solved new problem
                                                   // Using ArrayList
class  complaint{
 boolean q=false;
 ArrayList a=new ArrayList();
 public complaint(){
     Scanner input = new Scanner(System.in);
     int w=1;
     int e=0;                                    // for debuging ln
     while(w==1){
         
         System.out.println("write your complimant");
         a.add(input.nextLine());
         if (e>0)
            a.add(input.nextLine());   
         System.out.println("\n---------------\nif you want to write another complaint enter [1]\nif you want back enter                       [2]");
         w=input.nextInt(); 
         e++;
     }
                System.out.println("-------------------------------------\nnow if you want to exit enter        [1]\nelse if you want another service enter another number");
       int x =input.nextInt();
       if(x!=1)
       q=true;
       else
           System.out.println("----------- your are welcom ------------");
     }
 
 }

    

