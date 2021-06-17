package subtask1

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {

        Locale.setDefault(Locale("ru"))
        var newDateFormat = SimpleDateFormat("d M yyyy")
        newDateFormat.isLenient = false

        val date: Date? = try {
            newDateFormat.parse("$day $month $year")
        } catch (e: ParseException) {
            null
        }

        newDateFormat = SimpleDateFormat("d MMMM, EEEE", Locale.getDefault())

        return if (date != null) newDateFormat.format(date) else "Такого дня не существует"
    }
}
