fun main() {
    println("Please enter a temperature")
    var temp = readln().toFloat()
    if (temp < 97.5)
        println("Temperature is low")
    else if (temp < 99.6)
        println("Temperature is normal")
    else
        println("Temperature is high")
}