/*Задание 1. Удаление отрицательных значений из массива
Реализуйте метод, который принимает на вход целочисленный массив и
удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
только неотрицательные числа.
Пример:
[-1, 2, -3, 4, -5, 6]
Результат:
[2, 4, 6] */

import java.util.ArrayList;
import java.util.Arrays;


class FilterNegative {
    public Integer[] filterNegative(Integer[] a) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }
        return list.toArray(new Integer[list.size()]);        
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        Integer[] a;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new Integer[] { -1, 2, -3, 4, -5, 6 };
        } else {
            a = (Integer[]) Arrays.stream(args[0].split(",")).map(x -> Integer.valueOf(x)).toArray();
        }
        FilterNegative answer = new FilterNegative();
        String itresume_res = Arrays.toString(answer.filterNegative(a));
        System.out.println(itresume_res);
    }
}
