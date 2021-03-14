/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void insideBounds(){
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        assertEquals(5,App.howManyBetweenBounds(list,1,1,5));
    }
    @Test void outsideBounds(){
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        assertEquals(0,App.howManyBetweenBounds(list,1,0,6));
    }
    @Test void listIsNull(){
        ArrayList<Integer> list=null;
        assertEquals(-1,App.howManyBetweenBounds(list,1,1,3));
    }
    @Test void lowBoundIsHigherThanHighBound(){
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        assertEquals(-1,App.howManyBetweenBounds(list, 6, 1, 1));
    }
    @Test void listIsEmpty(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        assertEquals(-1,App.howManyBetweenBounds(list, 1, 1, 5));
    }
    @test void boundDeciderIsUnexpected(){
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        assertEquals(-1,App.howManyBetweenBounds(list, 6, 2, 1));
    }
}
