package subtask3

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var sumInt = 0
        val newString = StringBuilder()
        var date = LocalDate.of(2000, 12, 30)
        for (i in blockA) {

            when (i) {
                is Int -> sumInt += i
                is String -> newString.append(i)
                is LocalDate -> {
                    blockA.forEach {
                        if (it is LocalDate) {
                            if (it > date) date = it
                        }
                    }

                }
            }
        }

        when(blockB){
            String::class -> return newString.toString()
            Int::class -> return sumInt
            LocalDate::class -> return "${date.dayOfMonth}.${date.monthValue}.${date.year}"
            else -> return 0
        }
    }
}
