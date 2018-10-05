// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding OptionalByte array field model class
class FieldModelArrayOptionalByte(buffer: Buffer, offset: Long, val size: Long) : FieldModel(buffer, offset)
{
    private val _model = FieldModelOptionalByte(buffer, offset)

    // Field size
    override val FBESize: Long = size * _model.FBESize

    // Field extra size
    override val FBEExtra: Long = 0

    // Get the array offset
    val offset: Long get() = 0

    // Array index operator
    fun getItem(index: Long): FieldModelOptionalByte
    {
        assert(_buffer.offset + FBEOffset + FBESize <= _buffer.size) { "Model is broken!" }
        assert(index < size) { "Index is out of bounds!" }

        _model.FBEOffset = FBEOffset
        _model.FBEShift(index * _model.FBESize)
        return _model
    }

    // Check if the array is valid
    override fun verify(): Boolean
    {
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return false

        _model.FBEOffset = FBEOffset
        var i = size
        while (i-- > 0)
        {
            if (!_model.verify())
                return false
            _model.FBEShift(_model.FBESize)
        }

        return true
    }

    // Get the array
    fun get(): Array<Byte?>
    {
        val values = arrayOfNulls<Byte?>(size.toInt())

        val fbeModel = getItem(0)
        for (i in 0 until size)
        {
            values[i.toInt()] = fbeModel.get()
            fbeModel.FBEShift(fbeModel.FBESize)
        }
        return values
    }

    // Get the array
    fun get(values: Array<Byte?>)
    {
        val fbeModel = getItem(0)
        var i: Long = 0
        while (i < values.size && i < size)
        {
            values[i.toInt()] = fbeModel.get()
            fbeModel.FBEShift(fbeModel.FBESize)
            i++
        }
    }

    // Get the array as ArrayList
    fun get(values: ArrayList<Byte?>)
    {
        values.clear()
        values.ensureCapacity(size.toInt())

        val fbeModel = getItem(0)
        var i = size
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.FBEShift(fbeModel.FBESize)
        }
    }

    // Set the array
    fun set(values: Array<Byte?>)
    {
        assert(_buffer.offset + FBEOffset + FBESize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return

        val fbeModel = getItem(0)
        var i: Long = 0
        while (i < values.size && i < size)
        {
            fbeModel.set(values[i.toInt()])
            fbeModel.FBEShift(fbeModel.FBESize)
            i++
        }
    }

    // Set the array as List
    fun set(values: ArrayList<Byte?>)
    {
        assert(_buffer.offset + FBEOffset + FBESize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return

        val fbeModel = getItem(0)
        var i: Long = 0
        while (i < values.size && i < size)
        {
            fbeModel.set(values[i.toInt()])
            fbeModel.FBEShift(fbeModel.FBESize)
            i++
        }
    }
}
