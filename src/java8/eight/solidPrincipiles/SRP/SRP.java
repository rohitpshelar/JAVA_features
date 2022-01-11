package java8.eight.solidPrincipiles.SRP;

// Solid Repository Principle
class Account {

	 void OpenAccount() {
		// 1
		System.out.println("Fill Account details");

		// 2
		System.out.println("Save to database");

		// 3
		System.out.println("Send notification");
	}
}

//===================================================^=OLD ==========
class AccountRepository {
	public void create() {
		// 2
		System.out.println("Save to database");
	}
}

class NotificationService {
	public void sendNotification() {
		// 3
		System.out.println("Send notification");
	}
}

public class SRP {
	AccountRepository accountRepository = new AccountRepository();
	NotificationService notificationService = new NotificationService();

	 void openAccount() {
		// 1
		System.out.println("Fill Account details");
		//2
		accountRepository.create();
		//3
		notificationService.sendNotification();

	}
}
