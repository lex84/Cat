package com.game.tictactoe;

import java.awt.Graphics;
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
	//JPanel panel;
	IconButton icone;
	CatMatrix catMatrix;

	public Game() {
		// TODO Auto-generated constructor stub
		catMatrix = new CatMatrix();	
		icone =new  IconButton();
		 gridSpaceGame = new GridLayout();
		 buttons = new Buttons();
		 createPanel();
		 createWindow();
		 play = new Play(buttons, icone,catMatrix, this);
		 listen = new MyListerner(buttons, play);
		
	}
	
	public void createWindow()
	{
		    frame =new JFrame("Tic Tac Toe ");
	        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
	        frame.setSize(300, 300);
	        frame.add(this);
	        
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public void createPanel()
	{
		//panel= new JPanel();
		this.setLayout(new GridLayout(3,3,3,3));
		
		this.add(buttons.getBtn00());
		this.add(buttons.getBtn01());
		this.add(buttons.getBtn02());
		    
		this.add(buttons.getBtn10());
		this.add(buttons.getBtn11());
		this.add(buttons.getBtn12());
		    
		this.add(buttons.getBtn20());
		this.add(buttons.getBtn21());
		this.add(buttons.getBtn22());
			
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
