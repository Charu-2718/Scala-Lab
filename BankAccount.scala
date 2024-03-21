//Charu
class BankAccount(private var balance: Double, private val accountNumber: String) {
  def getBalance: Double = balance
  def getAccountNumber: String = accountNumber
  
  def deposit(amount: Double): Unit = {
    balance += amount
  }
  
  def withdraw(amount: Double): Unit = {
    if (balance >= amount) {
      balance -= amount
    } else {
      println("Insufficient funds")
    }
  }
}

val account = new BankAccount(1000, "123456789")
println("Initial balance: " + account.getBalance)
account.deposit(500)
println("Balance after deposit: " + account.getBalance)
account.withdraw(200)
println("Balance after withdrawal: " + account.getBalance)
