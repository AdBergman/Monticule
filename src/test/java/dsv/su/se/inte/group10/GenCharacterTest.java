package dsv.su.se.inte.group10;

/**
 * General character will be an abstract class for all characters in the game.
 * This is a temporary template test class that should be applied to future sub-classes to GenChar.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class GenCharacterTest {
    GenCharacter genChar = new GenCharacter();

    @Test
    public void testGenCharacterGetDamage(){
        assertEquals(1, genChar.getDamage());
    }

    @Test
    public void testGenCharacterGetSpeed(){
        assertEquals(1, genChar.getSpeed());
    }

    @Test
    public void testGenCharacterGetMaxHP(){
        assertEquals(1, genChar.getMaxHP());
    }

    @Test
    public void testGenCharacterGetCurrentHP(){
        assertEquals(1, genChar.getCurrentHP());
    }
    
//    @Test
//    public void testGenCharacterHasPosition() {
//    	assertNotNull(genChar.getPosition());
//    }
//    
//    @Test
//    public void testGenCharacterMoveUp() {
//    	Position prePos = new Position(10,10);
//    	genChar.moveUp();
//    	assertTrue(prePos.getY() > genChar.getPosition().getY());
//    }
//    
//    @Test
//    public void testGenCharacterMoveDown() {
//    	Position prePos = new Position(10,10);
//    	genChar.moveDown();
//    	assertTrue(prePos.getY() < genChar.getPosition().getY());
//    }
//    
//    @Test
//    public void testGenCharacterMoveLeft() {
//    	Position prePos = new Position(10,10);
//    	genChar.moveLeft();
//    	assertTrue(prePos.getX() > genChar.getPosition().getX());
//    }
//    
//    @Test
//    public void testGenCharacterMoveRight() {
//    	Position prePos = new Position(10,10);
//    	genChar.moveRight();
//    	assertTrue(prePos.getX() < genChar.getPosition().getX());
//    }

    @Test
    public void testGenCharacterMoveUnit(){
        //TODO: once character has position
    }

}
