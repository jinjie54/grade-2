package chapter05数组_排序和查找;

import java.util.Scanner;

public class 数组 {

    //数组的引出 + 3.静态初始化-----------------------------------------------------------------------------------------------
    void Array01() {
        //它们的体重分别是3kg，1kg，3.1kg，2kg，50kg 问这六只鸡的总体重和平均体重

        /*
        思路分析（先试原有方法）
        1.定义六个变量 double，求和 得到总体重，/6 = 平均体重
        2.分析传统实现的方式问题：6->600
        3.引出新知识：使用数组
         */
        /*
        double hen1 = 3;
        double hen2 = 5;
        double hen3 = 1;
        double hen4 = 3.4;
        double hen5 = 2;
        double hen6 = 50;

        double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;

        double avgWeight = totalWeight / 6;
        System.out.println("总体重为：" + totalWeight);
        System.out.println("平均体重为：" + avgWeight);
        */

        //我们可以用数组来解决上一个问题
        //
        /*
        定义一个数组
        老韩解读
        1.double【】表示 是double类型的数组， 数组名hens
        2.{3，5，1，3.4，2，50}
        3.静态初始化
         */
        double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8, 88.8};

        //遍历数组得到数组的所有元素的和， 使用for
        //1、我们可以通过 hens【下标】 来访问数组的元素
        //  下标是从 0 开始编号的比如第一个元素就是 hens【0】
        //  第2个元素就是 hens【1】 ， 依此类推
        //2、通过for就可以循环的访问 数组的元素/值
        //3、使用一个变量 totalWight 将各个元素累积
        System.out.println("===使用数组解决===");
        //**老师提示： 可以通过 数组名.length 得到数组的大小/长度**
        //System.out.println("数组的长度=" + hens.length);
        double totalWeight = 0;
        for( int i = 0; i < hens.length; i++) {
            //System.out.println("第" + (i+1) + "个元素的值= " + hens[i]);
            totalWeight += hens[i];
        }

        System.out.println("总体重：" + totalWeight + '\n'
                + "平均体重：" + totalWeight/hens.length);
    }


    /*
    数组的使用 1.动态初始化2.动态初始化------------------------------------------------------------------------------------------
     */
    void Array02() {

        /*
        演示 数据类型 数组名[]=new 数据类型[大小]
        循环输入5个成绩，保存到double数组，并输出
         */

        //步骤
        //1、创建一个 double 数组，大小 5
        //（1）第一种动态分配方式
        //double scores[] = new double[5];
        //（2）第二种动态分配方式，先声明数组，再 new 分配空间
        double scores[]; //声明数组，这时scores 是nulll
        scores = new double[5]; //分配内存空间，可以存放数据

        //2.循环输入
        // scores.length 表示数组的大小/长度
        //
        Scanner myScanner = new Scanner(System.in);
        for( int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+ (i+1) +"个元素的值");
            scores[i] = myScanner.nextDouble();
        }

        //输出，遍历数组
        System.out.println("==数组的元素/值的情况如下===");
        for( int i = 0; i < scores.length; i++) {
            System.out.println("第"+ (i+1) +
                    "个元素的值=" + scores[i]);
        }
    }

    //数组使用注意事项和细节
    void ArrrayDetail() {
        //1.十足十多个相同类型数据的组合，实现对这些数据的统一管理
        int[] arr1 = {1, 2, 3, 4, 5};
        double[] arr2 = {1, 2, 1.1, 2.2};

        //2.数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
        String[] arr3 = {"北京","jack"};

        //3.数组创建后，如果没有赋值，有默认值 int 0,short 0,byte 0,long 0,
        // float 0.0,double 0.0,char \u0000,boolean false,String null
        short[] arr4 = new short[3];
        for( int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        //4.数组的步骤 1.声明数组并开辟空间 2.给数组各个元素赋值 3.使用数组
        //5.数组的下表是从0开始
        //6.数组属引用类型，数组型数据是对象（object）
    }

    //数组应用案例
    //1.创建一个char类型的26个元素的数组，分别放置A-Z，使用for循环访问所有元素并打印出来
    void ArrayExercise01() {
        char[] word = new char[26];
        for( int i = 0; i < word.length; i++) {
            word[i] = (char)(i+'A');
        }
        for( int i = 0; i < word.length; i++) {
            System.out.print(word[i] + " ");
        }
        System.out.println();
        System.out.println("a=" + (int)'a' + '\n' + "A=" + (int)'A');
    }
    //2.求出一个数组int【】的最大值{4,-1.9,10.23}并得到对应下标
    void ArrayExercise02() {
        double[] nums = {4, -1.9, 10, 23};
        double max = nums[0];
        int index = 0;
        for( int i = 0; i < nums.length-1; i++) {
            if( nums[i] < nums[i+1] ) {
                max = nums[i+1];
                index = i+1;
            }
        }
        System.out.println(max + " " + index);
    }

    //数组赋值机制-----------------------------------------------------------------------------------------------------------
    void ArrayAssign() {
        //基本数据类型赋值,赋值方式为值拷贝
        //n2的变化，不会影响n1的值
        int n1 = 10;
        int n2 = n1;
        n2 = 80;

        //数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用传递
        //是一个地址
    }

    //数组添加------------------------------------------------------------------------------------------------------------------
    //定义数组，然后添加新元素
    int[] Add(int[] arr, int num) {//创建新数组
        int[] arrcopy = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++) {
            arrcopy[i] =  arr[i];
        }
        arrcopy[arrcopy.length-1] = num;
        return arrcopy;
    }
    void ArrayAdd() {
        int[] arr1 = {1, 2, 3};
        char judge = 'y';
        int i = 4;
        Scanner myScanner = new Scanner(System.in);
        while(judge == 'y') {//使用函数
            arr1 = Add(arr1, i);
            i++;
            for(int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + "\t");
            }
            System.out.println();
            System.out.println("是否继续扩增：");
            judge = myScanner.next().charAt(0);
        }
    }

    //排序介绍（简要）---------------------------------------------------------------------------------------------------
    /*
    内部排序
    外部排序
     */
    //冒泡排序：从后向前，依次比较相邻元素的值，若发现逆序则交换，是值较大的元素逐渐从前移向后部(先写内层后写外层)
    void BubbleSort() {
        int[] arr1 = {24, 69, 80, 57, 13};
        int test;
        for( int i = 0; i < arr1.length-1; i++) {
            for( int j = 0; j < arr1.length-1-i; j++) {
                test = 0;
                if(arr1[j] > arr1[j+1]) {//交换
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                    test = 1;
                }
                if(test == 0) {
                    break;
                }
            }
        }
        //打印
        for( int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }

    //查找------------------------------------------------------------------------------------------------------------------


    //二维数组----------------------------------------------------------------------------------------------------------------

    void TwoDimensionalArray() {
        /*
        动态创建二维数组，并输出
        i = 0: 1
        i = 1: 2 2
        i = 2: 3 3 3
        一个有三个一维数组，每个一维数组的元素是不一样的
         */
        int[][] arr = new int[3][];//创建 二维数组，一共有3个一维数组，但是每个数组还没有开数据空间
        for(int i = 0; i < arr.length; i++) {//遍历arr每一个一维数组
            //给每一个一维数组开空间 new
            //如果没有给一维数组 new ，那么 arr【i】就是null
            arr[i] = new int[i + 1];

            //遍历一维数组，并给一维数组的每个元素赋值
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;//赋值
            }
        }

        //遍历arr输出
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    void YangHuiArray() {
        //定义杨辉三角的二维数组
        int[][] arr = new int[12][];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
        }
        //赋值
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < i+1; j++) {
                if(j == 0 || j == i) {//首尾为1
                    arr[i][j] = 1;
                } else {//中间为上面对应的加上面的前面一个
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }
        //打印输出
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    /*
    二维数组使用细节和注意事项：
    1、一维数组的声明方式有：
        int[] x 或者 int x[]
    2、二维数组的声明方式有：
        int[][] y 或者 int[] y[] 或者 int y[][]
    3、二维数组是由多个一维数组组成的，他的各个一维数组的长度可以相同，
        也可以不同：int map[][] = {{1},{1,2}};
    4、数组创建后，如果没有赋值，有默认值 int 0,short 0,byte 0,long 0,
         float 0.0,double 0.0,char \u0000,boolean false,String null
     */
    //-----------------------------------------------------------------------------------------------------------
    /*
    作业未掌握：
    1、  ' 是char，不能用于String的赋值
         String[] strs = new String[3]{"a","b","c"};//编译通不过，不能写3，或者不写后面的
    2、  bool(类型）默认是false
    4、  插入位置初始值为-1
         if(insertNum <= arr[i]) {
            index = i;
         }
    5、  生成1到100的随机整数：(int)(Math.random() * 100) + 1
    6、  数组赋值是传入地址 Java是16位Unicode有中文
    7、  冒泡排序：外层：length-1     内层：length-i-1
     */

    void main() {
        //Array01();//数组的引出
        //Array02();//数组的使用 1.动态初始化 2.动态初始化
        //ArrrayDetail();//注意事项
        //ArrayExercise01();//练习1
        //ArrayExercise02();//练习2
        //ArrayAdd();//数组添加
        //BubbleSort();//冒泡排序
        //TwoDimensionalArray();//二维数组
        //YangHuiArray();//二维数组的应用：杨辉三角
    }
}
