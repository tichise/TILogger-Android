package tichise.tilogger

import android.util.Log

object TILogger {
    private val tag = "TILogger"
    
    @JvmStatic
    fun debug(message: String) {
        val stackTrace = Thread.currentThread().stackTrace[3]
        val className = stackTrace.className.split(".").last()
        val formattedClassName = className.split("$").first()
        val messagePrefix = formattedClassName + " #" + stackTrace.lineNumber + " " + stackTrace.methodName + " - "
        Log.d(tag, messagePrefix + message)
    }
}