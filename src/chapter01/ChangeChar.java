package chapter01;

public class ChangeChar {
    public static void main(String[] args) {
        //\t制表符，对齐
        System.out.println("北京\t天津\t四川");
        //\n换行符
        System.out.println("jack\nsmith\nmary");
        //\\一个\
        System.out.println("C:\\Windows\\System32\\\\cmd.exe");
        //\"一个“ \' -> '
        System.out.println("他说：\"要好好学习\"");
        //\r 回车
        System.out.println("就这样过英语六级2\r北京1");
        System.out.println("就这样过六级2\n\r北京1");

        System.out.println("D:\\javacode>java Test\n书名 \t作者 \t价格 \t销量 \n三国 \t罗贯中 \t120 \t1000 \n");
    }
}
