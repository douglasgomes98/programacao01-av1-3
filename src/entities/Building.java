/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;


public class Building {

    private String color;
    private Integer totalDoors;
    private Integer totalFloors;
    private ArrayList<Door> doors = new ArrayList<>();

    public Building(String color, int totalDoors, int totalFloors) {
        this.color = color;
        this.totalDoors = totalDoors;
        this.totalFloors = totalFloors;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public int balanceDoorOpened() {
        int opened = 0;

        for (Door door : doors) {
            if (door.isOpened()) {
                opened += 1;
            }
        }

        return opened;
    }

    public void addDoor(Door door) {
        doors.add(door);
    }

    public int balanceDoors() {
        return doors.size() ;
    }

    public void addFloor(int floor) {
        totalFloors += floor;
    }

    public int balanceFloors() {
        return totalFloors;
    }
}
