package com.example.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.checkerframework.checker.units.qual.UnknownUnits;
import org.checkerframework.framework.qual.RelevantJavaTypes;
import org.checkerframework.framework.qual.SubtypeOf;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({UnknownUnits.class})
@Target(ElementType.TYPE_USE)
@RelevantJavaTypes({long.class, Long.class})
public @interface SomeAnnotation
{

}
