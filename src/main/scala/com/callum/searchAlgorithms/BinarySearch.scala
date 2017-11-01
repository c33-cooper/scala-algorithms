package com.callum.searchAlgorithms

import com.google.inject.{ImplementedBy, Singleton}

@ImplementedBy(classOf[BinarySearchImpl])
trait BinarySearch {

  def imperativeSearch(a: Array[Int], value: Int): Int

  def recursiveSearch(a: Array[Int], value: Int): Int
}

@Singleton
class BinarySearchImpl {

  def imperativeSearch(a: Array[Int], value: Int): Int = {
    var start = 0
    var end = a.length
    var middle = (end + start) / 2

    while (end > start && a(middle) != value) {
      if (value < a(middle)) {
        end = middle
      } else {
        start = middle + 1
      }
      middle = (start + end) / 2
    }
    if (end > start) middle else -1
  }

  def recursiveSearch(a: Array[Int], value: Int): Int = {
    def nestedRecursiveSearch(a: Array[Int], value: Int, start: Int, end: Int): Int = {
      if (end <= start) -1 else {
        val middle = (end + start) / 2
        if (a(middle) == value) middle
        else if(value < a(middle)) nestedRecursiveSearch(a, value, start, middle)
        else nestedRecursiveSearch(a, value, middle+1, end)
      }
    }
    nestedRecursiveSearch(a, value, 0, a.length)
  }
}
