# jetpack-compose-live-connection
Simple app to monitor internet connection via Jetpack Compose

This app is built by Jetpack Compose. Its main purpose is monitoring internet connection in real-time so user interface can respond to connection change.

<a href="https://github.com/raheemadamboev/jetpack-compose-live-connection/blob/master/app-debug.apk">Demo App</a>

It observes connection state with the help of LiveData and checks from Google server if it actually has internet connection. Connection with Google server is done in the background via Kotlin Coroutines.
