package TypesOfClass


fun main () {
    var currentState = State.PLAYING

    for(i in 1..3){
        currentState = stateGame(currentState)
        println(currentState.descr)
    }
}

fun stateGame (currentState: State) : State{
    return when(currentState){
        State.GAME_OVER -> State.STARTED
        State.PLAYING -> State.GAME_OVER
        State.STARTED -> State.PLAYING
    }
}

enum class State (var descr: String)  {
    STARTED ("Welcome to our game!"),
    PLAYING ("You are going very well =)"),
    GAME_OVER ("Sorry, try again =(")
}

