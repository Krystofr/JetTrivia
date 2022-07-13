package app.christopher.jettrivia.data


//Wrapper class for emitting metadata
data class DataOrException<T, Boolean, E: Exception>(
    var data: T? = null,
    var loading: Boolean? = null,
    var e: E? = null
)