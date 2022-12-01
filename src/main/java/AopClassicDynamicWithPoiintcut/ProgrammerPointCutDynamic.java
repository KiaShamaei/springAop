package AopClassicDynamicWithPoiintcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class ProgrammerPointCutDynamic extends DynamicMethodMatcherPointcut {


    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        if (method.getName().equals("md")
                && args.length > 0
                &&(Integer)args[0] > 100
        ){
            System.out.println(method.getReturnType());
            return true;
        }
        return false;
    }
//    @Override
//    public ClassFilter getClassFilter() {
//        return clazz -> clazz.getName().equals(JavaProgrammer.class.getName());
//    }

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                return clazz.getName().equals(JavaProgrammer.class.getName());
            }
        };
    }
}
