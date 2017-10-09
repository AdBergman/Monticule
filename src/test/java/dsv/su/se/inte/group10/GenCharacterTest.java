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
    public void testGenCharacterCreation() {
        assertNotNull("GenCharacter could not be created", genChar);
    }

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

    @Test
    public void testGenCharacterMoveUnit(){
        //TODO: once character has position
    }

}
