// CalculatorScreen.kt (UI Composable)
package com.example.cleancode_dojo.features.calculator.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cleancode_dojo.features.calculator.CalculatorViewModel

@Composable
fun CalculatorScreen(viewModel: CalculatorViewModel) {
    var number1 by remember { mutableStateOf("") }
    var number2 by remember { mutableStateOf("") }
    val result by viewModel.result.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = number1,
            onValueChange = { number1 = it },
            label = { Text("Number 1") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = number2,
            onValueChange = { number2 = it },
            label = { Text("Number 2") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            viewModel.onCalculateClicked(number1, number2)
        }) {
            Text("Add")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = result)
    }
}