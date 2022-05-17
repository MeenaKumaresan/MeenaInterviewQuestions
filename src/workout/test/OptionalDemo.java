package workout.test;

import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] input= new String[10];
        Optional<String> check = Optional.ofNullable(input[5]);
        if(check.isPresent()){
            String s = input[5].toLowerCase(Locale.ROOT);

        }else{
            System.out.println("word is null");

        }
    }
}
