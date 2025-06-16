// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.blocking.store

import com.agu_token.api.TestServerExtension
import com.agu_token.api.client.okhttp.AguTokenOkHttpClient
import com.agu_token.api.models.Order
import com.agu_token.api.models.store.order.OrderCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrderServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            AguTokenOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderService = client.store().order()

        val order =
            orderService.create(
                OrderCreateParams.builder()
                    .order(
                        Order.builder()
                            .id(10L)
                            .complete(true)
                            .petId(198772L)
                            .quantity(7)
                            .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(Order.Status.APPROVED)
                            .build()
                    )
                    .build()
            )

        order.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            AguTokenOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderService = client.store().order()

        val order = orderService.retrieve(0L)

        order.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            AguTokenOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderService = client.store().order()

        orderService.delete(0L)
    }
}
