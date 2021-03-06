package Game;

public class Funcs {
    public static boolean isGreenLight = false;

    public static int countLost(int[] speeds){
        int counter = 0;
        for (int i=0;  i < speeds.length; i++) {
            if (!isGreenLight && speeds[i] > 0){
                counter++;
            }
            else {
            }
        }
        return counter;
    }

    public static int[] lostSpeedArr(int[] speeds){
        int[] lostArr = new int[countLost(speeds)];
        for (int i=0; i < lostArr.length; i++){
            for (int j=i; j < speeds.length; j++){
                if (!isGreenLight && speeds[j] > 0){
                    lostArr[i] = speeds[j];
                    break;
                }
            }
        }
        return lostArr;
    }

    public static int[] wonSpeedArr(int[] speeds){
        int[] wonArr = new int[speeds.length - countLost(speeds)];
        for (int i=0; i < wonArr.length; i++){
            for (int j=i; j < speeds.length; j++){
                if (!isGreenLight && speeds[j] <= 0){
                    wonArr[i] = speeds[j];
                    break;
                }
            }
        }
        return wonArr;
    }
}
