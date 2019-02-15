package com.example.scheduled;

//SPRING SCHEDULE EXAMPLE
//bu class BURAK KUTBAY dan alınmıstır. burakkutbay.com

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

public class Mission {

    private int counter = 0;

    //belli zamanda calstrmak icin cron ile zaman bleirtme her 10 sn bir her gun calis
    //@Scheduled(cron = "saniye - dakika - saat - ayın günü - ay - ayın haftası")
    /**
            "0 0 * * * *" = Hergün her zaman çalışır.
            "*10 * * * * *" = Hergün 10 saniyede bir çalışır. " +  yildzdan snra / var
            ""0 0 8-10 * * *" = Hergün 8, 9 ve 10 saatinde çalışır.
            "0 0/30 8-10 * * *" = Hergün 8:00, 8:30, 9:00, 9:30 ve 10 saatinde çalışır.
            "0 0 9-17 * * MON-FRI" = Her zaman Pazartesiden Cumaya kadar saat 9 ile 17 saatleri arasında çalışır.
     */

    @Scheduled(cron = "*/10 * * * * *")
    public void run(){
        counter++;
        System.out.println("Program run  :  Mission  : " + counter + "Time : " + new Date());
    }
}
