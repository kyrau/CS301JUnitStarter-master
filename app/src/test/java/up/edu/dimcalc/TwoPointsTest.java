package up.edu.dimcalc;

import android.graphics.Point;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoPointsTest {

    /** when created, getPoint() should show both points at the origin */
    @Test
    public void getPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(0, p1.x);
        assertEquals(0, p1.y);
        assertEquals(0, p2.x);
        assertEquals(0, p2.y);
    }

    /** verify that arbitrary values are properly stored via setPoint() */
    @Test
    public void setPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -3);
        testPoints.setPoint(1, -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(5, p1.x);
        assertEquals(-3, p1.y);
        assertEquals(-3, p2.x);
        assertEquals(5, p2.y); //this is the line of code that will make the test fail
    }

    @Test
    public void randomValue() {
        TwoPoints points = new TwoPoints();
        points.randomValue(0);
        points.randomValue(1);

        assertEquals(points.getPoint(0).x, points.getPoint(0).y, 50);
        assertEquals(points.getPoint(1).x, points.getPoint(1).y, 50);

        points.randomValue(0);
        points.randomValue(1);

        assertEquals(points.getPoint(0).x, points.getPoint(0).y, 50);
        assertEquals(points.getPoint(1).x, points.getPoint(1).y, 50);

        points.randomValue(0);
        points.randomValue(1);

        assertEquals(points.getPoint(0).x, points.getPoint(0).y, 50);
        assertEquals(points.getPoint(1).x, points.getPoint(1).y, 50);

        points.randomValue(0);
        points.randomValue(1);

        assertEquals(points.getPoint(0).x, points.getPoint(0).y, 50);
        assertEquals(points.getPoint(1).x, points.getPoint(1).y, 50);
    }

    @Test
    public void setOrigin() {
        TwoPoints points = new TwoPoints();
        points.setOrigin(0);
        points.setOrigin(1);
        assertEquals(0, points.getPoint(0).x);
        assertEquals(0, points.getPoint(1).y);
    }

    @Test
    public void copy() {
        TwoPoints points = new TwoPoints();
        points.setPoint(0, 2, 4);
        points.setPoint(1, 6,8);
        points.copy(0,1);
        assertEquals(points.getPoint(1).x, points.getPoint(0).x);
        assertEquals(points.getPoint(0).y, points.getPoint(1).y);
        points.setPoint(1, 420, 66);
    }

    @Test
    public void distance() {
    }

    @Test
    public void slope() {
        TwoPoints points = new TwoPoints();
        points.setPoint(0, 1, 2);
        points.setPoint(1, 234, -2);
        double result = 0.0;
        int xDiff = 1 - 234;
        int yDiff = 2 + 2;
        result = yDiff / xDiff;
        //assertEquals(result, points.slope(), .1);
        points.setPoint(0, 1, 2);
        points.setPoint(1, 456, -1);
        xDiff = 1 - 456;

    }
}