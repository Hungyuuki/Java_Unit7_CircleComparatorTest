package com.company;

import com.company.Shape.Circle;
import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[2] = new Circle();
        circles[1] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleRadiusComparator = new CircleRadiusComparator();
        Comparator circleColorComparator = new CircleColorComparator();
//        Arrays.sort(circles);
//        Arrays.sort(circles, circleRadiusComparator);
        Arrays.sort(circles, circleColorComparator);


        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

    }
}
