package com.example.kotlinbegins

public class MyClass : ClassA()  {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            // All data types are like non primitive and starts with Capital letters

            Int
            String
            Boolean
            Float
            Double
            Long
            Char
            Byte
            Short

            // Declaring Variable

//            var a : Int
//            a = 7

            var a = 7
            var Desg : String = "Android Developers."

            // val and var

            var b = 11
            b = 13

            val name = "GET"    // val can not be reassigned.similar to final in java.



            println("Hey $Desg lets learn Kotlin.")
        }

    }
}