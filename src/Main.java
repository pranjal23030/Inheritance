import model.Children;
import model.Hobby;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hobby h1 = new Hobby("Swimming", "LongTerm");
        Hobby h2 = new Hobby("Playing Cricket", "ShortTerm");
        Hobby h3 = new Hobby("Simping Taylor", "LongTerm");
        Hobby h4 = new Hobby("Watching movies", "LongTerm");
        Hobby h5 = new Hobby("Playing video games", "ShortTerm");
        Hobby h6 = new Hobby("Reading novels", "ShortTerm");

        ArrayList<Hobby> hobby1 = new ArrayList<>();
        hobby1.add(h1);
        hobby1.add(h2);
        hobby1.add(h3);

        ArrayList<Hobby> hobby2 = new ArrayList<>();
        hobby2.add(h4);
        hobby2.add(h5);
        hobby2.add(h6);

        Children c1 = new Children("Pranjal", "A", 18, hobby1);
        Children c2 = new Children("Sangita", "B", 17, hobby2);

        System.out.println(c1.getFullName());
        c1.getHobby();


    }
}