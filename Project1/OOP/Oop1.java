package OOP;
class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class AdvCalc extends Calc{ // here we are inheriting Calc (parent)

    public int mult(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }
}


class VeryAdvCal extends AdvCalc{ // inheriting from AdvCalc so all features will come from AdvCal and Cal will be avaliable..

    public double pow(int a, int b){
        return Math.pow(a,b);
    }
}



// this type is call multi-level inheritence... Calc <- AdvCal <- VeryAdcCal
public class Oop1 {
    
    public static void main(String [] args){
        //Inheritance...


        VeryAdvCal obj = new VeryAdvCal();

        int r1 = obj.add(4,5);
        int r2 = obj.sub(6,5);
        int r3 = obj.mult(3,6);
        int r4 = obj.div(9,3);
        double r5 = obj.pow(5,2);

        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);


    }
}


// this and super

/* super will works even if u wont call the method in subclass..

class A{
    // we all know even if we wont not create constructor it was present.

    public A(){
        super(); // irrespective of class it will be there on each constructor..
        // Every class in java extends Object class super(); will call the object class constructor..
        sout.("in A");
    }
    public A(int n){
        sout.("in A int");
    }
}

class B extends A{

    // super(); when if we are not mentioned it will be present.. it will call constructor of super class..
    public B(){
        sout.("in B");
    }
    public B(int n){
        super(); // it will be present in every constructor class.. here A()
        super(n); it will call parameterized superclass constructor. here A(int n)

        this(); // this will execute constructor of same class.. 
        sout.("in B int");
    }

}

in main(){
    new B(); it will call B constructor as well as A() also because we have super() method on top of the B constructor.
}

*/

/*

method overloading
{
 same class as same methos with parameters or different return data types. 
 //Java chooses the version at compile time based on the arguments.

    int add(int a, int b)          { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c)   { return a + b + c; }

}
method overriding

here we are calling different class with same method name:
//Java chooses the version at runtime based on the actual object type.

super class as add();
subclass as add();

if we are creating a object of subclass it will override superclass method..

*/
