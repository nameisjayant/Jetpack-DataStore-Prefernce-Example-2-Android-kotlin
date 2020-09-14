# Jetpack-DataStore-Prefernce-Example-2-Android-kotlin

What is DataStore 🤷‍♀️? Jetpack DataStore is a data storage solution. It allows us to store key-value pairs (like SharedPreferences) or typed objects with protocol buffers DataStore uses Kotlin, Coroutines and Flow to store data asynchronously with consistency and transaction support 😍. In short, it’s the new data storage solution which is the replacement of SharedPreferences.

Why DataStore 🤷‍♂️ First and my favourite reason 😃 — Built with❤️ Kotlin, Coroutines and Flow. If you have used SharedPreferences you might abuse or blamed it for something 😆 then DataStore is here to rescue! SharedPreference has some drawbacks like it provided synchronous APIs -but it’s not MAIN-thread-safe! whereas DataStore is safe to use in UI thread because it uses Dispatchers.IO under the hood👀. It’s safe from runtime exceptions!❌⚠️. What would be more satisfying that? 😅 It also provides a way to migrate from SharedPreferences 😍. It provides Type safety! (Using Protocol buffers). These are some reasons which encourage us to use DataStore and finally say goodbye to beloved SharedPreferences 👋.

Let’s begin code 👨‍💻

We’ll develop a sample Android application which stores a UI mode preference from user i.e. 🌞 Light Mode or 🌑 Dark Mode.
