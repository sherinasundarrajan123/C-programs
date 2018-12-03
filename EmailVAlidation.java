package emailvalidation1;

import java.util.Scanner;

/**
 *
 * @author Sherina Sundarrajan
 */
public class EmailValidation1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int i=0,flag1=0,flag2=0;
        String email=sc.nextLine();
        String gmailValidation="@gmail.com";
        char[] mail=email.toCharArray();
        while(i<mail.length&&mail[i]!='@')
        {
            if(i==0&&(mail[i]<97||mail[i]>122))
            {
                System.out.println("Invalid mail ID");
                System.exit(0);
            }
            else if(i!=0&&mail[i]=='_'&&flag1==0)
            {
                flag2=1;
            } 
            else if(i!=0&&(mail[i]>=48&&mail[i]<=56)&&flag2==0)
            {
                flag1=1;
            }
            else if(i!=0&&(((mail[i]>=48&&mail[i]<=56)&&flag2!=0))||(mail[i]=='_'&&flag1!=0))
            {
                System.out.println("Invalid mail ID");
                System.exit(0);
            }
            i++;
        }
        if(mail.startsWith(gmailValidation,(mail.length)-10)))
            System.out.println("Valid Mail ID");
        else
            System.out.println("Invalid Mail ID");
        /*if(i>=mail.length)
        {
            System.out.println("Invalid mail ID");
            System.exit(0);
        }
        char[] checkerGmail=gmailValidation.toCharArray();
        int j=0;
        while(i<mail.length)
        {
            if(checkerGmail[j]!=mail[i])
            {
                System.out.println("Invalid mail ID");
                System.exit(0);
            }
            i++;
            j++;
        }
        if(j<checkerGmail.length)
        {
            System.out.println("Invalid mail ID");
            System.exit(0);
        }
        System.out.println("Valid mail");*/
    }
    
}
