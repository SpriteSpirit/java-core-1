//import arrays_.ArraysPart1;
//import arrays_.ArraysPart2;
import methods_.Methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Methods.task1(1990);
        Methods.task2(2024, 1);

        int value = 33;

        Methods.changeValue(value);
        System.out.println("Значение в главном методе: " + value);

        Integer value2 = 33;

        Methods.changeValue2(value2);
        System.out.println("Значение в главном методе: " + value2);

        Integer[] value3 = {3, 4};

        Methods.changeValue3(value3);
        System.out.println("Значение в главном методе: " + Arrays.toString(value3));

        Integer[] value4 = {3, 4};

        Methods.changeValue4(value4);
        System.out.println("Значение в главном методе: " + Arrays.toString(value4));
    }
}