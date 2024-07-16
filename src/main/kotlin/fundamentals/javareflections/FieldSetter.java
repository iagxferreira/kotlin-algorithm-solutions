package fundamentals.javareflections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldSetter {

    public static boolean set(Object object, String fieldName, Object fieldValue) {
        Class<?> clazz = object.getClass();

        while (clazz != null) {
            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);

                if (clazz.isRecord() && (field.getModifiers() & java.lang.reflect.Modifier.FINAL) != 0) {
                    Field modifiersField = Field.class.getDeclaredField("modifiers");
                    modifiersField.setAccessible(true);
                    modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                } else {
                    field.set(object, fieldValue);
                }
                return true;
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {


        Person person = new Person("Alice");
        System.out.println("Before: " + person.getName());
        set(person, "name", "Bob");
        System.out.println("After: " + person.getName());

        User user = new User("Charlie");
        System.out.println("Before: " + user.username());
        set(user, "username", "David");
        System.out.println("After: " + user.username());
    }
}

