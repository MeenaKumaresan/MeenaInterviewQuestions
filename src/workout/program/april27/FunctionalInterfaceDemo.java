package workout.program.april27;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
      // FunctionInterfaceExample demo =new FunctionImpl();
       //demo.workout.test();
        FunctionInterfaceExample demo=(x)-> x + x;
        System.out.println(demo.test(2));
//        if(demo.workout.test()){
//            System.out.println("success");
//        } else {
//            System.out.println("failure");
//        }
    }
}
