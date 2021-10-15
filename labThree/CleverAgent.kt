package labThree

class CleverAgent(override val name: String) : Actor {
    var perception: Percept? = if (Percept(name, name) == null) null else Percept(name, name)

    override fun act(): Action {
        TODO("Not yet implemented")
    }

    override fun perceive(vararg facts: Percept) {

    }
}