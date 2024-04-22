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
public class Electronicproduct extends product {private String brand;
    private int warrantyPeriod;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if(warrantyPeriod>0){
        this.warrantyPeriod = warrantyPeriod;
        }else throw new invalidinput(" warrantyPeriod should be greater than 0");
        }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    
}
