package responsi6and7.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Reflection {
    public ArrayList<String> ghostMethods() {
        ArrayList<String> methods = new ArrayList<>();
        try {
            Class<?> clazz = Class.forName("Ghost");
            for (Method method : clazz.getDeclaredMethods()) {
                methods.add(method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return methods;
    }

    public Integer sumGhost() throws Exception {
        Class<?> clazz = Class.forName("Ghost");
        int sum = 0;
        for (Method method : clazz.getDeclaredMethods()) {
            method.setAccessible(true);
            Object result = method.invoke(clazz.getDeclaredConstructor().newInstance());
            if (result instanceof Integer) {
                sum += (Integer) result;
            }
        }
        return sum;
    }

    public String letterGhost() throws Exception{
        Class<?> clazz = Class.forName("Ghost");
        StringBuilder result = new StringBuilder();
        for (Method method : clazz.getDeclaredMethods()) {
            method.setAccessible(true);
            Object res = method.invoke(clazz.getDeclaredConstructor().newInstance());
            if (res instanceof String) {
                result.append((String) res);
            }
        }
        return result.toString();
    }

    public String findSecretId(List<Secret> sl, String email) throws Exception{
        for (Secret secret : sl) {
            if (secret.isThis(email)) {
                Field field = secret.getClass().getDeclaredField("uniqueId");
                field.setAccessible(true);
                return (String) field.get(secret);
            }
        }
        return "NaN";
    }
}
