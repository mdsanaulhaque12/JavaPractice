/*package lab5flowcontrol;
public class Test {

    Rem during an interview was provided with the following program:

    class Rose {

        public static void main(String args[]) {

            int x, y, k; y=3;

            label:

            for (x = 0; x < y; x++) {

                for (k = 0; k < 2; k++) {

                    if (x == k) {

                        continue label;

                    }

                    System.out.println(x + " and " + k);

                }

            }

        }

    }

    What would be the output of the preceding program?

    Select one or more:
    Program will displayed 1 and 1 as an output
    Program will displayed 1 and 2 as an output
    Program will displayed 0 and 0 as an output
    Program will displayed 2 and 1 as an output
    Program will displayed 1 and 0 as an output
    Program will displayed 2 and 2 as an output
    Program will displayed 2 and 0 as an output
    Question 2
    Complete
    Mark 1 out of 1
    Not flaggedFlag question
    Question text
    Sam as a developer was asked to create a program using switch…case within for loop. Sam created the

    following program:

    class Sam {

        public static void main(String args[]){

            int z=3;

            for(int i=0; i<2;i++) {

                z++;

                switch(z) {

                    case 3: System.out.print(z=z+1 +” “);

                    case 5: System.out.print(z=z+2 + “ “);

                        break;

                    default : System.out.print(z=z+8 + “ “);

                    case 6: System.out.print( z=z+4 + “ “);

                }

                z--;

            }

        }

    }

    What would be the output of the preceding program out of the following?

    Select one:
            12 16 24 28
            4 7 15
            12 16
            4 7 15 19
    Question 3
    Complete
    Mark 1 out of 1
    Not flaggedFlag question
    Question text
    Imagine you work as a programmer in the ABC Company. You write the following program:

    public class A {

        public enum Cars {ferari, maruti, omni};

        public static void main(String [] args) {

            Cars mycar = Cars.ferari;

            switch (mycar) {

                case ferari:

                    System.out.print("ferari ");

                default case:

                    System.out.print("mercedez ");

                case maruti:

                    System.out.print("maruti ");

            }

        }

    }

    What will happen when you try to compile and execute the preceding program?

    Select one:
    It will produce the output as:
            true false done
    It will produce the output as:
    Feraari
    It will produce the output as:
    mercedez
    It will generate compilation error.
            Question 4
    Complete
    Mark 1 out of 1
    Not flaggedFlag question
    Question text
    Sam during an interview was provided with following code and asked to review the program:

    public class Sam {

        public static void main(String args[]) {

            int x=0, i=0;

            for (int y=0; y>=i; ++y,i++) {

                System.out.println(y);

                System.out.println(i);

            }

        }

    }

    After reviewing the code he was asked to predict the correct options among the following:

    Select one:
    a.  Program results in an endless loop
    b.  Program will not compile because declaration is not allowed inside the for loop
    c.  Program will print 0 0 for first time
    d.  Program will successfully compile and print 0 0 on execution and then terminates
    Question 5
    Complete
    Mark 1 out of 1
    Not flaggedFlag question
    Question text
    Steve during a training session was shown the following program:

    public class Rose{

        protected void get(boolean x ) {

            if(x){ System.out.println("True");}

            else { System.out.println("False");}

        }

        public static void main(String[] args) {

            Rose r = new Rose();

            r.get(true);

        }

    }

    What would be the output when the program is compiled?

    Select one:
    Program will not compile successfully
    Program will display False
    Program will successfully compile but give runtime error
    Program will display True
    Question 6
    Complete
    Mark 1 out of 1
    Not flaggedFlag question
    Question text
    Jennie is a software developer in an MNC. In one of her projects, she wrote a program as:

    class TestQuestion {

        public static void main(String s[]) {

            Boolean a = new Boolean("false");

            if(a) {

                System.out.println("false");

            }

            else {

                System.out.println("true");

            }

        }

    }

    What will be the output when the preceding program is compiled and executed?

    Select one:
    The program will display the output as:
            false
    The program will throw a runtime exception.
    The program will generate a compilation error.
    The program will display the output as:
    True
    Question 7
    Complete
    Mark 1 out of 1
    Not flaggedFlag question
    Question text
    Imagine you write the following program:

            package com.kogent;

    enum Students{Suchita, Deepak, Vikash, Charu, Mahtab}

    class Ques10 {

        public static void main(String args[]) {

            Students student;

            student = Students.Vikash;

            switch(student) {

                case Suchita: System.out.println("My name is Suchita");

                    break;

                case Deepak: System.out.println("My name is Deepak");

                    break;

                case Vikash: System.out.println("My name is Vikash");

                    break;

                case Charu: System.out.println("My name is Charu");

                    break;

                case Mahtab: System.out.println("My name is Mahtab");

                    break;

            }

        }

    }

    What will be the output after the preceding program is compiled and executed?

    Select one:
    The program will lead to runtime error.
    The program will lead to compilation error as the enum Students is declared outside the class.
    The program will compile successfully and execute by displaying the output, My name is Deepak.
    The program will compile successfully and execute by displaying the output, My name is Vikash.
    Question 8
    Complete
    Mark 1 out of 1
    Not flaggedFlag question
    Question text
    Hari is a student enrolled in a Java programming class. During the practice session he wrote the

    following code:

    class Temp {

        public static void main(String s[]) {

            int x = 20;

            int y = 25;

            if (++x < ( y= y-= 4) || ( x = x += 4) > y) {

                System.out.println(x + " " + y);

            }

        }

    }

    What will be the output when the preceding program is compiled and executed?

    Select one:
    The program compiles successfully and displays 25 21 as output.
    The program leads to compilation error.
    The program compiles successfully and displays 25 20 as output.
    The program compiles successfully but does not display anything as output.
            Question 9
    Complete
    Mark 1 out of 1
    Not flaggedFlag question
    Question text
    Rems as a student was provided with the following code snippet

    public void Rems(float c) {

        switch (c) {

            case 5:

            case 7:

            case 2:

            default:

            case 9.5:

        }

    }

    After viewing the code snippet Rems was asked to notice the problems in preceding code snippet on the

    basis of the rules regarding switch…case statement. Following are the options from which Rems has to

    choose the correct answer

    Select one:
    All cases must be in increasing order
    Switch cannot evaluate float value
    There is no problem in the code snippet
    The default statement can not be used between case statements
    Question 10
    Complete
    Mark 1 out of 1
    Not flaggedFlag question
    Question text
    Hari is a student enrolled in a Java programming class. During the practice session he wrote the

    following code:

    class Temp {

        public static void main(String s[]) {

            int x = 20;

            int y = 25;

            if (++x < ( y= y-= 4) || ( x = x += 4) > y) {

                System.out.println(x + " " + y);

            }

        }

    }

    What will be the output when the preceding program is compiled and executed?

    Select one:
    The program compiles successfully and displays 25 20 as output.
    The program compiles successfully and displays 25 21 as output.
    The program leads to compilation error.
    The program compiles successfully but does not display anything as output.
            Question 11
    Complete
    Mark 0 out of 1
    Not flaggedFlag question
    Question text
    Rose as a faculty given following options to her students and asked them to choose the correct options:

    Select one:
    A switch statement can only evaluate to float and double values
    Switch case must be similar to switch expression type
    A switch…case block must have break statements after every case
    A switch…case can be nested like nested if…else
    Question 12
    Complete
    Mark 0 out of 1
    Not flaggedFlag question
    Question text
    Sam was given the following code snippet during an interview and asked to choose all correct decisional

    and loop statements:

    int y=9;

for ( ;true ; ) { break;} // 1

if(y==9) { break; } // 2

switch(y) {default: break;} // 3

do ( ){ // code } while(expression); // 4

        while ( ) { //code } // 5

            Select one:
            Statement 1 and 3 are correct
            Statement 1,2, and 4 are correct
            Statement 1,4, and 5 are correct
            Statement 1, 3, and 5 are correct
            Statement 1, 2, and 3 are correct
            Question 13
            Complete
            Mark 1 out of 1
            Not flaggedFlag question
            Question text
            Neha works as a programmer in the ABC Company and she has written the following program:

            public class Foo {

                public static void main(String s[]) {

                    Integer i = new Integer(1) + new Integer(2);

                    switch(i) {

                        case 3: System.out.println("three"); break;

                        default: System.out.println("other"); break;

                    }

                }

            }

            What will be the output when the preceding program is compiled and executed?

                    Select one:
            three
                    other
            two
            program will not compile successfully.
                    Question 14
            Complete
            Mark 1 out of 1
            Not flaggedFlag question
            Question text
            John as a programmer created the following program:

            class Rose {

                public static void main (String args[]) {

                    int x=2; int y=6;

                    if( x!=y || (y*=x)!=x) {

                        System.out.println(" Not equal");

                    }else{

                        System.out.println(" Equal");

                    }

                }

            }

            What happens when he compile and run the preceding program?

            Select one:
            Program will not compile successfully because if statement is not correct
            Program will display Not Equal
            Program will compile but not executes
            Program will display Equal
            Question 15
            Complete
            Mark 1 out of 1
            Not flaggedFlag question
            Question text
            Imagine, you are a trainer in the XYZ company and during training session you asked one trainee to write

            code to implement the labeled continue statement. The trainee had written the following program:

            public class Sam {

                public static void main(String args[]) {

                    int x,y;

                    skip:

                    for(x=2; x<4; x++) {

                        System.out.print(x + “ “);

                        for(y=0; y<6;y++) {

                            System.out.print(y + “ “);

                            if (x==y) {

                                continue skip;

                            }

                        }

                    }

                }

            }

            What happens when you compile and run the preceding program? Choose the correct option from the

            following options:

            Select one:
            Program will display 2 0 1 2
            Program will not compile successfully
            Program will display 2 0 1 2 3 0 1 2 3
            Program will display 2 0 1 3 0 1 2 3
            Question 16
            Complete
            Mark 0 out of 1
            Not flaggedFlag question
            Question text
            Rose during an interview was shown the following program:

            class Rose {

                public static void main(String args[]) {

                    int x = 0;int y=9;

                    for ( ; x<y; ) { x++; y++;} // (a)

                    for (x; x==y; --x) continue; // (b)

                    for (x=0; x<5; ) { x++; } // (c)

                    for ( ; ; ) ; // (d)

                }

            }

            What would be the output of the preceding program from the following options?

                    Select one:
            Program will successfully compile and executes but does not print any value
            Program will successfully compile and becomes endless because of loop d
            Program will not compile because loop b is syntactically incorrect
            Program will not compile because loop a has only expression part but missing initialization and increment/decrement part
            Question 17
            Complete
            Mark 1 out of 1
            Not flaggedFlag question
            Question text
            Sam works as a programmer in Xyz Company and he created the following program:

            class Rose {

                public static void main (String args[]) {

// write appropriate code here

                    switch(k) {

                        case 65: System.out.println("hello");

                        case 'k': System.out.println("Hi");

                        case 'j': System.out.println("Java");

                            break;

                        default: System.out.println("default");}

                }

            }

            You have to choose appropriate code snippet from the following code snippets to replace the “// write

            appropriate code here” statement in the preceding program so that “hello Hi Java” can be printed:

            Select one or more:
            char k=’A’
            int k =’65’
            int k = 65
            char k= (char) 65
            Question 18
            Complete
            Mark 0 out of 1
            Not flaggedFlag question
            Question text
            Rose as a programmer created the following program:

            public class Rose{

                protected void get(char x ) {

                    switch(x){

                        case 88: System.out.println( "X");break;

                        case 90: System.out.println( "Z");break;

                        case 89: System.out.println( "Y");break;

                        default: System.out.println( 0);break;

                        case -97: System.out.println("a");break;

                    }

                    What would be the output of this program?

                }

                public static void main(String[] args) {

                    Rose r = new Rose();

                    r.get('X');

                }

            }

            Select one:
            Program will not compile successfully
            Program will compile successfully but not execute
            Program will display X
            Program will display X0
            Question 19
            Complete
            Mark 0 out of 1
            Not flaggedFlag question
            Question text
            Imagine you work as a programmer in the ABC Company and you have written the following program:

            class Test {

                public static void main(String[] args) {

                    for (int i = 0;i <=10;i++){

                        if( i > 6) break;

                    }

                    System.out.println(i);

                }

            }

            What will be the output after compilation and execution of the preceding program?

                    Select one:
            Program will not compile successfully.
            1 2 3
            4 4
            1 2 3 4
            Question 20
            Not answered
            Marked out of 1
            Not flaggedFlag question
            Question text
            Sam was given the following program by his teacher:

            class Sam {

                public static void main(String args[]) {

                    int y=2;int i;

                    for (i=0; i <= 3; i++) {

                        if (i == 2) {

                            break;

                        }else {

                            y++;}

                    }

                    System.out.println(i + ", " + y);

                }

            }

            What would be the output of the preceding code?

                    Select one:
            Program will display 2 , 2 as an output
            Program will display 2 , 3 as an output
            Program will display 1 , 2 as an output
            Program will display 2 , 4 as an output


 */