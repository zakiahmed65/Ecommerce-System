/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

;

/**
 *
 * @author Zaki
 */
public class order {private int orderid;

    public void setOrderid(int orderid) {
        if(orderid>0){
        this.orderid = orderid;
        }else throw new invalidinput("order id should be greater than zero");
        }
        public int getOrderid() {
        return orderid;   }    
    
    
    public void printinfo(int x,float f,String[]product){
        System.out.println("order id="+orderid);
        System.out.println("customer id="+x);
        System.out.println("products:");
    for (String product1 : product) {
        if (product1 != "") {
            System.out.println(product1);
        } else {
            continue;
        }
    }
        System.out.println("totalprice="+f);

    }
    }
