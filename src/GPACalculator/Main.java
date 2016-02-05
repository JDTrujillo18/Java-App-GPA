package GPACalculator;

import GPACalculator.frames.MainFrame;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello");
		MainFrame mainFrame = new MainFrame();
		mainFrame.showWelcomePanel();
		mainFrame.makeVisible();
	}
}