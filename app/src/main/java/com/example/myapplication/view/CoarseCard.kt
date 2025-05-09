package com.example.myapplication.view

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.saveable.rememberSaveable
import com.example.myapplication.data.Course

@Composable
fun CourseCard(course: Course) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { isExpanded = !isExpanded },
        elevation = CardDefaults.cardElevation()
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)
                .animateContentSize()
        ) {
            Text(course.title, style = MaterialTheme.typography.titleMedium)
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(course.code, style = MaterialTheme.typography.bodyMedium)
                Text("${course.creditHours} Credit Hours", style = MaterialTheme.typography.bodyMedium)
            }

            if (isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(course.description, style = MaterialTheme.typography.bodySmall)
                Text("Prerequisites: ${course.prerequisites}", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}

