package com.leetcode.easy;

public class CountPrimes {
	//Applying Sieve of Eratosthenes Algorithm.
	public int countPrimes(int n) {
		int numOfPrimes = 0;
		boolean[] primes = new boolean[n];
		for(int i = 2 ; i < n ;i++){
			primes[i] = true;
		}
		if(n <= 2)
			return 0;
		for(int i = 2 ; i < n ;i++){
			if(primes[i]){
				for(int j = i+i ; j < n ; j += i){
					primes[j] = false;
				}
			}
		}
		for(int i = 2 ; i < n ;i++){
			if(primes[i])
				numOfPrimes++;
		}
		return numOfPrimes;
	}
	
	public static void main(String[] args){
		System.out.println(new CountPrimes().countPrimes(1500000));
	}
}
