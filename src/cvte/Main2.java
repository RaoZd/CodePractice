package cvte;


/**
 * 将一个十进制数n划分，使其和不超过但最接近给定的数m,输出这个和，列子：n=654321  m=50 ，
 * 6+5+4+32+1=48  输出48
 */
public class Main2 {
    public static void main(String[] args) {
//        Collections.synchronizedList()
        byte b=-4;
        System.out.println(b>>1);
        b>>=1;  //  结果为 -2
        System.out.println(b);
        byte c=b;
        System.out.println(c>>>1);
        c>>>=1;  // 结果为 -2
        System.out.println(b);
    }
}
