package com.medicine.reminder.util

enum class Recurrence {
    Daily,
    Weekly,
    Monthly
}

fun getRecurrenceList(): List<Recurrence> {
    val recurrenceList = mutableListOf<Recurrence>()
    recurrenceList.add(Recurrence.Daily)
    recurrenceList.add(Recurrence.Weekly)
    recurrenceList.add(Recurrence.Monthly)

    return recurrenceList
}
