package day18_garbageCollection.pizza;

public class Pizza {


    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    //calculates the total price of the pizza, returns it as double
    public double calcCost() {
        double totalPrice = 0;

        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            default:
                System.out.println("Invalid size: " + size);

        }

        return totalPrice;
    }


    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;


    }



   // @Override
    public String toString() { // eger bu method bomisa konsolha rakam yazidu
                               // buningdek --day18_garbageCollection.Pizza@6acbcfc0
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price" + calcCost() +
                '}';
    }




}






/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping
			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
 */