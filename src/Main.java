import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Main {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		JButton quit = new JButton("quit");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			};
		});

		
		JButton Choose = new JButton("Choose Battle");
		
		JButton Musso = new JButton("Mussolini Fight");
		
		
		
		JButton Hit = new JButton("Hitler Fight");
		JButton Nos = new JButton("Nosferatu Fight");
		
		
		Choose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.remove(quit);
				frame.add(Musso);
				frame.add(Hit);
				frame.add(Nos);
				frame.remove(Choose);
				frame.revalidate();
				frame.validate();
				frame.repaint();
			};
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.add(quit);
		frame.add(Choose);
		frame.setVisible(true);
		
		
	}
}
