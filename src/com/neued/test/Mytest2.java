package com.neued.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mytest2 {
    public static Mybook[] books=new Mybook[200];
    public static List<Mybook>list=new ArrayList<>();
    public static void main(String[] args) {
        inputData(list);
        menu();

        /*print(list);
       addBook(list);
        print(list);*/
    }
    public static void menu(){
        System.out.println("输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：查看所有");
        System.out.println("5：退出");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        switch (i){
            case 1:
                addBook(list);
                break;
            case 2:
                System.out.println("请输入要删除的书名");
                String name=scanner.next();
                deleteName(list,name);
                break;
            case 3:
                System.out.println("请输入要查找的书名");
                String searchName=scanner.next();
                searchName(list,searchName);
                break;
            case 4:
                print(list);
                break;
            default:
                System.exit(1);
                break;

        }
    }
    public static void inputData(List<Mybook> books){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<=n;i++){

            Mybook myBook=new Mybook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社"+i,"作者"+i,"ISBN"+i);
            books.add(myBook);
        }
    }
    public static void print(List<Mybook>books){
        for (int i=0;i<books.size();i++){
            System.out.println(books.get(i));
        }
        menu();
    }
    public static void searchName(List<Mybook> books,String name){
        for (int i=0;i<books.size();i++){
            Mybook myBook=books.get(i);
          if ( myBook.getName().equals(name)){

              System.out.println(myBook);
              menu();
              return;
          }
        }
        System.out.println("此书不存在");
    }
    public static void deleteName(List<Mybook> books,String name){
        for (int i=0;i<books.size();i++){
            Mybook myBook=books.get(i);
            if ( myBook.getName().equals(name)){
                books.remove(i);
                System.out.println("删除成功");
                menu();
                return;
            }
        }
        System.out.println("此书不存在");
        menu();
    }
    public static void addBook(List<Mybook> books){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名");
        String name=scanner.next();
        System.out.println("请输入价格");
        double price=scanner.nextDouble();
        System.out.println("请输入出版社");
        String  press=scanner.next();
        System.out.println("请输入作者");
        String  author=scanner.next();
        System.out.println("请输入ISBN号");
        String bookISBN=scanner.next();
        Mybook mybook=new Mybook(name,price,press,author,bookISBN);
        books.add(mybook);
        menu();
    }
}
