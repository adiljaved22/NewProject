
enum class Trafficrules(val code: String) {
    RED("quit"),YELLOW("get ready"),GREEN("time to go"),PINK("pinky")
    }
    fun things(rules:Trafficrules): String{
        return when(rules){
            Trafficrules.RED -> "stop"
            Trafficrules.YELLOW -> "calm"
            Trafficrules.GREEN -> "Let's Go"
            Trafficrules.PINK->"cutie"
        else -> "null"
        }
    }
    fun main(){
        println(things(Trafficrules.RED))
        println(things(Trafficrules.YELLOW))
        println(things(Trafficrules.GREEN))
        println("Entries is.................")
        for (rules in Trafficrules.entries)
            println(rules.code)
    }

