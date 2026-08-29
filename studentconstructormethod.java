# Java Constructor and Method Example

```java
class Student {

    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student("Ravi", 18);

        // Calling method
        s1.display();
    }
}
```

### Output

```text
Student Name: Ravi
Student Age: 18
```

### Project name

**Java Constructor and Method Example**

### GitHub file name

`Student.java`
