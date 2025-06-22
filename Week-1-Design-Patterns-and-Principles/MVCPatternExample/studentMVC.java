class studentMVC {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 123, "A");
        StudentViewer view = new StudentViewer();
        StudentController controller = new StudentController(student, view);

        controller.updateView();
        System.out.println("\nAfter Updation:\n");

        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        controller.updateView();
    }
}