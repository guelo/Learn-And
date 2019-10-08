package com.example.logging

interface ILogger {
    enum class Type {
        DEBUG, WARN, VERBOSE, ERROR
    }

    fun log(logType: Type, message: String)
}