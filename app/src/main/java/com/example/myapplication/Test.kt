fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list.size)

    var sum = list.sum()
    //val sum = 0

    for(i in list) {
        sum += i
    }
    println("la somme est $sum")
}


/*
fun main() {
    val w = Weather(10f, "Paris")
    val w1 = object : Weather(10f, "Paris") {

        override fun isHot() = temp > 10f

    }

    object : Listener {
        override fun onClicked() {
           TODO("Not yet implemented")
        }

    }
}

interface Listener {

    fun onClicked()

}


open class Weather(val temp: Float, val city: String) {

    companion object {
        const val MIN_TEMP = 0f
        const val MAX_TEMP = 25f
    }


    constructor(weather: Weather) : this(
        weather.temp,
        weather.city,
    );

    override fun toString(): String {
        return "Température de $city : $temp"
    }

    fun isCold() = temp < MIN_TEMP

    open fun isHot() = temp > MAX_TEMP

}

class LocalWeather(temp: Float, city: String) : Weather(temp, city) {

    companion object {
        const val MAX_TEMP = 25f
    }


    override fun isHot() = temp > 32f

}

sealed interface AppState
object AppStateLoading
data class AppStateSuccess(val value: String) : AppState
data class AppStateError(val value: String) : AppState

 */





/*
fun main() {
    val str: String = "hello"
    print("la string est $str")

    var nB: Int =  2
    print("le nombre est $nB")


    //val attr : String? = null
    val attr : String = "ceci est une string"
    print(attr.uppercase())
}

//fun isEven(number: Int) = 2 == 0
//fun isEven(number: Int): Boolean return number % 2 == 0 ? true : false

/*
fun Int.isEven() {
    return this % 2 == 0
}
*/
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

class User(val firstName: String, val lastName: String){
    val user1 = User("JM", "Kevin")
    val user2 = User("JM", "Kevin")

    return (user1 == user2)

}


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

 */