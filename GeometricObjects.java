/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.geometricobjects;

/**
 *
 * @author bryce
 */
 
 public class GeometricObjects {

    // method that sums the areas of geometric objects in an array
    public static double sumArea(GeometricObject[] a){
        double totalArea = 0.0;
        for (GeometricObject obj : a) {
            if (obj != null) {
                totalArea += obj.getArea();
            }
        }
        return totalArea;
    }

    public static void main(String[] args) {
        // creating 2 circles and  rectangles
        GeometricObject[] objects = new GeometricObject[4];
        
        // Adding 2 Circle objects
        objects[0] = new Circle(4.0); 
        objects[1] = new Circle(5.5); 
        
        // Adding 2 Rectangle objects
        objects[2] = new Rectangle(3.0, 6.0); 
        objects[3] = new Rectangle(2.5, 5.0); 
        
        // Computing and printing the total area of all objects
        double totalArea = sumArea(objects);
        System.out.printf("Total area of all geometric objects: %.2f\n", totalArea);
    }
}

 interface GeometricObject {
    double getArea();  
}
 class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; 
    }
}
 class Rectangle implements GeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height; 
    }
}


