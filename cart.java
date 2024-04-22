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
public class cart {private int n;
   protected int nproduct;
   protected String[]x;
   protected float[]f;
   protected float totalprice;
   public cart(int nproduct) {
        this.nproduct = nproduct;
        x=new String[nproduct];
        f=new float[nproduct];
        n=0;
    }
    
   public String[] addproduct(String y){
       if(y==""){
       }else{
        x[n]=y; 
       }
        return(x);
   }
   public float calculateprice(float r){
       if(r!=0){
       totalprice+=r;
       f[n]=r;
       n++;}
       return(totalprice);
       
   }
   public void removeproduct(String y,float r){
      for(int i=0;i<=n;i++){
       if(y.equals(x[i])){
         x[i]="";
         totalprice-=r;
       }
           }

           }
    
}
