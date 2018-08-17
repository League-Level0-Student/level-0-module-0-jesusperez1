package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot bob = new Robot();
		bob.miniaturize();
		bob.penDown();
		bob.setPenWidth(10);
		bob.setSpeed(500);
		bob.setAngle(180);
		bob.move(100);
		int i;
		for (i = 0; i < 180; i++) {
			bob.move(1);
			bob.turn(1);
		}
	}


	}

