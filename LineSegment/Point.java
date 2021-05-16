import java.util.*;
public class Point implements Comparable<Point>{
    double x;
    double y;

    public Point (double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public int compareTo(Point b){
        if (this.angle() == b.angle()){
            return 0;
        }
        return this.angle()>b.angle()?1:-1;
    }
    public static Point[] sortPoint(Point[] a){
        MergeSort.mergeSort(a);
        return a;
    } 
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
    
    public double angle(){
        double angle = Math.atan2(this.x, this.y)*180/Math.PI;
        long roundedAngles = Math.round(angle);
        return (double) roundedAngles;
    }
    public boolean equalTo (Point b){
        boolean equals = false;
        if(this.angle() == b.angle()){
            equals = true;
        }
        return equals;
    }
    public static Point[] collinearPoints(Point[] a){
        List<Point> temp = new ArrayList<Point>();
        for (int i = 0; i < a.length-1;i++){
            if(a[i].equalTo(a[i+1])){
                temp.add(a[i]);
                temp.add(a[i+1]);            
            }
        }
        Point[] simpArray = new Point[temp.size()];
        simpArray = temp.toArray(simpArray);
        return simpArray;
    }
    public static Double[] anglesArray(Point[] a){
        Double[] angles = new Double[a.length];
        for (int i = 0; i < a.length;i++){
            angles[i] = a[i].angle(); 
        }
        return angles;
    }




}