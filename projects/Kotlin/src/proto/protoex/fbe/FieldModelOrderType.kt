// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package protoex.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import protoex.*;

// Fast Binary Encoding OrderType field model class
class FieldModelOrderType(buffer: Buffer, offset: Long) : FieldModel(buffer, offset)
{
    // Field size
    override val FBESize: Long = 1

    // Get the value
    fun get(defaults: OrderType = OrderType()): OrderType
    {
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return defaults

        return OrderType(readByte(FBEOffset))
    }

    // Set the value
    fun set(value: OrderType)
    {
        assert(_buffer.offset + FBEOffset + FBESize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return

        write(FBEOffset, value.raw)
    }
}
