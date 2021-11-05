public class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;


        if (!isGreenLight) {
            System.out.println(countLost(speedOfPlayer1, speedOfPlayer2, speedOfPlayer3));
        }
    }
    public static int countLost(int ...speeds){
        int counter = 0;
        for (int i=0;  i < speeds.length; i++) {
            if (speeds[i] > 0){
                counter++;
            }
        }
        return counter;
    }
}