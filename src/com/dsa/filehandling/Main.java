package com.dsa.filehandling;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in)){
            System.out.println("Enter some letters : ");
            int letters = inputStreamReader.read();
            while (inputStreamReader.ready()){
                System.out.println((char) letters);
                letters = inputStreamReader.read();
            }
            System.out.println();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (FileReader fileReader = new FileReader("D:\\IdeaProjects\\Data Structures and Algorithms\\src\\com\\dsa\\filehandling\\note.txt")){
            int letters = fileReader.read();
            while (fileReader.ready()){
                System.out.println((char) letters);
                letters = fileReader.read();
            }
            System.out.println((char) letters);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //byte to char stream and then reading char stream
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter some letters : ");
            System.out.println("You typed : " + bufferedReader.readLine());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\IdeaProjects\\Data Structures and Algorithms\\src\\com\\dsa\\filehandling\\note.txt"))) {
            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out)){
            outputStreamWriter.write("Hello world");
            outputStreamWriter.write(97);
            outputStreamWriter.write('A');
            outputStreamWriter.write('\n');
            char[] arr = "hello world".toCharArray();
            outputStreamWriter.write(arr);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (FileWriter fileWriter = new FileWriter("D:\\IdeaProjects\\Data Structures and Algorithms\\src\\com\\dsa\\filehandling\\note.txt", true)){
            fileWriter.write(" Hello world");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\Data Structures and Algorithms\\src\\com\\dsa\\filehandling\\note.txt",true))){
            bufferedWriter.write(" Welcome to DSA");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try {
            File file = new File("D:\\IdeaProjects\\Data Structures and Algorithms\\src\\com\\dsa\\filehandling\\output.txt");
            file.createNewFile();
            if(file.delete()){
                System.out.println(file.getName());
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
