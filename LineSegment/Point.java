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
        return this.x<b.x?-1:1;
    }
    public static Point[] sortPoint(Point[] a){
        MergeSort.mergeSort(a);
        return a;
    } 
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
    
    public double angle(){
        return Math.atan2(this.y, this.x);
    }
    public static Point [] collinearPoints(Point[] a){
        List<Point> temp = new ArrayList<Point>();
        Collections.addAll(temp, a);
        for (int i = 0; i < temp.size();i++){
            while (temp.get(i).angle() == temp.get(i+1).angle()){
                temp.remove(i+1);
            }
        }
        Point[] lineSegment = new Point[temp.size()];
        lineSegment = temp.toArray(lineSegment);
        return lineSegment;
     
    }




}