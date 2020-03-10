
import java.util.Scanner;

public class  成绩排序 {
    public static class  Student{
        private String name;
        private int value;

        @Override
        public String toString() {
            return
                    name+" "+value;
        }

        public Student(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        Student []students=new Student[s];
        int x=scanner.nextInt();
        for (int i=0;i<s;i++){
            String pp=scanner.next();
            int newx=scanner.nextInt();
            Student ss=new Student(pp,newx);
            students[i]=ss;
        }
        if (x==0){
            tt(students);
        }else {
            xx(students);
        }
        for (Student sss:students){
            System.out.println(sss);
        }
    }

    private static void xx(Student[] students) {
        for (int i=0;i<students.length;i++){
            for (int j=i;j<students.length;j++){
                if (students[j].value<students[i].value){
                   Student s=students[j];
                   students[j]=students[i];
                   students[i]=s;
                }
            }
        }
    }

    private static void tt(Student[] students) {
        for (int i=0;i<students.length;i++){
            for (int j=i;j<students.length;j++){
                if (students[j].value>students[i].value){
                    Student s=students[j];
                    students[j]=students[i];
                    students[i]=s;
                }
            }
        }
    }
}
