import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        Point[] testArray = generate.generateArray(10);
        System.out.println(Arrays.toString(testArray));
        
        Point.sortPoint(testArray);
        System.out.println(Arrays.toString(testArray));
        
        double angleOutput = testArray[0].angle();
        System.out.println(angleOutput);
        
        double angleOutput2 = testArray[1].angle();
        System.out.println(angleOutput2);
        
        Point.collinearPoints(testArray);
        System.out.println(Arrays.toString(testArray));

        Double[] testAngle = Point.anglesArray(testArray);
        System.out.println(Arrays.toString(testAngle));
        
    }
}
