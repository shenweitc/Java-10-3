package Dmeo02;

import java.util.Scanner;
import java.util.SortedMap;

public class CarTest {
    public static void main(String[] args) {
        //1. 创建一个数组用来存3个汽车对象
        Car[] arr = new Car[3];
        //2.创建汽车对象，数据来自于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车的对象
            Car c = new Car();
            System.out.println("请输入汽车品牌：");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车价格：");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车颜色：");
            String color = sc.next();
            c.setColor(color);
            //把汽车对象添加到数组当中
            arr[i] = c;
        }
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + " " + car.getPrice() + " " + car.getColor());
        }
    }
}
