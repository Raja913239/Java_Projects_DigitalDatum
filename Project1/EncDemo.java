class Human{

    private int Age;
    private String Name;

    public Human(){ // default Constructor
        System.out.println("This is default constructor");
        Age = 12;
        Name = "Ras";
        
    }

    public Human(int a, String n){ // Parameterized Constructor
        System.out.println("Parameterized Constructor..");
        Age = a;
        Name = n;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(int a){
        Age = a;
    }
    public String getName(){
        return Name;
    }

    public void setName(String n){
        Name = n;
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
