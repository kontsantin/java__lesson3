/*Задача 3. Длина слов
Реализуйте метод, который принимает на вход массив строк и возвращает
новый массив, содержащий только строки, длина которых больше 3 символов.
Пример:
["cat", "elephant", "dog", "giraffe"]
Результат:
["elephant", "giraffe"] */

import java.util.ArrayList;

import java.util.Arrays;



class FilterStrings {
    public static String[] filterShortStrings(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 3) {
                list.add(arr[i]);
            }  

        }
        return list.toArray(new String[0]);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        String[] arr;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new String[] { "cat", "elephant", "dog", "giraffe" };
        } else {
            arr = args[0].split(", ");
        }
        FilterStrings answer = new FilterStrings();
        String itresume_res = Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}
