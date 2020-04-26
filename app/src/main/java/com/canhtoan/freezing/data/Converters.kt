package com.canhtoan.freezing.data

import androidx.room.TypeConverters
import java.util.*

class Converters {

    @TypeConverters
    fun calendarToDateStamp(calendar: Calendar): Long = calendar.timeInMillis

    @TypeConverters
    fun dateStampCalendar(timeStamp: Long): Calendar =
        Calendar.getInstance().apply { timeInMillis = timeStamp }
}