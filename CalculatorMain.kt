import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main(){
   var Class:CalculatorClass1=CalculatorClass1()
    var k=Class.Input()
    GlobalScope.launch()
    {
        for (i in 1..k){
            println("${i} раз")
            Class.Calculator()
        }
    }
    runBlocking {
        delay(3000L)
    }
}