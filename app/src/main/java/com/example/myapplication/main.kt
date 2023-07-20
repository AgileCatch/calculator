package com.example.myapplication


fun main() {


    println("첫번째 값을 입력해주세요 : ")
    var num1= readLine()!!.toDouble()
    println("두번째 값을 입력해주세요 : ")
    var num2= readLine()!!.toDouble()

    println("번호를 선택해주세요.\n1. 더하기(+)\n2. 빼기(-)\n3. 곱하기(-)\n4. 나누기(/)")
    var button= readLine()!!.toInt()

    //계산기 호출
    var calc =Calculator(AddOperation())
    var sub=SubstractOperation()
    var mul=MultiplyOperation()
    var div=DivideOperation()
    var result : Double

    when(button){
        1-> {
            result = calc.operate(num1, num2)
            println("(${num1}) 더하기 (${num2}) 는 (${result}) 입니다.")
        }
        2-> {
            calc= Calculator(sub)
            result = calc.operate(num1,num2)
            println("(${num1}) 빼기 (${num2}) 는 (${result}) 입니다.")
        }
        3-> {
            calc=Calculator(mul)
            result = calc.operate(num1, num2)
            println("(${num1}) 곱하기 (${num2}) 는 (${result}) 입니다.")
        }
        4-> {
            calc=Calculator(div)
            result = calc.operate(num1, num2)
            println("(${num1}) 나누기 (${num2}) 는 (${result}) 입니다.")
        }
        else-> {
            println("올바르지 않은 번호입니다.\n번호를 다시입력해주세요")
        }
    }


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

