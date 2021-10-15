package labThree

import kotlin.random.Random

class FoodEnvironment(vararg ags: Actor) : Environment(*ags) {
    var scores: MutableMap<Actor, Int> = mutableMapOf()
    var animal : String? = ""

    init {
        for (ag in ags) {
            scores[ag] = 0
        }
    }

    override fun step() {
        val someRand = Random.nextDouble(0.0, 1.0)

        animal = if (someRand > 0.5) "dolphin" else null
        println(someRand)
        super.step()
    }

    override fun processAction(agent: Actor, act: Action) {
        when(act) {
            is ForageAction -> scores[agent] = scores[agent]!!.inc()
            is HuntAction -> println("hunt action")
            is NoAction -> println("no action")
        }
    }

    override fun sense(agent: Actor) {
        if (animal == null) {
            agent.perceive()
        } else {
            val perception: Percept = Percept("animal", animal!!)
            agent.perceive(perception)
        }
    }

}