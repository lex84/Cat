package com.game.tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListerner {

	private Buttons button;
	private Play play;
	
	public MyListerner(Buttons btn, Play play) {
		// TODO Auto-generated constructor stub
		this.button = btn;
		this.play = play;
		listerner();
	}
	public void listerner()
	{
		button.getBtn00().addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn00(),0,0);
	         }
	     });
		
		button.getBtn01().addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn01(),0,1);
	         }
	     });
		button.getBtn02().addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn02(),0,2);
	         }
	     });
		button.getBtn10().addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn10(),1,0);
	         }
	     });
		button.getBtn11().addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn11(),1,1);
	         }
	     });
		button.getBtn12().addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn12(),1,2);
	         }
	     });
		button.getBtn20().addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn20(),2,0);
	         }
	     });
		button.getBtn21().addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn21(),2,1);
	         }
	     });
		button.getBtn22().addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn22(),2,2);
	         }
	     });
		
		
	}

}
