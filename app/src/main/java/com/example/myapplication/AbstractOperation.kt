package com.example.myapplication
//추상 클래스는 기본적인 설계만 정의 되있는 구체화되지않은 클래스이다.
//클래스 내의 프로퍼티나 메소드도 abstract로 선언가능,초기값선언도 가능!
abstract class AbstractOperation {
    //하지만 추상메소드이기때문에 하위 클래스에서 반드시 재정의해야한다.
    abstract fun operate(a:Double,b:Double):Double
}