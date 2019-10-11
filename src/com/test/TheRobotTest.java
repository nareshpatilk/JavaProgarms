package com.test;

public class TheRobotTest {

	public static void main(String[] args) {
		
		HackerrankTest2 robot = new HackerrankTest2();
		robot.printCurrentCoordinates();
		
		HackerrankTest2 secondRobot = new HackerrankTest2(2, 1);
		secondRobot.printCurrentCoordinates();
		secondRobot.moveX(1);
		secondRobot.printLastMove();
		secondRobot.printCurrentCoordinates();
		secondRobot.moveY(1);
		secondRobot.printLastCoordinates();
		secondRobot.moveX(2);
		
		secondRobot.printLastMove();
		secondRobot.printCurrentCoordinates();
		
		secondRobot.moveY(0);
		secondRobot.printLastCoordinates();
	}
}
