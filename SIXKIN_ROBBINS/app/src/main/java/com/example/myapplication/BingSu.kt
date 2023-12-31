package com.example.myapplication


class BingSu(val name: String, val price: Double, val info: String) {
    fun operation() {
        val RedBean = BingSu("팥빙수", 5.0, "빙수의 원조")
        val Mango = BingSu("망고빙수", 5.5, "달콤한 빙수의 정석 망고빙수")
        val Melon = BingSu("메론빙수", 5.5, "통통튀는 메론빙수")
        val Cheese = BingSu("치즈빙수", 5.5, "어디든 다 잘어울리는 치즈의 매력")
        val Rise = BingSu("인절미빙수", 5.5, "이에 달라붙어 사르르 녹는 매력의 인절미빙수")
        val Yogurt = BingSu("요거트빙수", 5.5, "장 건강까지 생각한 요거트빙수")


        println("==========================음료를 선택해주세요.=========================")
        println("0. 뒤로가기")
        println("1. 빙수 이름:${RedBean.name} ㅣ가격:${RedBean.price} ㅣ설명:${RedBean.info}")
        println("2. 빙수 이름:${Mango.name}ㅣ가격:${Mango.price}ㅣ설명:${Mango.info}")
        println("3. 빙수 이름:${Melon.name}ㅣ가격:${Melon.price}ㅣ설명:${Melon.info}")
        println("4. 빙수 이름:${Cheese.name}ㅣ가격:${Cheese.price}ㅣ설명:${Cheese.info}")
        println("5. 빙수 이름:${Rise.name}ㅣ가격:${Rise.price}ㅣ설명:${Rise.info}")
        println("6. 빙수 이름:${Yogurt.name}ㅣ가격:${Yogurt.price}ㅣ설명:${Yogurt.info}")

        while (true) {
            try {
                val choice = readLine()?.toInt() ?: throw Exception()

                when (choice) {
                    0 -> {
                        back()
                    break}
                    1 -> {
                        order(RedBean)
                    break}
                    2 -> {order(Mango)
                    break}
                    3 -> {order(Melon)
                    break}
                    4 -> {order(Cheese)
                    break}
                    5 -> {order(Rise)
                    break}
                    6 -> {order(Yogurt)
                    break}
                    else -> {
                        println("다시 주문해 주세요")
                        operation()
                        break
                    }
                }
            }
            catch (e:Exception){
                println("숫자를 입력해 주세요.")
                operation()
                break
            }
        }
    }

    fun order(BingSu: BingSu) {
        println("선택하신 빙수: ${BingSu.name}")
        println("가격: ${BingSu.price}")
        println("주문이 완료되었습니다.")
    }
}