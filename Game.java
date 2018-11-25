



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

//implementing ActionListener interface
public class Game extends JFrame implements ActionListener{
	
	//Declaring variables
	static Date d;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;  
	private boolean flag=false;
	private int count=0;
	private static  String option="";
    private JPanel p1;
	JMenuItem game_inst,ng1, about_us;
	private JMenu ng , inst ,about_company;
    static  String n1,n2; 
    //Getting names of players
    public static void name(){
    	n1=JOptionPane.showInputDialog(null,"Enter 1st Player's Name","",1);
    	if(n1==null || n1=="" || n1.isEmpty()){
    		n1="0";
    		JOptionPane.showMessageDialog(null,"Default name for 1st Player is \"0\"");
    	}	   
    	n2=JOptionPane.showInputDialog(null,"Enter 2nd Player's Name","",1);
    	if(n2==null || n2=="" || n2.isEmpty()){
			 n2="X"; 
			 JOptionPane.showMessageDialog(null,"Default name for 2nd Player is \"X\"");
		}
	}    
	  
    //Adding game board and buttons in Constructor     
    public Game(){  
  
	     setLayout(new BorderLayout());
	    
		 //Adding grid and buttons on it
	     ng1=new JMenuItem("New Game begins");
	     ng = new JMenu("NEW GAME");
		 inst=new JMenu("INSTRUCTIONS");
		 about_company=new JMenu("ABOUT");
		 
		 game_inst = new JMenuItem(new AbstractAction("How to Play") {
			    public void actionPerformed(ActionEvent e) {
			    	JOptionPane.showMessageDialog(null,"Please select your player and choose turn one by one.\n"
			    			+ "Try to make a sequence of your type in a row : \n Horizontally, Vertically or Diagonally");
			    }
		});
		 
		 about_us = new JMenuItem(new AbstractAction("Developers") {
			    public void actionPerformed(ActionEvent e) {
			    	JOptionPane.showMessageDialog(null,"Group Project By: \n"
			    			+ " Navdeep Kaur \n Supreet Singh \n Shivam Pandey \n Saptrashi Goswami ");
			    }
		});
		 ng.add(ng1);
		 inst.add(game_inst);
		 about_company.add(about_us);
		 JMenuBar bar=new JMenuBar();
		 bar.add(ng);
		 bar.add(inst);
		 bar.add(about_company);	
		 setJMenuBar(bar);
		 ng1.addActionListener(this);
		
		 
	     p1=new JPanel();
	     p1.setLayout(new GridLayout(3,3));
	 
	     b1=new JButton("");
	     
	     b2=new JButton("");  
	     
	     b3=new JButton("");
	     
	     b4=new JButton("");
	     
	     b5=new JButton("");   
	
	     b6=new JButton("");
	
	     b7=new JButton("");
	
	     b8=new JButton("");
	
	     b9=new JButton("");
	
	
	     p1.add(b1);
	
	     p1.add(b2);
	
	     p1.add(b3);
	
	     p1.add(b4);
	
	     p1.add(b5);
	
	     p1.add(b6);
	
	     p1.add(b7);
	
	     p1.add(b8);
	
	     p1.add(b9);
	     
	    //adding current button to action listener 
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    b4.addActionListener(this);             
	    b5.addActionListener(this);             
	    b6.addActionListener(this);
	    b7.addActionListener(this);
	    b8.addActionListener(this);
	    b9.addActionListener(this);
	
	    this.add(p1,BorderLayout.CENTER);
	
	    setSize(400,300);
	    setVisible(true);
	    setTitle("GAME BEGINS");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
    }

    // defining action listener on button click
    public void actionPerformed(ActionEvent ae){
      
		if(ae.getSource()==ng1){
	        new Game();
	        dispose();
	        flag = false;
	     }
	     count++; 
	    if(count==1 || count==3 || count==5 || count==7 || count==9){
	        option="0";
	     }else if(count==2 || count==4 || count==6 || count==8 || count==10){
	         option="X";
	     }
	              	
	     if(ae.getSource()==b1){
			b1.setText(option);
			b1.setFont(new Font("Arial", Font.BOLD, 18));
	        b1.setEnabled(false);
	     }else if(ae.getSource()==b2){
			b2.setText(option);
			b2.setFont(new Font("Arial", Font.BOLD, 18));
	        b2.setEnabled(false);
		}else if(ae.getSource()==b3){
			b3.setText(option);
			b3.setFont(new Font("Arial", Font.BOLD, 18));
	        b3.setEnabled(false);
		}else if(ae.getSource()==b4){
			 b4.setText(option);
			 b4.setFont(new Font("Arial", Font.BOLD, 18));
			 b4.setEnabled(false);
		}else if(ae.getSource()==b5){
	         b5.setText(option);
	         b5.setFont(new Font("Arial", Font.BOLD, 18));
	         b5.setEnabled(false);
		}else if(ae.getSource()==b6){
	         b6.setText(option);
	         b6.setFont(new Font("Arial", Font.BOLD, 18));
	         b6.setEnabled(false);
		}else if(ae.getSource()==b7){
			 b7.setText(option);
			 b7.setFont(new Font("Arial", Font.BOLD, 18));
			 b7.setEnabled(false);
		}else if(ae.getSource()==b8){
			 b8.setText(option);
			 b8.setFont(new Font("Arial", Font.BOLD, 18));
			 b8.setEnabled(false);
		}else if(ae.getSource()==b9){
			 b9.setText(option);
			 b9.setFont(new Font("Arial", Font.BOLD, 18));
	         b9.setEnabled(false);
	}	
	         
	     if(b1.getText()==b2.getText() && b2.getText()==b3.getText() && b1.getText() !=""){
	    	 flag=true;
	     }
	     else if(b4.getText()==b5.getText() && b5.getText()==b6.getText() && b4.getText() !=""){
	    	 flag=true;
	     }else if(b7.getText()==b8.getText() && b8.getText()==b9.getText() && b7.getText() !=""){
	    	 flag=true;
	     }
	     else if(b1.getText()==b4.getText() && b4.getText()==b7.getText() && b1.getText() !=""){
	    	 flag=true;
	     }
	     else if(b2.getText()==b5.getText() && b5.getText()==b8.getText() && b2.getText() !=""){
	    	 flag=true;
	     }
	     else if(b3.getText()==b6.getText() && b6.getText()==b9.getText() && b3.getText() !=""){
	    	 flag=true;
	     }
	     else if(b1.getText()==b5.getText() && b5.getText()==b9.getText() && b1.getText() !=""){
	    	 flag=true;
	     }else if(b3.getText()==b5.getText() && b5.getText()==b7.getText() && b3.getText() !=""){
	    	 flag=true;
	     }
	     else{
	    	 flag=false;
	     }
	
	
	     if(flag==true&&count>=5){ // check for if one player won
			if(option.equals("0"))
			option= n1;
			else
			option=n2;
			JOptionPane.showMessageDialog(null, option +" Won..!! :)");
			// using getComponents to update all J buttons on panel
			Component[] com= p1.getComponents();
			for(int a=0;a<com.length;a++){
			   com[a].setEnabled(false);
			}
			flag = false;
			count = 0;
			JOptionPane.showMessageDialog(null, "Thank you " + n1+ " and " + n2 + " for playing");
	     }else if(count == 9 && flag==false){ //check for match draw
	    	 JOptionPane.showMessageDialog(null," Match Draw..!");
	    	 JOptionPane.showMessageDialog(null, "Thank you " + n1+ " and " + n2 + " for playing");
	    	 Component[] com= p1.getComponents();
			 for(int a=0;a<com.length;a++){
			    com[a].setEnabled(false);
			  }
	     }
}



	public static void main(String ar[]){
		d=new Date();
		JOptionPane.showMessageDialog(null,"Welcome to the Game..!! :)");
		// Calling static name method to enter name
		Game.name();
		int n3= JOptionPane.showConfirmDialog(null,"Do you want to change your name???");{
			if(n3==JOptionPane.YES_OPTION){
				Game.name();
			}
			//Creating object of Game class
			Game g=new Game();
			System.out.println("the date is"+d);
		}
	} 
}
