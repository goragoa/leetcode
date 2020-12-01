package utils;

import org.openjdk.btrace.core.annotations.OnMethod;
import static org.openjdk.btrace.core.BTraceUtils.println;

/**
 * @author gorag
 */
@org.openjdk.btrace.core.annotations.BTrace
public class BTrace{
    @OnMethod(clazz="java.lang.Thread",method="start")
    public static void func(){
        println("about to start a thread!");
    }
}