package week06_loop.pizzaOrderApp;

public class TestPizzaObjects {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.setInfo("small",2,3,4);
        //pizza1.setInfo("java",2,3,4);

        Pizza pizza2 = new Pizza();
        pizza2.setInfo("medium",3,4,3);
        //pizza2.setInfo("python",3,4,3);

        Pizza pizza3 = new Pizza();
        pizza3.setInfo("large",4,5,5);
        //pizza3.setInfo("cucamber",4,5,5);

        pizza1.numberOfCheeseTopping = 10;

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
