package exercises.Shape;

public class Shape {
    private int numberOfSides;
    private String type;

    /*
    //constructor
    public abstract Shape () {

    }

    //getters

    public int getNumberOfSides() {
        return numberOfSides;
    }

    //setters

    public void setNumberOfSides(int aNumberOfSides) {
        this.numberOfSides = aNumberOfSides;
    }
    */


    //methods - what do all shapes have? types, numberOfSides, area (determined by type)

    /*
    public Boolean isQuadrilateral() {

        if (numberOfSides == 4) {
            type = "Quadrilateral";
            return true;
        } else {
            return false;
        }
    }

    public Boolean isTriangle() {
        if (numberOfSides == 3) {
            type = "Triangle";
            return true;
        } else {
            return false;
        }
    }

    public Boolean isSphere() {
        if (numberOfSides == 1) {
            type = "Sphere";
            return true;
        } else {
            return false;
        }
    }
    */

    public String findType() {
        if (numberOfSides == 1) {
            type = "Sphere";
        }
        if (numberOfSides == 2) {
            type = "Not a valid shape";
        }
        if (numberOfSides == 3) {
            type = "Triangle";
        }
        if (numberOfSides == 4) {
            type = "Quadrilateral";
        }
        if (numberOfSides == 5) {
            type = "Pentagon";
        }
        if (numberOfSides == 6) {
            type = "Hexigon";
        }
        if (numberOfSides >= 7) {
            type = "Other";
        }
        return type;
    }

}
