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

    //@Test
    fun calculateMortgageTest() {

    }

    @Test
    fun changeAutomatTest() {
        var project = Projects()
        var result: List<Int> = project.changeAutomat(42.27f, 50f)
        var expected: List<Int> = listOf(500, 200, 50, 20 , 2, 1)
        assertEquals(expected, result)

        result = project.changeAutomat(5289f, 10000f)
        expected = listOf(50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 20000, 1000, 100)
        assertEquals(expected, result)
    }

    @Test
    fun decimalToBinaryTest() {
        var project = Projects()
        var result: List<Int> = project.decimalToBinary(13)
        var expected: List<Int> = listOf(1, 1, 0, 1)
        assertEquals(expected, result)

        result = project.decimalToBinary(174)
        expected = listOf(1, 0, 1, 0, 1, 1, 1, 0)
        assertEquals(expected, result)
    }

    @Test
    fun binaryToDecimalTest() {
        var project = Projects()
        var result: Int = project.binaryToDecimal(111001)
        var expected: Int = 57
        assertEquals(expected, result)

        result = project.binaryToDecimal(11001)
        expected = 25
        assertEquals(expected, result)
    }

    @Test
    fun calculatorTest() {
        var project = Projects()
        var result: Float = project.calculator("+", 1f, 1f)
        var expected: Float = 2f
        assertEquals(expected, result)

        result = project.calculator("-", 1f, 1f)
        expected = 0f
        assertEquals(expected, result)

        result = project.calculator("*", 1f, 1f)
        expected = 1f
        assertEquals(expected, result)

        result = project.calculator("/", 1f, 1f)
        expected = 1f
        assertEquals(expected, result)

        result = project.calculator("/", 1f, 0f)
        expected = 0f
        assertEquals(expected, result)

        result = project.calculator("wffw", 1f, 1f)
        expected = 0f
        assertEquals(expected, result)
    }

    @Test
    fun unitConverterTest() {
        var project = Projects()
        var result: Float = project.unitConverter("temp", 40f)
        var expected: Float = 104f
        assertEquals(expected, result)

        result = project.unitConverter("temp", -40f, 2)
        expected = -40f
        assertEquals(expected, result)

        result = project.unitConverter("temp", 50f, 2)
        expected = 10f
        assertEquals(expected, result)
    }
}