class Codechef {
    public static void main(String[] args) {
        // Step 1: Check attendance for the morning class
        boolean attendedMorningClass = true;

        // Step 2: Check attendance for the afternoon class
        boolean attendedAfternoonClass = true;

        // Step 3: Combine attendance checks for both classes using the AND operator
        boolean fullDayAttendance = attendedMorningClass && attendedAfternoonClass;

        // Step 4: Print whether the person attended the full day
        System.out.println("Full Day Attendance: " + fullDayAttendance); // Output: true
    }
}
