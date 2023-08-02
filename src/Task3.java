import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Task3 extends JFrame {
public static void main(String[] args) throws Exception{
    Task3 window = new Task3();
}
class Canvas extends JPanel{
    public Canvas(){
        setPreferredSize(new Dimension(720, 720));
    }

@Override
public void paint(Graphics g){
    g.drawRect(10, 10, 35, 35);

}



}
private Task3(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Canvas canvas = new Canvas();
    this.setContentPane(canvas);
    this.pack();
    this.setVisible(true);

}
}
