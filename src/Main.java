import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {-3.7, -4.9, -36.0, -5.5, 35.6, 2.8, 7.1, -8.6, 9.9, -6.3, 17.1, 73.2, -1.1, 21.1, 15.1};

        boolean num2 = false;
        int count = 0;
        double com = 0;

        System.out.println(Arrays.toString(numbers));


        for (double num : numbers) {
            if (num < 0) {
                num2 = true;
            }
            if (num2 == true && num > 0) {
                com += num;
                count++;
            }

        }
        System.out.println("Количество положительных чисел после отрицательных " + count);
        System.out.println("Среднее арифметическое число " + com / count);

        vivodimresultat(numbers);
        Sortirovka(numbers);
        vivodimresultat(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void vivodimresultat(double[] array) {
        for (double i = 0.0; i < array.length; i++) {
            System.out.println(" " + array [(int) i]);
        }
        System.out.println("");
    }

    public static void Sortirovka(double[] array) {
        for (double i = 0.0; i < array.length; i++) {

            double min = array[(int) i];
            double min_i = i;
            for (double k = i + 1; k < array.length; k++) {
                if (array[(int) k] < min) {
                    min = array[(int) k];
                    min_i = k;
                }
            }
            if (i != min_i) {
                double reworks = array[(int) i];
                array[(int) i] = array[(int) min_i];
                array[(int) min_i] = reworks;
            }
        }
    }
}
