package fundamentals.javareflections;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionUtils {

    public static boolean set(Object object, String fieldName, Object fieldValue) {
        Class<?> clazz = object.getClass();
        while (clazz != null) {
            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(object, fieldValue);
                return true;
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        return false;
    }

    public static void getNullProperties(Object object){
        System.out.println("Properties:");
        Arrays.stream(object.getClass().getDeclaredFields()).forEach(field -> {
            field.setAccessible(true);
            Object attribute = null;
            try {
                attribute = field.get(object);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            System.out.println(field.getName() + " = " + attribute);
        });
    }

}

