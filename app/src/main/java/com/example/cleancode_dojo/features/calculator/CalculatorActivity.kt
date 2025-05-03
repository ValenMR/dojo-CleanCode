// CalculatorActivity.kt (UI Layer)
package com.example.cleancode_dojo.features.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.cleancode_dojo.features.calculator.ui.CalculatorScreen
import com.example.cleancode_dojo.ui.theme.CleanCodeDojoTheme

class CalculatorActivity : ComponentActivity() {
    private val viewModel: CalculatorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanCodeDojoTheme {
                CalculatorScreen(viewModel)
            }
        }
    }
}