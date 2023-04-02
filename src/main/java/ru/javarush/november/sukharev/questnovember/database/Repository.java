package ru.javarush.november.sukharev.questnovember.database;

import ru.javarush.november.sukharev.questnovember.entity.MathematicalExpression;

import java.util.Collection;
import java.util.Optional;

public interface Repository<T> {
    Collection<MathematicalExpression> getAll();

    Optional<T> get(long id);

    void create(T entity);

    void update(T entity);

    void delete(T entity);
}
