package com.company;

import com.company.Shape.Circle;

import java.util.Comparator;

public class CircleColorComparator  implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        return c1.getColor().compareTo(c2.getColor());
    }
}
