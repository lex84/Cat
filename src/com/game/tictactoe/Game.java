package com.game.tictactoe;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Game extends JPanel {

	GridLayout gridSpaceGame;
	Buttons buttons;
	Play play ;
	MyListerner listen;;
	JFrame frame;
	IconButton icone;
	CatMatrix catMatrix;
	public static final int ROW=3, COLUMN=3, INIT=0;
	public static boolean pcON= false;
	public static int count=0;

	public Game() {
		// TODO Auto-generated constructor stub
   		 frame =new JFrame("Tic Tac Toe ");
		 catMatrix = new CatMatrix();	
		 icone =new  IconButton();
		 gridSpaceGame = new GridLayout();
		 buttons = new Buttons();
		 addButtons();
		 createWindow();
		 play = new Play(buttons,catMatrix, this,frame);
		 listen = new MyListerner(buttons, play);
		 switchPC();
	}
	public void switchPC()
	{
		count=0;
		int opt=0;
		 do{
			 String temp=JOptionPane.showInputDialog("Type 1 for one player \n Type 2 for two Players\n Type 3 for Exit");
			 try {
				 opt = Integer.parseInt(temp);
				 if(opt==3)
					 System.exit(0);
				} catch (NumberFormatException nfe){}
			  
		 }while(opt!=1 && opt!=2);
		 
		 if(opt==1){
			 count=0;
			 pcON=true;				
		 }
	}
	
	public void createWindow()
	{
		    
		    frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
	        frame.setSize(300, 300);
	        frame.add(this,BorderLayout.CENTER);  
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public void addButtons()
	{
		
		this.setLayout(new GridLayout(ROW,COLUMN,3,3));
		this.add(buttons.getBtn(0,0));
		this.add(buttons.getBtn(0,1));
		this.add(buttons.getBtn(0,2));
		    
		this.add(buttons.getBtn(1,0));
		this.add(buttons.getBtn(1,1));
		this.add(buttons.getBtn(1,2));
		    
		this.add(buttons.getBtn(2,0));
		this.add(buttons.getBtn(2,1));
		this.add(buttons.getBtn(2,2));
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Game();
	}

}
