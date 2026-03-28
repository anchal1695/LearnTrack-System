package com.airtribe.learntrack.util;

/**
 * Demonstrates STATIC members for global state management.
 */
public class IdGenerator {
    private static int studentCounter = 1000;
    private static int courseCounter = 5000;

    public static int nextStudentId() { return ++studentCounter; }
    public static int nextCourseId() { return ++courseCounter; }
}
