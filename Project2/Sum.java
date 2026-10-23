
public class Sum {
    
    int a;
    int b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

public int calculateSum() {
        return a + b;
    }

    public static void main(String[] args) {
        Sum sum = new Sum(5, 10);
        int result = sum.calculateSum();
        System.out.println("The sum is: " + result);
    }
}
