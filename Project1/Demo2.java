
class A{

    public A(){
        System.out.println("Objected Created");
    }

    public void show(){
        System.out.println("Methos show in A..");
    }
}


public class Demo2 {
    public static void main(String [] args){

        new A(); // anonymous object.. no reference nd we can't use them again..

        A obj = new A(); // here obj is reference object..
        obj.show();

    }
}


// Naming convenstions...

// for class and interface we use capital letters like Cal, Runnable where we use capital
// for variable and methods we use small letters like name and move()..
// Constants we use all capital PI or PIE, BRAND...


