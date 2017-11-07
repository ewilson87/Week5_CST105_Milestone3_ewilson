/**
 * Program: NFL Draft Final Project - NFL Manager class
 * File: Manager.java 
 * Summary: The NFL Player manager class for the project.
 * Author: Evan W Wilson 
 * Date: November 5, 2017
 **/
package draftfinalproject;

//import ArrayList
import java.util.ArrayList;

public class Manager {

    //declare and initialize ArrayList<>
    ArrayList<NFLPlayer> availablePlayers = new ArrayList<>();

    //Method to create players based on int x constructor
    public void createPlayers(int x) {
        for (int cnt = 0; cnt < x; cnt++) {

            //creates new NFLPlayer
            NFLPlayer player = new NFLPlayer();

            //sets random first name
            String[] randomFirstNames = new String[]{"Billy", "Javier", "Archie", "Buck", "Neville", "Doyle", "Christopher",
                "Harrison", "Ernie", "Marcus"};
            String randomFirstName = randomFirstNames[(int) Math.floor(Math.random() * randomFirstNames.length)];
            player.setFirstName(randomFirstName);

            //sets random last name
            String[] randomLastNames = new String[]{"Johnson", "Huskins", "Linhart", "Matson", "Madriz", "Newcombe", "Fender",
                "Brown", "Gleason", "Campo"};
            String randomLastName = randomLastNames[(int) Math.floor(Math.random() * randomLastNames.length)];
            player.setLastName(randomLastName);

            //sets random position
            String[] randomPositions = new String[]{"Center", "Offensive Guard", "Offensive Tackle", "Quarterback", "Running Back",
                "Wide Receiver", "Tight End", "Defensive Tacker", "Defensive End", "Line Backer", "Cornerback", "Safety", "Kicker"};
            String position = randomPositions[(int) Math.floor(Math.random() * randomPositions.length)];
            player.setPosition(position);

            //sets random height
            int randomHeight = (int) ((Math.random() * 25) + 60);
            player.setHeight(randomHeight);

            //sets random weight
            int randomWeight = (int) ((Math.random() * 200) + 160);
            player.setWeight(randomWeight);

            //sets random age
            int randomAge = (int) (Math.random() * 3) + 20;
            player.setAge(randomAge);

            //sets random 40 yard dash time
            double randomDash40 = (((Math.random() * 4) + 4));
            double roundDash40 = Math.round(randomDash40 * 100.0) / 100.0;
            player.setDash40(roundDash40);

            //sets random college
            String[] randomColleges = new String[]{"Oregon", "Ohio State", "Washington", "Arizona", "Alabama",
                "Penn State", "Iowa State", "Georgia", "Kansas State", "Michigan"};
            String randomCollege = randomColleges[(int) Math.floor(Math.random() * randomColleges.length)];
            player.setCollege(randomCollege);

            //creates 20% chance player has a history of injuries
            int randomInjury = (int) (Math.random() * 5);
            if (randomInjury == 0) {
                String injury = "Player has a history of injuries.";
                player.setInjury(injury);
            } else {
                String injury = "Player has no history of injuries.";
                player.setInjury(injury);
            }

            //sets player college experience
            player.setExperience(randomAge);

            //sets BMI
            player.setBMI(randomWeight, randomHeight);

            //adds player to available players ArrayList
            availablePlayers.add(player);

        }
    }

    //method to print all players using NFLPlayer class toString()
    public void printAllPlayers() {
        //loop to call players from availablePlayers ArrayList
        NFLPlayer playerX;
        for (NFLPlayer availablePlayer : availablePlayers) {
            playerX = availablePlayer;
            System.out.println(playerX);
            System.out.println("----------------------------------");
        }
    }

    //method to print specific player using NFLPlayer class toString()
    public void printSpecificPlayer(int x) {
        NFLPlayer playerX = availablePlayers.get(x);
        System.out.println(playerX);
        System.out.println("----------------------------------");

    }

}
