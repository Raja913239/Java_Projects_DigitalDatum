public class Prob1 {
    
    public static void main(String[] args) {
        
        //byte a = 10;
        //int n = a;  Type Conversion from byte to int..

        //int i = 12;
        //byte b = (byte) i; // Type Casting from int to byte..

       // int i = 257;
       //byte b = (byte) i; // Type Casting from int to byte.. value is modules so 256.. 257 % 256 = 1

       //float f = 5.6f;
       //int b = (int) f; // Type Casting from float to int..
       
       /*  Type Promotion
        byte a = 10;
        byte b = 30;
        int c = a * b; // Type Promotion from byte to int.. because byte is smaller than int.. so it will promote to int..
       System.out.println(c); */


       //--Increment and Decrement Operators

       /*int a = 10;
       int res = a++;  // Post Increment Operator.. first it will assign the value of a to res and then it will increment the value of a by 1..
       System.out.println(res); // 10 and a = 11 
       int res = ++a; // Pre Increment Operator.. first it will increment the value of a by 1 and then it will assign the value of a to res..
       System.out.println(res); // 11 and a = 11 

        int res = a--; // Post Decrement Operator.. first it will assign the value of a to res and then it will decrement the value of a by 1..
         System.out.println(res); // 10 and a = 9 
        int res = --a; // Pre Decrement Operator.. first it will decrement the value of a by 1 and then it will assign the value of a to res..
        System.out.println(res); // 9 and a = 9 

        // Logical Operator:

        int a = 5;
        int b = 6;
        int i = 7;
        int j = 9;

        //boolean res = a > b && i < j; // Logical AND Operator.. if both conditions are true then it will return true otherwise false..

       // boolean res = a > b || i < j;  Logical OR Operator.. if any one condition is true then it will return true otherwise false..

        boolean res = !(a > b); // Logical NOT Operator.. it will return the opposite value of the condition.. if condition is true then it will return false and if condition is false then it will return true..
        System.out.println(res); 

        // Conditional Statement:

        int x = 8;
        int y = 9;
        int z = 10;

        if (x>y && x>z)
            System.out.println(x);
        else if (y>z)
            System.out.println(y);
        else
            System.out.println(z);
        

        // Ternary Operator:

        int x = 11;
        int res = 0;
        res = (x%2==0) ? 10 : 20; // Ternary Operator.. if the condition is true then it will assign the value of 10 to res otherwise it will assign the value of 20 to res..
        System.out.println(res);
        

        int n = 1;

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                
        }
                

       //while Loops

        int i = 1;

        while(i <=4){
            System.out.println("Hi" + i);

           int j=1;
            while(j<=3){
                System.out.println("Hello" + j);
                j++;
            }
            i++;
        }

        

        

        int i = 5;

        do{

            System.out.println("Hi "+ i);

        }while(i<=4); 

        for(int i =1;i<=5;i++){
            System.out.println("Day " + i);
            for(int j = 1; j <= 9; j++){
                System.out.println("  " + (j+8) + " - " + (j+9));
            }
        }
        */
             
    }
}

        
            

