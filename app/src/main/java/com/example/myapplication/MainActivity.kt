package com.example.myapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.data.Course
import com.example.myapplication.view.CourseListScreen
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.view.CourseCard


val sampleCourses = listOf(
    Course("Mobile App Development", "CS301", 3, "Learn how to build mobile apps using Jetpack Compose.", "CS101, CS102"),
    Course("Data Structures", "CS201", 4, "Stacks, queues, trees, and graphs.", "CS100"),
    Course("Artificial Intelligence", "CS401", 3, "Intro to AI concepts like search, planning, and learning.", "CS301"),
    Course("Mobile App Development", "CS301", 3, "Learn how to build mobile apps using Jetpack Compose.", "CS101, CS102"),
    Course("Data Structures", "CS201", 4, "Stacks, queues, trees, and graphs.", "CS100"),
    Course("Artificial Intelligence", "CS401", 3, "Intro to AI concepts like search, planning, and learning.", "CS301"),
)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApplicationTheme{
                Surface(color = MaterialTheme.colorScheme.background) {
                    CourseListScreen(sampleCourses)
                }
            }
        }
    }
}
@Preview(
    name = "Light Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LightModePreview() {
    MyApplicationTheme {
        CourseListScreen(sampleCourses)
    }
}
@Preview(
    name = "Dark Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DarkModePreview() {
    MyApplicationTheme {
        CourseListScreen(sampleCourses)
    }
}




