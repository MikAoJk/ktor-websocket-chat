package no.taule.kartveit.server

import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import no.taule.kartveit.server.plugins.configureRouting
import no.taule.kartveit.server.plugins.configureSockets

fun startEmbeddedServer() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSockets()
    configureRouting()
}
