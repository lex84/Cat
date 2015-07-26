package com.game.tictactoe;



import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Buttons {

	  private JButton btn00;
	  private JButton btn01;
	  private JButton btn02;
	  private JButton btn10;
	  private JButton btn11;
	  private JButton btn12;
	  private JButton btn20;
	  private JButton btn21;
	  private JButton btn22;
	  
	  IconButton iconButton;
	  
	public Buttons() {
		// TODO Auto-generated constructor stub
		   this.setBtn00(new JButton());
		   this.setBtn01(new JButton());
		   this.setBtn02(new JButton());
		   this.setBtn10(new JButton());
		   this.setBtn11(new JButton());
		   this.setBtn12(new JButton());
		   this.setBtn20(new JButton());
		   this.setBtn21(new JButton());
		   this.setBtn22(new JButton());
		  		   
		 
		   
	
	}
	public void resetButton()
	{
		imageButton(this.getBtn00(),null);
		imageButton(this.getBtn01(),null);
		imageButton(this.getBtn02(),null);
		imageButton(this.getBtn10(),null);
		imageButton(this.getBtn11(),null);
		imageButton(this.getBtn12(),null);
		imageButton(this.getBtn20(),null);
		imageButton(this.getBtn21(),null);
		imageButton(this.getBtn22(),null);
		
		colorButton(this.getBtn00(),null);
		colorButton(this.getBtn01(),null);
		colorButton(this.getBtn02(),null);
		colorButton(this.getBtn10(),null);
		colorButton(this.getBtn11(),null);
		colorButton(this.getBtn12(),null);
		colorButton(this.getBtn20(),null);
		colorButton(this.getBtn21(),null);
		colorButton(this.getBtn22(),null);
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
	 * @return the btn00
	 */
	public JButton getBtn00() {
		return btn00;
	}
	/**
	 * @param btn00 the btn00 to set
	 */
	public void setBtn00(JButton btn00) {
		this.btn00 = btn00;
	}
	/**
	 * @return the btn01
	 */
	public JButton getBtn01() {
		return btn01;
	}
	/**
	 * @param btn01 the btn01 to set
	 */
	public void setBtn01(JButton btn01) {
		this.btn01 = btn01;
	}
	/**
	 * @return the btn02
	 */
	public JButton getBtn02() {
		return btn02;
	}
	/**
	 * @param btn02 the btn02 to set
	 */
	public void setBtn02(JButton btn02) {
		this.btn02 = btn02;
	}
	/**
	 * @return the btn10
	 */
	public JButton getBtn10() {
		return btn10;
	}
	/**
	 * @param btn10 the btn10 to set
	 */
	public void setBtn10(JButton btn10) {
		this.btn10 = btn10;
	}
	/**
	 * @return the btn11
	 */
	public JButton getBtn11() {
		return btn11;
	}
	/**
	 * @param btn11 the btn11 to set
	 */
	public void setBtn11(JButton btn11) {
		this.btn11 = btn11;
	}
	/**
	 * @return the btn12
	 */
	public JButton getBtn12() {
		return btn12;
	}
	/**
	 * @param btn12 the btn12 to set
	 */
	public void setBtn12(JButton btn12) {
		this.btn12 = btn12;
	}
	/**
	 * @return the btn20
	 */
	public JButton getBtn20() {
		return btn20;
	}
	/**
	 * @param btn20 the btn20 to set
	 */
	public void setBtn20(JButton btn20) {
		this.btn20 = btn20;
	}
	/**
	 * @return the btn21
	 */
	public JButton getBtn21() {
		return btn21;
	}
	/**
	 * @param btn21 the btn21 to set
	 */
	public void setBtn21(JButton btn21) {
		this.btn21 = btn21;
	}
	/**
	 * @return the btn22
	 */
	public JButton getBtn22() {
		return btn22;
	}
	/**
	 * @param btn22 the btn22 to set
	 */
	public void setBtn22(JButton btn22) {
		this.btn22 = btn22;
	}
    
}
