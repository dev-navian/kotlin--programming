package labThree

import kotlin.random.Random

class RandomAgent(override val name: String, val probability : Double) : Actor {

    override fun act(): Action {
        val randomNum = String.format("%.1f", Random.nextDouble(.9)).toDouble()

        return when(randomNum) {
            probability -> ForageAction()
            else -> NoAction()
        }
    }

    override fun perceive(vararg facts: Percept) {
    }

}