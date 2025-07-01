fun main(){
    val payment1=CreditClass(134532134, 30000.0)
    payment1.showAmount()
    println(payment1.processPayment())
    println("------------------------------------------------------------------------------------------------------------")
    val payment2=NayaPay(45555.6,"Codebase@gmail.com")
    payment2.showAmount()
    println(payment2.processPayment())
}



abstract class PaymentMethod(val amount: Double) {
    abstract fun processPayment(): String

    fun showAmount(){
        println("The amount is:${amount}")

    }
}
class CreditClass(val Cardnumber: Int,amount: Double):PaymentMethod(amount){
    override fun  processPayment():String{
        val message="Paid $amount using cardio $Cardnumber"
        return message
    }
}
class NayaPay(amount: Double,val email: String):PaymentMethod(amount){
    override fun processPayment(): String {
        val message2 = "Paid $amount via Nayapay account: $email"
        return message2
    }
}



