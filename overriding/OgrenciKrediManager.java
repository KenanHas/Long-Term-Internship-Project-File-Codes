package week3.overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	
	public double hesapla(double tutar)
	{
		 return tutar*1.1; //BaseKrediManager'ın hesapla metodunu öğrenci için ezdik
	}

}
