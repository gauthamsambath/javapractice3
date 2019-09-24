package PractiseExercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GetTxtFilesAndRead
    {
        public void GettextFilesAndReadFunction(String directory) throws IOException {
            List<String> textFiles = new ArrayList<String>();
            File dir = new File(directory);
            for (File file : dir.listFiles())
                {
                if (file.getName().endsWith((".txt")))
                    {
                    textFiles.add(file.getName());
                    }
                }
            for (int i=0;i<textFiles.size();i++)
                {
                    System.out.println("\n Content of text file "+textFiles.get(i)+"\n");
                    File path=new File(directory+"/"+textFiles.get(i));
                    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(path)));
                    String firstline=bufferedReader.readLine();
                    System.out.println(firstline+"\n");
                    while (bufferedReader.readLine()!=null)
                        {
                            System.out.println(bufferedReader.readLine()+"\n");
                        }
                    System.out.printf("\n");
                }
            }
    }
