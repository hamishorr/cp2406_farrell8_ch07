import java.util.*;

public class BabyName {

    public static void main(String[] args){
        String name;
        Scanner input = new Scanner(System.in);
        ArrayList names = new ArrayList<String>(0);
        for(int i = 0; i < 3; i = i + 1) {
            System.out.println("Enter Name");
            name = input.nextLine();
            names.add(name);
        }


    }

}
