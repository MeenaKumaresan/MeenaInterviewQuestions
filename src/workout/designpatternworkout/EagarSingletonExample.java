package workout.designpatternworkout;

public class EagarSingletonExample {
    private static EagarSingletonExample singletonObject=new EagarSingletonExample();
    private EagarSingletonExample(){

    }
    public  static EagarSingletonExample getSingletonObject(){
        return singletonObject;
    }
}
