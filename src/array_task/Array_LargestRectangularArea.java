package array_task;

import java.util.Stack;

public class Array_LargestRectangularArea {
    public static void main(String[] args) {

        System.out.println(largestRectangularArea(new int[]{6, 2, 5, 4, 5, 1, 6}));

    }

    private static int largestRectangularArea(int[] heights) {

        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            int count = 1;

            for (int j = i + 1; j < heights.length; j++) {

                if (heights[j] < heights[i]){
                    break;
                }
                count++;
            }

            for (int k = i - 1; k >= 0; k--) {

                if (heights[k] < heights[i]){
                    break;
                }
                count++;
            }
            max = Math.max(max, heights[i] * count);
        }
        return max;
    }

    static int getMaxArea(int heights[])
    {
        Stack<Integer> s = new Stack<>();

        int max_area = 0; // Initialize max area
        int tp; // To store top of stack
        int area_with_top;
        int i = 0;
        while (i < heights.length) {
            if (s.empty() || heights[s.peek()] <= heights[i])
                s.push(i++);
            else {
                tp = s.peek(); // store the top index
                s.pop(); // pop the top

                area_with_top
                        = heights[tp]
                        * (s.empty() ? i : i - s.peek() - 1);

                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        while (!s.empty()) {
            tp = s.peek();
            s.pop();
            area_with_top
                    = heights[tp]
                    * (s.empty() ? i : i - s.peek() - 1);

            if (max_area < area_with_top)
                max_area = area_with_top;
        }

        return max_area;
    }
}
