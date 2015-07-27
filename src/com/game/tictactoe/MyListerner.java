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
		button.getBtn(0, 0).addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn(0,0),0,0);
	         }
	     });
		
		button.getBtn(0,1).addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn(0,1),0,1);
	         }
	     });
		button.getBtn(0,2).addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn(0,2),0,2);
	         }
	     });
		button.getBtn(1,0).addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn(1,0),1,0);
	         }
	     });
		button.getBtn(1,1).addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn(1,1),1,1);
	         }
	     });
		button.getBtn(1,2).addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn(1,2),1,2);;
	         }
	     });
		button.getBtn(2,0).addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn(2,0),2,0);
	         }
	     });
		button.getBtn(2,1).addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn(2,1),2,1);     
	         }
	     });
		button.getBtn(2,2).addActionListener(new ActionListener() {
			 
	         public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
	             play.select(button.getBtn(2,2),2,2);
	         }
	     });
		
		
	}

}
