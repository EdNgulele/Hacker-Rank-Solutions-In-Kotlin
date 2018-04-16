package Algorithms.Warmup.Java;

public class TimeConversion {

    public static void main(String[] args) {

        String input = "04:59:59AM";

        System.out.println(timeConversion(input));

    }

    static String timeConversion(String s) {

        String[] time = s.split(":");

        int hour = Integer.parseInt(time[0]);
        String minute = time[1];
        String seconds = time[2].substring(0, 2);

        String convertedTime = " ";

        char format = s.charAt(s.length() - 2);


        if (format == 'A' && hour == 12) {
            hour -= 12;
            convertedTime = "0" + hour + ":" + minute + ":" + seconds;
        } else if (format == 'A' && hour < 10) {
            convertedTime = "0" + hour + ":" + minute + ":" + seconds;
        } else if (format == 'A') {
            convertedTime = hour + ":" + minute + ":" + seconds;
        }

        if (format == 'P' && hour == 12) {
            convertedTime = hour + ":" + minute + ":" + seconds;
        } else if (format == 'P') {
            hour += 12;
            convertedTime = hour + ":" + minute + ":" + seconds;
        }

        return convertedTime;
    }
}
