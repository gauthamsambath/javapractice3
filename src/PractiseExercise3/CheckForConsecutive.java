package PractiseExercise3;

import java.util.Arrays;

public class CheckForConsecutive
    {
        public boolean CheckForConsecutiveFunction(int[] numbers)
            {
                int incrementfactor=numbers[0]-numbers[1],i,j;
                int []test=new int[numbers.length];
                if (Math.abs(incrementfactor)!=1)
                    {
                        return false;
                    }
                else
                    {
                        if(incrementfactor==1)
                            {
                                for (i=0;i<numbers.length;i++)
                                    {
                                        test[i]=numbers[0]-i;
                                    }
                                System.out.printf("\n"+test.toString());
                                return Arrays.equals(test,numbers);
                            }
                        else
                            {
                                for (i=0;i<numbers.length;i++)
                                {
                                    test[i]=numbers[0]+i;
                                }
                                return Arrays.equals(test,numbers);
                            }
                    }
            }
    }
