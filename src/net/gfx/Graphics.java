package net.gfx;

import org.lwjgl.opengl.GL11;

public class Graphics {
	
	public static Gui gui;
	
	int colors[][];
	
	public Graphics() {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 1280, 720, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		
		colors = new int[1280/20+1][720/20+1];
		
	}
	
	public void draw() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		GL11.glClearColor(255, 255, 255, 255);
		
		GL11.glColor4f(0, 255, 0, 255);
		for (int x = 0; x < colors.length; x++) {
			for (int y = 0; y < colors[1].length; y++) {
				GL11.glRecti(x*20, y*20, 20, 20);
				
			}
			
		}
		
	}

}
