package net.gfx;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Gui {
	
	static private int width, height;

	public Gui(int w, int h, String title) {
		width = w;
		height = h;
		
		try {
		Display.setDisplayMode(new DisplayMode(w, h));
		Display.setTitle(title);
		Display.create();
		
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void destroy() {
		Display.destroy();
		System.exit(0);
		
	}
	
	public void update() {
		Display.update();
		Display.sync(60);
		
	}
	
	public boolean isCloseRequest() {
		return Display.isCloseRequested();
		
	}
	
	public int getWidth() {
		return width;
		
	}
	
	public int getHeight() {
		return height;
		
	}
	
}
