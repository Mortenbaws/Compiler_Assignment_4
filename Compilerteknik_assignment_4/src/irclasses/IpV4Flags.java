package irclasses;
import ir.IR;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: IpV4Flags.java
 *
 * Created by: Morten J�rvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class IpV4Flags  extends IR{
	
	private Flagvalues values;
	
	
	public IpV4Flags(Flagvalues values){
		this.values = values;
		
	}

	public Flagvalues getValues() {
		return values;
	}

	public void setValues(Flagvalues values) {
		this.values = values;
	}

}
