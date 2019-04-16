package Utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

    public class DataReader {

        public static String readfile(String filePath) {
            String text;
            String a = null;
            try {
                FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((text = bufferedReader.readLine()) != null) {
                    a = text;
                }
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(a);

            return a;
        }

        public static void main(String[] args) {

            //readfile("src\\Utility\\Information.txt");
            // readfile("src\\Utility\\JavaClassNote.txt");
                writeFile("src\\Utility\\Information.txt","I like to learn java");
        }

        public static void writeFile(String filePath, String text) {

            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
                bufferedWriter.write(","+ text);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
                }

            }
        }




