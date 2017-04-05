package practice;

/**
 * Created by 58 on 2017/3/20.
 */
public class TestSplit {
    public static void main(String[] args){
        System.out.println("a,a,a,a,".split(",").length);
        System.out.println(",a,a,a,".split(",").length);
        System.out.println(",a,a,a,a".split(",").length);
        System.out.println("a,a,,,a".split(",").length);
        System.out.println(",,,,".split(",").length);
        System.out.println("a,a,a,,".split(",").length);
    }
}
/**
 输出结果：  4   4   5   5   0   3
 结论：split出的数组，从最后一位开始，如果结果为空，将不算在数组内
 */