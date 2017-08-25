package exercises.Shape;

public class Square extends Shape {

    //fields
    private String name;
    private Double length;
    private Double width;
    private String type = "Square";
    private int numberOfSides = 4;

    //constructors
    //main
    public Square (String name, Double length, Double width) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.type = "Square";
        this.numberOfSides = 4;
    }

    //no name
    public Square (Double length, Double width) {
        this.name = "Square";
        this.length = length;
        this.width = width;
        this.type = "Square";
        this.numberOfSides = 4;
    }

    //getters
    public String getName() {
        return name;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
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

    public void setLength(Double aLength) {
        this.length = aLength;
    }

    public void setWidth(Double aWidth) {
        this.width = aWidth;
    }

    //methods

    //area
    public Double getArea() {
        Double area = length * width;
        return area;
    }

    //perimeter
    public Double getPerimeter() {
        Double perimeter = (length * 2) + (width *2);
        return perimeter;
    }

    //isSquare
    public Boolean isSquare() {
        return length == width;
    }

}
