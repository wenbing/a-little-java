package chapter5;

abstract class Fish {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
