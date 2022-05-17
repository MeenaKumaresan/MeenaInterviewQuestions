package workout.designpatternworkout;

import java.io.Serializable;

public class LazySingletonExample implements Serializable,Cloneable {
    private  static LazySingletonExample singletonInstance;
    private LazySingletonExample() {

    }
//    public static LazySingletonExample getInstance(){
//        if(singletonInstance==null) {
//            synchronized (LazySingletonExample.class){
//                if (singletonInstance == null) {
//                    singletonInstance = new LazySingletonExample();
//                }
//            }
//        }
//
//        return singletonInstance;
//    }

    public synchronized static LazySingletonExample getSysnObject(){
        if (singletonInstance == null) {
            singletonInstance = new LazySingletonExample();
        }
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
