import java.util.Objects;

/**
 * Created by ASUS on 04.01.2018.
 */
public class WhileLoopDemo {
    public static void main(String[] args) {
        String [] friends = new String[20];
        friends[0] = "Jahongirmirzo";
        friends[1] = "Shaxzoda";
        friends[2] = "Boburmirzo";
        friends[8] = "Matilda";
        friends[18] = "Muyassar";
        friends[19] = "Muborak";

        int totalLength = friends.length;

        int i = 0;

        while (i < totalLength){
            if (friends[i] == null){
                i++;
                // Go back to check the while expression
                continue;
            }
            System.out.println("I love " +  friends[i]);
            if (!Objects.equals(friends[i], "Matilda")) {
                i++;
            } else {
                break;
            }
        }

        System.out.println("The iteration is over");
    }
}
