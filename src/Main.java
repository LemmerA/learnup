import java.util.Arrays;

import static Game.Funcs.*;

public class Main {
    public static void main(String[] args) {

        int[] speedArr = {5, 0, 2, 5, 1, 2, 5, 0, 2, 5, 1, 2};

        System.out.printf("Количество выбывших: %d \n", countLost(speedArr));
        System.out.println("Скорости выбывших: " + Arrays.toString(lostSpeedArr(speedArr)));
        System.out.println("Скорости выигравших: " + Arrays.toString(wonSpeedArr(speedArr)));
    }

}