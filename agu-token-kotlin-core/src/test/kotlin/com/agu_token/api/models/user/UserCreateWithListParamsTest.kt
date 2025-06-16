// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserCreateWithListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        UserCreateWithListParams.builder()
            .addItem(
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
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            UserCreateWithListParams.builder()
                .addItem(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
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
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserCreateWithListParams.builder().build()

        val body = params._body()
    }
}
