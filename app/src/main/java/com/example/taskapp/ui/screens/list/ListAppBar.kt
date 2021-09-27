package com.example.taskapp.ui.screens.list

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskapp.ui.theme.topAppBarBackgroundColor
import com.example.taskapp.ui.theme.topAppBarContentColor

@Composable
fun ListAppBar() {
    DefaultListAppBar()
}

@Composable
fun DefaultListAppBar() {
    TopAppBar(
        title = {
            Text(text= "Tasks", color=MaterialTheme.colors.topAppBarContentColor)
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor

    )
}

@Composable
@Preview
private fun DefaultListAppBarPreview() {
    DefaultListAppBar()
}
