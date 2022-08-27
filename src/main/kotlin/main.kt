fun main() {
    val amount = 10_000
    val commission = 0.75
    val minCommission = 350

    val amountCommission = (amount * commission) / 100
    val transfer = if (amountCommission > minCommission) amount - amountCommission else amount - minCommission
    println(transfer)
}