package net.gfx;

import net.gfx.TileSet.Tiles;

import org.lwjgl.opengl.GL11;

public class Graphics {
	
	public static Gui gui;
	public static TileSet Tile = new TileSet();
	
	int colors[][];
	
	public Graphics() {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 1280, 720, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		
		
	}
	
	public void draw() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		GL11.glClearColor(255, 255, 255, 255);
		
		GL11.glColor4f(0, 255, 0, 255);
		for (int i = 0; i < Tile.TILES; i++) {
			GL11.glVertex2i(Tile.tiles[i].x, Tile.tiles[i].y);
			GL11.glVertex2i(Tile.tiles[i].x + Tile.tiles[i].w, Tile.tiles[i].y);
			GL11.glVertex2i(Tile.tiles[i].x + Tile.tiles[i].w, Tile.tiles[i].y + Tile.tiles[i].h);
			GL11.glVertex2i(Tile.tiles[i].x, Tile.tiles[i].y + Tile.tiles[i].h);
			
		}
		
	}

}
