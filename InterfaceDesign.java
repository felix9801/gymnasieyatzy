import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class InterfaceDesign extends JFrame {

	public InterfaceDesign() {
		getContentPane().setBackground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 384);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Roll Dice");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(202, 311, 89, 23);
		getContentPane().add(btnNewButton);
		
		ImageIcon img = new ImageIcon("die1.png");
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(10, 11, 64, 64);
		getContentPane().add(lblNewLabel);
		
		ImageIcon img2 = new ImageIcon("die2.png");
		JLabel lblNewLabel_1 = new JLabel(img2);
		lblNewLabel_1.setBounds(106, 11, 64, 64);
		getContentPane().add(lblNewLabel_1);
		
		ImageIcon img3 = new ImageIcon("die3.png");
		JLabel lblNewLabel_2 = new JLabel(img3);
		lblNewLabel_2.setBounds(202, 11, 64, 64);
		getContentPane().add(lblNewLabel_2);
		
		ImageIcon img4 = new ImageIcon("die4.png");
		JLabel lblNewLabel_3 = new JLabel(img4);
		lblNewLabel_3.setBounds(298, 11, 64, 64);
		getContentPane().add(lblNewLabel_3);
		
		ImageIcon img5 = new ImageIcon("die5.png");
		JLabel lblNewLabel_4 = new JLabel(img5);
		lblNewLabel_4.setBounds(394, 11, 64, 64);
		getContentPane().add(lblNewLabel_4);
		
		setVisible(true);
	}
}
