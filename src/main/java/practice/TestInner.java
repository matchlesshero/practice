package practice;

/**
 * Created by 58 on 2017/3/20.
 */
public class TestInner {

    TestInner(String a,String b){
        System.out.println("Outer");
    }

    static class Inner{

        Inner(String a,String b){
            System.out.println("Inner");
        }
    }

    public static void main(String[] args) {
        new TestInner.Inner("a", "b");
    }

    /**
     输出结果：  Inner
     结论：即使外部类没有无参构造器，内部类的含参构造器默认调用外部类的无参构造器。
     */

}
