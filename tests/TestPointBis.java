package fr.cnam.tp1_2.tests;

import fr.cnam.tp2.point.Point;

public class TestPointBis {

    public static void main(String args[]){

        Point p1;
        p1= new Point(1,0);
        p1.setX(10);
        System.out.println("P1="+p1);
        System.out.println("Module de p1="+p1.getMod());
    }
}
