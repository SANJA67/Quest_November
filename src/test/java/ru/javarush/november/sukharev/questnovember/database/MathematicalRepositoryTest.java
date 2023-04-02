package ru.javarush.november.sukharev.questnovember.database;

import org.junit.jupiter.api.Test;
import ru.javarush.november.sukharev.questnovember.entity.MathematicalExpression;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MathematicalRepositoryTest {



   @Test
    void testGetAllMethod() {
       MathematicalRepository mr = new MathematicalRepository();

       for (MathematicalExpression me: mr.getAll()) {
           assertEquals(1L, me.getId());
           assertEquals("2 + 2", me.getExpression());
           assertEquals(4, me.getResult());
           break;
       }
    }

    @Test
    void testGetMethod() {
        MathematicalRepository mr = new MathematicalRepository();
        assertEquals(Optional.empty(), mr.get(1));
    }

    @Test
    void testCreateMethod() {
        MathematicalRepository mr = new MathematicalRepository();
        mr.create(new MathematicalExpression(8L,"2 + 6",8));

        assertEquals(6, mr.getAll().size());

    }

    @Test
    void testUpdateMethod() {
        MathematicalRepository mr = new MathematicalRepository();
        mr.update(new MathematicalExpression(3L,"2 + 4",6));

        assertEquals(5, mr.getAll().size());
    }

    @Test
    void testDeleteMethod() {
        MathematicalRepository mr = new MathematicalRepository();
        mr.delete(new MathematicalExpression(3L,"2 + 4",6));

        assertEquals(4, mr.getAll().size());
    }
}