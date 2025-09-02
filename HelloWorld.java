public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world");
    }

    static class Animal {
        String name;
        public void noise() {
            System.out.println("Animal noise");
        }
    }

    static class Dog extends Animal {
        public void myName() {
            System.out.println("My name is " + name);
        }
    }

    static class NoisyAnimal {
        public static void main(String[] args) {
            Dog greyhound = new Dog();

            greyhound.myName();
            greyhound.name = "FastRunner";
            greyhound.noise();
            greyhound.myName();
        }
    }
}