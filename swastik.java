import java.util.*;
import javax.swing.*;
import java.awt.*;

public class swastik extends JComponent {
 

        public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;    
        int cx = getSize().width / 2;
        int cy = getSize().height / 2;
        System.out.println(cx + " " + cy);
        g2.translate(cx, cy);
        System.out.println(cx + " cy=" + cy);
        System.out.println("Enter angel");
        Scanner input = new Scanner(System.in);
        float dg = input.nextFloat();
        g2.rotate(dg * Math.PI / 180);
        System.out.println("Enter a number partn one line");
        int pr = input.nextInt();
        System.out.println("Enter a patern print char");
        char pt = input.next().charAt(0);
        System.out.println("Enter degry for roted");

        System.out.println("Enter Scpace");
        int space = 4;

        int row = (pr * 3) + (space * 2);   // this is a formula creat by me for swastik program 

        int col = row;
        System.out.println(row);
        System.out.println(col);
        int x = -cx * 3 / 4;
        int y = cy / 4;
        x = -cx / 2;
        y = -cy / 2;
        for (int li = 1; li <= row; li++) {
            for (int colum = 1; colum <= col; colum++) {
                if (li > pr + space && li <= pr + pr + space) {
                    g.drawString("A", x, y);
                    x = x + 12;

                } else if (colum <= pr && li < pr + pr + space) {
                    g.drawString(pt+"", x, y);
                    x = x + 12;

                } else if (colum > pr + space && colum <= (pr + pr + space)) {
                    g.drawString(pt+ "", x, y);
                    x = x + 12;

                } else if (li > pr + pr + space && colum > (pr + space) * 2 && colum <= (pr + space) * 2 + pr) {
                    g.drawString(pt + "", x, y);
                    x = x + 12;

                } else if (li <= pr && colum > pr + pr + space) {
                    g.drawString(pt + "", x, y);
                    x = x + 12;

                } else if (li > (pr + space) * 2 && colum <= pr + space) {
                    g.drawString(pt + "", x, y);
                    x = x + 12;

                } else {
                    System.out.print(" ");
                    x = x + 12;

                }
            }
            y = y + 12;
            
            x = -cx / 2;
        }
        // System.out.println("Enter angel");
        // float dg = input.nextFloat();
        // g2.rotate(dg * Math.PI / 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.add(new swastik(), BorderLayout.CENTER);
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}