object Q3 extends App{
  val account1: Account = new Account("1", "001", 5000)
  val account2: Account = new Account("2", "002", 1000)

  account1.transfer(account2, 1000)

  println(s"Account 1 balance : ${account1.balance}")
  println(s"Account 2 balance : ${account2.balance}")
}

class Account(i: String, n: String, b: Double) {
  var id: String = i
  var accNo: String = n
  var balance: Double = b

  def transfer(that: Account, amount: Double) = {
    this.balance = this.balance - amount;
    that.balance = that.balance + amount
  }
}