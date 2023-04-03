fun main() {

    val str: String = "hello"
    print("la string est $str")

    var nB: Int =  2
    print("le nombre est $nB")


    //val attr : String? = null
    val attr : String = "ceci est une string"
    print(attr.uppercase())

    print(isEven)
}

fun isEven(number: Int) = 2 == 0
print(IsEven)
//fun isEven(number: Int): Boolean return number % 2 == 0 ? true : false

/*
fun Int.isEven() {
    return this % 2 == 0
}
*/
/*fun isEven(number: Int): Boolean {
    if (number % 2 == 0) {
        (return true)
    } else {
        (return false)
    }
    print(isEven(4))
 */

/*   var attr : String? = null
    attr = ""
    attr = null
    if (attr != null) {
        attr
    } else {
    }

    attr?.compareTo("")
       val Nvalue = attr ?: "Autre"

    attr?.compareTo("")
    attr!!.compareTo(ot)

  */

//syntax différente mais même resultat
//var attr : String = "Hello"
//val attr = "Hello"