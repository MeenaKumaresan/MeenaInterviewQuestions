package workout.designpatternworkout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingeltonBreakingDemo {
    public static  void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, FileNotFoundException, CloneNotSupportedException {
        // SingletonExample orginalSingletonInstance=new SingletonExample();
        LazySingletonExample orginalSingletonInstance = LazySingletonExample.getSysnObject();
        System.out.println("orginalSingletonInstance" + orginalSingletonInstance.hashCode());
        LazySingletonExample duplicateSingletonInstance = LazySingletonExample.getSysnObject();
        System.out.println("orginalSingletonInstance" + orginalSingletonInstance.hashCode());
        EagarSingletonExample orginalEagarSingletonInstance = EagarSingletonExample.getSingletonObject();
        System.out.println("orginalEagarSingletonInstance" + orginalEagarSingletonInstance.hashCode());
        EagarSingletonExample duplicateEagarSingletonInstance = EagarSingletonExample.getSingletonObject();
        System.out.println("duplicateEagarSingletonInstance" + duplicateEagarSingletonInstance.hashCode());

//broken via reflection concept
        Class<?> refSingletonclass = Class.forName("workout.designpatternworkout.LazySingletonExample");
        Constructor<LazySingletonExample> constructor = (Constructor<LazySingletonExample>) refSingletonclass.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingletonExample reflectionBrokenSingletonInstance = constructor.newInstance();
        System.out.println("------------------");
        System.out.println("orginalSingletonInstance" + orginalSingletonInstance.hashCode());
        System.out.println("reflectionBrokenSingletonInstance" + reflectionBrokenSingletonInstance.hashCode());

        //broken via serialization & deserialization
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\fileSerialize.sel"));
        objectOutputStream.writeObject(orginalSingletonInstance);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\fileSerialize.sel"));
        LazySingletonExample brokenSingletonInstanceUsingSerialization= (LazySingletonExample) objectInputStream.readObject();

        System.out.println("------------------");
        System.out.println("orginalSingletonInstance" + orginalSingletonInstance.hashCode());
        System.out.println("reflectionBrokenSingletonInstance" + brokenSingletonInstanceUsingSerialization.hashCode());
        objectInputStream.close();

        //Cloning
        LazySingletonExample brokenSingletonInstanceUsingCloning = (LazySingletonExample) orginalSingletonInstance.clone();
        System.out.println("------------------");
        System.out.println("orginalSingletonInstance" + orginalSingletonInstance.hashCode());
        System.out.println("reflectionBrokenSingletonInstance" + brokenSingletonInstanceUsingCloning.hashCode());

    }
}
