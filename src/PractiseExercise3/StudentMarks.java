package PractiseExercise3;

import java.util.Scanner;

public class StudentMarks
    {
        public void StudentMArksFunction(int numberoftstudents)
            {
                Scanner scanner=new Scanner(System.in);
                int[] stuGrades=new int[numberoftstudents];
                int grade=0;
                for(int i=0;i<numberoftstudents;i++)
                    {
                        System.out.println("Enter the grade of student "+(i+1)+"\n");
                        grade=scanner.nextInt();
                         if(grade<0||grade>100)
                            {
                                while (grade<0||grade>100)
                                    {
                                        System.out.printf("\n Please re enter the grade as it is beyond the range of 0-100 \n");
                                        grade=scanner.nextInt();
                                    }
                                stuGrades[i]=grade;
                            }
                         else
                            {
                                stuGrades[i]=grade;
                            }
                    }
                for (int i=0;i<stuGrades.length;i++)
                    {
                        System.out.printf("\n Grade of student "+(i+1)+" = "+stuGrades[i]+"\n");
                    }
            }
    }
