
class Mobile{

    String brand;
    int price;
    static String name;

    public Mobile(){ 
        brand = "";
        price = 200;
        System.out.println("Constructor..");
    }
    static{ // static  block will be executed first only one time..
        name = "ohone";
        System.out.println("Static block..");
    }



    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }

    // public static void show1(Mobile obj){
    //     System.out.println(obj.brand+" : "+obj.price+" : "+name); // here we are calling non-static variable with method reference.
    // }
}


public class Demo1 {
    public static void main(String [] args){
        Mobile obj1 = new Mobile();

        // obj1.brand = "Apple";
        // obj1.price = 1233;
        // Mobile.name = "phone";

        obj1.show();

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Googl3";
        // obj2.price = 1300;
        // Mobile.name = "SMphone";

        // //Mobile.name = "hyperphone";

        // obj1.show();
        // obj2.show();
        // Mobile.show1(obj1);

    }
}
