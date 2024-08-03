package labExceptionalHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFormatANDNullPointerDemo {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("enter integer only");
            int a= Integer.parseInt(br.readLine());
            System.out.println(a);
        }catch(IOException e){
            e.printStackTrace();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        br=null;
        try{
            int b=Integer.parseInt(br.readLine());
        }catch(NullPointerException e){
            e.printStackTrace();
        }

    }
}
