package workout.java8practise;

public class FInterfaceExample {
    public static void main(String[] args){
        FunInterface total = new FunInterface() {
            @Override
            public int multiply(int a, int b) {
                return a*b;
            }
        };
        System.out.println(total.multiply(4,5));
//        FunInterface total = (a,b)->(a*b);
//        System.out.println(total.multiply(2,3));
    }
}
