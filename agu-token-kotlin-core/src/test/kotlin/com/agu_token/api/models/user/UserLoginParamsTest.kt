// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models.user

import com.agu_token.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserLoginParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        UserLoginParams.builder().password("password").username("username").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = UserLoginParams.builder().password("password").username("username").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("password", "password")
                    .put("username", "username")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UserLoginParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
