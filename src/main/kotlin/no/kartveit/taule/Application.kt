package no.kartveit.taule

import no.kartveit.taule.client.startClient
import no.kartveit.taule.server.startEmbeddedServer

fun main() {
    startEmbeddedServer()
    startClient()
}
