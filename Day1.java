// this is day 1 of java
class Student{
    int rollno;
    String name;
    int marks;
    
}

public class Day1 {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollno=1;
        s1.name="sakshi";
        s1.marks=98;
        Student s2=new Student();
        s2.rollno=2;
        s2.name="rutuja";
        s2.marks=96;
        Student s3=new Student();
        s3.rollno=3;
        s3.name="siddhant";
        s3.marks=97;

        Student [] student=new Student[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        // for(int i=0; i<student.length; i++){
        //     System.out.println(student[i].name+" "+student[i].rollno+" "+student[i].marks);
        // }


        //for-each loop or enhance for loop
        for(Student i : student)
        {
            System.out.println(i.name);
        }

    }
    
}