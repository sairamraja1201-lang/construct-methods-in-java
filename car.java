```java
class Car {

    String brand;
    int price;

    // Constructor
    Car(String b, int p) {
        brand = b;
        price = p;
    }

    // Method
    void showDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Price: ₹" + price);
    }

    public static void main(String[] args) {

        Car c1 = new Car("Toyota", 800000);

        c1.showDetails();
    }
}
```

**Output:**

```text
Car Brand: Toyota
Car Price: ₹800000
```

**Constructor:** `Car(String b, int p)` → initializes the car details.
**Method:** `showDetails()` → displays the car details.
