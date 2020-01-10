package com.padmaja.flowcontrol;

public class DoWhileExample {
    public int getNumbers(int number,int finishNumber) {
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound++;
            if(evenNumbersFound >=5){
                break;
            }

        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
        return evenNumbersFound;
    }


    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else {
            return false;
        }
    }
}



 /*
    int count = 6;
    count = 1;
    do {
        System.out.println("count value was " + count);
        count++;
        if(count > 100){
        break;
        }

       }While(count != 6);

     }
    int number = 4;
    int finishNumber = 20;

 */