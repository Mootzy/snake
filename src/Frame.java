import javax.swing.*;

public class Frame extends JFrame {


Frame(){

    this.add(new GamePanel());
    this.setTitle("Tyler's Snake Game");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);

    }














}
