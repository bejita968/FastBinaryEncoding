// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

// Fast Binary Encoding string final model class
class FinalModelString(buffer: Buffer, offset: Long) : FinalModel(buffer, offset)
{
    // Get the allocation size
    fun FBEAllocationSize(value: String): Long = (4 + 3 * (value.length + 1)).toLong()

    // Check if the string value is valid
    override fun verify(): Long
    {
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return Long.MAX_VALUE

        val fbeStringSize = readInt32(FBEOffset)
        if (_buffer.offset + FBEOffset + 4 + fbeStringSize > _buffer.size)
            return Long.MAX_VALUE

        return (4 + fbeStringSize).toLong()
    }

    // Get the string value
    fun get(size: Size): String
    {
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
        {
            size.value = 0
            return ""
        }

        val fbeStringSize = readInt32(FBEOffset)
        assert(_buffer.offset + FBEOffset + 4 + fbeStringSize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 + fbeStringSize > _buffer.size)
        {
            size.value = 4
            return ""
        }

        size.value = (4 + fbeStringSize).toLong()
        return readString(FBEOffset + 4, fbeStringSize.toLong())
    }

    // Set the string value
    fun set(value: String): Long
    {
        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        val bytes = value.toByteArray(StandardCharsets.UTF_8)

        val fbeStringSize = bytes.size
        assert(_buffer.offset + FBEOffset + 4 + fbeStringSize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 + fbeStringSize > _buffer.size)
            return 4

        write(FBEOffset, fbeStringSize)
        write(FBEOffset + 4, bytes)
        return (4 + fbeStringSize).toLong()
    }
}
