package com.tiostitch.reflections;

import com.tiostitch.reflections.exceptions.ReflectionException;

public class ReflectionsAPI {

    public static Object getReflectionClass(String folder, String className) {
        try {
            Class<?> classe = Class.forName(folder + className);
            return classe.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new ReflectionException(e.getMessage());
        }
    }
}
