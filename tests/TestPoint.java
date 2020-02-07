package fr.cnam.tp1_2.tests;

import fr.cnam.tp2.point.Point;

public class TestPoint {

    public static void main(String args[]){

        Point p1;
        p1= new Point(1,0);
        System.out.println("p1 before translation="+p1);
        p1.translate(-1,1);
        System.out.println("p1 after translation="+p1);
    }
}
