package com.onepieceofjava.day10_collection_framework.hashMap;

import java.util.Objects;

public class EmployeeHashMap {
    private int id;
    private String name;
    private String dept;

    public EmployeeHashMap(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }


    @Override
    public String toString() {
        return "EmployeeHashMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
