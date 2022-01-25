import java.util.Scanner;

public class Week01qns2 {
    public static void main(String arg[])   
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter module code: "); 
        String mod = sc.next();
        sc.close();

        switch(mod)   
        {   
            case "CSC1006":   
            System.out.println("Mathematics 2"); 
            break;   
            case "CSC1007":   
            System.out.println("Operating Systems"); 
            break;   
            case "CSC1008":   
            System.out.println("Data Structures & Algorithm"); 
            break;   
            case "CSC1009":   
                System.out.println("Object-Oriented Programming"); 
                break;
            case "CSC1010":   
            System.out.println("Computer Networks"); 
            break;     
            default:
            System.out.println("Invalid");
            break;
        }     
    } 
}
