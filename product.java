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
public abstract class product {
    protected int productid;
   protected float price;
   protected String productname;

    public void setProductid(int productid) {
       if(productid>0){
        this.productid = productid;
       }else throw new invalidinput("productid should be greater than 0");
       }

    public void setPrice(float price) {
        if(price>0){
        this.price = price;
        }else throw new invalidinput("price should be greater than 0");
        }

    public void setproductName(String productname) {
        this.productname = productname;
    }

    public int getProductid() {
        return productid;
    }

    public float getPrice() {
        return price;
    }

    public String getproductName() {
        return productname;
    }
}
