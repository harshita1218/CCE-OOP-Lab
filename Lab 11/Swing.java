import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class swing{
    JTextField tf1;
    swing(){
        JFrame f=new JFrame("First Frame");
        f.setSize(100,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l=new JLabel("Hello World");
        tf1=new JTextField(12);
        f.setLayout(null);
        f.add(l);
        f.add(tf1);
    }
}