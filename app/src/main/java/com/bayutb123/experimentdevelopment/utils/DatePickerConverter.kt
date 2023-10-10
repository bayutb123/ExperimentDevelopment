package com.bayutb123.experimentdevelopment.utils

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date

class DatePickerConverter {
    companion object {
        @SuppressLint("SimpleDateFormat")
        fun convertMillisToDate(millis: Long): String {
            val formatter = SimpleDateFormat("dd/MM/yyyy")
            return formatter.format(Date(millis))
        }
    }
}