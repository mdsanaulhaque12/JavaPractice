package lab5flowcontrol;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(true){
            System.out.println("Enter the basic salary");
            double HRA,DA,grossSalary;
            double basicSalary=sc.nextDouble();

            if(basicSalary>15000){
                HRA=(20/100)*basicSalary;
                DA=(60/100)*basicSalary;
            }else {
                HRA=3000;
                DA=0.70*basicSalary;
            }
            grossSalary=basicSalary + HRA+DA;
            System.out.println("gross salary of employee : " +grossSalary);

            System.out.println("ENTER -1 TO CONTINUE ELSE ANY OTHER TO CONTINUE");
            i=sc.nextInt();
            if(i!=-1){break;}

        }
    }
}
