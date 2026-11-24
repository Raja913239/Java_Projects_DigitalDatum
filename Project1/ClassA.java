public class ClassA {

    public static void main(String [] args){

        int num1 = 5;
        int num2 = 10;
        Calculator cal = new Calculator();

        int res = cal.add(num1,num2);

        System.out.println(res);

    }

}


class Calculator{

    public int add(int n1, int n2){

        return n1+n2;
    }
}
