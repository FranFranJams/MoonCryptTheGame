package map;

import core.Size;
import gfx.SpriteLibrary;

import java.util.Arrays;

public class GameMap {

    private Tile[][] tiles;



    public GameMap(Size size, SpriteLibrary spriteLibrary) {
        tiles = new Tile[size.getWidth()][size.getHeight()];
        initalizeTiles(spriteLibrary);


    }

    private void initalizeTiles(SpriteLibrary spriteLibrary) {
        for(Tile[] row: tiles) {
            Arrays.fill(row, new Tile(spriteLibrary));
        }
    }

    public Tile[][] getTiles() {
        return tiles;
    }
}
