package com.company;


import java.util.Arrays;

/**
 * Created by zhaomingming-s on 2017/6/28.
 */
public class Exam {

    public static void main(String[] args) {
        Exam exam = new Exam();

//        System.out.println("the sum of 2th and 3th is: " + exam.henry(2, 3));
//
//        System.out.println("--------------------------------------");
//
//        int[] arrs1 = {3, 4, 3, 6, 36};
//        int[] arrs2 = {3, 3, 3, 6, 36};
//        System.out.println("{3, 4, 3, 6, 36} isDivisible by divisor: " + exam.isDivisible(arrs1, 3));
//        System.out.println("{3, 3, 3, 6, 36} isDivisible by divisor: " + exam.isDivisible(arrs2, 3));
//
//        System.out.println("--------------------------------------");
//
//        System.out.println("{3, 4, 3, 6, 36} isNUnique by 6: " + exam.isNUnique(arrs1, 6));
//        System.out.println("{3, 3, 3, 6, 36} isNUnique by 6: " + exam.isNUnique(arrs2, 6));
//
//        System.out.println("--------------------------------------");
//
//        System.out.println("25 isSquare : " + exam.isSquare(25));
//        System.out.println("-4 isSquare : " + exam.isSquare(-4));
//        System.out.println("8 isSquare : " + exam.isSquare(8));
//        System.out.println("0 isSquare : " + exam.isSquare(0));
//
//        System.out.println("--------------------------------------");
//
//        int[] arrs3 = {1, 0, 1, 1};
//        int[] arrs4 = {1, 1, 2};
//        int[] arrs5 = {3, 7, 1};
//        System.out.println("1011 base on 2 isLegalNumber base on 10 : " + exam.isLegalNumber(arrs3, 2));
//        System.out.println("112 base on 3 isLegalNumber base on 10 : " + exam.isLegalNumber(arrs4, 3));
//        System.out.println("371 base on 6 isLegalNumber base on 10 : " + exam.isLegalNumber(arrs5, 6));
//
//        System.out.println("--------------------------------------");
//
//        int[] arrs6 = {1, 1, 2};
//        int[] arrs7 = {3, 2, 5};
//        int[] arrs8 = {3, 7, 1};
//        System.out.println("112 base on 3 convertToBase10 base on 10 : " + exam.convertToBase10(arrs6, 3));
//        System.out.println("325 base on 8 convertToBase10 base on 10 : " + exam.convertToBase10(arrs7, 8));
//        System.out.println("371 base on 6 convertToBase10 base on 10 : " + exam.convertToBase10(arrs8, 6));
//
//        System.out.println("--------------------------------------");
//
//        int[] arrs9 = {1, 2, 3, -5, -5, 2, 3, 18};
//        int[] arrs10 = {3, -2, 3};
//        int[] arrs11 = {2, 1, -1, -1, 2, 1};
//        int[] arrs13 = {1, 1, 1, -1, -1, 1, 1, 1};
//        int[] arrs14 = {4, -1, 3};
//        int[] arrs15 = {2, -3, 3};
//        int[] arrs16 = {8};
//        System.out.println("{1, 2, 3, -5, -5, 2, 3, 18} matches {3, -2, 3} : " + exam.matches(arrs9, arrs10));
//        System.out.println("{1, 2, 3, -5, -5, 2, 3, 18} matches {2, 1, -1, -1, 2, 1} : " + exam.matches(arrs9, arrs11));
//        System.out.println("{1, 2, 3, -5, -5, 2, 3, 18} matches {1, 1, 1, -1, -1, 1, 1, 1} : " + exam.matches(arrs9, arrs13));
//        System.out.println("{1, 2, 3, -5, -5, 2, 3, 18} matches {4, -1, 3} : " + exam.matches(arrs9, arrs14));
//        System.out.println("{1, 2, 3, -5, -5, 2, 3, 18} matches {2, -3, 3} : " + exam.matches(arrs9, arrs15));
//        System.out.println("{1, 2, 3, -5, -5, 2, 3, 18} matches {8}: " + exam.matches(arrs9, arrs16));
//
//        System.out.println("--------------------------------------");
//
//        System.out.println("1 isStacked : " + exam.isStacked(1));
//        System.out.println("10 isStacked : " + exam.isStacked(10));
//        System.out.println("15 isStacked : " + exam.isStacked(15));
//        System.out.println("7 isStacked : " + exam.isStacked(7));
//        System.out.println("8 isStacked : " + exam.isStacked(8));
//
//        System.out.println("--------------------------------------");
//
//        System.out.println("{5, -5, 0} isSumSafe : " + exam.isSumSafe(new int[]{5, -5, 0}));
//        System.out.println("{5, -2, 1} isSumSafe : " + exam.isSumSafe(new int[]{5, -2, 1}));
//
//        System.out.println("--------------------------------------");
//
//        System.out.println("163 isIsolated : " + exam.isIsolated(163));
//        System.out.println("162 isIsolated : " + exam.isIsolated(162));
//
//        System.out.println("--------------------------------------");
//
//        System.out.println("{1} isVanilla : " + exam.isVanilla(new int[]{1}));
//        System.out.println("{11, 22, 13, 34, 125} isVanilla : " + exam.isVanilla(new int[]{11, 22, 13, 34, 125}));
//        System.out.println("{9, 999, 99999, -9999} isVanilla : " + exam.isVanilla(new int[]{9, 999, 99999, -9999}));
//        System.out.println("{ } isVanilla : " + exam.isVanilla(new int[]{}));
//
//        System.out.println("--------------------------------------");
//
//        System.out.println("{-1, 0, 1, 0, 0, 0} isTrivalent : " + exam.isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
//        System.out.println("{ } isTrivalent : " + exam.isTrivalent(new int[]{}));
//        System.out.println("{ 2147483647, -1, -1,-2147483648} isTrivalent : " + exam.isTrivalent(new int[]{2147483647, -1, -1, -2147483648}));
//        System.out.println("{22, 19, 10, 10, 19, 22, 22, 10}  isTrivalent : " + exam.isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
//        System.out.println("{2, 2, 3, 3, 3, 3, 2, 41, 65}  isTrivalent : " + exam.isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
//
//        System.out.println("--------------------------------------");
//
//        System.out.println("5  countRepresentations : " + exam.countRepresentations(5));
//        System.out.println("3  countRepresentations : " + exam.countRepresentations(3));
//        System.out.println("6  countRepresentations : " + exam.countRepresentations(6));
//        System.out.println("0  countRepresentations : " + exam.countRepresentations(0));
//        System.out.println("12  countRepresentations : " + exam.countRepresentations(12));
//
//        System.out.println("--------------------------------------");
//
//        System.out.println("{0, 1}  isSequentiallyBounded : " + exam.isSequentiallyBounded(new int[]{0, 1}));
//        System.out.println("{-1, 2}  isSequentiallyBounded : " + exam.isSequentiallyBounded(new int[]{-1, 2}));
//        System.out.println("{}  isSequentiallyBounded : " + exam.isSequentiallyBounded(new int[]{}));
//        System.out.println("{5, 5, 5, 5}  isSequentiallyBounded : " + exam.isSequentiallyBounded(new int[]{5, 5, 5, 5}));
//        System.out.println("{5, 5, 5, 2, 5}  isSequentiallyBounded : " + exam.isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));
//
//        System.out.println("--------------------------------------");
//
//        System.out.println("{18, -1, 3, 4, 0}   isMinMaxDisjoint : " + exam.isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
//        System.out.println("{9, 0, 5, 9}    isMinMaxDisjoint : " + exam.isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
//        System.out.println("{0, 5, 18, 0, 9}  isMinMaxDisjoint : " + exam.isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
//        System.out.println("{7, 7, 7, 7}   isMinMaxDisjoint : " + exam.isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
//        System.out.println("{}  isMinMaxDisjoint : " + exam.isMinMaxDisjoint(new int[]{}));
//        System.out.println("{1, 2}    isMinMaxDisjoint : " + exam.isMinMaxDisjoint(new int[]{1, 2}));
//
//        System.out.println("--------------------------------------");
//        System.out.println("4   smallest : " + exam.smallest(4));
//        System.out.println("5   smallest : " + exam.smallest(5));
//        System.out.println("6   smallest : " + exam.smallest(6));
//        System.out.println("7   smallest : " + exam.smallest(7));
//
//
//        System.out.println("--------------------------------------");
//
//        int[] arrRet1 = exam.clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0});
//        for (int i = 0; i < arrRet1.length; i++) {
//            System.out.println("{0, 0, 0, 2, 0, 2, 0, 2, 0, 0}   clusterCompression : " + arrRet1[i]);
//        }
//
//        arrRet1 = exam.clusterCompression(new int[]{18});
//        for (int i = 0; i < arrRet1.length; i++) {
//            System.out.println("{18}   clusterCompression : " + arrRet1[i]);
//        }
//
//        arrRet1 = exam.clusterCompression(new int[]{});
//        for (int i = 0; i < arrRet1.length; i++) {
//            System.out.println("{}   clusterCompression : " + arrRet1[i]);
//        }
//
//        arrRet1 = exam.clusterCompression(new int[]{-5, -5, -5, -5, -5});
//        for (int i = 0; i < arrRet1.length; i++) {
//            System.out.println("{-5, -5, -5, -5, -5}   clusterCompression : " + arrRet1[i]);
//        }
//
//        arrRet1 = exam.clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1});
//        for (int i = 0; i < arrRet1.length; i++) {
//            System.out.println("{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1,1, 1}   clusterCompression : " + arrRet1[i]);
//        }
//
//        arrRet1 = exam.clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2});
//        for (int i = 0; i < arrRet1.length; i++) {
//            System.out.println("{8, 8, 6, 6, -2, -2, -2}   clusterCompression : " + arrRet1[i]);
//        }
//
//
//        System.out.println("--------------------------------------");
//        System.out.println("{1, 2}    isRailroadTie : " + exam.isRailroadTie(new int[]{1, 2}));
//        System.out.println("{1, 2, 0, 1, 2, 0, 1, 2}    isRailroadTie : " + exam.isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
//        System.out.println("{0, 0, 0, 0}   isRailroadTie : " + exam.isRailroadTie(new int[]{0, 0, 0, 0}));
//        System.out.println("{1, 3, 0, 3, 5, 0}    isRailroadTie : " + exam.isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));
//        System.out.println("{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}    isRailroadTie : " + exam.isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
//
//
//        System.out.println("--------------------------------------");
//        System.out.println("{1}   isOddHeavy : " + exam.isOddHeavy(new int[]{1}));
//        System.out.println("{2}    isOddHeavy : " + exam.isOddHeavy(new int[]{2}));
//        System.out.println("{1, 1, 1, 1, 1, 1}  isOddHeavy : " + exam.isOddHeavy(new int[]{1, 1, 1, 1, 1, 1}));
//        System.out.println("{2, 4, 6, 8, 11}  isOddHeavy : " + exam.isOddHeavy(new int[]{2, 4, 6, 8, 11}));
//        System.out.println("{-2, -4, -6, -8, -11}  isOddHeavy : " + exam.isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
//
//
//        System.out.println("--------------------------------------");
//        System.out.println("27 3   getExponent : " + exam.getExponent(27, 3));
//        System.out.println("28 3   getExponent : " + exam.getExponent(28, 3));
//        System.out.println("280 7   getExponent : " + exam.getExponent(280, 7));
//        System.out.println("-250 5   getExponent : " + exam.getExponent(-250, 5));
//        System.out.println("18 1   getExponent : " + exam.getExponent(18, 1));
//        System.out.println("128 4   getExponent : " + exam.getExponent(128, 4));
//
//
//        System.out.println("--------------------------------------");
//        System.out.println("{1, 2, 1}   is121Array : " + exam.is121Array(new int[]{1, 2, 1}));
//        System.out.println("{1, 1, 2, 2, 2, 1, 1}  is121Array : " + exam.is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
//        System.out.println("{1, 1, 2, 2, 2, 1, 1, 1}   is121Array : " + exam.is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
//        System.out.println("{1, 1, 2, 1, 2, 1, 1}   is121Array : " + exam.is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
//        System.out.println("{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}   is121Array : " + exam.is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
//        System.out.println("{1, 1, 1, 1, 1, 1}    is121Array : " + exam.is121Array(new int[]{1, 1, 1, 1, 1, 1}));
//        System.out.println("{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}    is121Array : " + exam.is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
//
//        System.out.println("--------------------------------------");
//
//        int[] retArr = exam.filterArray(new int[]{9, -9}, 0);
//
//        for (int i = 0; i < retArr.length; i++) {
//            System.out.println("{9, -9} 0   filterArray : " + retArr[i]);
//        }
//
//        retArr = exam.filterArray(new int[]{9, -9}, 1);
//
//        for (int i = 0; i < retArr.length; i++) {
//            System.out.println("{9, -9} 1   filterArray : " + retArr[i]);
//        }
//
//        retArr = exam.filterArray(new int[]{9, -9}, 2);
//
//        for (int i = 0; i < retArr.length; i++) {
//            System.out.println("{9, -9} 2   filterArray : " + retArr[i]);
//        }
//
//        retArr = exam.filterArray(new int[]{9, -9}, 3);
//
//        for (int i = 0; i < retArr.length; i++) {
//            System.out.println("{9, -9} 3   filterArray : " + retArr[i]);
//        }
//
//        retArr = exam.filterArray(new int[]{9, -9}, 4);
//
//        if (retArr == null) {
//            System.out.println("{9, -9} 4   filterArray : null ");
//        } else {
//            for (int i = 0; i < retArr.length; i++) {
//                System.out.println("{9, -9} 4   filterArray : " + retArr[i]);
//            }
//        }
//
//        retArr = exam.filterArray(new int[]{9, -9, 5}, 3);
//
//        for (int i = 0; i < retArr.length; i++) {
//            System.out.println("{9, -9, 5} 3   filterArray : " + retArr[i]);
//        }
//
//        retArr = exam.filterArray(new int[]{0, 9, 12, 18, -6}, 11);
//
//        for (int i = 0; i < retArr.length; i++) {
//            System.out.println("{0, 9, 12, 18, -6} 11   filterArray : " + retArr[i]);
//        }
//
//        System.out.println("1%2 : " + 3 / 2);
//
//
//        System.out.println("--------------------------------------");
//        System.out.println("198 2   checkConcatenatedSum : " + exam.checkConcatenatedSum(198, 2));
//        System.out.println("198 3   checkConcatenatedSum : " + exam.checkConcatenatedSum(198, 3));
//        System.out.println("2997 3   checkConcatenatedSum : " + exam.checkConcatenatedSum(2997, 3));
//        System.out.println("2997 2   checkConcatenatedSum : " + exam.checkConcatenatedSum(2997, 2));
//        System.out.println("13332 4   checkConcatenatedSum : " + exam.checkConcatenatedSum(13332, 4));
//        System.out.println("9 1   checkConcatenatedSum : " + exam.checkConcatenatedSum(9, 1));
//
//
//        System.out.println("--------------------------------------");
//        System.out.println("{1, 2, 3, 4, 5} 1 5   isSequencedArray : " + exam.isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5));
//        System.out.println("{1, 3, 4, 2, 5}  1 5   isSequencedArray : " + exam.isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5));
//        System.out.println("{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2} -5 -2   isSequencedArray : " + exam.isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
//        System.out.println("{0, 1, 2, 3, 4, 5}  1 5   isSequencedArray : " + exam.isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5));
//        System.out.println("{1, 2, 3, 4}  1 5   isSequencedArray : " + exam.isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5));
//        System.out.println("{1, 2, 5}  1 5  isSequencedArray : " + exam.isSequencedArray(new int[]{1, 2, 5}, 1, 5));
//
//
//        System.out.println("--------------------------------------");
//        System.out.println("10    largestPrimeFactor : " + exam.largestPrimeFactor(10));
//        System.out.println("6936   largestPrimeFactor : " + exam.largestPrimeFactor(6936));
//        System.out.println("1   largestPrimeFactor : " + exam.largestPrimeFactor(1));


        System.out.println("--------------------------------------");
        int[] retArr = exam.encodeNumber(6);
        if (retArr != null) {
            for (int i = 0; i < retArr.length; i++) {
                System.out.println("6 encodeNumber : " + retArr[i]);
            }
        }

        retArr = exam.encodeNumber(14);
        if (retArr != null) {
            for (int i = 0; i < retArr.length; i++) {
                System.out.println("14 encodeNumber : " + retArr[i]);
            }
        }

        retArr = exam.encodeNumber(24);
        if (retArr != null) {
            for (int i = 0; i < retArr.length; i++) {
                System.out.println("24 encodeNumber : " + retArr[i]);
            }
        }

        retArr = exam.encodeNumber(1200);
        if (retArr != null) {
            for (int i = 0; i < retArr.length; i++) {
                System.out.println("1200 encodeNumber : " + retArr[i]);
            }
        }

        retArr = exam.encodeNumber(1);
        if (retArr != null) {
            for (int i = 0; i < retArr.length; i++) {
                System.out.println("1 encodeNumber : " + retArr[i]);
            }
        }

        retArr = exam.encodeNumber(11);
        if (retArr != null) {
            for (int i = 0; i < retArr.length; i++) {
                System.out.println("11 encodeNumber : " + retArr[i]);
            }
        }

        retArr = exam.encodeNumber(2);
        if (retArr != null) {
            for (int i = 0; i < retArr.length; i++) {
                System.out.println("2 encodeNumber : " + retArr[i]);
            }
        }


        System.out.println("--------------------------------------");
        System.out.println("{1, 1, 1, 1, 1}  {1}  matchPattern : " + exam.matchPattern(new int[]{1, 1, 1, 1, 1}, 5, new int[]{1}, 1));
        System.out.println("{1}  {1}  matchPattern : " + exam.matchPattern(new int[]{1}, 1, new int[]{1}, 1));
        System.out.println("{1, 1, 2, 2, 2, 2}    {1, 2}   matchPattern : " + exam.matchPattern(new int[]{1, 1, 2, 2, 2, 2}, 6, new int[]{1, 2}, 2));
        System.out.println("{1, 2,3}  {1,2}  matchPattern : " + exam.matchPattern(new int[]{1, 2, 3}, 3, new int[]{1, 2}, 2));
        System.out.println("{1, 1, 2, 2, 2, 2, 3}  {1, 3}   matchPattern : " + exam.matchPattern(new int[]{1, 1, 2, 2, 2, 2, 3}, 7, new int[]{1, 3}, 2));
        System.out.println("{1, 1, 1, 1} {1, 2}  matchPattern : " + exam.matchPattern(new int[]{1, 1, 1, 1}, 4, new int[]{1, 2}, 2));
        System.out.println("{1, 1, 1, 1, 2, 2, 3, 3}  {1, 2}   matchPattern : " + exam.matchPattern(new int[]{1, 1, 1, 1, 2, 2, 3, 3}, 7, new int[]{1, 2}, 2));
        System.out.println("{1, 1, 10, 4, 4, 3} {1, 4, 3}  matchPattern : " + exam.matchPattern(new int[]{1, 1, 10, 4, 4, 3}, 6, new int[]{1, 4, 3}, 3));


        System.out.println("--------------------------------------");

        int[] arr = exam.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 2);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("{1, 2, 3, 4, 5} 2   doIntegerBasedRounding : " + arr[i]);
        }

        arr = exam.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 3);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("{1, 2, 3, 4, 5} 3   doIntegerBasedRounding : " + arr[i]);
        }

        arr = exam.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, -3);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("{1, 2, 3, 4, 5} -3   doIntegerBasedRounding : " + arr[i]);
        }

        arr = exam.doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5}, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("{-18, 1, 2, 3, 4, 5} 4   doIntegerBasedRounding : " + arr[i]);
        }

        arr = exam.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 5);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("{1, 2, 3, 4, 5} 5   doIntegerBasedRounding : " + arr[i]);
        }

        arr = exam.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 100);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("{1, 2, 3, 4, 5} 100   doIntegerBasedRounding : " + arr[i]);
        }


        System.out.println("--------------------------------------");
        System.out.println("153   isCubePowerful : " + exam.isCubePowerful(153));
        System.out.println("370  isCubePowerful : " + exam.isCubePowerful(370));
        System.out.println("371  isCubePowerful : " + exam.isCubePowerful(371));
        System.out.println("407  4  isCubePowerful : " + exam.isCubePowerful(407));
        System.out.println("87   isCubePowerful : " + exam.isCubePowerful(87));
        System.out.println("0  isCubePowerful : " + exam.isCubePowerful(0));


        System.out.println("--------------------------------------");
        System.out.println("{0, -3, 0, -4, 0}   decodeArray : " + exam.decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println("{-1, 5, 8, 17, 15}  decodeArray : " + exam.decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println("{1, 5, 8, 17, 15}  decodeArray : " + exam.decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println("{111, 115, 118, 127, 125}    decodeArray : " + exam.decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println("{1, 1}   decodeArray : " + exam.decodeArray(new int[]{1, 1}));


        System.out.println("--------------------------------------");
        System.out.println("{0, 0, 0, 0, 0}   isZeroPlentiful : " + exam.isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
        System.out.println("{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}  isZeroPlentiful : " + exam.isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println("{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0} isZeroPlentiful : " + exam.isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println("{1, 2, 3, 4}   isZeroPlentiful : " + exam.isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println("{1, 0, 0, 0, 2, 0, 0, 0, 0}   isZeroPlentiful : " + exam.isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println("{0}  isZeroPlentiful : " + exam.isZeroPlentiful(new int[]{0}));
        System.out.println("{}    isZeroPlentiful : " + exam.isZeroPlentiful(new int[]{}));


        System.out.println("--------------------------------------");
        System.out.println("7   isDigitIncreasing : " + exam.isDigitIncreasing(7));
        System.out.println("36  isDigitIncreasing : " + exam.isDigitIncreasing(36));
        System.out.println("984  isDigitIncreasing : " + exam.isDigitIncreasing(984));
        System.out.println("7404   isDigitIncreasing : " + exam.isDigitIncreasing(7404));

        System.out.println("--------------------------------------");
        System.out.println("{0, 1}   decodeArray2 : " + exam.decodeArray2(new int[]{0, 1}));
        System.out.println("{1}   decodeArray2 : " + exam.decodeArray2(new int[]{1}));
        System.out.println("{-1, 0, 1}    decodeArray2 : " + exam.decodeArray2(new int[]{-1, 0, 1}));
        System.out.println("{0, 1, 1, 1, 1, 1, 0, 1}    decodeArray2 : " + exam.decodeArray2(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println("{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}   decodeArray2 : " + exam.decodeArray2(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));


        System.out.println("--------------------------------------");
        System.out.println("5   isPrimeHappy : " + exam.isPrimeHappy(5));
        System.out.println("25  isPrimeHappy : " + exam.isPrimeHappy(25));
        System.out.println("32  isPrimeHappy : " + exam.isPrimeHappy(32));
        System.out.println("8   isPrimeHappy : " + exam.isPrimeHappy(8));
        System.out.println("2   isPrimeHappy : " + exam.isPrimeHappy(2));


        System.out.println("--------------------------------------");
        System.out.println("{1}   isSystematicallyIncreasing : " + exam.isSystematicallyIncreasing(new int[]{1}));
        System.out.println("{1, 2, 1, 2, 3}   isSystematicallyIncreasing : " + exam.isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3}));
        System.out.println("{1, 1, 3}  isSystematicallyIncreasing : " + exam.isSystematicallyIncreasing(new int[]{1, 1, 3}));
        System.out.println("{1, 2, 1, 2, 1, 2}   isSystematicallyIncreasing : " + exam.isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2}));
        System.out.println("{1, 2, 3, 1, 2, 1}   isSystematicallyIncreasing : " + exam.isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1}));
        System.out.println("{1, 1, 2, 3}   isSystematicallyIncreasing : " + exam.isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
        System.out.println("{1, 1,2, 1, 2, 3,1,2,3,4,1,2,3,4,5}   isSystematicallyIncreasing : " + exam.isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}));


        System.out.println("--------------------------------------");
        System.out.println("2   isFactorialPrime : " + exam.isFactorialPrime(2));
        System.out.println("3  isFactorialPrime : " + exam.isFactorialPrime(3));
        System.out.println("7  isFactorialPrime : " + exam.isFactorialPrime(7));
        System.out.println("8   isFactorialPrime : " + exam.isFactorialPrime(8));
        System.out.println("11   isFactorialPrime : " + exam.isFactorialPrime(11));
        System.out.println("721   isFactorialPrime : " + exam.isFactorialPrime(721));

        System.out.println("--------------------------------------");
        System.out.println("{1, 3, 5, 9}   largestDifferenceOfEvens : " + exam.largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println("{1, 18, 5, 7, 33}  largestDifferenceOfEvens : " + exam.largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println("{2, 2, 2, 2}  largestDifferenceOfEvens : " + exam.largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println("{1, 2, 1, 2, 1, 4, 1, 6, 4}     largestDifferenceOfEvens : " + exam.largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));


        System.out.println("--------------------------------------");
        System.out.println("2   isHodder : " + exam.isHodder(2));
        System.out.println("3  isHodder : " + exam.isHodder(3));
        System.out.println("7  isHodder : " + exam.isHodder(7));
        System.out.println("8   isHodder : " + exam.isHodder(8));
        System.out.println("11   isHodder : " + exam.isHodder(11));
        System.out.println("31   isHodder : " + exam.isHodder(31));
        System.out.println("127   isHodder : " + exam.isHodder(127));
        System.out.println("128   isHodder : " + exam.isHodder(128));


        System.out.println("--------------------------------------");
        System.out.println("{‘s’, ‘i’, ‘t’} and {‘i’, ‘t’, ‘s’}   areAnagrams : " + exam.areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println("{‘s’, ‘i’, ‘t’} and {‘i’, ‘d’, ‘s’}  areAnagrams : " + exam.areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println("{‘b’, ‘i’, ‘g’} and {‘b’, ‘i’, ‘t’}  areAnagrams : " + exam.areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println("{‘b’, ‘o’, ‘g’} and {‘b’, ‘o’, ‘o’} areAnagrams : " + exam.areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println("{} and {}  areAnagrams : " + exam.areAnagrams(new char[]{}, new char[]{}));
        System.out.println("{‘b’, ‘i’, ‘g’} and {‘b’, ‘i’, ‘g’}  areAnagrams : " + exam.areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));


        System.out.println("--------------------------------------");
        System.out.println("8  closestFibonacci : " + exam.closestFibonacci(8));
        System.out.println("20  closestFibonacci : " + exam.closestFibonacci(20));
        System.out.println("30  closestFibonacci : " + exam.closestFibonacci(30));

        System.out.println("--------------------------------------");
        System.out.println("50  isVesuvian : " + exam.isVesuvian(50));
        System.out.println("60  isVesuvian : " + exam.isVesuvian(60));
        System.out.println("65  isVesuvian : " + exam.isVesuvian(65));
        System.out.println("85  isVesuvian : " + exam.isVesuvian(85));


        System.out.println("--------------------------------------");
        System.out.println("{1, 1, 1, 2, 3, -18, 45, 1}  isOneBalanced : " + exam.isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println("{1, 1, 1, 2, 3, -18, 45, 1, 0}  isOneBalanced : " + exam.isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
        System.out.println("1, 1, 2, 3, 1, -18, 26, 1  isOneBalanced : " + exam.isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println("{}  isOneBalanced : " + exam.isOneBalanced(new int[]{}));
        System.out.println("3, 4, 1, 1  isOneBalanced : " + exam.isOneBalanced(new int[]{3, 4, 1, 1}));
        System.out.println("1, 1, 3, 4  isOneBalanced : " + exam.isOneBalanced(new int[]{1, 1, 3, 4}));
        System.out.println("3, 3, 3, 3, 3, 3  isOneBalanced : " + exam.isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println("1, 1, 1, 1, 1, 1  isOneBalanced : " + exam.isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));


        System.out.println("--------------------------------------");
        System.out.println("6  isTriangular : " + exam.isTriangular(6));
        System.out.println("7  isTriangular : " + exam.isTriangular(7));
        System.out.println("10  isTriangular : " + exam.isTriangular(10));
        System.out.println("2  isTriangular : " + exam.isTriangular(2));
        System.out.println("1  isTriangular : " + exam.isTriangular(1));


        System.out.println("--------------------------------------");
        System.out.println("{1, 2, 10, 3, 15, 1, 2, 2}  isMercurial : " + exam.isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println("{5, 2, 10, 3, 15, 1, 2, 2}  isMercurial : " + exam.isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println("1, 2, 10, 3, 15, 16, 2, 2  isMercurial : " + exam.isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println("{3, 2, 18, 1, 0, 3, -11, 1, 3}  isMercurial : " + exam.isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println("2, 3, 1, 1, 18  isMercurial : " + exam.isMercurial(new int[]{2, 3, 1, 1, 18}));
        System.out.println("8, 2, 1, 1, 18, 3, 5  isMercurial : " + exam.isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
        System.out.println("3, 3, 3, 3, 3, 3  isMercurial : " + exam.isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println("1  isMercurial : " + exam.isMercurial(new int[]{1}));
        System.out.println("{}  isMercurial : " + exam.isMercurial(new int[]{}));


        System.out.println("--------------------------------------");
        System.out.println("{2, 3, 5, 7, 11}  is235Array : " + exam.is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println("{2, 3, 6, 7, 11}  is235Array : " + exam.is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println("2, 3, 4, 5, 6, 7, 8, 9, 10  is235Array : " + exam.is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println("{2, 4, 8, 16, 32}  is235Array : " + exam.is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println("3, 9, 27, 7, 1, 1, 1, 1, 1  is235Array : " + exam.is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println("7, 11, 77, 49  is235Array : " + exam.is235Array(new int[]{7, 11, 77, 49}));
        System.out.println("2  is235Array : " + exam.is235Array(new int[]{2}));
        System.out.println("{}  is235Array : " + exam.is235Array(new int[]{}));
        System.out.println("{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}  is235Array : " + exam.is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));


        System.out.println("--------------------------------------");
        System.out.println("3735  computeHMS : " + exam.computeHMS(3735));
        System.out.println("380  computeHMS : " + exam.computeHMS(380));
        System.out.println("3650  computeHMS : " + exam.computeHMS(3650));
        System.out.println("55  computeHMS : " + exam.computeHMS(55));
        System.out.println("0  computeHMS : " + exam.computeHMS(0));

        System.out.println("--------------------------------------");
        System.out.println("{1, 3}  isMartian : " + exam.isMartian(new int[]{1, 3}));
        System.out.println("{1, 2, 1, 2, 1, 2, 1, 2, 1}  isMartian : " + exam.isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println("{1, 3, 2} isMartian : " + exam.isMartian(new int[]{1, 3, 2}));
        System.out.println("{1, 3, 2, 2, 1, 5, 1, 5}  isMartian : " + exam.isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5}));
        System.out.println("{1, 2, -18, -18, 1, 2}  isMartian : " + exam.isMartian(new int[]{1, 2, -18, -18, 1, 2}));
        System.out.println("{} isMartian : " + exam.isMartian(new int[]{}));
        System.out.println("{1}  isMartian : " + exam.isMartian(new int[]{1}));
        System.out.println("2  isMartian : " + exam.isMartian(new int[]{2}));


        System.out.println("--------------------------------------");
        System.out.println("{1, 4, 1, 4, 5, 6} 5  isPairedN : " + exam.isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 5));
        System.out.println("{1, 4, 1, 4, 5, 6} 6  isPairedN : " + exam.isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 6));
        System.out.println("{0, 1, 2, 3, 4, 5, 6, 7, 8} 6 isPairedN : " + exam.isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));
        System.out.println("{1, 4, 1} 5  isPairedN : " + exam.isPairedN(new int[]{1, 4, 1}, 5));
        System.out.println("{8, 8, 8, 8, 7, 7, 7} 15  isPairedN : " + exam.isPairedN(new int[]{8, 8, 8, 8, 7, 7, 7}, 15));
        System.out.println("{8, -8, 8, 8, 7, 7, -7} -15 isPairedN : " + exam.isPairedN(new int[]{8, -8, 8, 8, 7, 7, -7}, -15));
        System.out.println("{3}  3 isPairedN : " + exam.isPairedN(new int[]{3}, 3));
        System.out.println("{}  isPairedN : " + exam.isPairedN(new int[]{}, 0));


    }

    /*************question a perfect number**************/

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


    /*************question a isDivisible******************/

    private int isDivisible(int[] arrs, int divisor) {
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] % divisor != 0)
                return 0;
        }
        return 1;
    }


    /*************question n-unique******************/

    private int isNUnique( int[] arrs, int n) {
        if (arrs.length < 2)
            return 0;
        int equalCount = 0;
        for (int i = 0; i < arrs.length; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[i] + arrs[j] == n) {
                    equalCount++;
                }
            }
        }
        if (equalCount == 1)
            return 1;
        else
            return 0;
    }


    /*************question isSquare******************/

    private int isSquare(int n) {
        if (n < 0) return 0;
        for (int i = 0; i <= n; i++) {
            if (i * i == n)
                return 1;
        }
        return 0;
    }


    /*************question isLegalNumber******************/

    private int isLegalNumber(int[] arrs, int n) {
        int sum = 0;
        for (int i = 0; i < arrs.length; i++) {
            int element = arrs[arrs.length - i - 1];
            if (element > n) return 0;
            sum += element * Math.pow(n, i);
        }
        if (sum > 10)
            return 1;
        else
            return 0;
    }


    /*************question convertToBase10******************/

    private int convertToBase10(int[] arrs, int n) {
        if (isLegalNumber(arrs, n) == 0) return -1;
        int sum = 0;
        for (int i = 0; i < arrs.length; i++) {
            int element = arrs[arrs.length - i - 1];
            sum += element * Math.pow(n, i);
        }
        return sum;
    }


    /*************question matches******************/

    private int matches(int[] a, int[] p) {
        int startIndex = 0;
        for (int i = 0; i < p.length; i++) {
            int length;
            if (p[i] < 0)
                length = -p[i];
            else
                length = p[i];
            for (int j = startIndex; j < length; j++) {
                if (p[i] * a[j] < 0) {
                    return 0;
                }
            }
            startIndex += length;
        }
        return 1;
    }


    /*************question isStacked******************/

    private int isStacked(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (sum == n) return 1;
        }
        return 0;
    }


    /*************question isSumSafe******************/

    private int isSumSafe(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (sum == a[i]) return 0;
        }
        return 1;
    }


    /*************question isIsolated******************/

    private int isIsolated(long n) {
        if (n < 1 || n > 2097151) {
            return -1;
        }
        long square = n * n;
        long cube = n * n * n;

        String squareStr = String.valueOf(square);
        String cubeStr = String.valueOf(cube);

        char[] cubeCharArr = cubeStr.toCharArray();
        char[] squareCharArr = squareStr.toCharArray();
        for (int i = 0; i < cubeCharArr.length; i++) {
            for (int j = 0; j < squareCharArr.length; j++) {
                if (cubeCharArr[i] == squareCharArr[j])
                    return 0;
            }
        }
        return 1;
    }


    /*************question vanilla******************/

    private int isVanilla(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        int baseDigit = getBaseDigit(a[0]);
        for (int i = 0; i < a.length; i++) {
            int element = a[i];
            if (!isElementLegal(element))
                return 0;
            if (getBaseDigit(element) != baseDigit)
                return 0;
        }
        return 1;
    }

    private boolean isElementLegal(int element) {
        if (element < 0) element = -element;
        char[] elementCharArr = String.valueOf(element).toCharArray();
        for (int j = 0; j < elementCharArr.length; j++) {
            for (int i = j + 1; i < elementCharArr.length; i++) {
                if (elementCharArr[j] != elementCharArr[i]) return false;
            }
        }
        return true;
    }

    private int getBaseDigit(int element) {
        if (element < 0) element = -element;
        return element % 10;
    }


    /*************question trivalent******************/

    private int isTrivalent(int[] a) {
        if (a.length < 3)
            return 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] != a[j] && a[j] != a[k] && a[k] != a[i]) {
                        int[] tmpArr = new int[3];
                        tmpArr[0] = a[i];
                        tmpArr[1] = a[j];
                        tmpArr[2] = a[k];
                        for (int l = 0; l < a.length; l++) {
                            boolean isIncluded = false;
                            for (int m = 0; m < tmpArr.length; m++) {
                                if (a[l] == tmpArr[m])
                                    isIncluded = true;
                            }
                            if (!isIncluded)
                                return 0;
                        }
                    }
                }
            }
        }

        return 1;
    }


    /*************question countRepresentations******************/

    private static final int RUPEE_ONE = 1;
    private static final int RUPEE_TWO = 2;
    private static final int RUPEE_FIVE = 5;
    private static final int RUPEE_TEN = 10;
    private static final int RUPEE_TWENTY = 20;

    private int countRepresentations(int n) {
        int count = 0;
        if (n >= 20) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; k <= n; k++) {
                        for (int l = 0; l <= n; l++) {
                            for (int m = 0; m <= n; m++) {
                                if (i * RUPEE_ONE + j * RUPEE_TWO + k * RUPEE_FIVE + l * RUPEE_TEN + m * RUPEE_TWENTY == n) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        } else if (n >= 10) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; k <= n; k++) {
                        for (int l = 0; l <= n; l++) {
                            if (i * RUPEE_ONE + j * RUPEE_TWO + k * RUPEE_FIVE + l * RUPEE_TEN == n) {
                                count++;
                            }
                        }
                    }
                }
            }
        } else if (n >= 5) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; k <= n; k++) {
                        if (i * RUPEE_ONE + j * RUPEE_TWO + k * RUPEE_FIVE == n) {
                            count++;
                        }
                    }
                }
            }
        } else if (n >= 2) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i * RUPEE_ONE + j * RUPEE_TWO == n) {
                        count++;
                    }
                }
            }
        } else if (n == 1) {
            return 1;
        }
        return count;
    }


    /*************question isSequentiallyBounded******************/

    private int isSequentiallyBounded(int[] a) {
        if (a.length == 0)
            return 1;

        if (!isLegal(a)) return 0;
        if (!isRising(a)) return 0;

        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (count >= a[i])
                return 0;
        }

        return 1;
    }

    private boolean isRising(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j])
                    return false;
            }
        }
        return true;
    }

    private boolean isLegal(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0)
                return false;
        }
        return true;
    }


    /*************question minmax-disjoint******************/

    private int isMinMaxDisjoint(int[] a) {
        if (a.length == 0 || a.length == 1)
            return 0;
        sort(a);
        int min = a[0];
        int max = a[a.length - 1];
        if (min == max)
            return 0;

        if (max - min == 1)
            return 0;

        if (min == a[1] || max == a[a.length - 2])
            return 0;

        return 1;
    }

    private void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int tmp;
                if (a[j] < a[i]) {
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
    }


    /*************question smallest******************/

    private int smallest(int n) {
        if (n == 0) return 0;
        int ret = 0;
        int count = 0;
        while (true) {

            for (int i = 1; i <= n; i++) {
                String multipledStr = String.valueOf(ret * i);
                if (multipledStr.contains("2"))
                    count++;
            }
            if (count == n)
                break;
            count = 0;
            ret++;
        }
        return ret;
    }

    /*************question clusterCompression******************/

    private int[] clusterCompression(int[] a) {
        if (a.length == 1 || a.length == 0)
            return a;
        int size = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] != a[j]) {
                    size++;
                    i = j - 1;
                    break;
                }
            }
        }
        System.out.println("size: " + size);
        int[] ret = new int[size];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            ret[count] = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] != a[j]) {
                    count++;
                    i = j - 1;
                    break;
                }
            }
        }
        return ret;
    }

    /*************question railroad-tie******************/

    private int isRailroadTie(int[] a) {
        if (a.length == 0 || a.length == 1)
            return 0;
        if (a[0] == 0 || a[a.length - 1] == 0)
            return 0;
        if (!includeNonZeroElement(a))
            return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                if (a[i - 1] == 0 || a[i + 1] == 0)
                    return 0;
            } else {
                if (i == 0) {
                    if (a[i + 1] == 0)
                        return 0;
                } else if (i == a.length - 1) {
                    if (a[i - 1] == 0)
                        return 0;
                } else {
                    if (a[i - 1] == 0 && a[i + 1] == 0)
                        return 0;
                }
            }
        }

        return 1;
    }

    private boolean includeNonZeroElement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                return true;
        }
        return false;
    }

    /*************question isOddHeavy******************/

    private int isOddHeavy(int[] a) {
        if (a == null || a.length == 0)
            return 0;
        if (!containOdd(a))
            return 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                int oddElement = a[i];
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 != 0)
                        continue;

                    if (oddElement < a[j])
                        return 0;
                }
            }
        }
        return 1;
    }

    private boolean containOdd(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                return true;
            }
        }
        return false;
    }


    /*************question getExponent******************/

    private int getExponent(int n, int p) {

        if (p <= 1) return -1;

        if (n == 0) return -1;

        if (n == 1) return 0;

        if (n < 0) n = -n;

        int retExponent = 0;
        int exponent = 1;

        while (true) {

            int tmp = 1;
            for (int i = 0; i < exponent; i++) {
                tmp *= p;
            }

            if (tmp <= n) {
                if (n % tmp == 0) {
                    retExponent = exponent;
                }
            } else
                break;

            exponent++;
        }

        return retExponent;
    }


    /*************question is121Array******************/
    private int is121Array(int[] a) {
        if (a == null || a.length < 3)
            return 0;

        if (!isElementLegal(a))
            return 0;

        if (a[0] != 1 || a[a.length - 1] != 1)
            return 0;

        if (!is2Consecutive(a))
            return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                if (a[a.length - 1 - i] != 1)
                    return 0;
            }
        }

        return 1;
    }

    private boolean isElementLegal(int[] a) {
        boolean isHas1 = false;
        boolean isHas2 = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 1 && a[i] != 2)
                return false;
            if (a[i] == 1)
                isHas1 = true;
            if (a[i] == 2)
                isHas2 = true;
        }
        return isHas1 && isHas2;
    }

    private boolean is2Consecutive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 2) {
                if (a[i + 1] != 2) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[j] == 2) {
                            return false;
                        }
                    }
                }
            }

        }
        return true;
    }


    /*************question filterArray******************/

    private int[] filterArray(int[] a, int n) {
        String binaryStr = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
        char[] charArr = binaryStr.toCharArray();
        int size = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '1') {
                if (i >= a.length)
                    return null;
                size++;
            }
        }
        int[] ret = new int[size];
        int index = 0;
        for (int j = 0; j < charArr.length; j++) {
            if (charArr[j] == '1') {
                if (j >= a.length)
                    return null;
                ret[index] = a[j];
                index++;
            }
        }

        return ret;
    }


    /*************question checkConcatenatedSum******************/

    private int checkConcatenatedSum(int n, int concatenateTimes) {

        int sum = 0;
        int tmp = n;
        int dividend = 10;
        int compareBaseNumber = 1;
        while (n > compareBaseNumber) {
            int modulus = (tmp % dividend) / compareBaseNumber;

            sum += getConcatenatedSum(modulus, concatenateTimes);

            dividend *= 10;
            compareBaseNumber *= 10;
        }

        if (sum == n)
            return 1;
        else
            return 0;

    }

    private int getConcatenatedSum(int n, int concatenateTimes) {
        int sum = 0;
        int multiplicand = 1;
        for (int i = 0; i < concatenateTimes; i++) {
            sum += multiplicand * n;
            multiplicand *= 10;
        }
        return sum;
    }

    /*************question isSequencedArray******************/

    private int isSequencedArray(int[] a, int m, int n) {
        if (!isAscendingOrder(a))
            return 0;
        if (a[0] != m)
            return 0;

        if (a[a.length - 1] != n)
            return 0;

        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                if (a[i + 1] - a[i] >= 2) {
                    return 0;
                }
            }

        }
        return 1;
    }

    private boolean isAscendingOrder(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i])
                    return false;
            }
        }
        return true;
    }


    /*************question largestPrimeFactor******************/

    private int largestPrimeFactor(int n) {
        if (n < 1) return 0;

        int tmp = n;
        while (tmp > 1) {
            if (n % tmp == 0) {
                if (isPrime(tmp))
                    return tmp;
            }
            tmp--;
        }
        return 0;
    }

    private boolean isPrime(int n) {
        if (n == 2)
            return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    /*************question encodeNumber******************/

    private int[] encodeNumber(int n) {
        if (n <= 1)
            return null;
        int size = 0;
        int tmp = n;
        while (tmp > 1) {
            if (n % tmp == 0) {
                if (isPrime(tmp))
                    size++;
            }
            tmp--;
        }
        System.out.println("size: " + size);
        int[] primeFactorArr = new int[size];
        tmp = n;
        int index = 0;
        while (tmp > 1) {
            if (n % tmp == 0) {
                if (isPrime(tmp)) {
                    primeFactorArr[index] = tmp;
                    index++;
                }

            }
            tmp--;
        }

        for (int i = 0; i < primeFactorArr.length; i++) {
            System.out.println("primeFactorArr: " + primeFactorArr[i]);
        }

        tmp = n;
        size = 0;
        for (int i = 0; i < primeFactorArr.length; i++) {
            if (tmp % primeFactorArr[i] == 0) {
                tmp = tmp / primeFactorArr[i];
                i--;
                size++;
            }
        }

        System.out.println("ret arr size: " + size);
        int[] ret = new int[size];
        index = 0;
        tmp = n;
        for (int i = 0; i < primeFactorArr.length; i++) {
            if (tmp % primeFactorArr[i] == 0) {
                tmp = tmp / primeFactorArr[i];
                ret[index] = primeFactorArr[i];
                i--;
                index++;
            }
        }

        System.out.println("tmp: " + tmp);
        if (tmp == 1) {
            return ret;
        } else {
            return null;
        }

    }


    /*************question matchPattern******************/
    static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
        // len is the number of elements in the array a, patternLen is the number of elements in thepattern.
        int i = 0; // index into a
        int k = 0; // index into pattern
        int matches = 0; // how many times current pattern character has been matched so far
        for (i = 0; i < len; i++) {
            if (a[i] == pattern[k])
                matches++; // current pattern character was matched
            else if (matches == 0 || k == patternLen - 1)
                return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
            else {// advance to next pattern character
                // !!You write this code !!
                if (k == patternLen)
                    break;
                i--;
                k++;
            } // end of else
        } // end of for
        // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
        if (i == len && k == patternLen - 1) return 1;
        else return 0;
    }

    /*************question doIntegerBasedRounding******************/

    private int[] doIntegerBasedRounding(int[] a, int n) {
        if (n <= 0) {
            return a;
        }

        int[] ret = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int baseRoundingInteger = getIntegerLessBasedRounding(n, a[i]);

            if (a[i] < 0) {
                ret[i] = a[i];
            } else {
                if (baseRoundingInteger + n - a[i] <= a[i] - baseRoundingInteger) {
                    ret[i] = baseRoundingInteger + n;
                } else {
                    ret[i] = baseRoundingInteger;
                }
            }

        }

        return ret;

    }

    private int getIntegerLessBasedRounding(int a, int base) {
        for (int i = base; i >= 0; i--) {
            if (i % a == 0) {
                return i;
            }
        }
        return 0;
    }


    /*************question isCubePowerful******************/

    private int isCubePowerful(int n) {
        if (n <= 0)
            return 0;
        int compareBaseNumber = 1;
        int dividend = 10;
        int tmp = n;
        int cubesSumNumber = 0;
        while (n > compareBaseNumber) {
            int modulus = (tmp % dividend) / compareBaseNumber;

            cubesSumNumber += modulus * modulus * modulus;
            dividend *= 10;
            compareBaseNumber *= 10;
        }

        if (cubesSumNumber == n)
            return 1;
        else
            return 0;
    }


    /*************question decodeArray******************/
    private int decodeArray(int[] a) {
        boolean isNegative = a[0] < 0;

        int retNumber = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int digit = a[i] - a[i + 1];
            if (digit < 0)
                digit = -digit;
            int count = a.length - 1 - i;
            for (int j = 0; j < count - 1; j++) {
                digit *= 10;
            }
            retNumber += digit;
        }
        if (isNegative)
            retNumber = -retNumber;
        return retNumber;
    }


    /*************question isZeroPlentiful******************/
    private int isZeroPlentiful(int[] a) {
        if (a.length < 4)
            return 0;

        int retcCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                int zeroSumCount = 0;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] == 0) {
                        zeroSumCount++;
                    } else {
                        if (zeroSumCount >= 3) {
                            retcCount++;
                        } else {
                            return 0;
                        }
                        i = j;
                        break;
                    }

                    if (j == a.length - 1) {
                        if (zeroSumCount >= 3) {
                            retcCount++;
                            return retcCount;
                        }
                    }

                }
            }
        }

        return retcCount;
    }


    /*************question isDigitIncreasing******************/
    private int isDigitIncreasing(int n) {
        if (n == 0)
            return 1;

        for (int i = 1; i < 10; i++) {
            int multiplicand = 1;
            int tmp = 0;
            int sum = 0;
            while (sum < n) {
                tmp = multiplicand * i + tmp;
                sum += tmp;
                multiplicand *= 10;
            }
            if (sum == n)
                return 1;
        }
        return 0;
    }

    /*************question decodeArray******************/
    private int decodeArray2(int[] a) {
        boolean isNegative = false;

        String retStr = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0 && a[0] == -1) {
                isNegative = true;
                continue;
            }

            if (a[i] == 0) {
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
//                    System.out.println("a[j]: " + a[j]);
//                    System.out.println("count: " + count);
                    if (a[j] == 0) {
                        count++;
                    } else {
                        retStr += count;
                        i = j - 1;
                        break;
                    }

                }
            } else {
                if (i + 1 < a.length && a[i + 1] != 0) {
                    retStr += 0;
                }
            }
        }
        if (retStr == "") return 0;

        int ret = Integer.parseInt(retStr);
        if (isNegative) ret = -ret;

        return ret;
    }


    /*************question isPrimeHappy******************/

    private int isPrimeHappy(int n) {
        if (n <= 2)
            return 0;

        int sum = 0;
        for (int i = 2; i < n; i++) {

            if (isPrime(i)) {
                sum += i;
            }
        }

        if (sum == 0)
            return 0;

        if (sum % n == 0) {
            return 1;
        }

        return 0;
    }


    /*************question isSystematicallyIncreasing******************/

    private int isSystematicallyIncreasing(int[] a) {
        if (a[0] != 1)
            return 0;

        if (a.length > 1 && a[1] != 1)
            return 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == 1) {
                int sequentCount = a[i - 1] + 1;
                if (i + sequentCount < a.length) {
                    if (a[i + sequentCount] != 1) {
                        return 0;
                    }
                }
                for (int j = i; j < i + sequentCount; j++) {
                    if (j + 1 < i + sequentCount) {
                        if (a[j + 1] - a[j] != 1) {
                            return 0;
                        }
                    }

                }
            }
        }
        return 1;
    }


    /*************question isFactorialPrime******************/

    private int isFactorialPrime(int n) {
        if (n == 1) {
            return 1;
        }
        if (!isPrime(n))
            return 0;

        int factorialNum = 1;
        int factorialResult = 0;
        while (factorialResult < n) {

            factorialResult = factorial(factorialNum);

            if (factorialResult + 1 == n)
                return 1;

            factorialNum++;
        }

        return 0;

    }

    private int factorial(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }


    /*************question largestDifferenceOfEvens******************/

    private int largestDifferenceOfEvens(int[] a) {

        int[] evenArr = getEvenArr(a);

        if (evenArr.length < 2) {
            return -1;
        }

        int maxDifference = 0;
        for (int i = 0; i < evenArr.length; i++) {
            if (i == 0) {
                if (evenArr[i] > evenArr[i + 1]) {
                    maxDifference = evenArr[i] - evenArr[i + 1];
                } else {
                    maxDifference = evenArr[i + 1] - evenArr[i];
                }
            }
            for (int j = i + 1; j < evenArr.length; j++) {
                int difference;
                if (evenArr[i] > evenArr[j]) {
                    difference = evenArr[i] - evenArr[j];
                } else {
                    difference = evenArr[j] - evenArr[i];
                }
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }
        }


        return maxDifference;
    }

    private int[] getEvenArr(int[] a) {
        int size = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) size++;
        }

        int[] retArr = new int[size];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                retArr[index] = a[i];
                index++;

            }
        }

        return retArr;
    }


    /*************question isHodder******************/

    private int isHodder(int n) {
        if (n < 2)
            return 0;

        int exponentResult = 1;
        while (exponentResult < n) {
            exponentResult *= 2;
            if (exponentResult - 1 == n) {
                return 1;
            }
        }

        return 0;
    }

    /*************question areAnagrams******************/
    private int areAnagrams(char[] a1, char[] a2) {
        if (a1 == null || a2 == null)
            return 0;

        if (a1.length != a2.length)
            return 0;

        if (a1.length == 0)
            return 1;

        int count = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    if (i != j) {
                        char tmp = a2[j];
                        a2[j] = a2[i];
                        a2[i] = tmp;
                    }
                    count++;
                    break;
                }
            }
        }
        if (count == a1.length)
            return 1;
        else
            return 0;
    }


    /*************question closestFibonacci******************/
    private int closestFibonacci(int n) {
        for (int i = n; i > 0; i--) {
            if (isFibonacci(i))
                return i;
        }
        return 0;
    }

    private boolean isFibonacci(int n) {
        int lastNum1 = 0;
        int lastNum2 = 1;
        int calculatedNum = 0;
        while (calculatedNum <= n) {
            calculatedNum = lastNum1 + lastNum2;
            if (calculatedNum == n)
                return true;
            lastNum1 = lastNum2;
            lastNum2 = calculatedNum;
        }
        return false;
    }


    /*************question isVesuvian******************/

    private int isVesuvian(int n) {
        int[] squareArr = getSquareArr(n);
        int corrextSumCount = 0;
        if (squareArr.length > 2) {
            for (int i = 0; i < squareArr.length; i++) {
                for (int j = i; j < squareArr.length; j++) {
                    if (squareArr[i] + squareArr[j] == n) {
                        corrextSumCount++;
                    }
                }
            }
        }
        if (corrextSumCount == 2)
            return 1;
        else
            return 0;
    }

    private int[] getSquareArr(int n) {
        int size = 0;

        for (int i = 1; i < n; i++) {
            if (isSquare(i) == 1)
                size++;
        }

        int[] ret = new int[size];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (isSquare(i) == 1) {
                ret[index] = i;
                index++;
            }

        }

        return ret;
    }


    /*************question isOneBalanced******************/

    private int isOneBalanced(int[] a) {
        int countOf1s = 0;
        int countOfNon1s = 0;
        boolean isLegal = true;
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                if (a[i] == 1 && a[i - 1] != 1) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[j] != 1) {
                            isLegal = false;
                        }
                    }
                }
            }
        }


        if (!isLegal) return 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                countOf1s++;
            else
                countOfNon1s++;
        }

        if (countOf1s == countOfNon1s)
            return 1;
        else if (countOf1s == 0 && countOfNon1s == 0 && a.length == 0) {
            return 1;
        } else
            return 0;
    }


    /*************question isTriangular******************/

    private int isTriangular(int n) {
        int calculatedNum = 0;
        int index = 1;
        while (calculatedNum <= n) {
            calculatedNum = calculatedNum + index;
            if (n == calculatedNum)
                return 1;
            index++;
        }

        return 0;
    }


    /*************question isMercurial******************/
    private int isMercurial(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i != 0 && i != a.length - 1) {
                if (a[i] == 3) {
                    boolean isForepartContain1 = false;
                    boolean isLastpartContain1 = false;
                    for (int j = 0; j < i - 1; j++) {
                        if (a[j] == 1)
                            isForepartContain1 = true;
                    }
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[j] == 1)
                            isLastpartContain1 = true;
                    }

                    if (isForepartContain1 && isLastpartContain1)
                        return 0;
                }
            }
        }
        return 1;
    }

    /*************question is235Array******************/
    private int is235Array(int[] a) {
        int countOfDividedBy2 = 0;
        int countOfDividedBy3 = 0;
        int countOfDividedBy5 = 0;
        int countOfNormalNum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                countOfDividedBy2++;
            if (a[i] % 3 == 0)
                countOfDividedBy3++;
            if (a[i] % 5 == 0)
                countOfDividedBy5++;
            if (a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0)
                countOfNormalNum++;
        }

        int count = countOfDividedBy2 + countOfDividedBy3 + countOfDividedBy5 + countOfNormalNum;
        if (count == a.length)
            return 1;
        else
            return 0;
    }


    /*************question computeHMS******************/
    private int[] computeHMS(int seconds) {
        int[] ret = new int[3];
        int hour = 0;
        int minute = 0;
        int second = 0;

        hour = seconds / 3600;
        minute = (seconds - hour * 3600) / 60;
        second = seconds - hour * 3600 - minute * 60;
        System.out.println("hour: " + hour);
        System.out.println("minute: " + minute);
        System.out.println("second: " + second);
        ret[0] = hour;
        ret[1] = minute;
        ret[2] = second;

        return null;
    }

    /*************question isMartian******************/
    private int isMartian(int[] a) {
        if (isAdjacentElementEqual(a)) return 0;

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                count1++;
            if (a[i] == 2)
                count2++;
        }

        if (count1 > count2)
            return 1;
        return 0;
    }

    private boolean isAdjacentElementEqual(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i + 1 < a.length) {
                if (a[i] == a[i + 1])
                    return true;
            }
        }
        return false;
    }


    /*************question isPairedN******************/
    private int isPairedN(int[] a, int n) {
        if (a.length < 2 || n < 0)
            return 0;
        for (int i = 0; i < a.length; i++) {
            int partnerIndex = n - i;
            if (partnerIndex > i && partnerIndex < a.length) {
                if (a[i] + a[partnerIndex] == n)
                    return 1;
            }
        }
        return 0;
    }
}
