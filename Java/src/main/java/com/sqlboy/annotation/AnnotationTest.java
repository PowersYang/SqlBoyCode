package com.sqlboy.annotation;

import jdk.nashorn.internal.ir.annotations.Reference;

@MyAnnotation(reportedBy = "sqlboy")
public class AnnotationTest {
    public static void main(String[] args) {

    }
}

@interface MyAnnotation {
    enum Status{UNCONFIRMED, CONFIRMED, FIXED, NOTBUG};
    boolean showStopper() default false;
    String assignedTo() default "[none]";
    Class<?> testCase() default Void.class;
    Status status() default Status.UNCONFIRMED;
    Reference fer() default @Reference;
    String[] reportedBy();
}
