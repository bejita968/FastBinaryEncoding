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

// Fast Binary Encoding ULong final model class
class FinalModelUInt64(buffer: Buffer, offset: Long) : FinalModel(buffer, offset)
{
    // Get the allocation size
    @Suppress("UNUSED_PARAMETER")
    fun FBEAllocationSize(value: ULong): Long = FBESize

    // Final size
    override val FBESize: Long = 8

    // Check if the value is valid
    override fun verify(): Long
    {
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return Long.MAX_VALUE

        return FBESize
    }

    // Get the value
    fun get(size: Size): ULong
    {
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return 0uL

        size.value = FBESize
        return readUInt64(FBEOffset)
    }

    // Set the value
    fun set(value: ULong): Long
    {
        assert(_buffer.offset + FBEOffset + FBESize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return 0

        write(FBEOffset, value)
        return FBESize
    }
}
