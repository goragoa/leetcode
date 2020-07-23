
public class QuickStartzhs {
    public static class Student implements java.lang.Comparable<Student> {
        String name;
        int score;

        Student(String n, int s) {
            name = n;
            score = s;
        }

        @Override
        public int compareTo(Student o) {
            return this.score - o.score;
        }
    }

    public static void main(String[] args) {
        Student[] a = new Student[] { new Student("a", 10), new Student("b", 9), new Student("c", 11) };
        java.util.Arrays.sort(a);
        for (Student student : a) {
            System.out.println(student.name);
            System.out.println(student.score);
        }
        System.out.println((char) (6 + 'a'));
    }
}