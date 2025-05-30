/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.footballplayer;

/**
 *
 * @author bryce
 */
public class FootballPlayer {
    private String name;
    private String position;

    public FootballPlayer(String name, String position) {
        this.name = name;
        this.position = position.toLowerCase();
    }

    public void makePlay(String playType) throws InvalidPlayException {
        playType = playType.toLowerCase();

        if (position.equals("offense") && playType.equals("sack")) {
            throw new InvalidPlayException(name + " is an offensive player and cannot sack the QB!");
        } else if (position.equals("defense") && playType.equals("throws")) {
            throw new InvalidPlayException(name + " is a defensive player and cannot throw a pass!");
        }

        System.out.println(name + " successfully " + playType);
    }

    public static void main(String[] args) {
        FootballPlayer JJ = new FootballPlayer("JJ McCarthy", "offense");
        FootballPlayer Blake = new FootballPlayer("Blake Cashman", "defense");

        try {
            JJ.makePlay("completed a pass");  
            JJ.makePlay("sack");       
        } catch (InvalidPlayException e) {
            System.err.println("Play error: " + e.getMessage());
        }

        try {
            Blake.makePlay("sacked the QB");   
            Blake.makePlay("throws");  
        } catch (InvalidPlayException e) {
            System.err.println("Play error: " + e.getMessage());
        }
    }
}
