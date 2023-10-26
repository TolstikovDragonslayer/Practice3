import kotlin.random.Random

fun main(args: Array<String>) {
    //first exercise
    val myAge = 18
    val isTeenager = (13 <= myAge) && (myAge < 19)

    //second exercise
    val theirAge = 30
    val bothTeenagers = (isTeenager && (13 <= theirAge) && (theirAge < 19))

    //third exercise
    val reader = "Vlad"
    val author = "Richard Lucas"
    val authorIsReader = (reader == author)

    //fourth exercise
    val readerBeforeAuthor = (reader > author)

    //fifth exercise
    val myAge2 = 18
    if ((13 <= myAge) && (myAge < 19)){
        println("Подросток")
    }
    else{
        println("Не подросток")
    }

    //sixth exercise
    val answer: String
    if ((13 <= myAge) && (myAge < 19)){
        answer = "Подросток"
    }
    else{
        answer = "Не подросток"
    }
    println(answer)

    //seventh exercise
    var Counter = 0
    while(Counter < 10){
        println("counter = $Counter")
        Counter += 1
    }

    //eighth exercise
    var counter = 0
    var roll = 0
    do{
        roll = Random.nextInt(6)
        counter += 1
        println("После $counter, roll равен $roll")
    }while(roll == 0)

    //ninth exercise
    val range = (1..11)
    var p: Int = 0
    for (p in range){
        println(p * p)
    }

    //tenth exercise
    for (p in range){
        println(Math.sqrt(p.toDouble()))
    }

    //eleventh exercise
    var sum = 0
    for (row in 1 until 9 step 2){
        for ( column in 0 until 8) {
            sum += row * column
        }
    }
    println(sum)
}