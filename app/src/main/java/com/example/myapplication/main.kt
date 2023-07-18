package com.example.myapplication


fun main() {



    println("첫번째 값을 입력해주세요 : ")
    var num1= readLine()!!.toDouble()
    println("두번째 값을 입력해주세요 : ")
    var num2= readLine()!!.toDouble()
    println("번호를 선택해주세요.\n1. 더하기(+)\n2. 빼기(-)\n3. 곱하기(-)\n4. 나누기(/)")
    var button= readLine()!!.toInt()

    var calc= Calculator()
//    var result=calc.operation(num1,num2,button)
    var result = 0.0
    when(button){
        1-> {
            result = calc.addOperation(num1, num2)
            println("(${num1}) 더하기 (${num2}) 는 (${result}) 입니다.")
        }
        2-> {
            result = calc.subOperation(num1, num2)
            println("(${num1}) 빼기 (${num2}) 는 (${result}) 입니다.")
        }
        3-> {
            result = calc.mulOperation(num1, num2)
            println("(${num1}) 곱하기 (${num2}) 는 (${result}) 입니다.")
        }
        4-> {
            result = calc.divOperation(num1, num2)
            println("(${num1}) 나누기 (${num2}) 는 (${result}) 입니다.")
        }
        else-> {
            println("값을 다시입력해주세요")
        }
    }


}
open class Calculator{
    fun addOperation(num1: Double, num2: Double): Double {
        return AddOperation().operate(num1,num2)
    }

    fun subOperation(num1: Double, num2: Double): Double {
        return SubstractOperation().operate(num1,num2)
    }

    fun mulOperation(num1: Double, num2: Double): Double {
        return MultiplyOperation().operate(num1,num2)
    }

    fun divOperation(num1: Double, num2: Double): Double {
        return DivideOperation().operate(num1,num2)
    }

    // Lv2계산기
//    fun operation(num1:Double,num2:Double,button:Int):Double{
//        if(button==1){
//            AddOperation()
//            return num1+num2
//        }
//        else if(button==2)
//        {
//            return num1-num2
//        }
//        else if (button==3) {
//            return num1*num2
//        }
//        else if (button==4) {
//            return num1/num2
//        }
//        else if (button==5) {
//            return num1%num2
//        }
//        else
//        {
//            println("번호를 다시 선택해주세요.")
//            return 0.0
//        }
//    }
}
class AddOperation{
    fun operate(num1: Double, num2: Double): Double = (num1 + num2)
}
class SubstractOperation{
    fun operate(num1: Double, num2: Double): Double = (num1 - num2)
}
class MultiplyOperation{
    fun operate(num1: Double, num2: Double): Double = (num1 * num2)
}
class DivideOperation{
    fun operate(num1: Double, num2: Double): Double = (num1 / num2)
}