package ru.javarush.november.sukharev.questnovember.service;

import ru.javarush.november.sukharev.questnovember.database.MathematicalRepository;
import ru.javarush.november.sukharev.questnovember.database.Repository;
import ru.javarush.november.sukharev.questnovember.entity.MathematicalExpression;

import java.util.Collection;
import java.util.Optional;

public enum MathematicalExpressionService {

    MATH_SERVICE;

    private final Repository<MathematicalExpression> expressionRepository = new MathematicalRepository();

    public Collection<MathematicalExpression> getAll() {
        return expressionRepository.getAll();
    }
}
