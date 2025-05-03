// AddNumbersUseCase.kt (Domain Layer)
package com.example.cleancode_dojo.features.calculator.domain

class AddNumbersUseCase {
    fun execute(input1: String, input2: String): String {
        return try {
            val sum = input1.toInt() + input2.toInt()
            "Result: $sum"
        } catch (e: Exception) {
            "Invalid input"
        }
    }
}