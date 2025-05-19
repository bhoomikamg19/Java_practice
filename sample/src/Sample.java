public class Sample {
    double price = 200000;
    public static void main(String[] args) {
        String name = "BMW";
        System.out.println("Car name is: " + name);
        Sample sample = new Sample();
        System.out.println("Price is: " + sample.price);
    }
}

class Bike {
    int mil = 68;
    public static void main(String[] args) {
        String name = "Yamaha";
        System.out.println("Bike name is: " + name);
        Bike bike = new Bike();
        System.out.println( bike.mil);
    }
}

class Laptop {
    String ram="8gb";
    public static void main(String[] args) {
        String name = "Dell";
        System.out.println("Laptop name is: " + name);
        Laptop laptop = new Laptop();
        System.out.println("Ram of laptop: " + laptop.ram);
    }
}

class Mobile {
    double price = 30000;
    public static void main(String[] args) {
        String name = "Samsung";
        System.out.println("Mobile name is: " + name);
        Mobile mobile = new Mobile();
        System.out.println("Price is: " + mobile.price);
    }
}

class Watch {
    long price = 15000L;
    public static void main(String[] args) {
        String name = "Fossil";
        System.out.println("Watch name is: " + name);
        Watch watch = new Watch();
        System.out.println("Price is: " + watch.price);
    }
}

class Book {
    int pages=500;
    public static void main(String[] args) {
        String name = "Java Programming";
        System.out.println("Book name is: " + name);
        Book book = new Book();
        System.out.println("No of pages: " + book.pages);
    }
}

class TV {
    String screen="oled";
    public static void main(String[] args) {
        String name = "Sony";
        System.out.println("TV name is: " + name);
        TV tv = new TV();
        System.out.println("Screen type: " + tv.screen);
    }
}

class Fan {
    int wings=3;
    public static void main(String[] args) {
        String name = "Crompton";
        System.out.println("Fan name is: " + name);
        Fan fan = new Fan();
        System.out.println("wings: " + fan.wings);
    }
}

class Fridge {
    int doors=2;
    public static void main(String[] args) {
        String name = "LG";
        System.out.println("Fridge name is: " + name);
        Fridge fridge = new Fridge();
        System.out.println("No of doors: " + fridge.doors);
    }
}

class AC {
    double price = 45000;
    public static void main(String[] args) {
        String name = "Voltas";
        System.out.println("AC name is: " + name);
        AC ac = new AC();
        System.out.println("Price is: " + ac.price);
    }
}
