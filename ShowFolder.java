

//package com.java2novice.files;

import java.io.File;
 
public class ShowFolder {
     
    public static void main(String a[]){
        File file = new File("C:/jnr/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}