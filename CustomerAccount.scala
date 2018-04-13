import java.util._
import java.time.LocalDate

object CustomerAccount extends App {
  val accountCounter: AtomicInteger = new AtomicInteger(0)

  case class AccountPresentState(amountDeposied: Double, balance: Double, date: LocalDate)

  def createAccount(): Account = CustomerAccount(0, accountCounter.getAndIncrement(), List())

}

  case class CustomerAccount(balance: Double, PresentState: List[CustomerAccount.AccountPresentState], id: Int){
    def changeBalance(amountDeposited) : Account = {
      val newBalance = (balance+amountDeposited)

  }
}



