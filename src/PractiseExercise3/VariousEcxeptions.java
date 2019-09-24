package PractiseExercise3;

public class VariousEcxeptions
    {
        public void ecxeptionsFunctions()
            {
                try
                    {
                    int size=-1;
                    int[] array=new int[size];

                    }
                catch (Exception e)
                    {
                        System.out.println("\n"+e+"\n");
                    }
                try
                    {
                        int[] array=new int[2];
                        int number=array[3];
                    }
                catch (Exception e)
                    {
                        System.out.println("\n"+e+"\n");
                    }
                try
                    {
                        String a=null;
                        a.toLowerCase();
                    }
                catch (Exception e)
                    {
                        System.out.println("\n"+e+"\n");
                    }
            }
    }
