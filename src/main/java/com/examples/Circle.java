package com.examples;

public class Circle {

    /**
     * Calculate and return Circle area
     *
     * @param radius the Circle radius
     * @return the Circle area
     */
    public Double getArea(Double radius) {
        if (radius == null) {
            return null;
        }
        return Math.PI * radius * radius;
    }

    /**
     * Calculate and return Circle radius
     *
     * @param radius the Circle radius
     * @return the Circle length
     */
    public Double getLength(Double radius) {
        if (radius == null) {
            return null;
        }
        return Math.PI * radius * 2;
    }
}
