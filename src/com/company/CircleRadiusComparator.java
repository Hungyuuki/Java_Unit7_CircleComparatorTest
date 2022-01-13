package com.company;

import com.company.Shape.Circle;

import java.util.Comparator;

public class CircleRadiusComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        if (c1.getRadius() < c2.getRadius()) return  1;
        else if (c1.getRadius() > c2.getRadius()) return -1;
        else return 0;
    }
}
