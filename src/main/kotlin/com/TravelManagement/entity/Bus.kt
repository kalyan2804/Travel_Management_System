package com.TravelManagement.entity

import com.TravelManagement.entity.common.AbstractEntity
import java.util.*
import javax.persistence.Entity

@Entity
class Bus : AbstractEntity() {
    var busNumber: String? = null
    var busName: String? = null
    var fromStation: String? = null
    var toStation: String? = null
    var dateOfDeparture: Date? = null
    var departureTime: String? = null
    var arrivalTime: String? = null
    var journeyTime: String? = null
    var price: Int? = 0
}