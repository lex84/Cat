package com.game.tictactoe;



import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Buttons {

	   
	   private JButton btn[][];
	  IconButton iconButton;
	  
	public Buttons() {
		// TODO Auto-generated constructor stub
		btn = new JButton[3][3];
		createButton();   
	
	}
	public void createButton()
	{
		for(int r=0; r<3; r++)
			for(int c=0; c<3; c++)
				setBtn(new JButton(),r,c);
	}
	public void resetButton()
	{
		for(int r=0; r<3; r++){
			for(int c=0; c<3; c++){
				imageButton(btn[r][c],null);
				colorButton(btn[r][c],null);
			}
		}
	}
	//Insert image button
	public void imageButton(JButton btnTemp,ImageIcon icon )
	{
		btnTemp.setIcon(icon);
	}
	public void colorButton(JButton btnTemp, Color color)
	{
		btnTemp.setBackground(color);
	}
	/**
	 * @return the btn
	 */
	public JButton getBtn(int r, int c) {
		return btn[r][c];
	}
	/**
	 * @param btn the btn to set
	 */
	public void setBtn(JButton  btnTemp,int r,int c) {
		this.btn[r][c] = btnTemp;
	}
	    
}
