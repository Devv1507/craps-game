package com.example.crapsgame.models;

/**
 * ChallengesPOE class have the challenges we did in class.
 * @author David Esteban Valencia
 * @version 1.0.0
 */
public class ChallengesFPOE {

    /**
     * It is the student name.
     * @serial
     */
    private String studentName;

    /**
     * To calculate triangle area.
     * @param width: Represents the base of the triangle.
     * @param height: Represents the height of the triangle.
     * @return The triangle area.
     * @throws ArithmeticException Division by 0.
     */
    public double calculateTriangleArea(double width, double height) throws ArithmeticException {
        int divisor = 2;
        return (width*height)/divisor;
    }

    /**
     * To calculate rectangle area.
     * @param width: Represents the base of the rectangle.
     * @param height: Represents the height of the rectangle.
     * @return The rectangle area.
     */
    public double calculateRectangleArea(double width, double height) {
        return width*height;
    }

    /**
     * To print rectangle area in console.
     * @param width: Represents the base of the rectangle.
     * @param height: Represents the height of the rectangle.
     * @see #calculateRectangleArea(double, double)
     * @since 1.0.0
     */
    public void showRectangleArea(double width, double height) {
        System.out.println("The rectangle area is "+ this.calculateRectangleArea(width, height));
    }

}
