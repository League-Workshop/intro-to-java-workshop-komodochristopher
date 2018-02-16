package section2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot bob = new Robot();
		bob.penDown();
		bob.setSpeed(500);
		bob.move(200);
	}

}
