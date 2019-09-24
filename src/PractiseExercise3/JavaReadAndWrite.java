package PractiseExercise3;

import java.io.*;
import java.util.Scanner;

public class JavaReadAndWrite
    {
        public void JavaReadAndWriteFunction() throws IOException {
                Scanner scanner=new Scanner(System.in);
                String sentence="";
                File path=new File("firstText.txt");
                System.out.println("if path exists "+path.exists()+"\n");
                System.out.println("if its a directory "+path.isDirectory());
                System.out.printf("\n Type the sentence you want to add to the txt file \n");
//                scanner.nextLine();
                sentence=scanner.nextLine();
                System.out.println(sentence);
                String contentsToWrite=sentence;
                OutputStream stream=new FileOutputStream(path);
                stream.write(contentsToWrite.getBytes());
                stream.close();
                BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(path)));
                String contentInside=reader.readLine();
                System.out.println("\n the content of path = "+path+" is \n"+contentInside);
                reader.close();
            }
    }
