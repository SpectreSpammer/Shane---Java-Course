package com.onepieceofjava.day10_collection_framework.treeSets;

public class EmployeeTreeSet implements Comparable<EmployeeTreeSet> {
    private int id;
    private String name;
    private String dept;

    public EmployeeTreeSet(int id, String name, String dept) {
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
    public int compareTo(EmployeeTreeSet o) {
        return Integer.compare(this.id,o.id);
    }

    @Override
    public String toString() {
        return "EmployeeTreeSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
