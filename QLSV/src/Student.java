public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getId() {
        return id;
    }

    public void setId(String n) {
        this.id = n;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String n) {
        this.group = n;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String n) {
        this.email = n;
    }

    /**
     * This is a default constructor.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * This is a constructor.
     *
     * @param name  String
     * @param id    String
     * @param email String
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * This is a copy method.
     *
     * @param s Student
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}
