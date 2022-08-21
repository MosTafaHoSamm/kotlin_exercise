import java.lang.ArithmeticException
import java.lang.Math.pow
import java.lang.NumberFormatException
import java.util.*
import kotlin.math.*
import second.B
import kotlin.concurrent.thread
import kotlin.jvm.Throws
import kotlin.random.Random

fun main(args: Array<String>) {
//println("Mostafa Hosam Eldin")
//println("Mostafa Hosam Eldin")
//    val x : Int =55;
//
//    println("x= $x");
//    val b:Int=15
//    var c:Char='m'
//
//    print("x= "+x);

//    var x:Boolean=true //
//    var r :String="100"
//    var z:Int=r.toInt()
//    var rr:String=r+"mo"
//    println(rr)
//    println("Z = $z");
//    println(x);
//    var y:Boolean=12>30
//    println(y);


//    var x : Int?=33
//    print(x!!);

//    println("Enter your age");
//    var Age :Int?= readLine()!!.toInt()
//    println("Your Age is ${Age!!+9}");

//    println("Enter Any number ")
//    var num:Int?=readLine()!!.toInt()
//    if(num!!>0){
//        println("You Entred Positive Number");
//    }
//    else if (num<0){
//        print("you Entered Negative Number ");
//
//
//    }
//    else {
//        print("you Entered Zero")
//    }
// when used instead of switch

//    println("Enter your name");
//    var name : String?= readLine()
//    when(name){
//        "Mostafa"->{println("Accepted")}
//        "Asmaa"->{println("Accepted")}
//        "Amer"->{println("Accepted")}
//        else->println("Not Accepted");
//    }
//    println("Enter your degree");
//    var degree : Int?= readLine()!!.toInt()
//    when(degree){
//         50->{println("pass")}
//        70->{println("Good")}
//        90->{println("Excellent")}
//        else->println("Not Defined");
//    }
//println("Enter First Number ")
//    var num1:Int?=readLine()!!.toInt()
//println("Enter second Number ")
//    var num2:Int?=readLine()!!.toInt()
//    println("Sumation = ${num1!!+ num2!!}" )
//    println("Sub = ${num1- num2}" )
//    println("Mul = ${num1* num2}" )
//    println("Div = ${num1/ num2}" )
//    println("Modulus = ${num1% num2}" )
//val x =10
//    val y =5
//    if(x>2&&y>10)
//        print("x && y larg numbers")
//    else print("low nembers ")

//    val str="Welcome Sasa"
//    println("str : "+str)
//    println("str : "+str.plus(" ❤ Semsma"))
//    println("str : "+str.length)
//    println("str : "+str.count())
//    println("str : "+str.uppercase())
//    println("str : "+str.lowercase())
//    println("str : "+str.drop(5))
//    println("str : "+str.take(5))
//    println("str : "+str.hashCode())
//    println("str : "+str.reversed())
//    println("str : "+str.toSet())

//    while(true){
//        println("Enter your Degree")
//        var degree :Int=readLine()!!.toInt()
//        if(degree !in 0..100)
//            break
//        when(degree){
//            in 90..100->{println("Excellent")}
//            in 80..90->{println("Very Good ")}
//            in 70..80->{println("Good")}
//            in 60..70->{println("Pass")}
//            in 50..60->{println("fail")}
//        }

//   for (i: Int in 1..12){
//        for (k :Int in 1..12)
//        { println("$i * $k = ${i*k}")
//
//        } }
//    var j : Int =0
//    var x :String = "Asmaa Akram"
//    for(i : Char in x ){
//        println("${j}= $i")
//        j++
//    }
//
//  mostafa@ for (i :Int in 1..10 ){
//    asmaa@ for (k in 1..10){
//        println("$i*$k = ${i*k}")
//        if(k==5)
//            continue@mostafa
//    }
//
//}
//    mostafa@ while(true){
//     try {
//         println("Enter your Age ")
//         val age: Int = readLine()!!.toInt()
//         println("Your Age : $age")
//        break@mostafa
//
//
//     } catch (e: Exception) {
//         println("you Entered error Value ")
//        continue@mostafa
//     }
//}
//    print("Done")
//    val a   =Array<Int>(size = 4){0}
//    a[0]=40
//    a[1]=47
//    a[2]=443
//    a[3]=44
//    for(i:Int in a){
//        println(i)
//    }

//    val a =Array<String>(size = 4){""}
//    a[0]="Mostafa"
//    a[0]="Asmaa"
//    a[0]="Hosam"
//    a[0]="Akram"
//
//    val a =IntArray ( 4)
//    a[0]=1

//    val a: Array<Any> =  arrayOf("Asmaa",55,6.6)
//    println(a[0])
//    println(a[1])
//    println(a[2])
//    val a :Array<Any> =arrayOf("",99,",mostafa")
//    for (i  in 0 until a.size )
//    {
//        println("Enter Value")
//        a[i]= readLine()!!
//    }
//    for (i :Int in 0 until a.size){
//        println(a[i])
//    }

//    val a : Array<Int> =arrayOf(20,33,90,2,11,44)
//    println("size "+a.size)
//    println("count "+a.count())
//    println("max "+a.maxOrNull())
//    println("min "+a.minOrNull())
//    println("get "+a.get(4))
//    println("get "+a.set(4,55))
//    println("get "+a.get(4))
//a[4]=0
//    println("get "+a.get(4))
//    println(a[4])
//
//    a.sort()
//     for(i in 0 until a.count()){
//println(a[i])
//
//    }
//    val a    = ArrayList<Int>()
//    a.add(55)
//    a.add(100)
//    a.add(2,44)
//        println(a[0])

//    val x   =arrayOf<Int>(22,33,44,55,66)
//    for (i in 0 until x.count()){
//       print("Index of ${i+1} = ${x[i]}\n")
//    }
//collection :: set `map  list

//    val x :MutableList<Int> = mutableListOf(22,33,44)
//    val y =mutableSetOf<Int>(88,99,400)
//    val z = mutableMapOf<Int,String>(
//
//    )
//    print(y)
//    print(z)
//    print(x[0])
//    val x : Map<String,Int> = mapOf (Pair("Mostafa",1),Pair("Hosam",2))
//
//    val y : MutableMap<String,String> = mutableMapOf()
//    val d :HashMap<String,String> = hashMapOf()
//
//    y.put("name","Mostafa Hosam")
//    d.put("name","Mostafa Hosam")
//    d.put("name","Mostafa Hosam")
//    print(y)
//    y.set("Age","44")
//    y["section"]="It"
//    y["section"]="It"
//     print(d)
//  }
//    print()
//    calculateAge()

//    val x = sum(44, 55)
//    print(x)
//}
//
//fun print() {
//    print("First part of Functions")
//}
//fun calculateAge(){
//    println("Enter your Age")
//    val birthday :Int = readLine()!!.toInt()
//    val age : Int =Calendar.getInstance().get(Calendar.YEAR)-birthday
//    print("your Age $age")
//}
//
//fun sum(a: Int, b: Int): Int {
//    return (a + b)
//}
//val x :ArrayList<Any> = arrayListOf<Any>()
//
// input(x,4)
//    outPut(x,4)
//
//}
//
//fun input( x :ArrayList<Any> , size:Int){
//    println("Enter elements Of Array")
//    for(i:Int in 0 until size)
//    {
//        x.add(readLine()!!)
//    }
//
//}
//fun outPut(x:ArrayList<Any>,size :Int){
//    for(i : Int in 0 until size){
//        println("x[$i] = ${x[i]}")
//    }
//}
    //............................................
    //..............................................
//Recursive Method
//    println("Enter Positive Number ")
//    val x:Int = readLine()!!.toInt()
//    println("Sumation = ${add(x)}")
//
//}
//fun add(x:Int):Int{
//    return if (x>0) x+add(x-1) else 0
//}
//=================================================
    //Built in functions
//
//    val x :Double=5.0
//   println( x.pow(2))
//   println( x.sign)
//   println( round(6.4))
//   println( ceil(6.4))
//   println( asin(.5)*(180/ PI))
//
//mostafa@ while(true){
//   try{
//      println("please Enter two numbers")
//      val x : Int = readLine()!!.toInt()
//      val y : Int = readLine()!!.toInt()
//      println("x/y = ${x/y}")
//break@mostafa
//   }
//   catch (e:NumberFormatException){
//      println("Enter Integer Number only")
//continue@mostafa
//   }
//   catch (e:ArithmeticException){
//
//      println("Can't Divided By Zero ......")
//continue@mostafa
//   }
//}


    //======================================

    //lambda Expression
//
//    myfun()
//    lambda1()
//    println(
//        lambda2(100)
//    )
////    println("A* B = ${lambda3(44,2)}")
//    println("Higher Order Function = "+sum(2,3) { a, b -> a % b })
//}
//
//fun myfun(): Unit {
//    println("Hello From My Fun")
//}
//
//val lambda1: () -> Unit = {  println("Hello From Lambda1") }
//
//val lambda2: (Int) -> Int = { a -> a * (2) }
//val lambda3:(Int,Int)->Int={a,b->a*b}
////===========================================
////higher Order Functions
//
//fun sum(a:Int,b:Int,myFun:(Int,Int)->Int):Int{
//
//    return myFun(a,b)
//}
//=============================================
//val total=sum(3,4,::myFun)
//
//}
//fun sum(a:Int,b:Int,myFun:(Int,Int)->Unit):Unit{
//
//      myFun(a,b)
//}
//fun myFun(a:Int,b:Int):Unit{
//    var total=0
//    total=  a+b
//    println(total)
//}

////higher("Mostafa", ) { it.reversed()}
//higher("Mostafa",::rever)
//}
//fun higher(value:String,myFun:(String)->String){
//         println(myFun(value))
//}
//fun rever(s:String):String{
//    return s.reversed()+" go"
//}
//val lambadaRever:(String)->String={s->s.reversed()}
//====================================================
//// Higher Order Function With Array
//val x : Array<Int> =Array( 5, { a:Int-> a*2 })
//
//    for (i:Int in x)
//    {println(i)}
//}
//fun myFun(a:Int):String{
//    return ( a+1).toString()
//}
//var mostafa:Human=Human()
//    mostafa.name="Mostafa Hosam Eldin"
//    mostafa.gender="Male"
//    mostafa.length=170
//var Asmaa:Human=Human()
//    Asmaa.name="Asmaa Akram Helmy"
//    Asmaa.gender="Female"
//    Asmaa.length=200
//
//    mostafa.introduce()
//    Asmaa.introduce()
////}
//val h1 =Human(3,4)
//val h3=Human(3.6,4.6)
//    val h2=Human()
//val h=Mostafa()
//    h.myFun()
//    val Mona=Akram()
//    Mona.myFun2()
//
//}
//
//open class Asmaa{
//init {
//    println("From Asmaa")
//}
//    var x:Int?=4444
//    fun myFun(){
//        this.x=50
//        println("Age = ${this.x}")
//    }
//}
//
//open class Mostafa :Asmaa(){
//    init {
//        println("From Mostafa")
//    }
//
//    var age:Int?=null
//    fun myFun2(){
//        this.age=44
//        println("age 2 = ${this.age}")
//        println("age 1 = ${this.x}")
//    }
//
//}
//class Akram :Mostafa(){
//    init {
//        println("From Akram")
//    }
//}

//    var Mostafa=C(55)
//
//}
//
//open class A(){
//    init{
//        println("Hello From A")
//    }
//
//}
//
//open class B:A {
//    constructor(){
//        println("Hello From B")
//    }
//    constructor(n:Int){
//        println("Hello From B with Paarameter")
//    }
//
//}
//
//class C(n:Int) :B(n){
//    init  {
//        println("Hello From C= $n")
//    }
//
//}
//val obj=Operation()
//    obj.sum(6,5)
//
//}
//open class Sum{
//    open fun sum(a:Int,b:Int){
//        println("Summation : ${a+b}")
//
//    }
//}
//open class Sub:Sum(){
//    fun sub(a:Int,b:Int){
//        println("sub : ${a-b}")
//
//    }
//}
//open class Mul:Sub(){
//    fun mul(a:Int,b:Int){
//        println("mul : ${a*b}")
//
//    }
//}
//open class Div:Mul(){
//    fun div(a:Int,b:Int){
//        println("Summation : ${a/b}")
//
//    }
//}
//class Operation:Div(){
//    override fun sum(a:Int,b:Int){
//        println("Summation ==== ${a+b}")
//    }
//
//}
//val m=A()
//    m.setval("Mostafa")
//    var x:String?=m.getVal()
//    print("set & get Value:$x")
//
//}
//open class A{
//    private var name:String?=null
//    protected var gender:String?=null
//    fun setval(a:String){
//        this.name=a
//    }
//    fun getVal():String?{
//        return this.name
//    }
//}
//
//
//
//
//
//
//val a=A()
//    a.namePrint("Mostafa Asmaa")
//
//
//}
// Exception >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // exception Catcher
//printVal(-9)
//}
//fun printVal(a:Int){
//   try {
//       val e= Exception()
//       if(a<0)
//           throw e
//       print(a)
//   }
//   catch(e:Exception){
//       print("Enter Number more than 0")
//   }
//}

// exception Propagator

//try {
//    val b: Int= readLine()!!.toInt()
//    printNum(b)
//}
//catch (e:Exception){
//    print("Error : $e")
//
//}
//
//}
//
//@Throws
//fun printNum(a:Int){
//    val ex =Exception()
//    if(a<0){
//        throw ex
//    }
//    println("Number = $a")
//
//
//}

//Polymorphism


//
//    val x:Array<Shape> =Array(3){Shape()}
//    x[0]=Square()
//    x[1]=Circle()
//    x[2]=Rectangle()
//for(i:Int in 0 until  x.size){
//    x[i].printShape()}
//
//    val a=Tryial()
//    a.printS(Square())
//    a.printS(Shape())
//    a.printS(Circle())
//    a.printS(Rectangle())
//}
//
//
//
//
//open class Shape{
//    open fun printShape(){
//        println("Shape")
//    }
//
//
//}
//open class Rectangle :Shape(){
//  override  fun printShape(){
//        println("Rectangle")
//    }
//
//
//}
//open class Square :Shape(){
//    fun printShapee(){
//        println("Square")
//    }
//
//
//}
//open class Circle :Shape(){
//    override  fun printShape(){
//        println("Circle")
//    }
//
//
//}
//class Tryial{
//    fun printS(a:Shape){
//        a.printShape()
//    }
//}

//
//    val a = Rectangle()
//    a.printValue(5,6)
//
//
//}
//
//abstract class Shape{
//   abstract fun printValue(a:Int , b:Int )
//}
//interface Circle {
//
//    fun printValue2()
//}
//
//class Rectangle :Shape (){
//
//    override fun printValue(a:Int , b:Int)
//        {
//
//                println("Sum : ${a+b}")
//
//        }
//
//
//}

//val b= A()
//    b.namePrint("Mostafa")
//    val b = object : B  {
//        override fun namePrint(a: String) {
//            println("Name : ${a}")
//
//        }
//
//    }
//    b.namePrint("Asmaaaaaaaaaaaaaaaaaa")
//    val bb=Poly()
//    bb.test(
//        object:B {
//        override  fun namePrint(){
//            println("الحمد لله رب العالمين الرحمن الرحيم مالك يوم الدين ")}
//
//
//
//        })
//
//
//}
//class Poly {
//      fun test(a:B) {
//
//      }
//
//}


//    val x =X()
//    x.a=200
//    println("A of X = ${x.a}")
//    val y =Y()
//    var b =y.casting().a
//    b=900
//println("A Of Y = ${b}")
//    var ss =X()
//    val dd = Y()
//    ss=dd as X
//
//var a =A()
//    a.printA()
//a.create()
//
//}
//
////
////class X{
////    var a:Int?=null
////}
////class Y {
////    fun casting ():X{
////        val s=X()
////        return s
////    }
////}
//
//class A{
//    var a:Int?=null
//    fun create() {
//        class C {
//            var b: Int? = null
//            fun printB() {
//                this.b = 400
//                a = 23
//                printA()
//                val c = C()
//                c.printB()
//
//            }
//
//        }
//        println("Trial from Class c")
//
//    }
//    fun printA() {
//        this.a = 90
//        println(" A From A = ${this.a}")
//
//
//          class B {
//            var b: Int? = null
//            fun printB() {
//                this.b = 400
//                a = 23
//                println("${a}")
//                printA()
//            }
//        }
//    }}

//
//    val wor = World()
//    val t1 = Thread(  Runnable {  for (i: Int in 0..5) {
//        println("Hello")
//
//    }
//
//    })
//    val t2 = Thread(Runnable{
//        ->for (i: Int in 0..5) {
//        println("World")
//
//    }
//    })
//
//    t1.start()
//    Thread.sleep(500)
//    println(t1.isAlive)
//    t2.start()
//    t1.join()
//    t2.join()
//    println(t1.isAlive)
//
//    println("End")
//
//
//}
//
//
//class Hello : Runnable {
//    override fun run() {
//        for (i: Int in 0..5)
//            println("Hello")
//        Thread.sleep(500)
//    }
//
//}
//
//class World : Runnable {
//    override fun run() {
//        for (i: Int in 0..5) {
//            println("World")
//            Thread.sleep(500)
//
//        }
//    }
//}
//
//
//
//    println(
//        Directions.East
//    )
//    Directions.East.getDir()
//    println(Directions.NORTH.lat)
//
//}
//
//enum class Directions {
//    NORTH {
//        override fun getDir() {
//            println("North Direction ")
//        }
//        override  var lat:Int?=800
//    },
//    SOUTH {
//        override fun getDir() {
//            println("South Direction ")
//        }
//        override  var lat:Int?=500
//
//    },
//    East {
//        override fun getDir() {
//            println("East Direction ")
//        }
//        override  var lat:Int?=300
//
//    },
//    WEST {
//        override fun getDir() {
//            println("West Direction ")
//        }
//        override  var lat:Int?=100
//
//    };
//
//    open var lat: Int? = null
//    abstract fun getDir()
//
//}

//  println(  Direction.EAST.i)
//  println(  Direction.SOUTH.i)
//    Direction.SOUTH.getDirection()
//    val directions =Direction.values()
//for(i in directions)
//{
//    print("$i"+"\t")
//}
//    print('\n')
//
//    println("Enter Direction ")
//val x :Direction= Direction.valueOf(readLine().toString())
//when(x){
//    Direction.NORTH ->    println("You Choice Direction $x")
//    Direction.SOUTH->println("You Choice Direction $x")
//    Direction.EAST->println("You Choice Direction $x")
//    Direction.WEST->println("You Choice Direction $x")
//    else -> println("Not Found ")
//
//
//}}
//
//
//
//enum class Direction constructor(ii: Int, s: String) {
//
//    NORTH (1,"North"){
//        override fun getDirection() {
//            println("North")
//
//        }
//     },
//    SOUTH (2,"South"){
//        override fun getDirection() {
//            println("South")
//
//        }
//
//    },
//    EAST (3,"East"){
//        override fun getDirection() {
//            println("East")
//
//        }
//
//    },
//    WEST (4,"West"){
//        override fun getDirection() {
//            println("West")
//
//        }
//
//    }
//    ;
//
//
//    abstract fun getDirection()
//   open var i :Int?=ii
//
//}
//
//
//    val a=A<Int,Int>()
//    a.x=10
//     println("${a.x}")
//    val b=A<String,String>()
//    b.x="Mostafa Hosam"
//    b.name="no name but allah"
//    print("${b.x}")
//    a.prpr(a.x!!, a.x!!)
//
//}
//
//
//class A<in T, out E>{
//    var x:T?=null
//    var name:E?=null
//    fun prpr(a:T,b:E):E{
//        print("${a}${b}")
//        return b
//    }
//
//}


}






