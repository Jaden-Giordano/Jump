package net.jump;

import net.gfx.*;

public class Jump {
	
	public static Gui gui = new Gui(1280, 720, "Jump!");
	public static Graphics gfx = new Graphics();

	public static void main(String[] args) {
		while (gui.isCloseRequest() != true) {
			
			gfx.draw();
			
			gui.update();
		}
		
		gui.destroy();

	}

}
