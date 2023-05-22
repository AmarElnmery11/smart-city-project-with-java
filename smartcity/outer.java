package smartcity;

import java.util.*;
import java.util.Scanner;

class  RegisterOrLogin {
    boolean q=false;
    private String name;
    private String user;
    private String emailaddress;
    private String nationality;
    private String password;
    private String conpassword;
    private String loguser;
    private String logpassword;
    Map acounts = new HashMap();             //using hashmap to store acounts in (keys,values)  
    Scanner input = new Scanner(System.in);
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getEmailaddress() {
        return emailaddress;
    }
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getConpassword() {
        return conpassword;
    }
    public void setConpassword(String conpassword) {
        this.conpassword = conpassword;
    }
    public void setallacounts(String user, String password) {
        this.acounts.put(user, password);
    }
    public Map getAcounts() {
        return acounts;
    }
    public String getLoguser() {
        return loguser;
    }
    public void setLoguser(String loguser) {
        this.loguser = loguser;
    }
    public String getLogpassword() {
        return logpassword;
    }
    public void setLogpassword(String logpassword) {
        this.logpassword = logpassword;
    }
    public RegisterOrLogin() {               //counstractor
        int z=0;                             // for depuging in repet hine
        acounts.put("amar", "111");          //database
        boolean x = true;                    // for while confirm password
        Scanner input = new Scanner(System.in);
        System.out.println("choose \nRegister [1]\nLogine [2]\nAnother number to exite");
        int a = input.nextInt();
        switch (a) {
            case (1):
                System.out.println("please enter your full name");
                this.setName(input.nextLine());
                this.setName(input.nextLine());
                System.out.println("enter your nationality");
                this.setNationality(input.nextLine());
                System.out.println("enter your email ");
                this.setEmailaddress(input.nextLine());
                System.out.println("enter the user ");
                this.setUser(input.nextLine());
                while (x) {
                    System.out.println("enter the password ");
                    this.setPassword(input.nextLine());
                    System.out.println("confirm the password");
                    this.setConpassword(input.nextLine());
                    if (conpassword.equals(password) == false) {
                        System.out.println("the two passwords not confirm\nplease enter to confirm password ");
                    } else {
                        x = false;
                    }
                }
                this.setallacounts(user, password);
                System.out.println("---------------------------");
                System.out.println("now enrolling");  
                z++;                                           // for debuging ln in case (2)
                                              // i put enrooling after register directly so i didnot put break
            case (2):
                boolean l = true;
                while (l) {
                    System.out.println("enter user");
                    this.setLoguser(input.nextLine()); 
                    if(z==0){                              // becous of debug of ln it is very important her
                    this.setLoguser(input.nextLine());}
                    System.out.println("enter the password");
                    this.setLogpassword(input.nextLine());
                    z++;
                    if (acounts.containsKey(loguser) == false) {
                        System.out.println("the user is wrong");
                    } else if (acounts.get(loguser).equals(logpassword) == false) {
                        System.out.println("the password is wrong");
                    } else {
                        l = false;             // to stop repeat 
                        q=true;                // enter to optionts if user and password right
                    }
                }
                break;
            default:
                System.out.println("-----------Thank You------------");
        }
    
    }

}
