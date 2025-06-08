import java.util.*;

public class methodsInJava {
    public static void main(String[] args) {
        /*
        What are methods??
        Methods are blocks of code that perform a repeated action.

        METHOD OVERLOADING:
        In this file, we'll try method overloading and learn more about it!

        What is a method signature?
        A method signature is a unique combo of the following:
        1) Method name
        2) Number of Parameters
        3) Type of Parameters
        4) Order of Parameters
        NOTE: Name of parameters aren't related to uniqueness of method signatures
         */
        System.out.println(getDurationString(1400));
    }

    public static double convertToCentimeters(double inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        double totalInches = (double)(feet * 12 + inches);
        return convertToCentimeters(totalInches);
    }
    public static String getDurationString(int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(hours, minutes, remainingSeconds);
    }
    public static String getDurationString(int hours, int minutes, int seconds){
        String hoursString = hours > 9 ? Integer.toString(hours) : "0" + Integer.toString(hours);
        String minutesString = minutes > 9 ? Integer.toString(minutes) : "0" + Integer.toString(minutes);
        String secondsString = seconds > 9 ? Integer.toString(seconds) : "0" + Integer.toString(seconds);
        return hoursString + "h " + minutesString + "m " + secondsString + "s";
    }
}
