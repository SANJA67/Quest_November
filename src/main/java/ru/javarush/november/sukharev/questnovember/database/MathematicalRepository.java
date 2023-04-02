package ru.javarush.november.sukharev.questnovember.database;

import ru.javarush.november.sukharev.questnovember.entity.MathematicalExpression;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class MathematicalRepository implements Repository<MathematicalExpression> {

    private final Map<Long, MathematicalExpression> map = new HashMap<>();

    public static final AtomicLong id = new AtomicLong(System.currentTimeMillis());
    public MathematicalRepository() {
        map.put(1L, new MathematicalExpression(1L,"2 + 2",4));
        map.put(2L, new MathematicalExpression(2L,"2 + 3",5));
        map.put(3L, new MathematicalExpression(3L,"2 + 4",6));
        map.put(4L, new MathematicalExpression(4L,"2 + 5",7));       map.put(5L, new MathematicalExpression(5L,"2 + 6",8));

    }

    @Override
    public Collection<MathematicalExpression> getAll() {
        return map.values();
    }

    @Override
    public Optional<MathematicalExpression> get(long id) {
        return Optional.empty();
    }

    @Override
    public void create(MathematicalExpression entity) {
        entity.setId(id.incrementAndGet());
        update(entity);
    }

    @Override
    public void update(MathematicalExpression entity) {
        map.put(entity.getId(), entity);
    }

    @Override
    public void delete(MathematicalExpression entity) {
        map.remove(entity.getId(), entity);
    }
}
