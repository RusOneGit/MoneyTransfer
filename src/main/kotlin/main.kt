fun main() {
    var amount = 10_000
    var commission = if (35 > amount * 0.0075) 35.0 else amount * 0.0075
    var result = amount - commission
    println(result)

}

