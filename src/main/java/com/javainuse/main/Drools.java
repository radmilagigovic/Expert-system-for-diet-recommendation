package com.javainuse.main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.javainuse.model.Ishrana;
//import com.sample.Test;
import com.javainuse.model.BodyMassIndex;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
public class Drools {
private JFrame frame;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField txtPreporukaIshrane;


public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Drools window = new Drools();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}


public Drools() {
	initialize();
}

private void initialize() {
	frame = new JFrame();
	frame.getContentPane().setBackground(SystemColor.info);
	frame.setBounds(100, 100, 1139, 696);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setBackground(SystemColor.text);
	comboBox.setFont(new Font("Times New Roman", Font.BOLD, 11));
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"ne treniram", "4 i vise puta nedeljno", "1-3 puta nedeljno"}));
	comboBox.setBounds(250, 122, 182, 45);
	frame.getContentPane().add(comboBox);
	
	JComboBox comboBox_1 = new JComboBox();
	comboBox_1.setBackground(SystemColor.text);
	comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
	comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "mrsavljenje", "odrzavanje", "dobijanje misicne mase", "dobijanje telesne mase"}));
	comboBox_1.setBounds(250, 178, 182, 45);
	frame.getContentPane().add(comboBox_1);
	
	JComboBox comboBox_2 = new JComboBox();
	comboBox_2.setBackground(SystemColor.text);
	comboBox_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
	comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "muski", "zenski"}));
	comboBox_2.setBounds(250, 234, 182, 45);
	frame.getContentPane().add(comboBox_2);
	
	JComboBox comboBox_3 = new JComboBox();
	comboBox_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
	comboBox_3.setBackground(SystemColor.text);
	comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Da", "Ne"}));
	comboBox_3.setBounds(250, 289, 182, 45);
	frame.getContentPane().add(comboBox_3);
	
	JComboBox comboBox_4 = new JComboBox();
	comboBox_4.setBackground(SystemColor.text);
	comboBox_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
	comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Hormonski disbalans", "Dijabetes", "nemam", "povisen holesterol"}));
	comboBox_4.setBounds(250, 345, 182, 45);
	frame.getContentPane().add(comboBox_4);
	
	
	JComboBox comboBox_5 = new JComboBox();
	comboBox_5.setBackground(SystemColor.text);
	comboBox_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
	comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46"})); //bmi
	comboBox_5.setBounds(692, 105, 182, 45);
	frame.getContentPane().add(comboBox_5);
	
	
	JComboBox comboBox_7 = new JComboBox();
	comboBox_7.setBackground(SystemColor.text);
	comboBox_7.setFont(new Font("Times New Roman", Font.BOLD, 11));
	comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80"})); //godine
	comboBox_7.setBounds(692, 161, 182, 45);
	frame.getContentPane().add(comboBox_7);
	
	JComboBox comboBox_8 = new JComboBox();
	comboBox_8.setBackground(SystemColor.text);
	comboBox_8.setFont(new Font("Times New Roman", Font.BOLD, 11));
	comboBox_8.setModel(new DefaultComboBoxModel(new String[] { "0-999", "1000-5000"}));  //kalorije
	comboBox_8.setBounds(305, 401, 127, 45);
	frame.getContentPane().add(comboBox_8);
	
	
	JLabel lblNewLabel = new JLabel("Trening");
	lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblNewLabel.setBounds(32, 131, 74, 38);
	frame.getContentPane().add(lblNewLabel);
			
			
	JLabel lblNewLabel_2 = new JLabel("Cilj promene ishrane");
	lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblNewLabel_2.setBounds(32, 179, 178, 38);
	frame.getContentPane().add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("Pol");
	lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblNewLabel_3.setBounds(32, 235, 149, 38);
	frame.getContentPane().add(lblNewLabel_3);
	
	JLabel lblNewLabel_4 = new JLabel("Problem sa uobrocavanjem");
	lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblNewLabel_4.setBounds(32, 290, 231, 38);
	frame.getContentPane().add(lblNewLabel_4);
	
	JLabel lblNewLabel_5 = new JLabel("Zdravstveni problem");
	lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblNewLabel_5.setBounds(32, 346, 193, 38);
	frame.getContentPane().add(lblNewLabel_5);
	
	JLabel lblNewLabel_6 = new JLabel("BMI");
	lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblNewLabel_6.setBounds(575, 112, 149, 38);
	frame.getContentPane().add(lblNewLabel_6);
	
	JLabel lblNewLabel_7 = new JLabel("Godine");
	lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblNewLabel_7.setBounds(575, 161, 149, 38);
	frame.getContentPane().add(lblNewLabel_7);
	
	JLabel lblNewLabel_8 = new JLabel("Koliko dnevno unoste kalorija:");
	lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblNewLabel_8.setBounds(32, 417, 256, 38);
	frame.getContentPane().add(lblNewLabel_8);
	
			
	JButton btnNewButton = new JButton("SUBMIT");
	
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		String trening=comboBox.getSelectedItem().toString();
		String ciljPromeneIshrane=comboBox_1.getSelectedItem().toString();
		String pol=comboBox_2.getSelectedItem().toString();
		String problemSaUobrocavanjem=comboBox_3.getSelectedItem().toString();
		String zdravstveniProblem=comboBox_4.getSelectedItem().toString();
		String bmi=comboBox_5.getSelectedItem().toString();
		String godine=comboBox_7.getSelectedItem().toString();
		String kalorije=comboBox_8.getSelectedItem().toString();
		
	

//public static final void main(String[] args) {
    try {
       
        KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
    	
    	BodyMassIndex bmi1 = new BodyMassIndex();
    	bmi1.setGodine(26);
    	bmi1.setBmi(14);
       
    	Ishrana i1  = new Ishrana();
    	i1.setCiljPromeneIshrane("");
    	i1.setKalorije(1500);
    	i1.setPol("");
    	i1.setProblemSaUobrocavanjem("");
    	i1.setTrening("");
    	i1.setZdravstveniProblem("");
    	
       kSession.insert(bmi1);
        kSession.insert(i1);
        
        kSession.fireAllRules();
        
        //System.out.println("---- " + bmi1.getBodyMassIndex());
       // System.out.println("----Preporuka: " + i1.getIshrana());
        textField_1.setText(bmi1.getBodyMassIndex());
        textField_2.setText("Preporuka: " +  i1.getIshrana() );
        
        
    } catch (Throwable t) {
        t.printStackTrace();
    }
}
});
	
	btnNewButton.setBounds(803, 511, 266, 57);
	btnNewButton.setBackground(new Color(240, 255, 240));
	btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
	frame.getContentPane().add(btnNewButton);
	
	textField_1 = new JTextField();
	textField_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
		});
	
	textField_1 = new JTextField();
	textField_1.setBounds(492, 290, 562, 45);
	frame.getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	JLabel lblNewLabel_9 = new JLabel("Stanje tela i preporuka ishrane na osnovu unetih parametara:");
	lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 23));
	lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_9.setBounds(48, 42, 1021, 45);
	frame.getContentPane().add(lblNewLabel_9);
	
	textField_2 = new JTextField();
	textField_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
		});
	textField_2 = new JTextField();
	textField_2.setBounds(32, 549, 535, 38);
	frame.getContentPane().add(textField_2);
	textField_2.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Stanje tela:");
	lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
	lblNewLabel_1.setBounds(492, 235, 196, 38);
	frame.getContentPane().add(lblNewLabel_1);
	
	txtPreporukaIshrane = new JTextField();
	txtPreporukaIshrane.setFont(new Font("Times New Roman", Font.BOLD, 13));
	txtPreporukaIshrane.setHorizontalAlignment(SwingConstants.CENTER);
	txtPreporukaIshrane.setText("Preporuka ishrane:");
	txtPreporukaIshrane.setBounds(32, 511, 127, 20);
	frame.getContentPane().add(txtPreporukaIshrane);
	txtPreporukaIshrane.setColumns(10);
	
}
}



