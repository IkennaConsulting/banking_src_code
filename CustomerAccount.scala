import java.util._
import java.time.LocalDate

object Account extends App {
  val accountCounter: AtomicInteger = new AtomicInteger(0)

  case class AccountPresentState(date: LocalDate, openingAmount:Double, balance:Double)

  def createAccount(): Account = Account(0, accountCounter.getAndIncrement(), List.empty())

}

  case class Account(balance: Double, PresentState: List[Account.AccountPresentState], id: Int){
    def changeBalance(openingAmount) : Account = {
      val newBalance = (balance + openingAmount)
      Account(newBalance, Account.AccountPresentState(LocalDate.now(), openingAmount, balance))
  }

    def deposit(amountDepWithd: Double): Account = {
      if (amountDepWithd > 0) changeBalance(amountDepWithd)
      else this
    }

    def withdrawal(amountDepWithd: Double) : Acount = {
      if(balance<amountDepWithd || amountDepWithd <= 0)
        (this, 0)
      else
        changeBalance(-amountDepWithd)
    }

    def printStatement() ={
      println("Below is the your acct statement. in the order of Date OpeningAmount Balance")
      PresentState.forEach(acct => println(s"$acct.date $acct.openingAmount $acct.balance"))
    }
}



