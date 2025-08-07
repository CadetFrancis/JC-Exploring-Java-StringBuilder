package org.example;

public class Main {
    public static void main(String[] args) {
        append();
        insert();
        delete();
        replace();
        methodChaining();
        queryLikeString();
        toStr();
    }
    public static void append(){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Cadets!");
        System.out.println(sb);
        sb.append("Welcome to ");
        sb.append("2025");
        sb.append(".");
        System.out.println(sb);
    }
    public static void insert(){
        StringBuilder sb = new StringBuilder("Java is great!");
        sb.insert(8,"really ");
        System.out.println(sb);
    }
    public static void delete(){
        StringBuilder sb = new StringBuilder("This is a test sentence.");
        sb.delete(8,16);
        System.out.println("After delete(8,16): " + sb);
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb);
    }
    public static void replace(){
        StringBuilder sb = new StringBuilder("I like programming in Python.");
        sb.replace(24,30,"Java");
        System.out.println(sb);
    }
    public static void methodChaining(){
        StringBuilder sb = new StringBuilder("Start");
        sb.append("...").insert(0,"Ready,Set, ").delete(12,15);
        System.out.println(sb);
    }
    public static void queryLikeString(){
        StringBuilder sb = new StringBuilder("The quick brown fox jumps over the lazy dog.");
        String sub = sb.substring(16,19);
        System.out.println("Substring: " + sub);

        int indexOfFox = sb.indexOf("fox");
        System.out.println("Index of 'fox': " + indexOfFox);

        int indexOfCat = sb.indexOf("cat");
        System.out.println("Index of 'cat': " + indexOfCat);
    }
    public static void toStr(){
        StringBuilder sb = new StringBuilder("Status: ");

        sb.append("Pending");
        String finalStatus = sb.toString();
        sb.append(" - Approved");

        System.out.println("StringBuilder: " + sb);
        System.out.println("Final String: " + finalStatus);
    }
}