package com.example.myapplication

class Ice(val name:String,val price:Double,val info:String)  {

    fun operation() {

        val Vanilla = Ice("바닐라", 3.0, "누구나 아는 그 맛")
        val StrawBerry = Ice("베리베리 스트로베리", 3.5, "진한 딸기맛 아이스크림")
        val DadEarth = Ice("아빠는 지구인", 4.5, "우리 아빠가...지구인???")
        val MintChoco = Ice("민트초코", 3.5, "호불호가 없다는 바로 그 맛")
        val ShootingStar = Ice("슈팅스타", 3.5, "입안에서 터지는 불꽃놀이")
        val AllthatMelona = Ice("올때 메로나", 3.0, "메로나는 사실 참외맛이죠")

        println("==========================아이스크림을 선택해주세요.=========================")
        println("0. 뒤로가기")
        println("1. 아이스크림 이름:${Vanilla.name} ㅣ가격:${Vanilla.price} ㅣ설명:${Vanilla.info}")
        println("2. 아이스크림 이름:${StrawBerry.name}ㅣ가격:${StrawBerry.price}ㅣ설명:${StrawBerry.info}")
        println("3. 아이스크림 이름:${DadEarth.name}ㅣ가격:${DadEarth.price}ㅣ설명:${DadEarth.info}")
        println("4. 아이스크림 이름:${MintChoco.name}ㅣ가격:${MintChoco.price}ㅣ설명:${MintChoco.info}")
        println("5. 아이스크림 이름:${ShootingStar.name}ㅣ가격:${ShootingStar.price}ㅣ설명:${ShootingStar.info}")
        println("6. 아이스크림 이름:${AllthatMelona.name}ㅣ가격:${AllthatMelona.price}ㅣ설명:${AllthatMelona.info}")

        while (true) {
            try {
                val choice = readLine()?.toInt() ?: throw Exception()

                when (choice) {
                    0 -> {
                        back()
                    break}
                    1 -> {
                        order(Vanilla)
                    break}
                    2 -> {order(StrawBerry)
                    break}
                    3 -> {order(DadEarth)
                    break}
                    4 -> {order(MintChoco)
                    break}
                    5 -> {order(ShootingStar)
                    break}
                    6 -> {order(AllthatMelona)
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

    fun order(Ice:Ice) {
        println("선택하신 아이스크림: ${Ice.name}")
        println("가격: ${Ice.price}")
        println("주문이 완료되었습니다.")

    }
}