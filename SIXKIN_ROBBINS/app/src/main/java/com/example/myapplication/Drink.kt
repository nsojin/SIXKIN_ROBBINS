package com.example.myapplication

class Drink(val name:String,val price:Double,val info:String)  {
    fun operation() {

        val Americano = Drink("아메리카노", 2.0, "전국민 피로회복제")
        val Latte = Drink("라떼는말이야", 3.5, "라떼는말이야 2:2:2였어")
        val Cafemocha = Drink("카페모카", 4.5, "커피의 쌉쌀함과 초코의 달콤함을 고소한 우유가 감싸안은 커피")
        val apogato = Drink("아포가토", 4.5, "쌉쌀한 에스프레소와 달콤한 바닐라의 환상적인 달콤 쌉싸름함")
        val hotchocolate = Drink("핫초코", 5.0, "당충전이 필요해")
        val milkshake = Drink("밀크쉐이크", 3.5, "따라서 들어왔는데 뭐 먹지..? 그럴땐 밀크쉐이크")

        println("==========================음료를 선택해주세요.=========================")
        println("0. 뒤로가기")
        println("1. 음료 이름:${Americano.name} ㅣ가격:${Americano.price} ㅣ설명:${Americano.info}")
        println("2. 음료 이름:${Latte.name}ㅣ가격:${Latte.price}ㅣ설명:${Latte.info}")
        println("3. 음료 이름:${Cafemocha.name}ㅣ가격:${Cafemocha.price}ㅣ설명:${Cafemocha.info}")
        println("4. 음료 이름:${apogato.name}ㅣ가격:${apogato.price}ㅣ설명:${apogato.info}")
        println("5. 음료 이름:${hotchocolate.name}ㅣ가격:${hotchocolate.price}ㅣ설명:${hotchocolate.info}")
        println("6. 음료 이름:${milkshake.name}ㅣ가격:${milkshake.price}ㅣ설명:${milkshake.info}")
        while (true) {
            try {
                val choice = readLine()?.toInt() ?: throw Exception()

                when (choice) {
                    0 -> {
                        back()
                    break}
                    1 -> {
                        order(Americano)
                    break}
                    2 -> {
                        order(Latte)
                    break}
                    3 -> {
                        order(Cafemocha)
                    break}
                    4 -> {
                        order(apogato)
                    break}
                    5 -> {
                        order(hotchocolate)
                    break}
                    6 -> {
                        order(milkshake)
                    break}
                    else -> {
                        println("다시 선택해 주세요.")
                        operation()
                        break
                    }
                }
            } catch (e: Exception) {
                println("다시 주문해주세요.")
                operation()
                break
            }
        }
    }
    fun order(Drink: Drink) {
        println("선택하신 음료: ${Drink.name}")
        println("가격: ${Drink.price}")
        println("주문이 완료되었습니다.")
    }
}