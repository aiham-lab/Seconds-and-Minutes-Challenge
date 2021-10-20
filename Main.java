public class Main {
    public static void main(String[] args) {
        getDurationString(3660);

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value");
            return "Invalid value";
        }
        int hours = minutes / 60;
        int  remainingMin = minutes%60;
        System.out.println(hours + "h " + remainingMin + "m " + seconds + "s");
        return hours + "h " + remainingMin + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if (seconds<0){
            return "Invalid value";
        }
        int minutes=seconds/60;
        int remainingSec =seconds %60;
        System.out.println(minutes + "M " + remainingSec + "S");
        return getDurationString(minutes,remainingSec);

    }
}
