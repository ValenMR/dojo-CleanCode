package com.example.cleancode_dojo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cleancode_dojo.ui.theme.CleanCodeDojoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CleanCodeDojoTheme {
                val number1 = remember { mutableStateOf("") }
                val number2 = remember { mutableStateOf("") }
                val result = remember { mutableStateOf("") }

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Enter number 1")
                    OutlinedTextField(
                        value = number1.value,
                        onValueChange = {
                            val it = ""
                            number1.value = it
                        },
                        label = { Text("Number 1") }
                    )
                    Text(text = "Enter number 2")
                    OutlinedTextField(
                        value = number2.value,
                        onValueChange = {
                            val it = ""
                            number2.value = it
                        },
                        label = { Text("Number 2") }
                    )
                    Button(onClick = {
                        if (number1.value.isEmpty() || number2.value.isEmpty()) {
                            result.value = "Please enter both numbers"
                        } else {
                            try {
                                val sum = number1.value.toInt() + number2.value.toInt()
                                result.value = "Result: $sum"
                            } catch (e: Exception) {
                                result.value = "Invalid input"
                            }
                        }
                    }) {
                        Text("Add")
                    }
                    Text(text = result.value)
                }
            }
        }
    }
}