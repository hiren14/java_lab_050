<h1 align="center" style="margin-top: 0px;">
Practical 3 e 
</h1>

#	3. 	e) Consider an example of declaring the examination result. Design three classes: Student, Exam, and Result. The Student class has data memberssuchasthose representingrollnumber,nameetc.Create theclassExambyinheritingtheStudent class.TheExamclassadds fieldsrepresentingthemarksscoredinsixsubjects.Derivethe Result fromtheExamclassandithasitsownfieldssuchastotal_Marks. Writean interactiveprogramtomodelthisrelationship. 	 	

## Code 

```java
import java.util.Scanner;

public class partical3e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter student Roll No. :");
        int roll=sc.nextInt();
        System.out.println("Enter student name :");
        String name=sc.next();
        int[] arr = new int[6];
        for(int i=0;i<6;i++){
            arr[i]=(int)(Math.random()*100);
        }            
        Result e1 = new Result(roll, name, arr);    
        for(int i=0;i<6;i++)
        System.out.println(e1.marksSubj[i]);

        System.out.println("The total: "+e1.settotal());
        System.out.println("The Percentage: "+((e1.settotal())/6f));
    }
}
class Student{
    int rollNo;
    String Name;
    Student(int r, String n)
    {
        rollNo=r;
        Name =n;
    }
    
}
class Exam extends Student{
    int[] marksSubj=new int[6];
    Exam(int r, String n, int[] marks)
    {
        super(r,n);
        marksSubj = marks;
    }
    
}
class Result extends Exam{
    int total;
    Result(int r, String n, int[] marks)
    {
        super(r,n,marks);
    }

    int settotal()
    {
        for(int i=0;i<marksSubj.length;i++)
        total = total+marksSubj[i];
        return total;
    }
    
}
```
# Output 


![p1a](https://hiren14.github.io/java_lab_050/output/practical3/output3e.png)


## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)