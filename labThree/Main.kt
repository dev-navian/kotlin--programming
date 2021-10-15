package labThree

fun main(args : Array<String>) {
    val myName = SimpleAgent("Dev-Navian")

    println(myName.act())

    println("-----------")

//    val env = FoodEnvironment(SimpleAgent("Charlie"))
//    env.step()
//    println(env.scores)

//    val env = FoodEnvironment(RandomAgent("Charlie",0.8), RandomAgent("Bob", 0.2), RandomAgent("Alice", 0.6))
//    for (i in 1..100)
//        env.step()
//    println(env.scores)

    val env = FoodEnvironment()
    for (i in 1..10) {
        env.step()
        println("running: $i")
        println(env.animal)
    }
}