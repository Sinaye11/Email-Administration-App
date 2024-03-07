import java.util.Scanner;

//Initilizing of the required strings and integers
public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "hummingbird.com";

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName){

        this.firstName = firstName;
        this. lastName = lastName;

        //Call a method asking for the department - return the department
        this.department =setDepartment();

        //Call a method that returns a random password
        this.password =randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " +this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    //Getting the the department
    private String setDepartment(){

        System.out.print("New employee: " + firstName + "\nDepartment Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the Department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if
         (depChoice == 1){ return "sales" ;}
        else if 
            (depChoice == 2) {return "dev";}
        else if 
            (depChoice ==3){return "acct";}
        else 
            {return " ";}
    }

    //Generating a random password
    private String randomPassword(final int length){

       final String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
             final int rand = (int) (Math.random() * passwordSet.length());
             password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity 
    public void setMailboxCapacity(int capacity){

        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public  void setAlternateEmail(String altEmail){

        this.alternateEmail = altEmail;
    }

    //Change the passsword
    public void changePassword(String password){

        this.password =password;
    }

    //Get  the mailbox capacity
    public int getMailboxCapacity() {return mailboxCapacity;}

    //Get alternate email
    public String getAlternateEmail() {return alternateEmail;}

    //Get the password
    public String  getPassword() {return password;}

    //Displaying  user  details
    public String showInfo() {

        return "Display name: " +firstName + " " +lastName+ 
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " +mailboxCapacity + "mb";
    }
}
