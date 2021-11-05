package Game;

public class Funcs {
    public static boolean isGreenLight = false;
    public static int countLost(int ...speeds){
        int counter = 0;
        for (int i=0;  i < speeds.length; i++) {
            if (!isGreenLight && speeds[i] > 0){
                System.out.printf("Игрок %d выбыл \n", i+1);
                counter++;
            }
            else {
                System.out.printf("Игрок %d не выбыл \n", i+1);
            }
        }
        System.out.printf("Количество выбывших: %d \n", counter);
        return counter;
    }
}
