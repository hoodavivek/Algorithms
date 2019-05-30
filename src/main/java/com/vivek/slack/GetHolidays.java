package com.vivek.slack;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetHolidays {


    public GetHolidays() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, 2); // Adding 5 days
        String output = sdf.format(c.getTime());
        System.out.println(output);
    }


    public boolean isLeapYear(int year) {
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        return leap;
    }


    public static void main(String args[]) {
        new GetHolidays();
    }


}
