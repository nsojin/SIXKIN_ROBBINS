package com.example.myapplication

class ICE_CEREAM : menu() {

    fun operation(){

        val cream = ice("바닐라", 3.0,"누구나 아는 그 맛")
        val cream1 = ice("베리베리 스트로베리", 3.5,"진한 딸기맛 아이스크림")
        val cream2 = ice("아빠는 지구인", 4.5,"우리 아빠가...지구인???")
        val cream3 = ice("민트초코", 3.5,"호불호가 없다는 바로 그 맛")
        val cream4 = ice("슈팅스타", 3.5,"입안에서 터지는 불꽃놀이")
        val cream5 = ice("올때 메로나", 3.0,"메로나는 사실 참외맛이죠")

        println("==========================아이스크림을 선택해주세요.=========================")
        println("1. 아이스크림 이름:${cream.name} ㅣ가격:${cream.price} ㅣ설명:${cream.info}")
        println("2. 아이스크림 이름:${cream1.name}ㅣ가격:${cream1.price}ㅣ설명:${cream1.info}")
        println("3. 아이스크림 이름:${cream2.name}ㅣ가격:${cream2.price}ㅣ설명:${cream2.info}")
        println("4. 아이스크림 이름:${cream3.name}ㅣ가격:${cream3.price}ㅣ설명:${cream3.info}")
        println("5. 아이스크림 이름:${cream4.name}ㅣ가격:${cream4.price}ㅣ설명:${cream4.info}")
        println("6. 아이스크림 이름:${cream5.name}ㅣ가격:${cream5.price}ㅣ설명:${cream5.info}")

        val choice = readLine()?.toInt()

        when (choice) {
            1 -> order(cream)
            2 -> order(cream1)
            3 -> order(cream2)
            4 -> order(cream3)
            5 -> order(cream4)
            6 -> order(cream5)
            else -> println("다시 선택해 주세요.")
        }
    }

    fun order(Ice:ice) {
        println("선택하신 아이스크림: ${Ice.name}")
        println("가격: ${Ice.price}")
        println("주문이 완료되었습니다.")
    }
}