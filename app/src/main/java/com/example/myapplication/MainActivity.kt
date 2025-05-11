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

val sampleCourses = listOf(
    Course("Mobile App Development", "CS301", 3, "Learn how to build mobile apps using Jetpack Compose.", "CS101, CS102"),
    Course("Data Structures", "CS201", 4, "Stacks, queues, trees, and graphs.", "CS100"),
    Course("Artificial Intelligence", "CS401", 3, "Intro to AI concepts like search, planning, and learning.", "CS301"),
    Course("Database Systems", "CS305", 3, "Covers relational models, SQL, and transactions.", "CS201"),
    Course("Operating Systems", "CS302", 4, "Processes, threads, memory management, and file systems.", "CS201"),
    Course("Web Development", "CS204", 3, "Frontend and backend development using HTML, CSS, JS, and Node.js.", "CS101"),
    Course("Computer Networks", "CS303", 3, "Networking protocols, TCP/IP, routing, and security.", "CS201"),
    Course("Software Engineering", "CS306", 3, "Software development lifecycle, UML, and Agile methods.", "CS204"),
    Course("Machine Learning", "CS402", 3, "Supervised and unsupervised learning techniques.", "CS401"),
    Course("Cloud Computing", "CS403", 3, "Cloud models, services, and deployment using AWS and Azure.", "CS302")
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




