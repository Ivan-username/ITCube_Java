package ten_to_16

import java.util.*

fun main (){
    val scan = Scanner(System.`in`)
    println("Введите систему счисленияя")
    val notationInput = scan.nextInt()
    println("Введите исходное число")
    var numberInput = scan.nextInt()
    val output = mutableListOf<String>()
    val sixteen = listOf(
        "0", "1", "2", "3", "4",
        "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E",
        "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O",
        "P", "Q", "R", "S", "T",
        "U", "V", "W" // todo   Весь алфавит(любая система счисления до 33)
    )
    if (numberInput < notationInput){
        println(sixteen[numberInput])
    } else {
        while (numberInput >= notationInput) {
            output.add(sixteen[numberInput % notationInput])
            numberInput /= notationInput
        }
        output.add(sixteen[numberInput])
        output.reverse()
        for (i in output){
            print(i)
        }
    }
}