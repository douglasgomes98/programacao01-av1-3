/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class House {

	private String color;
	private final Door door1;
	private final Door door2;
	private final Door door3;

	public House(String color, Door door1, Door door2, Door door3) {
		this.color = color;
		this.door1 = door1;
		this.door2 = door2;
		this.door3 = door3;
	}

	public void changeColor(String color) {
		this.color = color;
	}

	public int balanceDoorOpened() {
		int opened = 0;
		opened += door1.isOpened() ? 1 : 0;
		opened += door2.isOpened() ? 1 : 0;
		opened += door3.isOpened() ? 1 : 0;

		return opened;
	}

	public int balanceDoors() {
		return 3;
	}

}
