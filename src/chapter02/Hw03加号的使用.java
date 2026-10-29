package chapter02;

public class Hw03加号的使用 {
    public static void main (String[] args) {
        //保存两本书名，用+拼接看效果。保存两个性别，用加号拼接，看效果
        //保存两本书价格，用加号拼接，看效果
        String book1 = "果壳中的宇宙";
        String book2 = "三体";
        System.out.println(book1 + book2);//果壳中的宇宙三体

        //性别因该使用char保存
        char c1 = '男';
        char c2 = '女';
        System.out.println(c1 + c2);//数字码值相加

        //保存两本书价格
        double price1 = 120.43;
        double price2 = 321.98;
        System.out.println(price1 + price2);

        //又一边是字符串就是拼接
        System.out.println(book1 + c1);
        System.out.println(price1 + book2);
    }
}
