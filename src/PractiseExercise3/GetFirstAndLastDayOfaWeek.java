package PractiseExercise3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetFirstAndLastDayOfaWeek
    {
        private int year;
        private static final int dayofweek = 2;
        private int weekofyear;

        public GetFirstAndLastDayOfaWeek(int year, int weekofyear) {
            this.year = year;
            this.weekofyear = weekofyear;
        }

        public String[] GetFirstAndLastDayofaWeekFunction()
            {
                String[] Dates=new String[2];
                SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.WEEK_OF_YEAR, this.weekofyear);
                cal.set(Calendar.DAY_OF_WEEK, dayofweek);
                cal.set(Calendar.YEAR,this.year);
                System.out.println(sdf.format(cal.getTime()));
                System.out.println();
                // Print dates of the current week starting on Monday
                DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
//                System.out.println(df.format(cal.getTime()).toString());
                Dates[0]= String.valueOf(df.format(cal.getTime()));
                for (int i = 0; i <6; i++) {
                    cal.add(Calendar.DATE, 1);
                }
//                System.out.println(df.format(cal.getTime()).toString());
                Dates[1]= String.valueOf(df.format(cal.getTime()));
                return Dates;

            }
    }
