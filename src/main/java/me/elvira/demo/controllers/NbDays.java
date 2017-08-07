package me.elvira.demo.controllers;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class NbDays {
    public static void main(String[] args) {

        long oneDay;
        long val;
        long res;
        Date toDay;
        Date fdate1;
        Date fdate2;
        String date1=null;
        String date2=null;

        oneDay=1000*60*60*24;

        date1="${adduser.startdate}";
        date2="${adduser.enddate}";

        toDay=new Date();
        fdate1=new Date();
        fdate2=new Date();

        try {
            DateFormat format=new SimpleDateFormat("MM/dd/yyyy");
            fdate1=format.parse(date1);
            System.out.println(fdate1.toString());
        } catch (ParseException pe) {
            pe.printStackTrace();
        }

        if (date2=="") {
            fdate2=toDay;
            System.out.println(fdate2.toString());
        }
        else {
            try {
                DateFormat format=new SimpleDateFormat("MM/dd/yyyy");
                fdate2=format.parse(date2);
                System.out.println(fdate2.toString());
            } catch (ParseException pe) {
                pe.printStackTrace();
            }
        }

        val=fdate2.getTime()-fdate1.getTime();
        res=val/oneDay;
    }
}