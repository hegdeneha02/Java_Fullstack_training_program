//SmartTv.java
package annotation;
import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartTv {
    String Os();
    int width();
    int height();
}

//AndroidSeries.java
package annotation;
@SmartTv(Os="Android",height=40,width=50)
public class AndroidSeries {
 String model;
 int ScreenSize;
 public AndroidSeries(String model,int ScreenSize) {
	 this.model=model;
	 this.ScreenSize=ScreenSize;
 }
}

//AnnotationDemo.java
package annotation;
import java.lang.annotation.*;
public class AnnotationDemo {

	public static void main(String[] args) {
		AndroidSeries obj=new AndroidSeries("A23",14);
		System.out.println(obj.model);
		System.out.println(obj.ScreenSize);
		System.out.println("Smart tv details");
		
		@SuppressWarnings("unchecked")
		
		Class c=obj.getClass();
		@SuppressWarnings("unchecked")
		Annotation an1=c.getAnnotation(SmartTv.class);
		SmartTv s1=(SmartTv)an1;
		System.out.println(s1.Os());
		System.out.println(s1.height());
		System.out.println(s1.width());

	}

}

//Student.java
package annotation;
public class Student {
	
      int id;
      String name;
      String branch;
	public Student(int id,String name,String branch) {
		this.id=id;
		this.name=name;
		this.branch=branch;
		
	}
	//getter setter
	@Override
	public String toString() {
		return "Student Information [id="+id+",name="+name+",branch="+branch+"]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}

//PredefinedAnnotationDemo.java
package annotation;
import java.util.*;

public class PreDefinedAnnotationDemo {
  @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	  @SuppressWarnings("raw typed")
		List a1=new ArrayList();
		Student s2=new Student(102,"Neha","ISE");
		a1.add(10);
		a1.add(22.22f);
		a1.add(new Student(101,"Nitya","ISE"));

	}
}
