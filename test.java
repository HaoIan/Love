
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class App {

    JFrame frame = new JFrame(":D");
    JLabel text = new JLabel("Do you love me?");
    JLabel image = new JLabel();
    JButton yes = new JButton("Yes");
    JButton no = new JButton("No");
    Random random = new Random();

    App() {
        text.setFont(new Font("Arial", Font.PLAIN, 50));
        text.setBounds(90, 50, 500, 50);

        image.setIcon(new ImageIcon(new ImageIcon("C:/Users/B78937/Downloads/8801442.png").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
        image.setBounds(75, 50, 300, 300);

        yes.setSize(75, 30);
        yes.setFocusable(false);
        yes.setLocation(150, 300);
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("I love you too bebe.");
                text.setBounds(45, 50, 500, 55);
                frame.remove(yes);
                frame.remove(no);

                frame.repaint();
            }
        });

        no.setSize(75, 30);
        no.setFocusable(false);
        no.setLocation(275, 300);
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveButton(no);
            }
        });

        frame.add(yes);
        frame.add(no);
        frame.add(text);
        frame.add(image);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void moveButton(JButton button) {
        int x = random.nextInt(400);
        int y = random.nextInt(400);

        button.setLocation(x, y);

        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        new App();
    }

}
