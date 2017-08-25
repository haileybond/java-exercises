package exercises.Shape;

public class Circle {

    //fields
    private String name;
    private Double diameter;
    private Double radius;
    private String type = "Circle";
    private int numberOfSides = 1;

    //constructor
    public Circle(String name, Double diameter, Double radius) {
        this.name = name;
        this.diameter = diameter;
        this.radius = radius;
        this.type = "Circle";
        this.numberOfSides = 1;
    }

    //no name
    public Circle(Double diameter, Double radius) {
        this.name = "Circle";
        this.diameter = diameter;
        this.radius = radius;
        this.type = "Circle";
        this.numberOfSides = 1;
    }

    //no diameter
    public Circle(String name, Double radius) {
        this.name = name;
        this.diameter = radius * 2;
        this.radius = radius;
        this.type = "Circle";
        this.numberOfSides = 1;
    }

    //getters
    public String getName() {
        return name;
    }

    public Double getDiameter() {
        return diameter;
    }

    public Double getRadius() {
        return radius;
    }

    public String getType() {
        return type;
    }

    public Integer getNumberOfSides() {
        return numberOfSides;
    }

    //setters

    public void setName(String aName) {
        this.name = aName;
    }

    public void setRadius(Double aRadius) {
        this.radius = aRadius;
    }

    public void setDiameter(Double aDiameter) {
        this.diameter = aDiameter;
    }

    //methods

    //area
    public Double areaOf() {
        Double area = 3.14 * (radius * radius);
        return area;
    }

    //circumference
    public Double areaOf() {
        Double circumference = 2 * 3.14 * radius;
    }
}
