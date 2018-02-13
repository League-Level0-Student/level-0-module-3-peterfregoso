package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot rob = new Robot("mini");
	
public static void main(String[] args) {
	rob.setSpeed(100);
	rob.penDown();
String shape = JOptionPane.showInputDialog("what shape should I draw(make it simple pls)");
String color = JOptionPane.showInputDialog("what color should I draw with(Red,Green,Blue)");
if (color.equalsIgnoreCase("Red")) {
	rob.setPenColor(255,0,0);
}
else if (color.equalsIgnoreCase("blue")) {
	rob.setPenColor(0,0,255);
}
else if (color.equalsIgnoreCase("green")) {
	rob.setPenColor(0,255,0);
}
else {
	JOptionPane.showMessageDialog(null, "toooooooooo complex for me");
}
if(shape.equalsIgnoreCase("Square")){
drawSquare();	
}
if(shape.equalsIgnoreCase("Triangle")){
drawTriangle();
}
if(shape.equalsIgnoreCase("circle")){
drawCircle();	
}
}
static void drawSquare() {
	
	
for (int i = 0; i < 4 ; i++) {
	
rob.move(50);
rob.turn(90);
}
}
static void drawTriangle() {
	
	
	for (int j = 0; j < 3 ; j++) {
		rob.move(200);
		rob.turn(120);
	}

}
static void drawCircle() {
	
	
	for (int p = 0; p < 100000 ; p++) {
		rob.move(1);
		rob.turn(1);
	}
}
}

