package java.eight.solidPrincipiles.SRP;

// Solid Repository Principle
//public class Account {
//	
//	private void OpenAccount() {
//		// 1
//		System.out.println("Fill Account details");
//		
//		//2 
//		System.out.println("Save to database");
//		
//		//3 
//		System.out.println("Send notification");
//
//	}
//	
//}
//===================================================^=OLD ==========
//public class AccountRepository{
//	public void create(){
//		//2 
//		System.out.println("Save to database");
//	}
//}
//
//public class NotificationService{
//	public void sendNotification(){
//		//3 
//		System.out.println("Send notification");
//	}
//}

public class SRP {
	AccountRepository accountRepository = new AccountRepository();
	NotificationService notificationService = new NotificationService();
	
	private void openAccount() {
		// 1
		System.out.println("Fill Account details");
		
		accountRepository.create();
		notificationService.sendNotification();

	}
}
