package chapter5;

class RemV {
    Pie forBot(Object o) {
        return new Bot();
    }
    Pie forTop(Object t, Pie r, Object o) {
        if (o.equals(t)) {
            return r.rem(o);
        } else {
            return new Top(t, r.rem(o));
        }
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
