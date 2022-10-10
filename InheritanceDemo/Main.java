package Week2.InheritanceDemo;
//LESSON 37
public class Main {

	public static void main(String[] args) {
		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		//teacherCreditManager.Calculate();
		CreditUI creditUI = new CreditUI();
		creditUI.CreditCalculate(teacherCreditManager);
		SoldierCreditManager soldierCreditManager = new SoldierCreditManager();
		creditUI.CreditCalculate(soldierCreditManager);
	
	}

}
