package chapter06面向对象编程_基础;

public class 类与对象 {
    void Object01 () {
    /*
    两只猫：小白、3岁、白色
           小花、100岁、花色
    要求：输入名字时， 显示名字、年龄、花色
     */
        //1、原有方法的缺陷：
        //单独用变量来解决 => 不利于数据的管理（把猫的信息拆解）
        String cat1Name = "小白";
        String cat2Name = "小花";
        int cat1Age = 3;
        int cat2Age = 100;
        String cat1Color = "白色";
        String cat2Color = "花色";

        //数组 ===> （1）数据类型体现不出来  （2）只能通过【下标】获取信息，造成变量名字和内容的对应关系不明确   （3）不能体现猫的行为
        String[] cat1 = {"小白", "3", "白色"};

        //总结：不利于数据管理   效率低

        //类和对象概述：类：数据类型     对象：具体实例

        //使用面向对象的方式来解决养猫问题
        //
        //定义一个猫类 Cat -> 自定义的数据类型
        class Cat {
            //属性
            String name;//名字
            int age;//年龄
            String color;//颜色
            //还可以增加行为
        }
        //使用OOP面向对象解决
        //实例化一只猫
        Cat cat01 = new Cat();
        cat01.name = "小白";
        cat01.age = 3;
        cat01.color = "白色";
        Cat cat02 = new Cat();
        cat02.name = "小花";
        cat02.age = 100;
        cat02.color = "花色";
        //怎么访问对象的属性呢
        System.out.println("第1只猫信息" + cat01.name + "\t" + cat01.age + "\t" + cat01.color);
        System.out.println("第2只猫信息" + cat02.name + "\t" + cat02.age + "\t" + cat02.color);

        //**对象在内存中的存在形式
        /*
        栈：cat-->0x0011--
        堆：0x0011 <------
           0x0022
           0x0033
        方法区：常量池             加载Cat类信息
              0x0022:小白        1、属性信息
              0x0033:白色        2、行为（方法信息）
         */

        //名称介绍：
        /*
        1、属性/成员变量：int age;属性可以是基本数据类型，也可以时引用类型
            属性的注意事项：
                （1）属性的定义语法同变量：访问修饰符 属性类型 属性名；（访问修饰符： public,protected,默认,private
                （2）属性的定义类型可以为任意类型，包含基本类型或引用类型
                （3）属性如果不复制，有默认值，规则和数组一致有默认值 int 0,short 0,byte 0,long 0,
                    float 0.0,double 0.0,char \u0000,boolean false,String null
         2、创建Cat对象 Cat cat = new Cat();
            cat 是对象名（对象引用）
            new Cat() 创建的对象空间（数据）才是真正的对象
         */

        /*创建对象的形式：
            1、先声明再创建
                Cat cat;        //指向空
                cat = new Cat();//在堆开辟空间
            2、直接创建
                Cat cat = new Cat();
         */

        /*
        对象分配机制
            只有new 才在堆上开辟空间 p1 = p2;是指向同一个地址
         */

    }

    void main() {
        Object01();
    }
}
