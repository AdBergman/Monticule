package dsv.su.se.inte.group10;

/**
 * General character will be an abstract class for all characters in the game.
 * This is a temporary template test class that should be applied to future sub-classes to GenChar.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    Character player = new Player();

    @Test
    public void testPlayerGetDamage(){
        assertEquals(10, player.getDamage());
    }

    @Test
    public void testPlayerGetSpeed(){
        assertEquals(10, player.getSpeed());
    }

    @Test
    public void testPlayerGetMaxHP(){
        assertEquals(100, player.getMaxHP());
    }

    @Test
    public void testPlayerCurrentHP(){
        assertEquals(100, player.getCurrentHP());
    }

    @Test
    public void testPlayerMoveUnit(){
        //TODO: once character has position
    }

}
