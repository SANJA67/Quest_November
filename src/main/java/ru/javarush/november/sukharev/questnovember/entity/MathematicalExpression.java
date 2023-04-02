package ru.javarush.november.sukharev.questnovember.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MathematicalExpression {
    private long id;
    private String expression;
    private int result;

}
