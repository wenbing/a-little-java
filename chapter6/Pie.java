package chapter6;

abstract class Pie {
    abstract Pie accept(PieVisitorI ask);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
