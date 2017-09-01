package com.company;

public class Main {

    public static void main(String[] args) {

    }


    private long henry(int x, int y) {
        return getPrefectNum(x) + getPrefectNum(y);
    }

    private long getPrefectNum(int position) {
        long prefectNum = 0;
        int index = 0;
        while (true) {
            prefectNum++;
            int j = 0;
            for (int i = 1; i < prefectNum; i++) {
                if (prefectNum % i == 0) {
                    j += i;
                }
            }

//			System.out.println(j);
//			System.out.println(prefectNum);
//			System.out.println("---------------");
            if (j == prefectNum) {
                index++;
                if (index == position)
                    break;
            }
        }
        return prefectNum;
    }
}
