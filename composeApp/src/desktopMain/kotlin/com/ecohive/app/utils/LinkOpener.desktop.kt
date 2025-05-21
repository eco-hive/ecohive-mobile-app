package com.ecohive.app.utils

import java.awt.Desktop
import java.net.URI

actual fun openLink(url: String) {
    Desktop.getDesktop().browse(URI(url))
}
