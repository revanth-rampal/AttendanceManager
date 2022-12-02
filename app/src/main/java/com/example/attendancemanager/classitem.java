package com.example.attendancemanager;

public class classitem{
    String className;

    public String getClassName() {
        return className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    String subjectName;

    public classitem(String className, String subjectName) {
        this.className = className;
        this.subjectName = subjectName;
    }
}
