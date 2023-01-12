package gr.aueb.cf.exercisesch11oop.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class MainReflection {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("gr.aueb.cf.exercisesch11oop.model.User");
            Class<?> bClass = Class.forName("gr.aueb.cf.exercisesch11oop.model.UserCredentials");


            Constructor<?> overloadedConst = aClass.getConstructor(long.class, String.class, String.class);
            User newUser = (User) overloadedConst.newInstance(10L, "Marios", "Avramidis");

            Constructor<?> overloadedConst2 = bClass.getConstructor(long.class, String.class, String.class);
            UserCredentials newUserCredentials = (UserCredentials) overloadedConst2.newInstance(10L, "marios123", "avramidis123");

            Method getFields = aClass.getMethod("getFields");
            System.out.println(getFields.invoke(newUser));

            Method getFieldsUserCredentials = bClass.getMethod("getFieldsUserCredentials");
            System.out.println(getFieldsUserCredentials.invoke(newUserCredentials));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
