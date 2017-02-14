import java.util.Scanner;

/**
 * Created by CosticaTeodor on 14/02/2017.
 */
public class Triangle {
    private static final Scanner in = new Scanner(System.in);

    private static final String equilateral = "Equilateral";
    private static final String isosceles = "Isosceles";
    private static final String scalene = "Scalene";

    public static String triangleType(){
        String input;
        System.out.println("Insert 3 values separated by coma and press enter: ");
        input = in.nextLine();
        if(!input.contains(","))return "Use comas!";
        String [] numbers = input.split(",");

        if(!isNumeric(numbers[0]) || !isNumeric(numbers[1]) || !isNumeric(numbers[2]))
            return "Input only numbers please!";

        int side1 = Integer.parseInt(numbers[0]);
        int side2 = Integer.parseInt(numbers[1]);
        int side3 = Integer.parseInt(numbers[2]);
        if((side1 < 0 || side2 < 0 || side3 < 0))
            return "Value of the sides are invalid";
        if (numbers.length > 3)return "You entered too many numbers!";

        System.out.println("The numbers are: " + numbers[0] + ',' + numbers[1] +',' + numbers[2]);

        if (!((side1 + side2 > side3) || (side1 + side3 > side2) || (side2 + side3 > side1)))
        return "Not a triangle";
        if ((side1 == side2) && (side2== side3)) return equilateral;
        if (side1 == side2 || side1 == side3 || side2 == side3) return isosceles;

        return scalene;
    }

    private static boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }



}
