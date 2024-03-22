import kotlinx.coroutines.delay
import kotlin.math.pow
import kotlin.math.sqrt

class CalculatorClass1
{
    fun Input():Int
    {
        println("Сколько раз вы собираетесь использовать калькулятор?")
        var kol= readLine()!!.toInt()
        if (kol>=0)
        {
            println("Программа будет работать ${kol} раз")
        }
        else
        {
            println("Количество не может быть равно нулю или меньше. Установлено значение по умолчанию")
            kol=1
        }
           return kol
    }
    fun Calculator()
    {


        println("Какое действие вы хотите выполнить?\n1-Возведение в квадрат\n2-Вычислить корень из числа\n3-Возвести число в вашу степень")
        var b= readLine()!!.toInt()
        println("Введите число")
        var a= readLine()!!.toDouble()

        if (b==1)
        {
            a=a.pow(2)
            println("Ваш результат = ${a}")
        }
        if (b==2)
        {
            a= sqrt(a)
            println("Ваш результат = ${a}")
        }
        if (b==3)
        {
            println("Введите степень")
            var c= readLine()!!.toDouble()
            a=a.pow(c)
            println("Ваш результат = ${a}")
        }

    }
}
