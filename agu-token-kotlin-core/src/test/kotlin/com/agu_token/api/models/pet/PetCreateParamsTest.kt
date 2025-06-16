// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models.pet

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        PetCreateParams.builder()
            .pet(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            PetCreateParams.builder()
                .pet(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .category(Category.builder().id(1L).name("Dogs").build())
                        .status(Pet.Status.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PetCreateParams.builder()
                .pet(Pet.builder().name("doggie").addPhotoUrl("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Pet.builder().name("doggie").addPhotoUrl("string").build())
    }
}
