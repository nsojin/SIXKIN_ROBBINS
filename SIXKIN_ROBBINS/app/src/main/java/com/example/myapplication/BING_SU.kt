package com.example.myapplication

import com.example.bingsu.bingsu

class BING_SU : menu() {
    fun operation(){

        val ShavedIce = bingsu("팥빙수", 5.0,"빙수의 원조")
        val ShavedIce1 = bingsu("망고빙수", 5.5,"달콤한 빙수의 정석 망고빙수")
        val ShavedIce2 = bingsu("메론빙수", 5.5,"통통튀는 메론빙수")
        val ShavedIce3 = bingsu("치즈빙수", 5.5,"어디든 다 잘어울리는 치즈의 매력")
        val ShavedIce4 = bingsu("인절미빙수", 5.5,"이에 달라붙어 사르르 녹는 매력의 인절미빙수")
        val ShavedIce5 = bingsu("요거트빙수", 5.5,"장 건강까지 생각한 요거트빙수")


        println("==========================음료를 선택해주세요.=========================")
        println("1. 빙수 이름:${ShavedIce.name} ㅣ가격:${ShavedIce.price} ㅣ설명:${ShavedIce.info}")
        println("2. 빙수 이름:${ShavedIce1.name}ㅣ가격:${ShavedIce1.price}ㅣ설명:${ShavedIce1.info}")
        println("3. 빙수 이름:${ShavedIce.name}ㅣ가격:${ShavedIce.price}ㅣ설명:${ShavedIce2.info}")
        println("4. 빙수 이름:${ShavedIce3.name}ㅣ가격:${ShavedIce3.price}ㅣ설명:${ShavedIce3.info}")
        println("5. 빙수 이름:${ShavedIce4.name}ㅣ가격:${ShavedIce4.price}ㅣ설명:${ShavedIce4.info}")
        println("6. 빙수 이름:${ShavedIce5.name}ㅣ가격:${ShavedIce5.price}ㅣ설명:${ShavedIce5.info}")

        val choice = readLine()?.toInt()

        when (choice) {
            1 -> order(ShavedIce)
            2 -> order(ShavedIce1)
            3 -> order(ShavedIce2)
            4 -> order(ShavedIce3)
            5 -> order(ShavedIce4)
            6 -> order(ShavedIce5)
            else-> println("다시 선택해 주세요.")

        }
    }

    fun order(Bingsu: bingsu) {
        println("선택하신 빙수: ${Bingsu.name}")
        println("가격: ${Bingsu.price}")
        println("주문이 완료되었습니다.")
    }
}