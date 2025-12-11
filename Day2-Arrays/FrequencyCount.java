package Day2;

public class FrequencyCount {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20,50, 10};
        boolean[] visited = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(numbers[i] + " → " + count);
        }
    }
}
