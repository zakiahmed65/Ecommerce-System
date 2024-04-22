/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;



/**
 *
 * @author Zaki
 */
import java.util.Scanner;

        
public class Programming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your id");
        int x = input.nextInt();
        System.out.println("please enter your name");
        String y = input.next();
        System.out.println("please enter your address");
        String z = input.next();
        customer c1 = new customer();
        c1.setName(y);
        c1.setCustomerid(x);
        c1.setAddress(z);
        System.out.println("How many products do you want to add");
        int q=input.nextInt();
        cart c=new cart(q);
       for(int i=0;i<q;i++){
        System.out.println("which product do you want to add \n 1.clothes category \n 2.Electronics category \n 3.books category");
        int s=input.nextInt();
        switch (s) {
            case 1:
                clothingproduct b = new clothingproduct();
                b.setProductid(1);
                System.out.println("Enter product in this category do you want to add");
                String a=input.next();
                b.setproductName(a);
                c.addproduct(b.getproductName());
                System.out.println("Enter price of this product");
                int w=input.nextInt();
                b.setPrice(w);
                c.calculateprice(b.getPrice());
                break;
            case 2:
                Electronicproduct e = new Electronicproduct();
                e.setProductid(2);
                System.out.println("Enter product in this category do you want to add");
                a=input.next();
                 e.setproductName(a);
                 System.out.println("Enter price of this product");
                 w=input.nextInt();
                 e.setPrice(w);
                 c.addproduct(e.getproductName());
                 c.calculateprice(e.getPrice());
                 
                 break;
            case 3:
                bookproduct b1 = new bookproduct();
                 b1.setProductid(3);
                 System.out.println("Enter product in this category do you want to add");
                 a=input.next();
                 System.out.println("Enter price of this product");
                 w=input.nextInt();
                 b1.setPrice(w);
                 b1.setproductName(a);
                 c.addproduct(b1.getproductName());
                 c.calculateprice(b1.getPrice());
                break;
        }  
       }
        order v=new order();
       v.setOrderid(1);
       v.printinfo(x, c.calculateprice(0),c.addproduct(""));

    }
    }