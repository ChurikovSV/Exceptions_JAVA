package org.example.Final_work;


public class Main {
    public static void main(String[] args) {
        try {
            CheckAndWriteData checkData = new CheckAndWriteData();
            checkData.checkAndWriteData();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}