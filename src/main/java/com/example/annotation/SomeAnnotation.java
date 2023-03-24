package com.example.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.checkerframework.checker.units.qual.UnknownUnits;
import org.checkerframework.framework.qual.RelevantJavaTypes;
import org.checkerframework.framework.qual.SubtypeOf;


import static java.lang.annotation.ElementType.TYPE_USE;

@Documented
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@SubtypeOf({UnknownUnits.class})
@Target(TYPE_USE)
@RelevantJavaTypes({long.class, Long.class})
public @interface SomeAnnotation
{
}
