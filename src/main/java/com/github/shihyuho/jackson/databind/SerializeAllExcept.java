package com.github.shihyuho.jackson.databind;


import com.github.shihyuho.jackson.databind.resolver.SerializeAllExceptResolver;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link SerializeAllExceptResolver}
 * 
 * @author Matt S.Y. Ho
 *
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SerializeAllExcept {

  String[] value();
  
}
