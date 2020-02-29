package com.alibaba.rsocket;

import java.lang.annotation.*;

/**
 * Service Mapping for reactive interface method
 *
 * @author leijuan
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ServiceMapping {
    /**
     * service mapping value, service or handler name
     *
     * @return mapping value
     */
    String value() default "";

    String group() default "";

    String version() default "";

    String encoding() default "";

    String decoding() default "";

    String endpoint() default "";
}
