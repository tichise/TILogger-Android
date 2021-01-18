package tichise.tilogger

import android.util.Log

open class TILogger {
    private var mPrefix = "TILogger"

    public fun setPrefix(prefix: String) : TILogger {
        mPrefix = prefix

        return this
    }

    fun verbose(message: String) {
        val logMessage = getLogMessage(LogLevel.VERBOSE, message)

        Log.v(mPrefix, logMessage)
    }

    fun debug(message: String) {
        val logMessage = getLogMessage(LogLevel.DEBUG, message)

        Log.d(mPrefix, logMessage)
    }

    fun info(message: String) {
        val logMessage = getLogMessage(LogLevel.INFO, message)

        Log.i(mPrefix, logMessage)
    }

    fun warining(message: String) {
        val logMessage = getLogMessage(LogLevel.WARNING, message)

        Log.w(mPrefix, logMessage)
    }

    fun error(message: String) {
        val logMessage = getLogMessage(LogLevel.ERROR, message)

        Log.e(mPrefix, logMessage)
    }

    fun getLogMessage(logLevel: LogLevel, message: String): String {
        val stackTrace = Thread.currentThread().stackTrace[3]
        val className = stackTrace.className.split(".").last()
        val formattedClassName = className.split("$").first()
        val messagePrefix = logLevel.logLovel + " " + formattedClassName + " #" + stackTrace.lineNumber + " - " + stackTrace.methodName + " - "
        val logMessage = messagePrefix + message

        return logMessage
    }

    enum class LogLevel(val logLovel: String) {
        VERBOSE("💜 VERBOSE"),
        DEBUG("💚 DEBUG"),
        INFO("💙 INFO"),
        WARNING("💛 WARNING"),
        ERROR("❤️ ERROR")
    }
}