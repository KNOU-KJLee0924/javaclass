package lecture4;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public enum Color {
        RED, BLACK, WHITE, BLUE
    }

    public static void main(String[] args) {
        List<Color> colors = new ArrayList<Color>();
        for(Color color : Color.values()){
            System.out.println(color);
        }

        if (getColor(2) == Color.WHITE) {
            System.out.println("WHITE");
        }
        try {
            for (int i = 0; i < 12; i++) {
                int r = SecureRandom.getInstance("SHA1PRNG").nextInt(4);
                System.out.println(r + " Random Color = " + getColor(r));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static Color getColor(int n) {
        Supplier<Color> supplier = () -> Color.values()[n];
        return switch (n) {
            case 0 -> Color.RED;
            case 1 -> Color.BLUE;
            case 2 -> Color.WHITE;
            default -> Color.BLACK;
        };

    }
}
