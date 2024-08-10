package arrays_;

import java.util.Arrays;

public class ArraysPart1 {

    public static void task1() {
        //       ### Задание 1
        //        Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        //        На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        //        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        //        Не забудьте выполнить переход на новую строку между двумя циклами.
        //        В результате программы вывод должен получиться следующий:
        //        1 2 3 4 5 6 7 8 9 10
        //        10 9 8 7 6 5 4 3 2 1

        int i = 0;

        while (i < 10) {
            i++;

            if (i != 10) {
                System.out.print(i + " ");
            } else {
                System.out.println(i);
            }
        }

        while (i > 0) {
            if (i != 1) {
                System.out.print(i + " ");
            } else {
                System.out.println(i);
            }

            i--;
        }
    }

    public static void task2() {
        //        ### Задание 2
        //        В вашей компании пятница является днем отчетным. Нужно написать программу, которая считает дни месяца
        //        по датам, определяет, какой день пятница, и выводит сообщение с напоминанием о том, что нужно подготовить еженедельный отчет.
        //        Условия задачи:
        //        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        //        "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        //        В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.

        int friday = 5;
        int month = 31;

        for (int i = 1; i <= month; i++) {
            if (i == friday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                friday += 7;
            }
        }
    }

    public static void task3() {
        // Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно
        // будет увидеть. Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей
        // каждый 79-й год, начиная с нулевого.
        // Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее
        // в следующий раз.
        // Нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        // Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего
        // (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        // В результате решения задачи в консоль должен вывестись следующий результат: 1896, 1975, 2054

        int eachCometYear = 79;
        int nowYear = 2024;
        int beforeNowYear = nowYear - 200;
        int afterNowYear = nowYear + 100;

        for (int i = 0; i <= afterNowYear; i += eachCometYear) {
            if (i >= beforeNowYear) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        /*
        ## 1 задача
        Объявите три массива:
        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания
        массива: с помощью ключевого слова или сразу заполненный элементами.

        ## 2 задача
        Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
        через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        ## 3 задача
        Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента
        массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива
        располагаются на одной строчке, а элементы другого массива – на другой.
        Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        ### 4 задача
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        Распечатайте результат преобразования в консоль.
        */

        int[] numbers = {1, 2, 3};
        float[] floatNumbers = new float[]{1.57f, 7.654f, 9.986f};
        char[] characters = new char[3];
        characters[0] = '!';
        characters[1] = 'd';
        characters[2] = '#';

        String[] names;
        names = new String[2];
        names[0] = "Alice";
        names[1] = "Bob";

        int count = 0;

        System.out.println(Arrays.toString(numbers) + "\n" + Arrays.toString(floatNumbers) + "\n" +
                Arrays.toString(characters) + "\n" + Arrays.toString(names));

        for (int number : numbers) {
            if (count < numbers.length - 1) {
                System.out.print(number + ", ");
            } else {
                System.out.println(number);
            }
            count++;
        }

        count = 0;

        for (float num : floatNumbers) {
            if (count < floatNumbers.length - 1) {
                System.out.print(num + ", ");
            } else {
                System.out.println(num);
            }
            count++;
        }

        count = 0;

        for (char character : characters) {
            if (count < floatNumbers.length - 1) {
                System.out.print(character + ", ");
            } else {
                System.out.println(character);
            }
            count++;
        }

        count = 0;

        for (String name : names) {
            if (count < names.length - 1) {
                System.out.print(name + ", ");
            } else {
                System.out.println(name);
            }
            count++;
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i]);
            }
        }

        for (int i = floatNumbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(floatNumbers[i] + ", ");
            } else {
                System.out.println(floatNumbers[i]);
            }
        }

        for (int i = characters.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(characters[i] + ", ");
            } else {
                System.out.println(characters[i]);
            }
        }

        for (int i = names.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(names[i] + ", ");
            } else {
                System.out.println(names[i]);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
