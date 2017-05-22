import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by galym on 10.05.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Инициализация массива
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        //изменение исходного массива
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        //Вывод на экран значений массива
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
