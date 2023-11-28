package day8_ternaris_swith;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber = 2;

        /*
        if (floorNumber >= 1 && floorNumber <= 3){
            // apartmanda sadece 3 kat var
            if (floorNumber == 1){
                System.out.println("Floor 1 selected,companies:lobby,verizon,starbucks ");
            }else if(floorNumber == 2){
                System.out.println("Floor 2 selected,companies: cydeo,NASA,Intelsat");
            }else {
                System.out.println("Floor 3 selected,companies: Lyft,Bofa,Stake,house");
            }

        }else {
            //invalid floor
            System.out.println("Invalid floor");
        }

         */

        String result = "Invalid floor";
        if (floorNumber >= 1 && floorNumber <= 3){
            result = "Floor" + floorNumber + " selected,companies: ";
            if (floorNumber == 1){
                result += "lobby,verizon,starbucks";
            }else if(floorNumber == 2){
                result += "cydeo,NASA,Intelsat";
            }else {
                result += "Lyft,Bofa,Stake,house";
            }
        }
        System.out.println(result);



    }
}
