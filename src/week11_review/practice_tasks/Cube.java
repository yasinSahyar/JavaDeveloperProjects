package week11_review.practice_tasks;

public class Cube extends Shape implements Volume {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calcVolume(){
        return getSide() * getSide() * getSide();
    }

    @Override
    public double calcArea() {
        return 6 * (getSide() * getSide());
    }

    @Override
    public double calcPerimeter() {
        return 12 * getSide();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a cube with the side of " + getSide());
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", volume= '" +calcVolume() +"'}");
    }

}

/*
2.3 Cube:
   				Attributes:
   					side

				Actions:
					calcArea() -> 6 * (side * side)
					calcPerimeter() -> 12 * side
					calcVolume() -> side * side * side

 */
