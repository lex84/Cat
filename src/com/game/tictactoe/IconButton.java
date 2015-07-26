package com.game.tictactoe;


import javax.swing.ImageIcon;


public class IconButton {
 
	  
	ImageIcon icon0;
	ImageIcon icon1;
	public IconButton() {
		// TODO Auto-generated constructor stub
		
		this.setIcon0(new ImageIcon(IconButton.class.getResource("1.jpg")));
		this.setIcon1(new ImageIcon(IconButton.class.getResource("2.jpg")));
		
	}
	/**
	 * @return the icon0
	 */
	public ImageIcon getIcon0() {
		return icon0;
	}
	/**
	 * @param icon0 the icon0 to set
	 */
	public void setIcon0(ImageIcon icon0) {
		this.icon0 = icon0;
	}
	/**
	 * @return the icon1
	 */
	public ImageIcon getIcon1() {
		return icon1;
	}
	/**
	 * @param icon1 the icon1 to set
	 */
	public void setIcon1(ImageIcon icon1) {
		this.icon1 = icon1;
	}

}
