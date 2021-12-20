package com.company;

public class Printer {
    String queue = "";
    String text;
    String name;
    int count = 0;
    int pendingCount = 0;
    int totalCount = 0;

    public void append(String text) {
        this.text = text;
        queue = queue + "\n" + text + "\n";
        pendingCount++;
    }

    public void append(String text, String name) {
        this.text = text;
        this.name = name;
        queue = queue + "\n" + name + "\n" + text + "\n";
        pendingCount++;
    }

    public void append(String text, String name, int count) {
        this.text = text;
        this.name = name;
        this.count = count;
        pendingCount = pendingCount + count;
        queue = queue + "\n" + name + "\n" + text + "\n" + count + "\n";
    }

    public void print() {
        System.out.println(queue);
        clear();
    }

    public void clear() {
        queue = "";
    }

    public void getPendingPagesCount() {
        System.out.println("Pages pending: " + pendingCount);
    }

    public void getTotalCount() {
        totalCount = totalCount + pendingCount;
        System.out.println("Total pages: " + totalCount);
    }
}
