package PractiseExercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InputFileAndFindFrequency
    {
        public void InputFileAndFindFrequencyFunction() throws IOException {
                File path=new File("FileDemo.txt");
                String[] firstline=new String[]{"i am a man ,","i like to sleep ,","i have a home ,"};
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
                for(int i=0;i<firstline.length;i++)
                    {
                        bw.write(firstline[i]);
                        bw.newLine();
                    }
                bw.close();
                 HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
                 BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream("FileDemo.txt")));
                 List<String> wordlist=new ArrayList<String>();
                 String line1=bufferedReader.readLine();
//                 System.out.println("\n"+line1);
//                 wordlist.add(line1);
//                 System.out.println(line1+"\n");
                 while (line1!=null)
                 {
                     wordlist.add(line1);
                     System.out.println(line1+"\n");
                     line1=bufferedReader.readLine();
                 }
                 String[] wordInString=new String[wordlist.size()];
//            System.out.println("\n" +wordlist.size()+"\n");
                 for (int i=0;i<wordlist.size();i++)
                    {
                        wordInString[i]=wordlist.get(i);
                    }
//            System.out.println("\n"+Arrays.asList(wordInString).toString());
                 for (String word:wordInString)
                     {
                         String[] w=word.split(" ");
                         for (int i=0;i<w.length;i++)
                         {
                             if(hash_map.containsKey(w[i])==false)
                             {
                                 hash_map.put(w[i],1);
                             }
                             else
                             {
                                 hash_map.put(w[i],hash_map.get(w[i])+1);
                             }
                         }
                     }
            System.out.println("occurence of each word = "+ Arrays.asList(hash_map).toString());
            }
    }
