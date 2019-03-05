package com.eugene.kotlin

import kotlin.test.assertEquals
import org.junit.Test

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class PersonTest {

    @Test 
    fun getBirthDateTest() {
        var date: LocalDate = LocalDate.parse("2019-03-04", DateTimeFormatter.ISO_DATE)
        var person = Person("firstName", "lastName", date)
        assertEquals(date, person.birthDate)
    }
}