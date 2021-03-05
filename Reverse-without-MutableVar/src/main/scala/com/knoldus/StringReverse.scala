package com.knoldus

import scala.io.StdIn._            // package for reading line
import scala.annotation.tailrec    // package for tail recursion function

object StringReverse {

  def inputReverse(input: String): String = {

    @tailrec           // tailrec for reversing the input
    def reverse(input: String, n: String): String = {
      input match {
        case "" => n                // case for blank input
        case word => reverse(word.tail, word.head +n)   // recursively calling  reverse
      }
    }
    reverse(input,n="")
  }


  def main(args: Array[String]): Unit = {

    println("Type Something \n eg. your name :")
    val input = readLine()                    // input from user
    println("Reverse of the input :")
    println(inputReverse(input))              // printing output

  }

}
