package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int viTriCanXoa = findindex(arr, X);
        if (viTriCanXoa == -1){
            System.out.println("Phần từ không có trong mảng");
        } else {
            arr = delIndex(arr, viTriCanXoa);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
    static int findindex(int[] arr, int phanTu){
        int viTri = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == phanTu) {
                viTri = i;
                break;
            }
        }
        return viTri;
    }
    static int[] delIndex(int[] arr, int viTri) {
        int[] arrNew = new int[arr.length - 1];
        for (int i =0; i < viTri; i++){
            arrNew[i] = arr[i];
        }
        for (int i = viTri + 1; i <arr.length; i++){
            arrNew[i-1] = arr[i];
        }
        return arrNew;
    }
}