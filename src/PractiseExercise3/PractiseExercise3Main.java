package PractiseExercise3;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PractiseExercise3Main
    {
        public static void main(String[] args) throws MyArithmeticEcxeption, IOException {
                int choice;
                Scanner scanner=new Scanner(System.in);

                char decision;
                do
                    {
                        System.out.println("\n Choose an option \n");
                        System.out.println("1. Enter number of students,grades for each and display \n");
                        System.out.println("2. Add 2 matrices \n");
                        System.out.println("3. Get the first and last date of a given week in a given year \n");
                        System.out.println("4. Remove all vowels from every word input \n");
                        System.out.println("5. Make a chess board \n");
                        System.out.println("6. Check if the given set of numbers are consecutive \n");
                        System.out.println("7. Demonstrate custom defined ecxeptions \n");
                        System.out.println("8. Demonstrating various kinds of Ecxeptions \n");
                        System.out.println("9. Java reading and writing \n");
                        System.out.println("10. To get txt files from a folder and read them \n");
                        System.out.println("11. Input a file and count frequency of each word \n");
                        choice=scanner.nextInt();
                        switch (choice)
                        {
                            case 1:
                                System.out.printf("\n Enter number of student \n");
                                int numberOfStudents=scanner.nextInt();
                                StudentMarks studentMarks=new StudentMarks();
                                studentMarks.StudentMArksFunction(numberOfStudents);
                                break;
                            case 2:
                                AddTwoMatrix addTwoMatrix=new AddTwoMatrix();
                                addTwoMatrix.AddTwoMatrixFunction();
                                System.out.println("\n");
                                break;
                            case 3:
                                int year,weekofyear;
                                System.out.println("\n Enter your year \n");
                                year=scanner.nextInt();
                                System.out.println("\n Enter the week of year \n");
                                weekofyear=scanner.nextInt();
                                GetFirstAndLastDayOfaWeek getFirstAndLastDayOfaWeek=new GetFirstAndLastDayOfaWeek(year,weekofyear);
                                String[] dateString=getFirstAndLastDayOfaWeek.GetFirstAndLastDayofaWeekFunction();
                                System.out.println("\n First day of week "+weekofyear+" in year "+year+" = "+dateString[0].toString()+"\n");
                                System.out.println("\n Last day of week "+weekofyear+" in year "+year+" = "+dateString[1].toString()+"\n");
                                break;
                            case 4:
                                List<String> wordList=new ArrayList<String>();
                                System.out.println("Enter your words applying spaces in between and press enter after completing");
                                scanner.nextLine();
                                String word=scanner.nextLine();
                                System.out.println(word.toString());
                                String[] words=word.split(" ");
                                RemoveAllVowels removeAllVowels=new RemoveAllVowels();
                                String[] outPutWords=removeAllVowels.RemoveAllVowelsFunction(words);
                                System.out.println("\n words after removing vowels = "+Arrays.asList(outPutWords).toString()+"\n");
                                break;
                            case 5:
                                System.out.println("\n");
                                MakeAChessBoard makeAChessBoard=new MakeAChessBoard();
                                makeAChessBoard.MakeAChessBoardFunction();
                                break;
                            case 6:
                                System.out.printf("\n Start entering your numbers \n");
                                scanner.nextLine();
                                String numberstring=scanner.nextLine();
                                String[] numberStringArray=numberstring.split(" ");
                                int[] numbers= Arrays.asList(numberStringArray).stream().mapToInt(Integer::parseInt).toArray();
                                CheckForConsecutive checkForConsecutive=new CheckForConsecutive();
                                boolean truthvalue=checkForConsecutive.CheckForConsecutiveFunction(numbers);
                                if (truthvalue==true)
                                    {
                                        System.out.printf("\n the given set of numbers " + Arrays.asList(numberStringArray).toString() + " is consecutive \n");
                                    }
                                else
                                    {
                                        System.out.printf("\n the given set of numbers " + Arrays.asList(numberStringArray).toString() + " is not consecutive \n");
                                    }
                                break;
                            case 7:
                                int a=0,b=0,c=0,x=1;
                                do
                                    {
                                        try
                                        {
                                            System.out.printf("\n Enter value of a \n");
                                            a=scanner.nextInt();
                                            System.out.printf("\n Enter value of b \n ");
                                            b=scanner.nextInt();
                                            if(b==0)
                                            {

                                                throw new MyArithmeticEcxeption("\nDividing by zero is not possible Please Enter value again \n");
                                            }
                                            x=2;
                                        }
                                        catch (MyArithmeticEcxeption e)
                                        {
                                            System.out.println(e);
                                        }
                                    }while (x==1);

                                c=a/b;
                                System.out.printf(" \n Sum = "+c+"\n");
                                break;
                            case 8:
                                VariousEcxeptions variousEcxeptions=new VariousEcxeptions();
                                variousEcxeptions.ecxeptionsFunctions();
                                break;
                            case 9:
                                JavaReadAndWrite javaReadAndWrite=new JavaReadAndWrite();
                                javaReadAndWrite.JavaReadAndWriteFunction();
                                break;
                            case 10:
                                GetTxtFilesAndRead getTxtFilesAndRead=new GetTxtFilesAndRead();
                                getTxtFilesAndRead.GettextFilesAndReadFunction("textfiles");
                                break;
                            case 11:
                                InputFileAndFindFrequency inputFileAndFindFrequency=new InputFileAndFindFrequency();
                                inputFileAndFindFrequency.InputFileAndFindFrequencyFunction();
                                break;
                            default:
                                System.out.println("\n Wrong choice \n");
                        }

                        System.out.println("\n press y to continue and any key to exit \n");
                        decision=scanner.next().charAt(0);
                    }while (decision=='y');



            }

    }
