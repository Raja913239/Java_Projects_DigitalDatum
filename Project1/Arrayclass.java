

class Student{
    String name;
    int roll_no;
    int marks;
}

public class Arrayclass{

    public static void main(String [] args){

         //int n [] = {1,2,3,4}; 
       /* int num [] = new int [4];
        num[0] = 10;
        num[1] = 6;
        num[2] = 9;
        num[3] = 3;
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        } 

        // int num [] []  = new int [2] [3]; 2D Array   
        // int num1 [][][] = new int [2][3][4]; 3D Array


        int num [] [] = new int [3][4];

        for(int i = 0; i<3;i++){

            for(int j = 0; j <4; j++){

                num[i][j] = (int)(Math.random()*10);
                System.out.print(num[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        // Enhanced for loop

        for(int n[] : num){

            for(int m : n){

                System.out.print(m+ " ");

            }
            System.out.println();
        }

        // Jagged Array
        int num1 [] [] = new int [3] [];
        num1[0] = new int [3];
        num1[1] = new int [4];
        num1[2] = new int [2];


        for(int i =0; i<num1.length; i++){

            for(int j = 0; j<num1[i].length; j++){

                num1[i][j] = (int)(Math.random()*10);
                

            }
        }

        for(int n[] : num1){

            for(int m : n){

                System.out.print(m+ " ");

            }
            System.out.println();
        }
            

        String str[] = new String[5]; // if not initialized then it will print null..

        for(String s : str){

            System.out.println(s);
        } 

        double num [] = new double [5]; // if not initialized then it will print 0.0
        for(double n : num){

            System.out.println(n);
        } 

        boolean num [] = new boolean [5]; // if not initialized then it will print false
        for(boolean n : num){

            System.out.println(n);
        }

        char num [] = new char [5]; // if not initialized then it will print empty space
        for(char n : num){
            System.out.println(n);
        } 

    Student s1 = new Student();
    s1.name = "Raj";
    s1.roll_no = 1;
    s1.marks = 99;

    Student s2 = new Student();
    s2.name = "Rab";
    s2.roll_no = 2;
    s2.marks = 56;

    Student s3 = new Student();
    s3.name = "Raj";
    s3.roll_no = 1;
    s3.marks = 69;

    Student std[] = new Student[3];
    std[0] = s1;
    std[1] = s2;
    std[2] = s3;


    // for(int i=0;i<std.length;i++){
    //     System.out.println(std[i].name +" : "+ std[i].marks);
    // }
 
    
    // }


    for(Student stud : std){
        System.out.println(stud.name +" : "+ stud.marks);
    }*/
}
}

