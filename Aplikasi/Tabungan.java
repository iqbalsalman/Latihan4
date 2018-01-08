package Latihan4.Aplikasi;
import java.math.BigDecimal;
public class Tabungan{

Double sukuBunga;
BigDecimal saldo;
BigDecimal akrual;
String kriteriaProduct;

public Tabungan(){

}

public Tabungan(Double sukuBunga, String kriteriaProduct){
this.sukuBunga=sukuBunga;
this.saldo=BigDecimal.ZERO;
this.akrual=BigDecimal.ZERO;
this.kriteriaProduct=kriteriaProduct;
}

 Double getSukuBunga(){
 	return sukuBunga;
 }
 BigDecimal getSaldo(){
 	return saldo;
 }
 BigDecimal getAkrual(){
  return akrual;
 }
 String getKriteriaProduct(){
     
     return kriteriaProduct; 
   }

 public void setSukuBunga(Double sukuBunga){

 	this.sukuBunga=sukuBunga;
 }
 public void setSaldo(BigDecimal saldo){

  this.saldo=saldo;
  }
  public void setAkrual(BigDecimal akrual){

 	 this.akrual=akrual;
   }
   public void setKriteriaProduct(String kriteriaProduct){

 	 this.akrual=akrual;
   }
}