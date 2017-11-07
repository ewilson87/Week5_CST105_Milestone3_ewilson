/**
 * Program: NFL Draft Final Project 
 * File: DraftFinalProject.java 
 * Summary: The driver main class for the project. Used for testing purposes while building the project
 * Author: Evan W Wilson 
 * Date: November 5, 2017
 **/

package draftfinalproject;

public class DraftFinalProject {

    public static void main(String[] args) {
        
        //driver for the Manager and NFLPlayer classes. Creates int number of players in constructor
        Manager manager = new Manager();
        manager.createPlayers(10);
        
        //driver to print a specific player at index 0 based in int constructor 
        manager.printSpecificPlayer(0);
        
        //driver to print all players from availablePlayers ArrayList<>
        manager.printAllPlayers();
        
    }

}
