package OOP;
class Human{

    private int age;
    private String name;

    public Human(){ // default Constructor
        System.out.println("This is default constructor");
        age = 12;
        name = "Ras";
        
    }

    public Human(int a, String n){ // Parameterized Constructor
        System.out.println("Parameterized Constructor..");
        age = a;
        name = n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }


}


public class EncDemo {
    public static void main(String [] args){

        Human obj = new Human();
        Human obj1 = new Human(19,"Rjj");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        // obj.setAge(45);
        // obj.setName("Raj");

        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
