class Clock {

//    static int hours = 12;
//    static int minutes = 0;
//
//    public void next() {
//        if (minutes < 59) {
//            minutes += 1;
//        } else {
//            minutes = 0;
//
//            if (hours < 12) {
//                hours += 1;
//            } else {
//                hours = 1;
//            }
//        }
//    }

    long longField;
    static String strField;

    static void method2() {
        System.out.println(strField);  // (1)
        System.out.println(longField); // (2)

    }

    void method1() {
        System.out.println(strField);  // (3)
        System.out.println(longField); // (4)
    }
}