package com.example.myapplication


fun main() {

    println("첫번째 값을 입력해주세요 : ")
    var num1= readLine()!!.toInt()

    println("두번째 값을 입력해주세요 : ")
    var num2= readLine()!!.toInt()

    println("번호를 선택해주세요.\n1. 더하기\n2. 빼기\n3. 곱하기\n4. 나누기(몫)\n5. 나머지")
    var button= readLine()!!.toInt()

    var calc= Calculator()



}

open class Calculator{

    fun operation(num1:Int,num2:Int,button:Int):Int{

        if(button==1){
            AddOperation(num1,num2,button)

            return num1+num2
        }
        else if(button==2)
        {
            return num1-num2
        }
        else if (button==3) {
            return num1*num2
        }
        else if (button==4) {
            return num1/num2
        }
        else if (button==5) {
            return num1%num2
        }
        else
        {
            println("번호를 다시 선택해주세요.")
            return 0
        }
    }

    fun AddOperation(num1:Int,num2:Int,result:Int){
//        return num1+num2
    }

    fun SubstractOperation(){

    }
    fun MultiplyOperation(){

    }
    fun DivideOperation(){

    }
}

