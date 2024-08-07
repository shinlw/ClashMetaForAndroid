package com.github.kr328.clash.design.util

import com.github.kr328.clash.common.util.PatternFileName

typealias Validator = (String) -> Boolean

val ValidatorAcceptAll: Validator = {
    true
}

val ValidatorFileName: Validator = {
    PatternFileName.matches(it) && it.isNotBlank()
}

val ValidatorNotBlank: Validator = {
    it.isNotBlank()
}

val ValidatorHttpUrl: Validator = {
    it.startsWith("https://", ignoreCase = true) || it.startsWith("http://", ignoreCase = true) || it.startsWith("content://", ignoreCase = true)
}

val ValidatorAutoUpdateInterval: Validator = {
    it.isEmpty() || (it.toLongOrNull() ?: 0) >= 15
}
