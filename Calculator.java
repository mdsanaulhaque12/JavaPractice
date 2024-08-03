package labExceptionalHandling;

import java.io.*;


class DivideByZeroException extends Exception{
    DivideByZeroException(String msg){
        super(msg);
    }
}

class InvalidRuntimeUnchkedOperatorException extends RuntimeException{
        InvalidRuntimeUnchkedOperatorException(String msg){
        super(msg);
    }
}
class InvalidOperatorException extends Exception { //this is checked exception
    InvalidOperatorException(String msg) {
        super(msg);
    }
}

public class Calculator {
    public static int calculate(int a, int b, char op) throws InvalidRuntimeUnchkedOperatorException,InvalidOperatorException,DivideByZeroException {
        int result = -1;
        switch (op) {
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                if (b == 0) throw new DivideByZeroException("divide by zero");
                else result = a / b;
                break;
            default:
                //throw new InvalidOperatorException("invalid operator  : " + op+"  enter only +,-,*,/ as operator");
                throw new InvalidRuntimeUnchkedOperatorException("invalid operator  : \" + op+\"  enter only +,-,*,/ as operator");
        }
        return result;
    }

    public static void main(String[] args)  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first number");
        try {
            int a = Integer.parseInt(br.readLine());
            System.out.println("enter second number");
            int b = Integer.parseInt(br.readLine());

            System.out.println("enter operators +,_,*,/");
            String s = br.readLine();
            char ch = s.charAt(0);

            try {
                int result = calculate(a, b, ch);
                System.out.println("result : "+  result);
            }

            catch(InvalidRuntimeUnchkedOperatorException e){
                //compiler will not force us to catch this exception
                //But we catch this so that our program can run even if this exception occured
                e.printStackTrace();
            }
            catch (DivideByZeroException e) {
                e.printStackTrace();
            }
            catch (InvalidOperatorException e) {
                e.printStackTrace();
            }
        } catch (NumberFormatException e) {
            System.out.println("input integers only to perfrom operations");
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("==========================================================\n");
        System.out.println("other code running successfully even if exception occurred or not ");
    }
}
