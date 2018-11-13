package post.it;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        PostIt note1 = new PostIt();
        note1.backgroundColor = "orange";
        note1.text = "Idea 1";
        note1.textColor = Color.BLUE;

        PostIt note2 = new PostIt();
        note2.backgroundColor = "pink";
        note2.text = "Awesome";
        note2.textColor = Color.BLACK;

        PostIt note3 = new PostIt();
        note3.backgroundColor = "yellow";
        note3.text = "Superb";
        note3.textColor = Color.GREEN;

        PostIt cetli = new PostIt("pink", "Good  morning", Color.BLACK);
        System.out.println(cetli.backgroundColor);
    }
}
