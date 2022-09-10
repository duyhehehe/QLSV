public class StudentManagement {

    private Student[] students = new Student[100];
    private int numberOfStudents;

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * This is 'add student to array' method.
     *
     * @param newStudent Student
     */
    public void addStudent(Student newStudent) {
        // TODO:
        students[numberOfStudents] = new Student(newStudent);
        ++numberOfStudents;
    }

    /**
     * This is a method.
     *
     * @return String answer
     */
    public String studentsByGroup() {
        // TODO:
        String res = "";
        boolean[] visited = new boolean[numberOfStudents];
        for (int i = 0; i < numberOfStudents; ++i) {
            visited[i] = false;
        }
        for (int i = 0; i < numberOfStudents; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                res += students[i].getGroup() + "\n";
                res += students[i].getInfo() + "\n";
                for (int j = i + 1; j < numberOfStudents; ++j) {
                    if (sameGroup(students[i], students[j])) {
                        res += students[j].getInfo() + "\n";
                        visited[j] = true;
                    }
                }
            }
        }
        return res;
    }

    /**
     * This is a method.
     *
     * @param id String
     */
    public void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < numberOfStudents; ++i) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < numberOfStudents - 1; ++j) {
                    students[j] = new Student(students[j + 1]);
                }
                --numberOfStudents;
                return;
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
    }
}