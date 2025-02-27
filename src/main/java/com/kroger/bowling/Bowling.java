package com.kroger.bowling;

/**
 * Instructions
 * DO NOT EDIT THIS FILE
 * Create a package under bowling with your name. Use the signature of this class.
 *
 * Requirements
 *
 * Takes an array of strings where each element of the array represents 1 round (or "frame")of a game of bowling.
 * Rules of Bowling:
 * Bowling is played over 10 frames.
 * Each frame the player rolls a ball and knocks over between 0 and 10 pins.
 * If they do not knock over all 10 pins, they may roll the ball a 2nd time to try and knock over the remaining pins
 * The score is recorded as "<number of pins knocked over with the first ball>,<number of pins knocked over with the 2nd ball>"
 * If a player knocks over all 10 pins with their first ball, a "strike" is recorded (as an "X").
 * If a player knocks down all remaining pins with their second ball, a "spare" is recorded (as an "/").
 * If a player gets a strike, they score 10 points, but they also add the points for their next 2 balls as well
 * (this means those next 2 balls count both in the frame they're rolled and in the frame that the strike was rolled).
 * If a player gets a spare, they also add the points for their next 1 ball as well.
 * If a player gets a strike or a spare in the 10th frame (the last of the game), they are allowed to roll the additional 2 or 1 balls but those additional balls only get added to the score of the 10th frame (there is no 11th frame)
 * If a player gets a strike or spare in the 10th frame, knocking down all 10 pins with the additional bonus balls does not trigger any additional balls.
 * If a strike is rolled in the 10th frame, the pins are reset before the player gets 2 additional balls. If a strike is rolled on the 2nd ball, the pins are reset again; otherwise, the pins are not reset.
 * Any issues with the input should throw an IllegalArgumentException.
 * A perfect score is 300 (all strikes).
 * Sample input:
 * ["0,4","X","3,2","4,5","1,0","4,4","X","0,0","4,2","1,1"] = 60
 * Example Strike data in 10th frame: "X,4,5" or "X,4,/" or "X,X,2" or "X,X,X".
 */
public class Bowling {
    public static int calculateScore(String[] frames) {
        return 0;
    }
}
