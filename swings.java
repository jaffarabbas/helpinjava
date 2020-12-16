import java.awt.event.*;
import javax.swing.*;
public class swings {
	public static void main(String[] args) {
		JFrame f = new JFrame(); //creating instance of JFrame

		JButton b = new JButton(new ImageIcon("C:\\Users\\gamap\\OneDrive\\Desktop\\loginbutton.png"));   //creating instance of JButton
		final JTextField fl = new JTextField();
		fl.setBounds(50, 50, 150, 20);
		b.setBounds(100, 200, 200, 100); //x axis, y axis, width, height
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fl.setText("JAffar abbas");
			}
		});
		f.add(b);//adding button in JFrame
		f.add(fl);
		f.setSize(400, 500); //400 width and 500 height
		f.setLayout(null);//using no layout managers
		f.setVisible(true);//making the frame visible
	}
}