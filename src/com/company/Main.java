package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Main implements Comparator<Integer> {

    /*
    This is comment
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.startTimer();
    }

    private void startTimer() {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                List<Integer> list = new ArrayList<>();
                for (int i = 9; i >= 0; i--) {
                    list.add(i);
                }
                System.out.println("List: " + list);
                Collections.sort(list, Main.this);
                System.out.println("List: " + list);
            }
        };

        Timer timer = new Timer();
        System.out.println("Before");
        timer.schedule(task, 3000);
        timer.schedule(task, 3000, 5000);

//        timer.cancel();
//        timer.purge();

        System.out.println("After");

    }


    @Override
    public int compare(Integer o1, Integer o2) {
        // more comments
        if ((o1 % 2 == 0 && o2 % 2 == 0) ||
                (o1 % 2 != 0 && o2 % 2 != 0)) {
            return Integer.compare(o1, o2);
        } else {
            if (o1 % 2 == 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }

}