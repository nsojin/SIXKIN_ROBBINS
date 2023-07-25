package com.example.myapplication

class ICECREAM {
    fun operation(icecream: String) {

        println("[1]바닐라, [2]베리베리스트로베리, [3]아빠는 지구인, [4]민트초코, [5]슈팅스타, [6]올때 메로나")
        var selectnumber = readln()!!.toInt()

        while (true) {
                when (selectnumber) {
                    1 -> {
                        println("바닐라 아이스크림을 선택하셨습니다.")
                        break
                    }

                    2 -> {
                        println("베리베리스트로베리 아이스크림을 선택하셨습니다.")
                        break
                    }

                    3 -> {
                        println("아빠는 지구인 아이스크림을 선택하셨습니다.")
                        break
                    }

                    4 -> {
                        println("민트초코 아이스크림을 선택하셨습니다.")
                        break
                    }

                    5 -> {
                        println("슈팅스타 아이스크림을 선택하셨습니다.")
                        break
                    }

                    6 -> {
                        println("올때 메로나를 선택하셨습니다.")
                        break
                    }

                    else -> {
                        println("잘못선택하셨습니다. 다시 선택하여 주세요.")
                        return
                    }
            }
        }
    }
}