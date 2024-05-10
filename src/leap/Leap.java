/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leap;
import java.util.Scanner;

/**
 *
 * @author dell1
 */
public class Leap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year no");
        int year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                     System.out.println("Its a Leap year");
                }
                else
                {
                     System.out.println("Not a Leap year");
                }
            }
        }
    }
}
                   
    
    

