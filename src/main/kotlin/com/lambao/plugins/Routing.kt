package com.lambao.plugins

import com.lambao.room.RoomController
import com.lambao.routes.chatSocket
import com.lambao.routes.getAllMessages
import io.ktor.server.application.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
