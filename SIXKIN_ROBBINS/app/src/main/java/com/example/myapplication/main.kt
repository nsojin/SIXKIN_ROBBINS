package com.example.myapplication
fun main(){
    val storename = "SIXKIN ROBBINS"

    var icecream = "아이스크림"
    var bingsu = "빙수"
    var cake = "케이크"
    var beverage = "음료"

    displayInfo(storename,icecream,bingsu,cake,beverage)

    while(true){
        println("[1]아이스크림, [2]빙수, [3]케이크, [4]음료")
        var selectnumber= readLine()!!.toInt()

        when(selectnumber){
            1 -> {
                selectmenu(1)
                break
            }

            2 -> {
                selectmenu(2)
                break
            }

            3 -> {
                selectmenu(3)
                break
            }

            4 -> {
                selectmenu(4)
                break
            }
            else -> {
                println("잘못선택하셨습니다.")
                break
            }
        }
    }



}

fun selectmenu(selectnumber: Int){
    var ice = Ice(name= "", price = 0.0, info = "")
    var bin = BingSu(name= "", price = 0.0, info = "")
    var cak = Cake(name= "", price = 0.0, info = "")
    var bev = Drink(name= "", price = 0.0, info = "")

    if(selectnumber == 1){
        ice.operation()
    }

    else if(selectnumber == 2){
        bin.operation()
    }

    else if(selectnumber == 3){
        cak.operation()
    }

    else if(selectnumber == 4){
        bev.operation()
    }

    else {
        println("다시입력해주세요.")
    }
}

fun displayInfo(storename:String, icecream:String, bingsu:String, cake:String, beverage:String){
    println("========================${storename}에 오신것을 환영합니다.=========================")
    println("${storename}의 메뉴는 다음과 같습니다.")
    println("[${icecream}]")
    println("1. 바닐라             | 닐라닐라 바닐라~")
    println("2. 베리베리스트로베리   | 딸기")
    println("3. 아빠는 지구인       | 아빠도 초고 좋아한다^^")
    println("4. 민트초코           | 난 내 갈길 간다-민초파")
    println("5. 슈팅스타           | 입안에서 팡팡 터지는 매력")
    println("6. 올때 메로나         | 설명 필요없음 '올때 메로나'")
    println("[${bingsu}]")
    println("1. 팥빙수             | 빙수의 원조")
    println("2. 망고 빙수          | 달콤한 빙수의 정석 망고 빙수")
    println("3. 메론 빙수          | 통통튀는 메론 빙수")
    println("4. 치즈 빙수          | 어디든 다 잘어울리는 치즈의 매력")
    println("5. 인절미 빙수         | 이에 달라붙어 사르륵 녹는 매력의 인절미 빙수")
    println("6. 요거트 빙수         | 장건강까지 생각한 요거트 빙수")
    println("[${cake}]")
    println("1. 웰시코기의 숨바꼭질  | 궁디팡팡 웰시코기의 귀여운 뒷모습이 돋보이는 아이스크림 케이크")
    println("2. 아기상어           | 전세계의 슈퍼스타 아기상어 아이스크림 케이크")
    println("3. 라이언             | 갈기가 없는 숫사자지만 모두에게 사랑받는 라이언 아이스크림 케이크")
    println("4. 어피치             | 라이언에게 뒤지지 않는 핑크핑크 매력의 어피치 아이스크림 케이크")
    println("5. 뽀로로             | 아이들의 대통령(뽀통령) 아이스크림 케이크")
    println("6. 루피               | 잔망미 넘치는 사랑스러운 잔망루피 아이스크림 케이크")
    println("[${beverage}]")
    println("1. 아메리카노          | 전국민 피로회복제")
    println("2. 라떼는말이야         | 라떼는말이야 2:2:2였어")
    println("3. 카페모카            | 커피의 쌉쌀함과 초코의 달콤함을 고소한 우유가 감싸 안은 커피")
    println("4. 아포가토            | 쌉쌀한 에스프레소와 달콤한 바닐라 아이스크림의 환상적인 달콤 쌉싸름함")
    println("5. 핫초코              | 당충전이 필요해")
    println("6. 밀크쉐이크           | 따라서 들어왔는데 뭐 먹지..? 그럴땐 밀크쉐이크")
    println("===================== =원하는 메뉴를 선택해 주세요. ==================================")
    println("")

}


