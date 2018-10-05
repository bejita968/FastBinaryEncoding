// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package protoex;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import fbe.*;
import proto.*;

enum class OrderTypeEnum
{
    market(0 + 0)
    , limit(0 + 1)
    , stop(0 + 2)
    , stoplimit(0 + 3)
    ;

    var raw: Byte = 0
        private set

    constructor(value: Byte) { this.raw = value.toByte() }
    constructor(value: Short) { this.raw = value.toByte() }
    constructor(value: Int) { this.raw = value.toByte() }
    constructor(value: Long) { this.raw = value.toByte() }
    constructor(value: OrderTypeEnum) { this.raw = value.raw }

    override fun toString(): String
    {
        if (this == market) return "market"
        if (this == limit) return "limit"
        if (this == stop) return "stop"
        if (this == stoplimit) return "stoplimit"
        return "<unknown>"
    }

    companion object
    {
        private val mapping = HashMap<Byte, OrderTypeEnum>()

        init
        {
            for (value in OrderTypeEnum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: Byte): OrderTypeEnum? { return mapping[value] }
    }
}
