public class conversaoTipos {     //byte,short,int,long,float,double
    private void conversaoImplicita() {
        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;
    }

    private void conversaoExplicita() {
        //byte,short,int,long,float e double

        double a = 100.65;
        float b = (float) a;
        long c = (long) b;
        int d = (int) c;
        short e = (short) d;
        byte f = (byte) e;
    }

    private void boxing(){
        //auto-boxing
        int a = 10;
        Integer b =a ;
    }

    private void unboxing(){
        Long a = 10L;
        long b = a;
    }

}