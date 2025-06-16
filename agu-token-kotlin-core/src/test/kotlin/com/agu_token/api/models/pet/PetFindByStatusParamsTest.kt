// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models.pet

import com.agu_token.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetFindByStatusParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        PetFindByStatusParams.builder().status(PetFindByStatusParams.Status.AVAILABLE).build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            PetFindByStatusParams.builder().status(PetFindByStatusParams.Status.AVAILABLE).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("status", "available").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PetFindByStatusParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
