package Day7Excercise;

class HospitalTreatment implements Comparable<HospitalTreatment> {
    private String name;
    private int severity;

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }
    
    public HospitalTreatment(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    
    @Override
    public int compareTo(HospitalTreatment other) {
        //for higher severity treatment first
        return Integer.compare(other.severity, this.severity);
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', severity=" + severity + "}";
    }
}
