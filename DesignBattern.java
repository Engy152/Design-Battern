
package designbattern;
import java.util.Scanner;

public class DesignBattern {

    
    public static void main(String[] args)
    {
     Scanner input = new Scanner (System.in);
     System.out.println("Staff Type = ");
     String t = input.nextLine();
     memberFactory mt = new memberFactory();
     Staff st = mt.getstaff(t);
     System.out.println("sallary = ");
     double sallary =  input.nextDouble();
     System.out.println("YearsOfWork = ");
     double yearsofwork =  input.nextDouble();
     Doctor Dr = new Doctor();
     Dr.setsallary(sallary);
     Dr.setyearsofwork(yearsofwork);
     TeachingAssistant teach = new TeachingAssistant();
     teach.setsallary(sallary);
     teach.setyearsofwork(yearsofwork);
        
       System.out.println(st.get_sallary());
       System.out.println(st.get_yearsofwork());
       
    }
    
}
