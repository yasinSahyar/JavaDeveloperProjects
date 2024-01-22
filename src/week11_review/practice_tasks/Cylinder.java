package week11_review.practice_tasks;

public class Cylinder extends Shape implements Volume {

    private double height, radius;

    public Cylinder(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcVolume(){
        return Math.PI * getRadius() * getRadius() * getHeight();
    }

    @Override
    public double calcArea() {
        return 2 * Math.PI * getRadius() * getHeight() + (2 * Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public double calcPerimeter() {
        return (2 * Math.PI * getRadius()) + 2 * getHeight();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a cylinder with the radius of " +getRadius() +", and the height of " + getHeight());
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", volume= '" +calcVolume() +"'}");
    }


}

/*
2.4 Cylinder:
    Attributes:
        height, radius

    Actions:
        calcArea() -> 2 * PI * radius * height + (2 * PI * pow(radius, 2))
        calcPerimeter() -> (2 * radius) + (2 * height)
        calcVolume() -> PI * radius * radius * height

 */
