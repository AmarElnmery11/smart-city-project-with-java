package smartcity;
//	-> club practicing(ranning,swimming,play football,..,..,..,tennis)
import java.util.Scanner;

class clup {

    String track = "the track in A at (@mm)\nthe tack in b at(@nn)";
    String bool = "the bool in A at (@mm)\nthe tack in b at(@nn)";
    String footballcourt = "the court in A at (@mm)\nthe tack in b at(@nn)";
    String handballcourt = "the court in A at (@mm)\nthe tack in b at(@nn)";
    String volleyballcourt = "the court in A at (@mm)\nthe tack in b at(@nn)";
    String tenniscourt = "the court in A at (@mm)\nthe tack in b at(@nn)";
    boolean q = false;

    public clup() {
        Scanner input = new Scanner(System.in);
        int w = 1;
        while (w == 1) {
            System.out.println("[1] practicing running\n[2] practicing swimming \n[3] practicing football\n[4] practicing handball ");
            System.out.println("[5] practicing volleyball\n[6] practicing tennis");
            int x = input.nextInt();
            switch (x) {
                case (1):
                    System.out.println(track);
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end enter[2]");
                    w = input.nextInt();
                    break;
                case (2):
                    System.out.println(bool);
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end enter another number");
                    w = input.nextInt();
                    break;
                case (3):
                    System.out.println(footballcourt);
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end enter anouther number");
                    w = input.nextInt();
                    break;
                case (4):
                    System.out.println(handballcourt);
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end enter anouther number");
                    w = input.nextInt();
                    break;
                case (5):
                    System.out.println(volleyballcourt);
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end enter anouther number");
                    w = input.nextInt();
                    break;
                case (6):
                    System.out.println(tenniscourt);
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end enter anouther number");
                    w = input.nextInt();
                    break;
                default:
                    System.out.println("enter the right number");
            }
        }
        System.out.println("-------------------------------------\nnow if you want to exit enter        [1]\nelse if you want another service enter another number");
        int x = input.nextInt();
        if (x != 1) {
            q = true;
        } else {
            System.out.println("----------- your are welcom ------------");
        }
    }
}

