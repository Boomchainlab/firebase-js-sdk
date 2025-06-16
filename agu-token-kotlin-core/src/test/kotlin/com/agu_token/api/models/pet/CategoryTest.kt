// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models.pet

import com.agu_token.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CategoryTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val category = Category.builder().id(1L).name("Dogs").build()

        assertThat(category.id()).isEqualTo(1L)
        assertThat(category.name()).isEqualTo("Dogs")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val category = Category.builder().id(1L).name("Dogs").build()

        val roundtrippedCategory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(category),
                jacksonTypeRef<Category>(),
            )

        assertThat(roundtrippedCategory).isEqualTo(category)
    }
}
