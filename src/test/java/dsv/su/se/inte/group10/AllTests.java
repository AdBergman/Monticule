package dsv.su.se.inte.group10;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value=Suite.class)
@SuiteClasses(value = {PlayerTest.class, ItemTest.class, MapScreenTest.class, MonticuleTest.class, ItemConsumableTest.class, StatTest.class, ItemEquippableTest.class, MovementEventTest.class, BackpackTest.class, EventHandlerTest.class, InputHandlerTest.class, NPCTest.class /*EquippedListTest.class*/})
public class AllTests {

}