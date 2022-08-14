package com.google.notekeeper.data

data class CourseInfo (val courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

data class NoteInfo(var course: CourseInfo, var title: String, var text: String)