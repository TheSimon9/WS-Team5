package org.acme.order

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/api/v1/order")
class OrderApi {

    @GET
    fun order(): String {
        return "Hello, World!"
    }

}