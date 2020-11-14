package com.company;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela"};
        for (int i = arr.length; i > 0; i--) {
			System.out.println(arr[i-1]);
		}

    }
}
