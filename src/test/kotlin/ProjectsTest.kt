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

    @Test
    fun isPrimeTest() {
        var project = Projects()
        var n = 1
        assertEquals(false, project.isPrime(n)) 
        n = 2                
        assertEquals(true, project.isPrime(n)) 
        n = 3                
        assertEquals(true, project.isPrime(n)) 
        n = 4                
        assertEquals(false, project.isPrime(n))  
        n = 9                
        assertEquals(false, project.isPrime(n))        
        n = 71                
        assertEquals(true, project.isPrime(n))         
        n = 91                
        assertEquals(false, project.isPrime(n))         
    }

    @Test
    fun primeFactorizeTest() {
        var project = Projects()
        var n: Int = 156
        var primeFacs: MutableList<Int> = project.primeFactorizeN(n)
        var expected: MutableList<Int> = mutableListOf<Int>(2, 2, 3, 13)
        assertEquals(expected, primeFacs) 

        n = 9999
        primeFacs = project.primeFactorizeN(n)
        expected = mutableListOf<Int>(3, 3, 11, 101)
        assertEquals(expected, primeFacs) 

    }

    @Test 
    fun getNPrimeNumbersTest() {
        var project = Projects()
        var n: Int = 10
        var primeNums: MutableList<Int> = project.getNPrimeNumbers(n)
        var expected: MutableList<Int> = mutableListOf<Int>(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
        assertEquals(expected, primeNums) 
    }

    @Test
    fun costOfTileTest() {
        var project = Projects()
        var result: Float = project.costOfTile(20, 50, 20.77f)
        var expected: Float = 20770f
        assertEquals(expected, result)
    }

    @Test
    fun calculateMortgageTest() {
        var project = Projects()
        var result: String = project.calculateMortgage(10400f, 24, 2.5f)
        var expected: String = "Monthly:444,58;Interest:269,89;EndCost:10,669,89"
        assertEquals(expected, result)
    }
}