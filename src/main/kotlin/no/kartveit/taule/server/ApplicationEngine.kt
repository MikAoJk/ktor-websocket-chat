package no.kartveit.taule.server

import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import no.kartveit.taule.server.plugins.configureRouting
import no.kartveit.taule.server.plugins.configureSockets

fun startEmbeddedServer() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = false)
}

fun Application.module() {
    configureSockets()
    configureRouting()
}
