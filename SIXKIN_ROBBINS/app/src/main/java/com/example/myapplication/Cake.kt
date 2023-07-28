package com.example.myapplication

class Cake(val name:String,val price:Double,val info:String) {
    fun operation() {

        val Corgi = Cake("수줍은 웰시코기의 숨바꼭질", 2.0, "궁디팡팡 웰시코기의 귀여운 뒷모습이 돋보이는 아이스크림 케이크")
        val Shark = Cake("아기상어", 3.5, "전세계의 슈퍼스타 아기상어 아이스크림 케이크")
        val Ryan = Cake("라이언", 4.5, "갈기가없는 숫사자지만 모두에게 사랑받는 라이언 아이스크림 케이크")
        val Apeach = Cake("어피치", 4.5, "라이언에게 뒤지지 않는 핑크핑크 매력의 어피치 아이스크림 케이크")
        val Pororo = Cake("뽀로로", 5.0, "아이들의 대통령(뽀통령) 아이스스크림 케이크")
        val Loopy = Cake("루피", 3.5, "잔망미 넘치는 사랑스러운 잔망루피 아이스크림 케이크")

        println("=========================케이크를 선택해주세요.=========================")
        println("0. 뒤로가기")
        println("1. 케이크 이름:${Corgi.name} ㅣ가격:${Corgi.price} ㅣ설명:${Corgi.info}")
        println("2. 케이크 이름:${Shark.name}ㅣ가격:${Shark.price}ㅣ설명:${Shark.info}")
        println("3. 케이크 이름:${Ryan.name}ㅣ가격:${Ryan.price}ㅣ설명:${Ryan.info}")
        println("4. 케이크 이름:${Apeach.name}ㅣ가격:${Apeach.price}ㅣ설명:${Apeach.info}")
        println("5. 케이크 이름:${Pororo.name}ㅣ가격:${Pororo.price}ㅣ설명:${Pororo.info}")
        println("6. 케이크 이름:${Loopy.name}ㅣ가격:${Loopy.price}ㅣ설명:${Loopy.info}")

        while (true) {
            try {
                val choice = readLine()?.toInt() ?: throw Exception()

                when (choice) {
                    0 -> {
                        back()
                    break}
                    1 -> {
                        order(Corgi)
                    break}
                    2 -> {
                        order(Shark)
                    break}
                    3 -> {
                        order(Ryan)
                    break}
                    4 -> {
                        order(Apeach)
                    break}
                    5 -> {
                        order(Pororo)
                    break}
                    6 -> {
                        order(Loopy)
                    break}
                    else -> {
                        println("다시 주문해 주세요")
                        operation()
                    break}
                }
            }
            catch (e:Exception){
                println("숫자를 입력해 주세요.")
            }
        }
    }

    fun order(Cake:Cake) {
        println("선택하신 케이크: ${Cake.name}")
        println("가격: ${Cake.price}")
        println("주문이 완료되었습니다.")
    }
}