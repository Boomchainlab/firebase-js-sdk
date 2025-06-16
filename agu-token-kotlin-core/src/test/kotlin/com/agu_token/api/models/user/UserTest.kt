// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models.user

import com.agu_token.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val user =
            User.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1)
                .build()

        assertThat(user.id()).isEqualTo(10L)
        assertThat(user.email()).isEqualTo("john@email.com")
        assertThat(user.firstName()).isEqualTo("John")
        assertThat(user.lastName()).isEqualTo("James")
        assertThat(user.password()).isEqualTo("12345")
        assertThat(user.phone()).isEqualTo("12345")
        assertThat(user.username()).isEqualTo("theUser")
        assertThat(user.userStatus()).isEqualTo(1)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val user =
            User.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1)
                .build()

        val roundtrippedUser =
            jsonMapper.readValue(jsonMapper.writeValueAsString(user), jacksonTypeRef<User>())

        assertThat(roundtrippedUser).isEqualTo(user)
    }
}
