import java.util.Random;
public class generate {
    public static Point [] generateArray(int n){
        Random rand = new Random();
        Point[] pointList = new Point[n-1];
        for(int i = 0 ; i < pointList.length; i++){
            pointList[i] = new Point((double)rand.nextInt(100), (double)rand.nextInt(100));
        }
        return pointList;
    }
}
