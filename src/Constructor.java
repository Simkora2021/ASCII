public class Constructor {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";


    @Override
    public String toString() {


        return ANSI_PURPLE + " _____________________";
    }


}

class P1 extends Constructor{
    @Override
    public String toString() {
        return ANSI_BLUE + "Choose Operator"+ ANSI_RESET;
    }

}

class P2 extends Constructor{
    @Override
    public String toString() {
        return ANSI_PURPLE + " |";
    }

}

class P3 {
    @Override
    public String toString() {
        return "  _________________";
    }

}

class P4 {
    @Override
    public String toString() {
        return "_________________";
    }

}

class P5 {
    @Override
    public String toString() {
        return "|";
    }

}

class P6 {
    @Override
    public String toString() {
        return "___";
    }

}
class P7 {
    @Override
    public String toString() {
        return "_____________________";
    }
}
class P8 {
    @Override
    public String toString() {
        return "Addition  (+)          Subtraction(-)";
    }
}
class P9 {
    @Override
    public String toString() {
        return "Multiplication  (*)    Division(/)";
    }
}
class P10 {
    @Override
    public String toString() {
        return "Modulus  (%)           Power(p)";
    }
}
class P11 {
    @Override
    public String toString() {
        return "Square Root  (r)       Floor(f)";
    }
}
class P12 {
    @Override
    public String toString() {
        return "Ceiling  (c)           Absolute Value(a)";
    }
}
//class P13 {
//    @Override
//    public String toString() {
//        return "Addition  (+)          Subtraction(-)";
//    }
//}
//class P14 {
//    @Override
//    public String toString() {
//        return "Addition  (+)          Subtraction(-)";
//    }
//}
//class P15 {
//    @Override
//    public String toString() {
//        return "_____________________";
//    }
//}
//class P16 {
//    @Override
//    public String toString() {
//        return "_____________________";
//    }
//}
//class P17 {
//    @Override
//    public String toString() {
//        return "_____________________";
//    }
//}
//
