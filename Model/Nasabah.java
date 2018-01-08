
package Latihan4.Model;
import java.math.BigDecimal;
public class Nasabah{

	String noidentitas;
	boolean active;
	BigDecimal saldo;

	public Nasabah(){
		
	}

	 public Nasabah(String noidentitas,boolean active,BigDecimal saldo){
       this.noidentitas =noidentitas ;
       this.active=active;
       this.saldo=saldo;
    }

String getNoidentitas(){
		return noidentitas;
	}

    boolean getActive(){
    	return active;
    }

    BigDecimal getSaldo(){
    	return saldo;
    }

	public void setNoidentitas(String noidentitas){

		this.noidentitas =noidentitas;

	}

	public void setActive(boolean active){
		 this.active=active;
	}

	public void setSaldo(BigDecimal saldo){
		this.saldo=saldo;
	}

}