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
public class customer {protected String name;
    protected String address;
    protected int customerid;
   
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        if(customerid>0){
        this.customerid = customerid;
        }else throw new invalidinput("customer id should be greater than zero");
        }

    

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
