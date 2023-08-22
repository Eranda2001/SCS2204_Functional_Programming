class Account(initialBalance: Double, val accountNumber: String) {
  private var balance: Double = initialBalance

  def getBalance: Double = balance

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $amount. New balance: $balance")
    } else {
      println("Invalid deposit amount.")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $amount. New balance: $balance")
    } else {
      println("Invalid withdrawal amount or insufficient balance.")
    }
  }

  def transfer(amount: Double, receiveAccount: Account): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      receiveAccount.deposit(amount)
      println(s"Transferred $amount to account ${receiveAccount.accountNumber}. New balance: $balance")
    } else {
      println("Invalid transfer amount or insufficient balance.")
    }
  }
}

object Account {
  private var Counter: Int = 0

  def generateAccountNumber(): String = {
    Counter += 1
    f"$Counter%04d"
  }
}

object Bank {
  val accounts: List[Account] = List(
    new Account(1000, Account.generateAccountNumber()),
    new Account(-500, Account.generateAccountNumber()),
    new Account(2000, Account.generateAccountNumber())
  )

  def accountsWithNegativeBalances: List[Account] =
    accounts.filter(account => account.getBalance < 0)

  def totalBalance: Double =
    accounts.map(_.getBalance).sum

  def applyInterest(): Unit = {
    for (account <- accounts) {
      if (account.getBalance > 0) {
        account.deposit(account.getBalance * 0.05)
      } else {
        account.withdraw(-account.getBalance * 0.1)
      }
    }
  }
}

object Q34 {
  def main(args: Array[String]): Unit = {
    val acc1 = new Account(5000, Account.generateAccountNumber())
    val acc2 = new Account(1000, Account.generateAccountNumber())

    println(s"Account 1: ${acc1.getBalance}")
    println(s"Account 2: ${acc2.getBalance}")

    acc1.deposit(2000)
    acc1.withdraw(1500)
    acc1.transfer(1000, acc2)

    println(s"Final balances:")
    println(s"Account 1: ${acc1.getBalance}")
    println(s"Account 2: ${acc2.getBalance}")

    println("Accounts with negative balances:")
    Bank.accountsWithNegativeBalances.foreach(account => println(s"${account.accountNumber}: ${account.getBalance}"))

    println(s"Total balance: ${Bank.totalBalance}")

    println("Initial balances:")
    Bank.accounts.foreach(account => println(s"${account.accountNumber}: ${account.getBalance}"))

    Bank.applyInterest()
    println("Balances after interest:")
    Bank.accounts.foreach(account => println(s"${account.accountNumber}: ${account.getBalance}"))
  }
}