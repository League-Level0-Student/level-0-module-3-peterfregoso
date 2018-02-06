package elseif;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
public static void main(String[] args) {
	Robot rob = new Robot("mini");
	for (int i = 0; i < 4 ; i++) {
		
	
	rob.move(50);
	rob.turn(90);
}
}
}
