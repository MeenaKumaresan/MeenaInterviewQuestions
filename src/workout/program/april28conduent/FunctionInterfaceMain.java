package workout.program.april28conduent;

public class FunctionInterfaceMain {
    public static void main(String[] args) {
        FunctionalInterfaceDemo demo = (int x,int y) ->{
            System.out.println("output"+ x*x);
        };
        demo.calculate(2,2);
    }
}
