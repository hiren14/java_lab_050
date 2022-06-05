<h1 align="center" style="margin-top: 0px;">
Practical 4 c 
</h1>

#	4. 	c) AninterfacePolygoncontainingthemembersasgivenbelow:  

-   • float area, floatperimeter 
-   • voidcalcArea();abstract method to calculate area of a particular polygon given  its dimensions <br/>
<br/>
-   • voidcalcPeri();abstract method to calculate perimeter of aparticular <br/>
<br/>
-   • polygon given its dimensions<br /> 
-   • voiddisplay();
method to display theare a and perimeter of the given polygon Create a classSquare that implements Polygon and has the following member: <br/>
-   • floatside 
-   • Square(float s);<br/>
<br/>
-    constructor to initialize side of square 
Create another class Rectangle that implements Polygon and has the following member:
<br/>
<br/>
- • float length, float breadth <br/>
<br/>
• Rectangle(int len, intbre); constructor toinitialize length and breadth of a rectangle Outside the package, create a class that imports the above package and instantiates an object of the Square class and an object of the Rectangle class. Call the above methods on each of the classes to calculate the area and perimeter given the side and the length/breadth of  the Square class and the Rectangle class respectively.

## code 

```java
/**
*   This is a collection of methods we expect and require a polygon to have 
**/
interface Polygon{
    /** @return The number of sides of the Polygon **/
    int getNumberOfSides();
    /** @return The perimeter of the Polygon **/
    double getPerimeter();
}

class Triangle implements Polygon {
    private static int numberOfSides = 3;
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public int getNumberOfSides(){
        return numberOfSides;
    }
    
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}

class Rectangle implements Polygon {
    private static int numberOfSides = 4;
    private double side1;
    private double side2;
    
    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    
    public int getNumberOfSides(){
        return numberOfSides;
    }
    
    public double getPerimeter(){
        return side1 + side1 + side2 + side2;
    }
} 

/**
*    This inherits the properties and methods of its superclass, Rectangle.
**/
class Square extends Rectangle implements Polygon {
    public Square(double side){
        super(side, side);
    }
} 

class Solution{
    public static void print(Polygon p){
        System.out.println( "A " + p.getClass().getSimpleName() + " has " + p.getNumberOfSides() + " sides." );
        System.out.println( "The perimeter of this shape is: " +  p.getPerimeter() + '\n');
    }
    
    public static void main(String[] args) {
        Polygon triangle = new Triangle(1, 2, 3);
        print(triangle);
        
        Polygon rectangle = new Rectangle(2, 3);
        print(rectangle);
        
        Polygon square = new Square(2);
        print(square);
        
    }
}
```
# Output 



![p1a](https://hiren14.github.io/java_lab_050/output/practical4/output4c.png)

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)