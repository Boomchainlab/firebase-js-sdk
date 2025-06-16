@file:JvmName("JsonHandler")

package com.agu_token.api.core.handlers

import com.agu_token.api.core.http.HttpResponse
import com.agu_token.api.core.http.HttpResponse.Handler
import com.agu_token.api.errors.AguTokenInvalidDataException
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw AguTokenInvalidDataException("Error reading response", e)
            }
        }
    }
