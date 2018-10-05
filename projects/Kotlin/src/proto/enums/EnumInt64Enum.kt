// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package enums;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import fbe.*;

enum class EnumInt64Enum
{
    ENUM_VALUE_0(0L + 0)
    , ENUM_VALUE_1(-9223372036854775807L + 0)
    , ENUM_VALUE_2(-9223372036854775807L + 1)
    , ENUM_VALUE_3(9223372036854775806L + 0)
    , ENUM_VALUE_4(9223372036854775806L + 1)
    , ENUM_VALUE_5(ENUM_VALUE_3.raw)
    ;

    var raw: Long = 0L
        private set

    constructor(value: Byte) { this.raw = value.toLong() }
    constructor(value: Short) { this.raw = value.toLong() }
    constructor(value: Int) { this.raw = value.toLong() }
    constructor(value: Long) { this.raw = value.toLong() }
    constructor(value: EnumInt64Enum) { this.raw = value.raw }

    override fun toString(): String
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0"
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1"
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2"
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3"
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4"
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5"
        return "<unknown>"
    }

    companion object
    {
        private val mapping = HashMap<Long, EnumInt64Enum>()

        init
        {
            for (value in EnumInt64Enum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: Long): EnumInt64Enum? { return mapping[value] }
    }
}
