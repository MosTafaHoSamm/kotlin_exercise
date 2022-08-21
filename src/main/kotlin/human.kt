//class Human {
//    var name :String?=null
//    var gender:String?=null
//    var length:Int?=null
//    fun introduce(){
//        this.length=this.length?.plus(10)
//        println("My Name is ${this.name}")
//        println("My Name is ${this.gender}")
//        println("My Name is ${this.length}")
//    }
//}

//class Human(a:Int){
//    var age:Int?=null
//   init{
//        this.age=a
//        println("Age Is : ${this.age}")
//
//    }
//}

//Over Loading
class Human {
    constructor(a:Int,b:Int){
        println("Sum = ${a+b}")
    }
    constructor(a:Double,b:Double){
        println("Sum = ${a+b}")
    }
    constructor(){
        println("Hello Mostafa Hosam }")
    }
}