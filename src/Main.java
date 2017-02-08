

import java.util.Scanner;

class Main {
    private static final Scanner in = new Scanner(System.in);

    private static final String equilateral = "Equilateral";
    private static final String isosceles = "Isosceles";
    private static final String scalene = "Scalene";


    public static void main(String[] args) {
        System.out.println(triangleType());
    }

    private static String triangleType(){
        String input;
        System.out.println("Insert 3 values separated by coma and press enter: ");
        input = in.nextLine();
        if(!input.contains(","))return "Use comas!";
        String [] numbers = input.split(",");

        int side1 = Integer.parseInt(numbers[0]);
        int side2 = Integer.parseInt(numbers[1]);
        int side3 = Integer.parseInt(numbers[2]);

        if((side1 < 0 || side2 < 0 || side3 < 0)||(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1))
            return "Value of the sides are invalid";
        if (numbers.length > 3)return "You entered too many numbers!";

        System.out.println("The numbers are: " + numbers[0] + ',' + numbers[1] +',' + numbers[2]);

        if ((side1 == side2) && (side2== side3)) return equilateral;
        if (side1 == side2 || side1 == side3 || side2 == side3) return isosceles;

         return scalene;
    }

}
