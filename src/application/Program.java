/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Scanner;

import entities.Building;
import entities.Door;
import entities.House;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Door door1, door2, door3, door4, door5, door6;

		// Door class test

		System.out.println("\n");
		System.out.println("Door class test");
		
		System.out.print("Door color: ");
		String color = sc.nextLine();
		System.out.print("dimension x: ");
		Double x = sc.nextDouble();
		System.out.print("dimension y: ");
		Double y = sc.nextDouble();
		System.out.print("dimension z: ");
		Double z = sc.nextDouble();

		door1 = new Door(false, color, x, y, z);
		door1.handleOpen();

		System.out.println("New colors: ");
		door1.changeColor("green");
		System.out.println(door1);
		door1.changeColor("black");
		System.out.println(door1);
		door1.changeColor("gray");
		System.out.println(door1);

		door1.handleClose();

		System.out.println("New dimensios: ");
		System.out.print("dimension x: ");
		door1.setDimensionX(sc.nextDouble());
		System.out.print("dimension y: ");
		door1.setDimensionY(sc.nextDouble());
		System.out.print("dimension z: ");
		door1.setDimensionZ(sc.nextDouble());
		System.out.println(door1);

		System.out.println("Open door: " + door1.isOpened());

		door1 = null;

		// House class test
		sc.nextLine();
		System.out.println("\n");
		System.out.println("House class test");
		
		System.out.print("House color: ");
		String houseColor = sc.nextLine();

		System.out.print("Door1 color: ");
		color = sc.nextLine();
		System.out.print("dimension x: ");
		x = sc.nextDouble();
		System.out.print("dimension y: ");
		y = sc.nextDouble();
		System.out.print("dimension z: ");
		z = sc.nextDouble();

		door1 = new Door(false, color, x, y, z);
		door1.handleOpen();
		sc.nextLine();
		System.out.print("Door2 color: ");
		color = sc.nextLine();
		System.out.print("dimension x: ");
		x = sc.nextDouble();
		System.out.print("dimension y: ");
		y = sc.nextDouble();
		System.out.print("dimension z: ");
		z = sc.nextDouble();

		door2 = new Door(false, color, x, y, z);
		door2.handleClose();

		sc.nextLine();
		System.out.print("Door3 color: ");
		color = sc.nextLine();
		System.out.print("dimension x: ");
		x = sc.nextDouble();
		System.out.print("dimension y: ");
		y = sc.nextDouble();
		System.out.print("dimension z: ");
		z = sc.nextDouble();

		door3 = new Door(false, color, x, y, z);
		door3.handleOpen();

		House house = new House(houseColor, door1, door2, door3);

		System.out.println("Number of open doors: " + house.balanceDoorOpened());
		door1 = null;
		door2 = null;
		door3 = null;

		// Building class test
		sc.nextLine();
		System.out.println("\n");
		System.out.println("Building class test");

		System.out.print("Buiding color: ");
		String buildingColor = sc.nextLine();

		Building building = new Building(buildingColor, 0, 0);

		System.out.print("Door1 color: ");
		color = sc.nextLine();
		System.out.print("dimension x: ");
		x = sc.nextDouble();
		System.out.print("dimension y: ");
		y = sc.nextDouble();
		System.out.print("dimension z: ");
		z = sc.nextDouble();

		door1 = new Door(false, color, x, y, z);
		door1.handleOpen();

		sc.nextLine();
		System.out.print("Door2 color: ");
		color = sc.nextLine();
		System.out.print("dimension x: ");
		x = sc.nextDouble();
		System.out.print("dimension y: ");
		y = sc.nextDouble();
		System.out.print("dimension z: ");
		z = sc.nextDouble();

		door2 = new Door(false, color, x, y, z);
		door2.handleClose();

		sc.nextLine();
		System.out.print("Door3 color: ");
		color = sc.nextLine();
		System.out.print("dimension x: ");
		x = sc.nextDouble();
		System.out.print("dimension y: ");
		y = sc.nextDouble();
		System.out.print("dimension z: ");
		z = sc.nextDouble();

		door3 = new Door(false, color, x, y, z);
		door3.handleOpen();

		sc.nextLine();
		System.out.print("Door4 color: ");
		color = sc.nextLine();
		System.out.print("dimension x: ");
		x = sc.nextDouble();
		System.out.print("dimension y: ");
		y = sc.nextDouble();
		System.out.print("dimension z: ");
		z = sc.nextDouble();

		door4 = new Door(false, color, x, y, z);
		door4.handleClose();

		sc.nextLine();
		System.out.print("Door5 color: ");
		color = sc.nextLine();
		System.out.print("dimension x: ");
		x = sc.nextDouble();
		System.out.print("dimension y: ");
		y = sc.nextDouble();
		System.out.print("dimension z: ");
		z = sc.nextDouble();

		door5 = new Door(false, color, x, y, z);
		door5.handleOpen();

		sc.nextLine();
		System.out.print("Door6 color: ");
		color = sc.nextLine();
		System.out.print("dimension x: ");
		x = sc.nextDouble();
		System.out.print("dimension y: ");
		y = sc.nextDouble();
		System.out.print("dimension z: ");
		z = sc.nextDouble();

		door6 = new Door(false, color, x, y, z);
		door6.handleClose();

		building.addDoor(door1);
		building.addDoor(door2);
		building.addDoor(door3);
		building.addDoor(door4);
		building.addDoor(door5);
		building.addDoor(door6);

		System.out.println("Number of open doors: " + building.balanceDoorOpened());
		System.out.println("Number of doors: " + building.balanceDoors());

		System.out.print("How many floors do you want to add? ");
		building.addFloor(sc.nextInt());

		System.out.println("Total floors: " + building.balanceFloors());

		sc.close();
	}
}
