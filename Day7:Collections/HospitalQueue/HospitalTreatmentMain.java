package Day7Excercise;

import java.util.PriorityQueue;

public class HospitalTreatmentMain {
    public static void main(String[] args) {

        PriorityQueue<HospitalTreatment> queue = new PriorityQueue<>();

        queue.add(new HospitalTreatment("Akash", 10));
        queue.add(new HospitalTreatment("Akshatha", 5));
        queue.add(new HospitalTreatment("Bhaskar", 3));
        queue.add(new HospitalTreatment("Leela", 13));

        System.out.println("Treatment Order:");

        while (!queue.isEmpty()) {
        	HospitalTreatment p = queue.poll();
            System.out.println("Treating: " + p.getName() +
                               " | Severity: " + p.getSeverity());
        }
    }
}
