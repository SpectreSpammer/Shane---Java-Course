package com.onepieceofjava.day10_collection_framework.linkedList;

public class EmployeeLinkedList {

    private int id;
    private String name;
    private String dept;

    public EmployeeLinkedList(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmployeeLinkedList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
