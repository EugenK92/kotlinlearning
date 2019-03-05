package com.eugene.kotlin

import kotlin.test.assertEquals
import org.junit.Test

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class ProjectsTest {

    @Test 
    fun findPiToNDigitTest() {
        val n: Int = 12
        var project = Projects()
        var pi_12: Double = project.findPiToNDigit(n)
        assertEquals(3.141592653589, pi_12)
    }

    @Test 
    fun findEToNDigitTest() {
        val n: Int = 7
        var project = Projects()
        var e_7: Double = project.findEToNDigit(n)
        assertEquals(2.7182818, e_7)
    }

    @Test
    fun fibonacciToN() {
        val n: Int = 11
        var project = Projects()
        var fibonacci: MutableList<Int> = project.fibonacciToN(n)
        val expected: MutableList<Int> = mutableListOf<Int>(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
        assertEquals(expected, fibonacci)        
    }

}