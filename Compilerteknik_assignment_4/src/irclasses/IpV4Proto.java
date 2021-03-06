package irclasses;
import ir.IR;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: IpV4Proto.java
 *
 * Created by: Morten J�rvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class IpV4Proto extends IR {
	
	private Protname name;
	private int number;
	
	public IpV4Proto(Protname name, int number){
		this.name = name;
		this.number = number;
		
	}

	public Protname getName() {
		return name;
	}

	public void setName(Protname name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
