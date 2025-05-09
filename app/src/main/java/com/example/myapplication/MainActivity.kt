package com.example.myapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import com.example.myapplication.data.Course
import com.example.myapplication.view.CourseListScreen
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.view.CourseCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sampleCourses = listOf(
            Course("Mobile App Development", "CS301", 3, "Learn how to build mobile apps using Jetpack Compose.", "CS101, CS102"),
            Course("Data Structures", "CS201", 4, "Stacks, queues, trees, and graphs.", "CS100"),
            Course("Artificial Intelligence", "CS401", 3, "Intro to AI concepts like search, planning, and learning.", "CS301"),
            Course("Mobile App Development", "CS301", 3, "Learn how to build mobile apps using Jetpack Compose.", "CS101, CS102"),
            Course("Data Structures", "CS201", 4, "Stacks, queues, trees, and graphs.", "CS100"),
            Course("Artificial Intelligence", "CS401", 3, "Intro to AI concepts like search, planning, and learning.", "CS301"),
        )

        setContent {
            MyApplicationTheme{
                Surface(color = MaterialTheme.colorScheme.background) {
                    CourseListScreen(sampleCourses)
                }
            }
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun CourseCardPreview() {
//    MyApplicationTheme{
//        CourseCard(
//            Course(
//                "AI Basics", "CS401", 3,
//                "Introduction to Artificial Intelligence concepts.",
//                "Math201, CS301"
//            )
//        )
//    }
//}
//
//@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
//@Composable
//fun CourseCardDarkPreview() {
//    CourseCardPreview()
//}
