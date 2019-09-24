package PractiseExercise3;

public class MakeAChessBoard
    {
        public void MakeAChessBoardFunction()
            {
                String first;
                String second;
                int i,j;
                String [][]t= new String[8][8];
                for (i=0;i<8;i++)
                    {
                        if(i%2==0)
                            {
                                first=new String("WW|");
                                second=new String("BB|");
                            }
                        else
                            {
                                first=new String("BB|");
                                second=new String("WW|");
                            }
                        for (j=0;j<8;j++)
                            {
                                if(j%2==0)
                                    {
                                        t[i][j]=first;
                                    }
                                else
                                    {
                                        t[i][j]=second;
                                    }
                            }
                    }
                for (i=0;i<8;i++)
                    {
                        for (j=0;j<8;j++)
                            {
                                System.out.print(t[i][j]+"\t");
                            }
                        System.out.printf("\n");
                    }

            }
    }
