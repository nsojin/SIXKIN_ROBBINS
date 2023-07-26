package com.example.myapplication

class CAKE : menu(){
    fun operation(name:String,price:Double,info:String){

        val icecake = cake("수줍은 웰시코기의 숨바꼭질", 2.0,"궁디팡팡 웰시코기의 귀여운 뒷모습이 돋보이는 아이스크림 케이크")
        val icecake1 = cake("아기상어", 3.5,"전세계의 슈퍼스타 아기상어 아이스크림 케이크")
        val icecake2 = cake("라이언", 4.5,"갈기가없는 숫사자지만 모두에게 사랑받는 라이언 아이스크림 케이크")
        val icecake3 = cake("어피치", 4.5,"라이언에게 뒤지지 않는 핑크핑크 매력의 어피치 아이스크림 케이크")
        val icecake4 = cake("뽀로로", 5.0,"아이들의 대통령(뽀통령) 아이스스크림 케이크")
        val icecake5 = cake("루피", 3.5,"잔망미 넘치는 사랑스러운 잔망루피 아이스크림 케이크")

        println("=========================케이크를 선택해주세요.=========================")
        println("1. 케이크 이름:${icecake.name} ㅣ가격:${icecake.price} ㅣ설명:${icecake.info}")
        println("2. 케이크 이름:${icecake1.name}ㅣ가격:${icecake1.price}ㅣ설명:${icecake1.info}")
        println("3. 케이크 이름:${icecake2.name}ㅣ가격:${icecake2.price}ㅣ설명:${icecake2.info}")
        println("4. 케이크 이름:${icecake3.name}ㅣ가격:${icecake3.price}ㅣ설명:${icecake3.info}")
        println("5. 케이크 이름:${icecake4.name}ㅣ가격:${icecake4.price}ㅣ설명:${icecake4.info}")
        println("6. 케이크 이름:${icecake5.name}ㅣ가격:${icecake5.price}ㅣ설명:${icecake5.info}")

        val choice = readLine()?.toInt()

        when (choice) {
            1 -> order(icecake)
            2 -> order(icecake1)
            3 -> order(icecake2)
            4 -> order(icecake3)
            5 -> order(icecake4)
            6 -> order(icecake5)
            else -> println("다시 선택해 주세요.")
        }
    }

    fun order(Cake:cake) {
        println("선택하신 케이크: ${Cake.name}")
        println("가격: ${Cake.price}")
        println("주문이 완료되었습니다.")
    }
}