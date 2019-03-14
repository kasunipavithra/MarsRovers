/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoverApp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class RoverControlerTest {
    
    public RoverControlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of rotateL method, of class RoverControler.
     */
    @Test
    public void testRotateL() {
        System.out.println("rotateL");
        Rover rover =new Rover();
        rover.setHeading_dir("N");
        rover.setX_coordinate(1);
        rover.setX_coordinate(2);
        
        RoverControler instance = new RoverControler();
        String expResult = "W";
       
        String result = instance.rotateL(rover).getHeading_dir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of rotateR method, of class RoverControler.
     */
    @Test
    public void testRotateR() {
        Rover rover =new Rover();
        rover.setHeading_dir("N");
        rover.setX_coordinate(1);
        rover.setY_coordinate(2);
        
        RoverControler instance = new RoverControler();
        String expResult = "E";
       
        String result = instance.rotateR(rover).getHeading_dir();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class RoverControler.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Grid.x_max =5;
        Grid.y_max =5;
        Rover rover =new Rover();
        rover.setHeading_dir("N");
        rover.setX_coordinate(1);
        rover.setY_coordinate(2);
        
        RoverControler instance = new RoverControler();
        int expResult = 3;
        int result = instance.move(rover).getY_coordinate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
