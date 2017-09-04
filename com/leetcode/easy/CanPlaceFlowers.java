package com.leetcode.easy;

public class CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
			return true;
		int distance = 0;
		int prevOneIndex = -1;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				distance++;
			} else {
				if (prevOneIndex == -1) {
					if (distance >= 2) {
						n -= (distance / 2);
					}
					if (n == 0) {
						return true;
					}
				} else {
					if (distance >= 3) {
						n -= ((distance - 1) / 2);
					}
					if (n == 0) {
						return true;
					}
				}
				prevOneIndex = i;
				distance = 0;
			}
		}
		if (prevOneIndex == -1 && distance != 0) {
			int temp = (distance - 1) / 2;
			temp++;
			if (temp >= n) {
				return true;
			} else {
				return false;
			}
		} else if (prevOneIndex != -1) {
			int temp = distance / 2;
			if (temp >= n) {
				return true;
			} else {
				return false;
			}
		}
		return true;

    }

}
