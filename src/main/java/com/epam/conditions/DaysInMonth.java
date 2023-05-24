package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(year < 0 || (month < 0 || month > 12)){
            System.out.println("invalid date");
        }else{
            boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

            switch(month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println(31);
                    break;
                case 2:
                    if(isLeapYear){
                        System.out.println(29);
                    }else{
                        System.out.println(28);
                    }
                    break;
                default:
                    System.out.println(30);
                    break;
            }
        }



    }
}

