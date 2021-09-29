package com.example.taskapp.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.taskapp.data.models.Priority
import com.example.taskapp.data.models.ToDoTask
import com.example.taskapp.util.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask= selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        },
        content = {
            TaskContent(
                title = "",
                onTitleChange = {},
                description = "",
                onDescriptionChange = {},
                priority = Priority.LOW,
                onPrioritySelected = {}
            )
        }
    )
}