import java.util.Random;

public class Cuckoo extends Bird {

    public Cuckoo(){}

    public void sing() {
        Random r = new Random();
        String out = "";

        for (int i = 0; i < r.nextInt(10) + 1; i++)
            out += "ку-ку ";

        System.out.println(out.trim());
    }
}