import java.util.*;
public class Point implements Comparable<Point>{
    double x;
    double y;

    public Point (double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public int compareTo(Point b){
        if (this.x == b.x){
            return 0;
        }
        return this.x>b.x?1:-1;
    }
    public static Point[] sortPoint(Point[] a){
        MergeSort.mergeSort(a);
        return a;
    } 
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
    
    public double angle(){
        return Math.atan2(this.x, this.y);
    }
    public static Point [] collinearPoints(Point[] a){
        List<Point> temp = new ArrayList<Point>();
        for (int i = 0; i < a.length-1;i++){
            if (a[i].angle() == a[i+1].angle()){
                temp.add(a[i]);
                temp.add(a[i+1]);
            }
            break;
        }
        Point[] lineSegment = new Point[temp.size()];
        lineSegment = temp.toArray(lineSegment);
        return lineSegment;
    }
    public static Double[] anglesArray(Point[] a){
        Double[] angles = new Double[a.length];
        for (int i = 0; i < a.length;i++){
            angles[i] = a[i].angle(); 
        }
        return angles;
    }




}