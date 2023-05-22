package smartcity;

import java.util.Scanner;

class smart {

    public smart() {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t-- welcom in our city --");
        RegisterOrLogin obj1 = new RegisterOrLogin();
        if (obj1.q == true) {
            boolean m = true;
            int x;
            System.out.println("----------------------");
            System.out.println("--       welcom     --");
            System.out.println("choose one of these option");
            while (m) {
                System.out.println("Phones and internet        [1]\nnews                       [2]\nPleaces to move and visited[3]\nlocal festival             [4]");
                System.out.println("for Booking                [5]\nclub practicing            [6]\nhealth                     [7]\nComplaining                [8]");
                x = input.nextInt();
                switch (x) {
                    case (1):
                        phones obj2 = new phones();
                        m = obj2.q;
                        break;
                    case (2):
                        news obj3 = new news();
                        m=obj3.q;
                        break;
                    case (3):
                        pleaces obj4=new pleaces();
                        m=obj4.q;
                        break;
                    case (4):
                        localfestival obj5=new localfestival();
                        m=obj5.q;
                        break;
                    case (5):
                        viewbooking obj6=new viewbooking();
                        m=obj6.q;
                        break;
                    case (6):
                        clup obj7=new clup();
                        m=obj7.q;
                        break;
                    case (7):
                        health obj8=new health();
                        m= obj8.q;
                        break;
                    case (8):
                        complaint obj10=new complaint();
                        m=obj10.q;
                        break;                   
                    default:
                        System.out.println("enter the right number");
                }
            }
        }
    }
}
