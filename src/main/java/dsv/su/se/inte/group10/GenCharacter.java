package dsv.su.se.inte.group10;

/**
 * General character will be an abstract class for all characters in the game.
 */

public class GenCharacter {
	
	private Position position = new Position(10, 10);

    public int getDamage(){
        return 1;
    }

    public int getSpeed(){
        return 1;
    }

    public int getMaxHP(){
        return 1;
    }

    public int getCurrentHP(){
        return 1;
    }
    
    public Position getPosition() {
    	return this.position;
    }
}
