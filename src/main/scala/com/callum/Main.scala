package com.callum

import com.callum.searchAlgorithms.BinarySearchImpl

object Main {

  // Objects
  val binarySearch = new BinarySearchImpl

  // Data collection
  val sortedCollection = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  def main(args: Array[String]): Unit = {

    println(s"value 9 is at index - ${binarySearch.imperativeSearch(sortedCollection, 9)} in the collection from an imperativeSearch")
    println(s"value 4 is at index - ${binarySearch.recursiveSearch(sortedCollection, 4)} in the collection from a recursiveSearch")
  }
}
