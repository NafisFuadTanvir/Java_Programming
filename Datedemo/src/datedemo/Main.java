package datedemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        //simple current date printing:-
        {
            Date date= new Date();
        System.out.println("printing current date:- ");
        System.out.println(date);
        }
        //modify/format date
        {

            Date myDate= new Date();
            DateFormat formattingDate= new SimpleDateFormat("MM/dd//yyyy");
             String result= formattingDate.format(myDate);
            System.out.println("current date is:- "+myDate);

        }
    }
}
