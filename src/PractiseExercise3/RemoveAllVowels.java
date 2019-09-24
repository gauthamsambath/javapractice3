package PractiseExercise3;

public class RemoveAllVowels
    {
        public String[] RemoveAllVowelsFunction(String[] words)
            {
                String[] outputStrings=new String[words.length];
                for (int i=0;i<words.length;i++)
                    {
                        outputStrings[i]=words[i].replaceAll("[AaEeIiOoUu]", "");
                    }
                return outputStrings;
            }
    }
