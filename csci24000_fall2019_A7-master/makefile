ATM.class: ATM.java AdminMenu.class UserMenu.class User.class CheckingAccount.class SavingsAccount.class
	javac -g ATM.java
AdminMenu.class: AdminMenu.java  User.class CheckingAccount.class SavingsAccount.class
	javac -g AdminMenu.java
UserMenu.class: UserMenu.java  User.class CheckingAccount.class SavingsAccount.class
	javac -g UserMenu.java
User.class: User.java CheckingAccount.class SavingsAccount.class
	javac -g User.java
CheckingAccount.class: CheckingAccount.java
	javac -g CheckingAccount.java
SavingsAccount.class: SavingsAccount.java CheckingAccount.class
	javac -g SavingsAccount.java

clean:
	rm *.class
run: ATM.class
	java ATM
debug: ATM.class
	jdb ATM