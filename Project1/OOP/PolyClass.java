package OOP;


// Polymorphism..  is main behaviours..
// two types  compile time (Early binding), Run time (Late binding)
//  // method overloading is part of Complie time.
// method overriding is a part of Run time.
// In Dynamic Method dispatch we can have a clear idea about Overloading and Overriding..
//---------------------------
/*
Dynamic Method dispatch

Reference of Super class and Object of subclass

    A obj = new B(); 
    // here A is Super class and obj is reference of Super class and we are creating Object of Sub class..
    first thing is A is reference and obj is reference type and also obj is implementation is B class.
    so we will get

class A{
    public void show(){
        System.out.println("A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("B Show");
    }
}

class C extends A{
    public void show(){
        System.out.println("C show");
    }
}

public class PolyClass {

    public static void main(String [] args){

        // A obj = new B();
        // obj.show(); here Obj is reference of A and implements of B class so  it will call B class Methods..

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    
    }
}

*/



// class Pa{

//     static void show(){
//         System.out.println("Parent"); 
//     }
// }
// class Ch extends Pa{

//     static void show(){
//         System.out.println("Child");
//     }

// }

// {
//     in main();

//     Pa obj = new Ch();
//     obj.show(); // for static method it will only call reference type not object type..
//   answer is Parent not child..
// }



// Final Key word...  we can use final key word for Variables, Methods and Class..
/*

for Variable we can use like this way..

final int a = 99;
a = 100; // it wont change because we used final keyword here.. it will be complie time error
if we have a constant value final makes best practice in coding...

For Class

class Cal{
    p.vshow(){
        Sout("Show");
    }
}
class AdCal extends Cal{ //here inheritence will work..
}


final class Cal{
    p.vshow(){
        Sout("Show");
    }
}
class AdCal extends Cal{ // here no inheritence work.. we can not inherit from final classes 
}


For Method final
class Cal{
    p.vshow(){
        Sout("Show");
    }
}
class AdCal extends Cal{ //here inheritence will work..
    p.v.show(){
        Sout("new show"); 
    }
}

class Cal{
    public final void show(){ show() method is final no one can use this method after inheritance..
        Sout("Show");
    }
}
class AdCal extends Cal{ //here inheritence will work..
    p.v.show(){
        Sout("new show"); // error for show() method because it is final method we can't override it..
    }
}

*/
