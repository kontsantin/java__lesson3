/*Задача 2. Уникальные числа
Напишите метод, который принимает целочисленный массив и возвращает
новый массив, содержащий только уникальные элементы из исходного
массива.
Пример:
[1, 2, 2, 3, 4, 4, 5]
Результат:
[1, 2, 3, 4, 5]*/

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class UniqueElements {
    public Integer[] getUniqueElements(Integer[] a) {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(a));
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        return set.toArray(new Integer[set.size()]);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        Integer[] a;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new Integer[] { 1, 2, 2, 3, 4, 4, 5 };
        } else {
            a = (Integer[]) Arrays.stream(args[0].split(",")).map(x -> Integer.valueOf(x)).toArray();
        }
        UniqueElements answer = new UniqueElements();
        String itresume_res = Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
    }
}