package cn.edu.gdut.zaoying.Option.series.graph.markLine.data.p0.lineStyle.normal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ColorHex {
    int value() default 0;
}