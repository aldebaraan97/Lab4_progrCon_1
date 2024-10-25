import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        sumOfNumbers();
//        penniesForPay();
//        fileLetterCounter();
//        largestNSmallest();
//        averageRainfall();
//        population();
//        celsiusToF();
//        barChart();
//        upperCaseFileConverter();
//        squareDisplay();


    }

    public static void sumOfNumbers() {
        Scanner input = new Scanner(System.in);
        int userNumber;
        int flag = 0, sum = 0;

        System.out.println("Please type a non-zero integer to get the sum of all the previous integers starting from 1:\n");
        userNumber = input.nextInt();

        while (flag <= userNumber) {
            sum += flag;
            ++flag;
        }
        System.out.println(sum);
    }

    public static void penniesForPay() {
        double totalEarned;
        int daysWorked;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of days worked, value must be >0:\n");
        daysWorked = input.nextInt();
        while (daysWorked < 1) {
            System.out.println("You can't enter a number less than 1. Please enter a valid number.");
            daysWorked = input.nextInt();
        }

        // Create the table
        totalEarned = daysWorked / 100.0;
        System.out.println("Days worked | Total pay");
        System.out.println(daysWorked + "   |   " + totalEarned);
    }

    public static void fileLetterCounter() {
        Scanner input = new Scanner(System.in);
        char charToCount;
        String fileSimulator = "abc bbc aacb";
        int count = 0;

        System.out.println("Please enter the character you want to count:\n");
        charToCount = input.nextLine().charAt(0);

        for (int _char = 0; _char < fileSimulator.length(); _char++) {
            if (charToCount == fileSimulator.charAt(_char)) {
                ++count;
            }
        }
        System.out.println("The character " + charToCount + " appears " + count +
                ((count > 1) ? " times." : " time."));
    }

    public static void largestNSmallest() {
        Scanner input = new Scanner(System.in);
        int largest = 0, smallest = 1, temp;
        boolean flag = true;

        System.out.println("Enter integers to find the smallest and largest. Enter '-99' to stop entering numbers:\n");
        while (flag) {
            temp = input.nextInt();
            flag = input.nextInt() != -99;
            largest = (temp > largest) ? temp : largest;
            smallest = (temp < smallest) ? temp : smallest;
        }
        System.out.println("The largest number is: " + largest + "\n the smallest is: " + smallest);
    }

    // Assignments

    public static void averageRainfall() {
        Scanner input = new Scanner(System.in);
        String monthString = "";
        int years, numMonths;
        double averagePeriod, totalRainfall = 0;

        System.out.println("Enter number of years to analyze:\n");
        years = input.nextInt();

        for (int year = 1; year <= years; year++){
            System.out.println("Year: " + year);
            for (int month = 1; month <= 12; month++){
                switch (month){
                    case 1: monthString = "January";
                    break;
                    case 2: monthString = "February";
                    break;
                    case 3: monthString = "March";
                    break;
                    case 4: monthString = "April";
                    break;
                    case 5: monthString = "May";
                    break;
                    case 6: monthString = "June";
                    break;
                    case 7: monthString = "July";
                    break;
                    case 8: monthString = "August";
                    break;
                    case 9: monthString = "September";
                    break;
                    case 10: monthString = "October";
                    break;
                    case 11: monthString = "November";
                    break;
                    case 12: monthString = "December";
                    break;
                    default : System.out.println("Invalid value.");
                }
                System.out.println("Enter inches of rain for " + monthString);
                totalRainfall += input.nextInt();
            }
        }
        numMonths = years * 12;
        averagePeriod = totalRainfall / numMonths;

        System.out.println("Number of months: " + numMonths +
                "\nTotal inches of rainfall: " + totalRainfall +
                "\nAverage rainfaill per month: " + averagePeriod);
    }

    public static void population() {
        Scanner input = new Scanner(System.in);
        double numOrganisms, avDailyIncrease;
        int daysToMultiply, day = 0;

        System.out.println("Enter number of initial organisms:\n");
        numOrganisms = input.nextDouble();
        System.out.println("Enter average daily population increase (as a percentage):\n");
        avDailyIncrease = input.nextDouble();
        System.out.println("Enter the number of days the organisms will multiply:\n");
        daysToMultiply = input.nextInt();

        while(daysToMultiply > 0 ) {
            if (numOrganisms < 2 || avDailyIncrease < 1)
                System.out.println("""
                        Number of initial organisms must be >2 .
                        Average daily population must be non negative value.
                        Days to multiply must be >= 1.""");
            else {
                System.out.println("Day: " + (++day) + " Population: " + numOrganisms);
                numOrganisms += numOrganisms * avDailyIncrease;
                --daysToMultiply;
            }
        }

    }

    public static void celsiusToF() {
        double fahrenheit;
        System.out.println("Celsius to Fahrenheit table, first 20 degrees:");

        for (int deg = 0; deg <= 20; deg++) {
            fahrenheit = ((9 * deg) / 5.0) + 32;
            System.out.println(deg + "\t" + fahrenheit);
        }
    }

    public static void  barChart() {
        Scanner input = new Scanner(System.in);
        double store1, store2, store3, store4, store5;

        System.out.println("Enter today's sales for store 1: ");
        store1 = input.nextDouble();
        System.out.println("Enter today's sales for store 2: ");
        store2 = input.nextDouble();
        System.out.println("Enter today's sales for store 3: ");
        store3 = input.nextDouble();
        System.out.println("Enter today's sales for store 4: ");
        store4 = input.nextDouble();
        System.out.println("Enter today's sales for store 5: ");
        store5 = input.nextDouble();

        System.out.println("SALES BAR CHART");
        System.out.print("Store 1: ");
        for (int row = 0; row <=1; row++){
            System.out.println("Store 1: " + "*".repeat((int)store1 / 100));
            }
        System.out.print("Store 2: ");
        for (int row = 0; row <=1; row++){
            System.out.println("Store 1: " + "*".repeat((int)store2 / 100));
        }
        System.out.print("Store 3: ");
        for (int row = 0; row <=1; row++){
            System.out.println("Store 1: " + "*".repeat((int)store3 / 100));
        }
        System.out.print("Store 4: ");
        for (int row = 0; row <=1; row++){
            System.out.println("Store 1: " + "*".repeat((int)store4 / 100));
        }
        System.out.print("Store 5: ");
        for (int row = 0; row <=1; row++){
            System.out.println("Store 1: " + "*".repeat((int)store5 / 100));
        }

    }

    public static void upperCaseFileConverter() throws IOException {
        File readFile;
        FileWriter writeFile;
        String readFilePath, writeFilePath;
        Scanner input = new Scanner(System.in), textToUpper;

        System.out.println("Enter the file name for reading: ");

        // save the user input as a string to verify its validity
        readFilePath = input.nextLine();
        // Initialize File object as the file with the name that the user provided
        readFile = new File(readFilePath);
        // We initialize second Scanner object with the file that matches the user input
        textToUpper = new Scanner(readFile);


        System.out.println("Enter the file name for writing: ");

        // Open file with write permissions that matches user input
        writeFilePath = input.nextLine();
        // Initialize File object with user input
        writeFile = new FileWriter(writeFilePath);

        while (textToUpper.hasNext()) {
            String data = textToUpper.nextLine();
            writeFile.write(data.toUpperCase());
            writeFile.close();
        }
    }

    public static void budgetAnalysis() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount tat you have budgeted:");
    }

    public static void squareDisplay() {
        Scanner input = new Scanner(System.in);
        int squareSide;

        System.out.println("Enter a positive integer <= 15: ");
        squareSide = input.nextInt();

        for (int w = 1; w <= squareSide; w++){
            System.out.println("X".repeat(squareSide));
        }

        // Using nested for loop
        for (int w = 1; w <= squareSide; w++) {
            System.out.println();
            for (int l = 1; l <= squareSide; l++)
                System.out.print("X");
        }
    }

    public static void slotMachineSimulation() {
    }
}