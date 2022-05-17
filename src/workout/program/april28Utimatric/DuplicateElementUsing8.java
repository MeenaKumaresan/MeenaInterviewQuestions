package workout.program.april28Utimatric;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementUsing8 {
    public static void main(String[] args) {
        List<Integer> inputList= Arrays.asList(1,2,22,2,1);
        Set<Integer> uniqueset = new HashSet<>();
        inputList.stream().filter(x->!uniqueset.add(x)).forEach(x-> System.out.println(x));

    }
}
