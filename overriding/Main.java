package week3.overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = { new TarimKrediManager(), new OgretmenKrediManager(),
				new OgrenciKrediManager() };

		for (BaseKrediManager krediManager : krediManagers) {

			System.out.println(krediManager.hesapla(1000));
		}

	}

}
