package com.leetcode.rectangleArea_II;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 2, 2}, {1, 0, 2, 3}, {1, 0, 3, 1}};
        System.out.println(new Solution().rectangleArea(arr));
    }
}

class Solution {
    public int rectangleArea(int[][] rectangles) {

        int res = 0;

        Rectangle rectangle1 = new Rectangle(0, 0, 2, 2);
        Rectangle rectangle2 = new Rectangle(1, 0, 2 - 1, 3 - 0);
        Rectangle rectangle3 = new Rectangle(1, 0, 3 - 1, 1 - 0);
        boolean intersects = rectangle1.intersects(rectangle2);

        if (intersects) {
            Rectangle intersection = rectangle1.intersection(rectangle2);
            double intersectionS = extracted(intersection);
            double s1 = extracted(rectangle1);
            double s2 = extracted(rectangle2);

            res =  (int) (s1 + s2 - intersectionS);
        }

        boolean intersects1 = rectangle1.intersects(rectangle3);

        if (intersects1){

        }
        return res;
    }

    private double extracted(Rectangle intersection) {
        double height = intersection.getHeight();
        double width = intersection.getWidth();
        return height * width;
    }
}
