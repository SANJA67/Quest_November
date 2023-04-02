package ru.javarush.november.sukharev.questnovember.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicalExpressionTest {

    @Test
    void testGetIdMethod() {
        MathematicalExpression me = new MathematicalExpression(5000L,"OK",8000);

        assertEquals(5000L, me.getId());
    }

    @Test
    void testGetExpressionMethod() {
        MathematicalExpression me = new MathematicalExpression(5000L,"OK",8000);

        assertEquals("OK", me.getExpression());
    }

    @Test
    void testGetResultMethod() {
        MathematicalExpression me = new MathematicalExpression(5000L,"OK",8000);

        assertEquals(8000, me.getResult());
    }

    @Test
    void testSetIdMethod() {
        MathematicalExpression me = new MathematicalExpression();
        me.setId(10L);
        assertEquals(10L, me.getId());
    }

    @Test
    void testSetExpressionMethod() {
        MathematicalExpression me = new MathematicalExpression();
        me.setExpression("OK");
        assertEquals("OK", me.getExpression());
    }

    @Test
    void testSetResultMethod() {
        MathematicalExpression me = new MathematicalExpression();
        me.setResult(45);
        assertEquals(45, me.getResult());
    }

    @Test
    void testEqualsMethod() {
        MathematicalExpression me1 = new MathematicalExpression();
        MathematicalExpression me2 = new MathematicalExpression();
        assertEquals(true, me2.equals(me1));
    }

    @Test
    void testCanEqualMethod() {
        MathematicalExpression me1 = new MathematicalExpression();
        MathematicalExpression me2 = new MathematicalExpression();
        assertEquals(true, me2.canEqual(me1));
    }

    @Test
    void testToStringMethod() {
        MathematicalExpression me1 = new MathematicalExpression();

        assertEquals("MathematicalExpression(id=0, expression=null, result=0)", me1.toString());
    }
}