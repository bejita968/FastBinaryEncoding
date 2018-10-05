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

// Fast Binary Encoding OptionalFlagsSimple vector field model class
class FieldModelVectorOptionalFlagsSimple(buffer: Buffer, offset: Long) : FieldModel(buffer, offset)
{
    private val _model = FieldModelOptionalFlagsSimple(buffer, offset)

    // Field size
    override val FBESize: Long = 4

    // Field extra size
    override val FBEExtra: Long get()
    {
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return 0

        val fbeVectorOffset = readInt32(FBEOffset).toLong()
        if (fbeVectorOffset == 0L || _buffer.offset + fbeVectorOffset + 4 > _buffer.size)
            return 0

        val fbeVectorSize = readInt32(fbeVectorOffset).toLong()

        var fbeResult: Long = 4
        _model.FBEOffset = fbeVectorOffset + 4
        var i = fbeVectorSize
        while (i-- > 0)
        {
            fbeResult += _model.FBESize + _model.FBEExtra
            _model.FBEShift(_model.FBESize)
        }
        return fbeResult
    }

    // Get the vector offset
    val offset: Long get()
    {
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return 0

        val fbeVectorOffset = readInt32(FBEOffset).toLong()
        return fbeVectorOffset
    }

    // Get the vector size
    val size: Long get()
    {
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return 0

        val fbeVectorOffset = readInt32(FBEOffset).toLong()
        if (fbeVectorOffset == 0L || _buffer.offset + fbeVectorOffset + 4 > _buffer.size)
            return 0

        val fbeVectorSize = readInt32(fbeVectorOffset).toLong()
        return fbeVectorSize
    }

    // Vector index operator
    fun getItem(index: Long): FieldModelOptionalFlagsSimple
    {
        assert(_buffer.offset + FBEOffset + FBESize <= _buffer.size) { "Model is broken!" }

        val fbeVectorOffset = readInt32(FBEOffset).toLong()
        assert(fbeVectorOffset > 0 && _buffer.offset + fbeVectorOffset + 4 <= _buffer.size) { "Model is broken!" }

        val fbeVectorSize = readInt32(fbeVectorOffset).toLong()
        assert(index < fbeVectorSize) { "Index is out of bounds!" }

        _model.FBEOffset = fbeVectorOffset + 4
        _model.FBEShift(index * _model.FBESize)
        return _model
    }

    // Resize the vector and get its first model
    fun resize(size: Long): FieldModelOptionalFlagsSimple
    {
        val fbeVectorSize = size * _model.FBESize
        val fbeVectorOffset = _buffer.allocate(4 + fbeVectorSize) - _buffer.offset
        assert(fbeVectorOffset > 0 && _buffer.offset + fbeVectorOffset + 4 <= _buffer.size) { "Model is broken!" }

        write(FBEOffset, fbeVectorOffset)
        write(fbeVectorOffset, size.toInt())
        write(fbeVectorOffset + 4, 0.toByte(), fbeVectorSize)

        _model.FBEOffset = fbeVectorOffset + 4
        return _model
    }

    // Check if the vector is valid
    override fun verify(): Boolean
    {
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return true

        val fbeVectorOffset = readInt32(FBEOffset).toLong()
        if (fbeVectorOffset == 0L)
            return true

        if (_buffer.offset + fbeVectorOffset + 4 > _buffer.size)
            return false

        val fbeVectorSize = readInt32(fbeVectorOffset).toLong()

        _model.FBEOffset = fbeVectorOffset + 4
        var i = fbeVectorSize
        while (i-- > 0)
        {
            if (!_model.verify())
                return false
            _model.FBEShift(_model.FBESize)
        }

        return true
    }

    // Get the vector as ArrayList
    operator fun get(values: ArrayList<FlagsSimple?>)
    {
        values.clear()

        val fbeVectorSize = size
        if (fbeVectorSize == 0L)
            return

        values.ensureCapacity(fbeVectorSize.toInt())

        val fbeModel = getItem(0)
        var i = fbeVectorSize
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.FBEShift(fbeModel.FBESize)
        }
    }

    // Get the vector as LinkedList
    operator fun get(values: LinkedList<FlagsSimple?>)
    {
        values.clear()

        val fbeVectorSize = size
        if (fbeVectorSize == 0L)
            return

        val fbeModel = getItem(0)
        var i = fbeVectorSize
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.FBEShift(fbeModel.FBESize)
        }
    }

    // Get the vector as HashSet
    operator fun get(values: HashSet<FlagsSimple?>)
    {
        values.clear()

        val fbeVectorSize = size
        if (fbeVectorSize == 0L)
            return

        val fbeModel = getItem(0)
        var i = fbeVectorSize
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.FBEShift(fbeModel.FBESize)
        }
    }

    // Set the vector as ArrayList
    fun set(values: ArrayList<FlagsSimple?>)
    {
        assert(_buffer.offset + FBEOffset + FBESize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for (value in values)
        {
            fbeModel.set(value)
            fbeModel.FBEShift(fbeModel.FBESize)
        }
    }

    // Set the vector as LinkedList
    fun set(values: LinkedList<FlagsSimple?>)
    {
        assert(_buffer.offset + FBEOffset + FBESize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for (value in values)
        {
            fbeModel.set(value)
            fbeModel.FBEShift(fbeModel.FBESize)
        }
    }

    // Set the vector as HashSet
    fun set(values: HashSet<FlagsSimple?>)
    {
        assert(_buffer.offset + FBEOffset + FBESize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for (value in values)
        {
            fbeModel.set(value)
            fbeModel.FBEShift(fbeModel.FBESize)
        }
    }
}
