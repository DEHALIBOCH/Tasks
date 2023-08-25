package kz.project.tasks

import androidx.lifecycle.ViewModel

class TaskViewModel(val dao: TaskDao) : ViewModel() {
    var newTaskName = ""

    fun addTask() {
        val task = Task()
        task.taskName = newTaskName
        dao.insert(task)
    }
}