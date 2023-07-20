package com.example.myapplication

class Calculator(private val operation: AbstractOperation){
    fun operate(a:Double,b:Double):Double{
        return operation.operate(a,b)
    }

}
// Lv3계산기
//fun addOperation(num1: Double, num2: Double): Double {
//    return AddOperation().operate(num1,num2)
//}
//
//fun subOperation(num1: Double, num2: Double): Double {
//    return SubstractOperation().operate(num1,num2)
//}
//
//fun mulOperation(num1: Double, num2: Double): Double {
//    return MultiplyOperation().operate(num1,num2)
//}
//
//fun divOperation(num1: Double, num2: Double): Double {
//    return DivideOperation().operate(num1,num2)
//}