package com.game.tictactoe;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Game extends JPanel {

	GridLayout gridSpaceGame;
	Buttons buttons;
	Play play ;
	MyListerner listen;
	
	JFrame frame;
	IconButton icone;
	CatMatrix catMatrix;
	public static final int ROW=3, COLUMN=3, INIT=0;

	public Game() {
		// TODO Auto-generated constructor stub
		catMatrix = new CatMatrix();	
		icone =new  IconButton();
		 gridSpaceGame = new GridLayout();
		 buttons = new Buttons();
		 addButtons();
		 createWindow();
		 play = new Play(buttons, icone,catMatrix, this);
		 listen = new MyListerner(buttons, play);
		
	}
	
	public void createWindow()
	{
		    frame =new JFrame("Tic Tac Toe ");
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
	public  void refresh()
	{
		this.validate();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Game();
	}

}
