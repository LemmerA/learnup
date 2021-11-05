public class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 2;
        int speedOfPlayer2 = 2;
        int speedOfPlayer3 = 2;

        System.out.println(countLost(isGreenLight,speedOfPlayer1, speedOfPlayer2, speedOfPlayer3));
    }
    public static int countLost(boolean lightCheck, int ...speeds){
        int counter = 0;
        for (int i=0;  i < speeds.length; i++) {
            if (lightCheck == false && speeds[i] > 0){
                counter++;
            }
        }
        return counter;
    }
}