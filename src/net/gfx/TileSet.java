package net.gfx;

public class TileSet {
	
	public final int TILES = 627;
	
	public class Tiles {
		int x, y;
		int w, h;
		
	}

	public Tiles tiles[];
	
	public TileSet() {
		for (int i = 0, x = 0, y = 0; i < TILES; i++, x += 25) {
			if (x > 1280) {
				x = 0;
				y += 40;
				
			}
			else {
				tiles[i].x = x; //ERROR CAUSED HERE
				tiles[i].y = y; //TO HERE *Unknown reason*
				tiles[i].w = 40;
				tiles[i].h = 40;
			
			}
			
		}
		
	}

}
