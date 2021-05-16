import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        Point[] testArray = generate.generateArray(30);
        System.out.println(Arrays.toString(testArray));
        
        Point.sortPoint(testArray);
        System.out.println(Arrays.toString(testArray));
        
        double angleOutput = testArray[0].angle();
        System.out.println(angleOutput);
        
        double angleOutput2 = testArray[1].angle();
        System.out.println(angleOutput2);
        
        System.out.println(Arrays.toString(Point.collinearPoints(testArray)));

        Double[] testAngle = Point.anglesArray(testArray);
        System.out.println(Arrays.toString(testAngle));
        
    }
}
