package labThree

class SimpleAgent(override val name: String) : Actor {
    override fun toString(): String {
        return name
    }

    // overriding the act function
    override fun act(): Action {
        println(name)
        return ForageAction()
    }

    override fun perceive(vararg facts: Percept) { }

}