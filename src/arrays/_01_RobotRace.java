package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[7];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(i * 100 + 100);
			robots[i].setY(550);
			robots[i].setSpeed(10);
		}
		
		  Boolean memes = false; while (memes == false) { for (int j = 0; j <
		  robots.length; j++) { Random random = new Random(); int coronavirus =
		  random.nextInt(50); if (robots[j].getY() <= 0) { memes = true;
		  JOptionPane.showMessageDialog(null, "The winner is " + j); break; }
		  robots[j].move(coronavirus); }
		  
		  }
		 	for (int i = 0; i < robots.length; i++) {
		robots[i].setX(i * 100 + 100);
		robots[i].setY(500);
		}
		 Boolean elmo = false;
		for (int k = 0; k < 27; k++) {
		for (int i = 0; i < robots.length; i++) {
			if (robots[i].getY() >= 550) {
				JOptionPane.showMessageDialog(null, "The winner is " +i);
				System.out.println("hello");
				System.exit(0);
			}
			robots[i].move(new Random().nextInt(20)+60);
			robots[i].turn(10);
			
		}	
		}
		
	}

}
// 2. create an array of 5 robots.

// 3. use a for loop to initialize the robots.

// 4. make each robot start at the bottom of the screen, side by side, facing up

// 5. use another for loop to iterate through the array and make each robot move
// a random amount less than 50.

// 6. use a while loop to repeat step 5 until a robot has reached the top of the
// screen.

// 7. declare that robot the winner and throw it a party!

// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
