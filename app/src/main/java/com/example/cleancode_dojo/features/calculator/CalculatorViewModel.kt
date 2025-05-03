// CalculatorViewModel.kt (Presentation Layer)
package com.example.cleancode_dojo.features.calculator

import androidx.lifecycle.ViewModel
import com.example.cleancode_dojo.features.calculator.domain.AddNumbersUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CalculatorViewModel : ViewModel() {
    private val addNumbersUseCase = AddNumbersUseCase()

    private val _result = MutableStateFlow("")
    val result: StateFlow<String> = _result

    fun onCalculateClicked(input1: String, input2: String) {
        val sumResult = addNumbersUseCase.execute(input1, input2)
        _result.value = sumResult
    }
}