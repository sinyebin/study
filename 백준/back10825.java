import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class back10825 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        Student[] student=new Student[n];
        for(int i=0;i<n;i++){
            String[] st=scanner.nextLine().split(" ");
            student[i]=new Student(st[0], Integer.parseInt(st[1]), Integer.parseInt(st[2]), Integer.parseInt(st[3]));
        }
        Comparator<Student> myComparator=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                if(o1.korean<o2.korean){
                    return 1;
                }else if(o1.korean==o2.korean){
                    if(o1.english>o2.english){
                        return 1;
                    }else if(o1.english==o2.english){
                        if(o1.math<o2.math){
                            return 1;
                        }else if(o1.math==o2.math){
                            return o1.name.compareTo(o2.name);
                        }
                    }
                }
                return 1;
            }
        };
        Arrays.sort(student, myComparator);
        for(int i=0;i<n;i++){
            System.out.println(student[i].name);
        }
    }
}

class Student{
    String name;
    int korean;
    int english;
    int math;
    Student(String name, int korean, int english,int math){
        this.name=name;
        this.korean=korean;
        this.english=english;
        this.math=math;
    }
}
