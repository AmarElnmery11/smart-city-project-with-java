package smartcity;
//-> health (choose pharmacy or sick --> choose dipartment and view the hospitals or clinics)

import java.util.Scanner;

class hospitals {    //class hospital we will use it in health construct

    public void hospital() {
        int w = 1;
        while (w == 1) {
            w = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("[1] Personnel department\n[2] pulmonary department\n[3] Dermatology\n[4] Dentistry");
            System.out.println("[5] Gastrology\n[7] OPd\n[8] Radiology department");
            int x = input.nextInt();
            switch (x) {
                case (1):
                    System.out.println("in hospital (a) at (@aa)\t and clinic a at(@aa)");
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end this window enter[2]");
                    w = input.nextInt();
                    break;
                case (2):
                    System.out.println("in hospital (b) at (@bb)\t and clinic b at(@bb)");
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end this window enter[2]");
                    w = input.nextInt();
                    break;
                case (3):
                    System.out.println("in hospital (c) at (@cc)\t and clinic c at(@cc)");
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end this window enter[2]");
                    w = input.nextInt();
                    break;
                case (4):
                    System.out.println("in hospital (d) at (@dd)\t and clinic d at(@dd)");
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end this window enter[2]");
                    w = input.nextInt();
                    break;
                case (5):
                    System.out.println("in hospital (e) at (@ee)\t and clinic e at(@ee)");
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end this window enter[2]");
                    w = input.nextInt();
                    break;
                case (6):
                    System.out.println("in hospital (f) at (@ff)\t and clinic f at(@ff)");
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end this window enter[2]");
                    w = input.nextInt();
                    break;
                case (7):
                    System.out.println("in hospital (g) at (@gg)\t and clinic g at(@gg)");
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end this window enter[2]");
                    w = input.nextInt();
                    break;
                case (8):
                    System.out.println("in hospital (h) at (@hh)\t and clinic h at(@hh)");
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end this window enter[2]");
                    w = input.nextInt();
                    break;
                default:
                    System.out.println("please enter the right number");
            }
        }
    }
}
class health extends hospitals {
    boolean warrning = false;                 // for emergancy it should wernning the empulence staff
    boolean q = false;
    
    public void emergancy(int x) {            //method for emergancy
        if (x == 1) {
            warrning = true;
        }
    }

    public health() {
        Scanner input = new Scanner(System.in);
        int w = 1;
        while (w == 1) {
            System.out.println("[1] iam very sick\n[2] emergancy \n[3] hospitals or clinics ");
            int x = input.nextInt();
            switch (x) {
                case (1):
                    System.out.println("stay calm");
                    this.emergancy(1);
                    System.out.println("waiting the empulence we are comming");
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end enter[2]");
                    w = input.nextInt();
                    break;
                case (2):
                    this.emergancy(1);
                    System.out.println("waiting the empulence we are comming");
                    System.out.println("---------------\nif you want back enter [1]\nif you want to end enter another number");
                    w = input.nextInt();
                    break;
                case (3):
                    System.out.println("choose department");
                    super.hospital();
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
