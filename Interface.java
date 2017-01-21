import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface extends JFrame implements ActionListener {
		ImageIcon[] dieImage = new ImageIcon[6];
		JButton [] die = new JButton[5];
	    JButton rollBtn = new JButton("Roll");
	    JButton exit = new JButton ("Exit");
	    
	    int value;

	    public Interface() {
	    	super("Yatzy");
			setSize(1080,720);
			this.setExtendedState(JFrame.MAXIMIZED_BOTH);
			setUndecorated(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			Container yatzyBackground = getContentPane();
			yatzyBackground.setBackground(Color.red);
			FlowLayout flowManager = new FlowLayout ();
			yatzyBackground.setLayout(flowManager);
			
			for (int i = 0; i < die.length; i++) {
				die[i] = new JButton();
				yatzyBackground.add(die[i]);
				die[i].addActionListener(this);
				yatzyBackground.add(die[i]);
			}
	        rollBtn.addActionListener(this);
			rollBtn.setBackground(Color.yellow);
			exit.addActionListener(this);
			yatzyBackground.add(rollBtn);
			yatzyBackground.add(exit);
	        setContentPane(yatzyBackground);
	        
	        for (int i = 0; i < dieImage.length; i++) {
	    		dieImage[i] = new ImageIcon("die" + i + ".png");
	    	}
	        
	        
	        
	    }
	    public void rollDice() {
	    	for (int i = 0; i < die.length; i++) {
	    		value = (int) Math.ceil(Math.random() * 6);
	    		die[i].setIcon(dieImage[value]);
	    	}}
	    
		public void actionPerformed(ActionEvent buttonClick) {
			if (buttonClick.getSource() == rollBtn) {
				rollDice();
				
				}
			if(buttonClick.getSource() == exit){
				System.exit(0);
			}
		}
}
