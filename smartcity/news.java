package smartcity;

import java.util.Scanner;

class news {
    boolean q=false;
    Scanner input = new Scanner(System.in);
    private String citynews=new String("the city news@@");
    private String weathernews=new String("the weather news@@");
    private String businessnews=new String("the business news@@");
    private String hiringjobnews=new String("the hiring job news@@");
    private String traininingnews=new String("the trainining news@@");
    private String colagenews=new String("the colage news@@");
    private String schoolnews=new String("the school news@@");
    private String trafficnews=new String("the traffic news@@");
    private String matchesnews=new String("the matches today news@@");
    public void studies(){                         //method 
        int w=1;
        while(w==1){
        System.out.println("[1] if you want news about collages\n[2] if you want news about schools");
        int x=input.nextInt();
        switch(x){
          case(1):
              System.out.println(this.colagenews);
              System.out.println("---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
          case(2):
              System.out.println(this.schoolnews);
              System.out.println("---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
          default:
              System.out.println("enter the right number");
        
            }
        }
    }
    
    public news(){                     // constructor
        int w=1;
        while(w==1){        
        System.out.println("[1] about city\n[2] about weather\n[3] about business");
        System.out.println("[4] about hiring job\n[5] about trainning\n[6] about studies \n[7] about traffic \n[8] about matches today");
        int x=input.nextInt();
        switch(x){
        case(1):
            System.out.println(this.citynews);
              System.out.println("---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
        case(2):
            System.out.println(this.weathernews);
              System.out.println("---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
        case(3):
            System.out.println(this.businessnews);
              System.out.println("---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
        case(4):
            System.out.println(this.hiringjobnews);
              System.out.println("---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
        case(5):
            System.out.println(this.traininingnews);
              System.out.println("---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
        case(6):
            this.studies();
              System.out.println("---------------\nif you want back in the main optins enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;
        case(7):
            System.out.println(this.trafficnews);
              System.out.println("---------------\nif you want back enter [1]\nif you want to end enter[2]");
              w=input.nextInt();
              break;    
        case(8):
            System.out.println(this.matchesnews);
              System.out.println("---------------\nif you want back enter [1]\n if you want to end enter[2]");
              w=input.nextInt();
              break;
        default:
            System.out.println("-------------------\nenter the right number");
        }
        }
       System.out.println("-------------------------------------\nnow if you want to exit enter        [1]\nelse if you want another service enter[2]");
       int x =input.nextInt();
       if(x==2)
       q=true;
       else
           System.out.println("----------- your are welcom ------------");
    }
}
