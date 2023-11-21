import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double s1 = 1.1;
        System.out.println("(BMW) Автоунаанын бир километринин баасы $ = "+TransportType.BMW.calculateTravelCost(s1));

        double s2 = 2.2;
        System.out.println("(AUDI) Автоунаанын бир километринин баасы $ = "+TransportType.AUDI.calculateTravelCost(s2));

        double s3 = 3.3;
        System.out.println("(FORD) Автоунаанын бир километринин баасы $ = "+TransportType.FORD.calculateTravelCost(s3));

        double s4 = 4.4;
        System.out.println("(HONDA) Автоунаанын бир километринин баасы $ = "+TransportType.HONDA.calculateTravelCost(s4));

        double s5 = 5.5;
        System.out.println("(HYUNDAI) Автоунаанын бир километринин баасы $ = "+TransportType.HYUNDAI.calculateTravelCost(s5));

        double s6 = 6.6;
        System.out.println("(PORSCHE) Автоунаанын бир километринин баасы $ = "+TransportType.PORSCHE.calculateTravelCost(s6));

        double s7 = 7.7;
        System.out.println("(VOLKSWAGEN) Автоунаанын бир километринин баасы $ = "+TransportType.VOLKSWAGEN.calculateTravelCost(s7));
    }
}